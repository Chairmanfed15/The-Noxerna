package net.chairmanfed.noxerna.item.consumable;

import net.chairmanfed.noxerna.Noxerna;
import net.chairmanfed.noxerna.effect.NoxernaEffects;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class NoxernaPotions {
    public static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(Registries.POTION, Noxerna.MODID);

    public static final DeferredHolder<Potion, Potion> BROKEN_ARMOR = POTIONS.register(
            "broken_armor", () -> new Potion(
                    "broken_armor", new MobEffectInstance(NoxernaEffects.ARMOR_REDUCTION, 3600)));
    public static final DeferredHolder<Potion, Potion> LONG_BROKEN_ARMOR = POTIONS.register(
            "long_broken_armor", () -> new Potion(
                    "broken_armor", new MobEffectInstance(NoxernaEffects.ARMOR_REDUCTION, 9600)));
    public static final DeferredHolder<Potion, Potion> STRONG_BROKEN_ARMOR = POTIONS.register(
            "strong_broken_armor", () -> new Potion(
                    "broken_armor", new MobEffectInstance(NoxernaEffects.ARMOR_REDUCTION, 1800, 1)));
}
