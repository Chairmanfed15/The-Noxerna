package net.chairmanfed.noxerna.effect;

import net.chairmanfed.noxerna.Noxerna;
import net.chairmanfed.noxerna.effect.harmful.FrostbiteEffect;
import net.chairmanfed.noxerna.effect.harmful.GroundedEffect;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.NeoForgeMod;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class NoxernaEffects {
    public static final DeferredRegister<MobEffect> EFFECTS =
            DeferredRegister.create(Registries.MOB_EFFECT, Noxerna.MODID);

    // Beneficial Effects
    // Neutral Effects
    // Harmful Effects
    public static final DeferredHolder<MobEffect, MobEffect> ARMOR_REDUCTION = EFFECTS.register(
            "broken_armor", () -> new GenericMobEffect(MobEffectCategory.HARMFUL, 9719685)
                    .addAttributeModifier(Attributes.ARMOR,
                            ResourceLocation.fromNamespaceAndPath(Noxerna.MODID,
                                    "effect.broken_armor.armor_reduction"),
                            -0.2F, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(Attributes.ARMOR_TOUGHNESS,
                            ResourceLocation.fromNamespaceAndPath(Noxerna.MODID,
                                    "effect.broken_armor.toughness.reduction"),
                            -0.05F, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
    public static final DeferredHolder<MobEffect, MobEffect> FROSTBITE = EFFECTS.register(
            "frostbite", () -> new FrostbiteEffect());
    public static final DeferredHolder<MobEffect, MobEffect> FLIGHT_CANCEL = EFFECTS.register(
            "grounded", () -> new GroundedEffect()
                    .addAttributeModifier(NeoForgeMod.CREATIVE_FLIGHT,
                            ResourceLocation.fromNamespaceAndPath(Noxerna.MODID,
                                    "effect.grounded.flight_cancel"),
                            -1.0F, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
}
