package net.chairmanfed.noxerna.item.consumable;

import net.chairmanfed.noxerna.Noxerna;
import net.chairmanfed.noxerna.effect.NoxernaEffects;
import net.chairmanfed.noxerna.item.NoxernaItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.Potions;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.brewing.RegisterBrewingRecipesEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class NoxernaPotions {
    public static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(Registries.POTION, Noxerna.MODID);

    // Positive Effect Potions
    public static final DeferredHolder<Potion, Potion> BOLSTERED_ARMOR = POTIONS.register(
            "bolstered_armor", () -> new Potion("bolstered_armor",
                    new MobEffectInstance(NoxernaEffects.ARMOR_BOOST, 3600)));
    public static final DeferredHolder<Potion, Potion> LONG_BOLSTERED_ARMOR = POTIONS.register(
            "long_bolstered_armor", () -> new Potion("bolstered_armor",
                    new MobEffectInstance(NoxernaEffects.ARMOR_BOOST, 9600)));
    public static final DeferredHolder<Potion, Potion> STRONG_BOLSTERED_ARMOR = POTIONS.register(
            "strong_bolstered_armor", () -> new Potion("bolstered_armor",
                    new MobEffectInstance(NoxernaEffects.ARMOR_BOOST, 1800, 1)));
    // Neutral Effect Potions
    // Negative Effect Potions
        // Broken Armour
    public static final DeferredHolder<Potion, Potion> BROKEN_ARMOR = POTIONS.register(
            "broken_armor", () -> new Potion("broken_armor",
                    new MobEffectInstance(NoxernaEffects.ARMOR_REDUCTION, 3600)));
    public static final DeferredHolder<Potion, Potion> LONG_BROKEN_ARMOR = POTIONS.register(
            "long_broken_armor", () -> new Potion("broken_armor",
                    new MobEffectInstance(NoxernaEffects.ARMOR_REDUCTION, 9600)));
    public static final DeferredHolder<Potion, Potion> STRONG_BROKEN_ARMOR = POTIONS.register(
            "strong_broken_armor", () -> new Potion("broken_armor",
                    new MobEffectInstance(NoxernaEffects.ARMOR_REDUCTION, 1800, 1)));
        // Frostbite
    public static final DeferredHolder<Potion, Potion> FROSTBITE = POTIONS.register(
            "frostbite", () -> new Potion("frostbite",
                        new MobEffectInstance(NoxernaEffects.FROSTBITE, 3600)));
    public static final DeferredHolder<Potion, Potion> LONG_FROSTBITE = POTIONS.register(
            "long_frostbite", () -> new Potion("frostbite",
                    new MobEffectInstance(NoxernaEffects.FROSTBITE, 9600)));
        // Leadweight
        public static final DeferredHolder<Potion, Potion> LEADWEIGHT = POTIONS.register(
                "leadweight", () -> new Potion("leadweight",
                        new MobEffectInstance(NoxernaEffects.LEADWEIGHT, 3600)));
    public static final DeferredHolder<Potion, Potion> LONG_LEADWEIGHT = POTIONS.register(
            "long_leadweight", () -> new Potion("leadweight",
                    new MobEffectInstance(NoxernaEffects.LEADWEIGHT, 9600)));
    public static final DeferredHolder<Potion, Potion> STRONG_LEADWEIGHT = POTIONS.register(
            "strong_leadweight", () -> new Potion("leadweight",
                    new MobEffectInstance(NoxernaEffects.LEADWEIGHT, 1800, 1),
                    new MobEffectInstance(NoxernaEffects.FLIGHT_CANCEL, 1800)));

    // We need to be able to brew these potions
    public static void registerBrewingRecipes(RegisterBrewingRecipesEvent event) {
        event.getBuilder().addMix(Potions.THICK, NoxernaItems.MYSTERIOUS_ALLOY_PLATE.get(), NoxernaPotions.BOLSTERED_ARMOR);
        event.getBuilder().addMix(NoxernaPotions.BOLSTERED_ARMOR, Items.REDSTONE, NoxernaPotions.LONG_BOLSTERED_ARMOR);
        event.getBuilder().addMix(NoxernaPotions.BOLSTERED_ARMOR, Items.GLOWSTONE_DUST, NoxernaPotions.STRONG_BOLSTERED_ARMOR);
        event.getBuilder().addMix(Potions.THICK, NoxernaItems.VITRALISK.get(), NoxernaPotions.BROKEN_ARMOR);
        event.getBuilder().addMix(NoxernaPotions.BROKEN_ARMOR, Items.REDSTONE, NoxernaPotions.LONG_BROKEN_ARMOR);
        event.getBuilder().addMix(NoxernaPotions.BROKEN_ARMOR, Items.GLOWSTONE_DUST, NoxernaPotions.STRONG_BROKEN_ARMOR);
        event.getBuilder().addMix(Potions.THICK, Items.SNOW_BLOCK, NoxernaPotions.FROSTBITE);
        event.getBuilder().addMix(NoxernaPotions.FROSTBITE, Items.REDSTONE, NoxernaPotions.LONG_FROSTBITE);
        event.getBuilder().addMix(Potions.THICK, NoxernaItems.FERREBRIS_BLOCK.get(), NoxernaPotions.LEADWEIGHT);
        event.getBuilder().addMix(NoxernaPotions.LEADWEIGHT, Items.REDSTONE, NoxernaPotions.LONG_LEADWEIGHT);
        event.getBuilder().addMix(NoxernaPotions.LEADWEIGHT, Items.GLOWSTONE_DUST, NoxernaPotions.STRONG_LEADWEIGHT);
    }
}
