package net.chairmanfed.noxerna.item.consumable;

import net.chairmanfed.noxerna.effect.NoxernaEffects;
import net.chairmanfed.noxerna.item.NoxernaItems;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class NoxernaFoods {
    // Noblephytes
    public static final FoodProperties XENON_NOBLEPHYTE = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.1F)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 600, 1), 1.0F)
            .effect(new MobEffectInstance(NoxernaEffects.FROSTBITE, 600, 0), 0.8F)
            .build();
    public static final FoodProperties COOKED_XENON_NOBLEPHYTE = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.3F)
            .build();
    public static final FoodProperties KRYPTON_NOBLEPHYTE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(0.1F)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 600, 1), 1.0F)
            .effect(new MobEffectInstance(NoxernaEffects.ARMOR_BOOST, 600, 0), 0.8F)
            .build();
    public static final FoodProperties COOKED_KRYPTON_NOBLEPHYTE = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(0.3F)
            .build();
    public static final FoodProperties ARGON_NOBLEPHYTE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(0.1F)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 600, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600, 0), 0.8F)
            .build();
    public static final FoodProperties COOKED_ARGON_NOBLEPHYTE = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(0.3F)
            .build();
    public static final FoodProperties NEON_NOBLEPHYTE = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.1F)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 600, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 600, 1), 0.8F)
            .build();
    public static final FoodProperties COOKED_NEON_NOBLEPHYTE = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.3F)
            .build();
    // "Snacks"
    public static final FoodProperties GLOWBREAD = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(0.6F)
            .build();
    // Meals
    public static final FoodProperties NOBLEPHYTE_STEW = cheapMeal(8).build();
    public static final FoodProperties GLOWING_PORRIDGE = cheapMealExtended(6).build();

    private static FoodProperties.Builder cheapMeal(int pNutrition) {
        return new FoodProperties.Builder()
                .nutrition(pNutrition)
                .saturationModifier(0.6F)
                .effect(new MobEffectInstance(NoxernaEffects.FOOD_REGENERATION, 4800, 0), 1.0F)
                .usingConvertsTo(NoxernaItems.NOBLEWOOD_BOWL);
    }
    private static FoodProperties.Builder cheapMealExtended(int pNutrition) {
        return new FoodProperties.Builder()
                .nutrition(pNutrition)
                .saturationModifier(0.8F)
                .effect(new MobEffectInstance(NoxernaEffects.FOOD_REGENERATION, 12000, 0), 1.0F)
                .usingConvertsTo(NoxernaItems.NOBLEWOOD_BOWL);
    }
}
