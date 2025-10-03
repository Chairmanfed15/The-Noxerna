package net.chairmanfed.noxerna.effect;

import net.chairmanfed.noxerna.Noxerna;
import net.chairmanfed.noxerna.effect.beneficial.SubsistenceEffect;
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
    public static final DeferredHolder<MobEffect, MobEffect> ARMOR_BOOST = EFFECTS.register(
            "bolstered_armor", () -> new  GenericMobEffect(MobEffectCategory.BENEFICIAL, 4757847)
                    .addAttributeModifier(Attributes.ARMOR,
                            ResourceLocation.fromNamespaceAndPath(Noxerna.MODID,
                                    "effect.bolstered_armor.armor"),
                            0.2F, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(Attributes.ARMOR_TOUGHNESS,
                            ResourceLocation.fromNamespaceAndPath(Noxerna.MODID,
                                    "effect.bolstered_armor.toughness"),
                            0.05F, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
    public static final DeferredHolder<MobEffect, MobEffect> FOOD_REGENERATION = EFFECTS.register(
            "subsistence", () -> new SubsistenceEffect());
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
                                    "effect.broken_armor.toughness_reduction"),
                            -0.05F, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
    public static final DeferredHolder<MobEffect, MobEffect> LEADWEIGHT = EFFECTS.register(
            "leadweight", () -> new  GenericMobEffect(MobEffectCategory.HARMFUL, 10531321)
                    .addAttributeModifier(Attributes.JUMP_STRENGTH,
                            ResourceLocation.fromNamespaceAndPath(Noxerna.MODID,
                                    "effect.leadweight.jump_strength_reduction"),
                            -0.1F, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(Attributes.SAFE_FALL_DISTANCE,
                            ResourceLocation.fromNamespaceAndPath(Noxerna.MODID,
                                    "effect.leadweight.safe_fall_reduction"),
                            -1F, AttributeModifier.Operation.ADD_VALUE)
                    .addAttributeModifier(Attributes.FALL_DAMAGE_MULTIPLIER,
                            ResourceLocation.fromNamespaceAndPath(Noxerna.MODID,
                                    "effect.leadweight.fall_damage"),
                            0.25F, AttributeModifier.Operation.ADD_VALUE)
                    .addAttributeModifier(Attributes.GRAVITY,
                            ResourceLocation.fromNamespaceAndPath(Noxerna.MODID,
                                    "effect.leadweight.gravity"),
                            0.1F, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
    public static final DeferredHolder<MobEffect, MobEffect> FROSTBITE = EFFECTS.register(
            "frostbite", () -> new FrostbiteEffect());
    public static final DeferredHolder<MobEffect, MobEffect> FLIGHT_CANCEL = EFFECTS.register(
            "grounded", () -> new GroundedEffect()
                    .addAttributeModifier(NeoForgeMod.CREATIVE_FLIGHT,
                            ResourceLocation.fromNamespaceAndPath(Noxerna.MODID,
                                    "effect.grounded.flight_cancel"),
                            -1.0F, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
    public static final DeferredHolder<MobEffect, MobEffect> STUNNED = EFFECTS.register(
            "stunned", () -> new  GenericMobEffect(MobEffectCategory.HARMFUL, 16777079));
}
