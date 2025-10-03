package net.chairmanfed.noxerna.item.consumable;

import net.chairmanfed.noxerna.effect.NoxernaEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class NoxernaFoods {
    public static final FoodProperties XENON_NOBLEPHYTE = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.1F)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 600, 1), 0.8F)
            .effect(new MobEffectInstance(NoxernaEffects.FROSTBITE, 600, 0), 1.0F)
            .build();
}
