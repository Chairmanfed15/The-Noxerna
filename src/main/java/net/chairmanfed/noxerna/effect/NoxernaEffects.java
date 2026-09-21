package net.chairmanfed.noxerna.effect;

import net.chairmanfed.noxerna.Noxerna;
import net.chairmanfed.noxerna.effect.beneficial.InsulatedEffect;
import net.chairmanfed.noxerna.effect.beneficial.SubsistenceEffect;
import net.chairmanfed.noxerna.effect.harmful.FrostbiteEffect;
import net.chairmanfed.noxerna.effect.harmful.GroundedEffect;
import net.minecraft.core.particles.ParticleTypes;
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
    public static final DeferredHolder<MobEffect, MobEffect> INSULATED = EFFECTS.register(
            "insulated", () -> new InsulatedEffect()
                    .addAttributeModifier(Attributes.BURNING_TIME,
                    ResourceLocation.fromNamespaceAndPath(Noxerna.MODID,
                            "effect.insulated.burning_time"),
                    -1.0F, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
    public static final DeferredHolder<MobEffect, MobEffect> MOVEMENT_EFFICIENCY = EFFECTS.register(
            "unimpeded", () -> new GenericMobEffect(MobEffectCategory.BENEFICIAL, 16751093)
                    .addAttributeModifier(Attributes.MOVEMENT_EFFICIENCY,
                            ResourceLocation.fromNamespaceAndPath(Noxerna.MODID,
                                    "effect.unimpeded.movement_efficiency"),
                            1, AttributeModifier.Operation.ADD_VALUE)
                    .addAttributeModifier(Attributes.WATER_MOVEMENT_EFFICIENCY,
                            ResourceLocation.fromNamespaceAndPath(Noxerna.MODID,
                                    "effect.unimpeded.water_movement_efficiency"),
                            1, AttributeModifier.Operation.ADD_VALUE));
    // Neutral Effects
    // Harmful Effects
    public static final DeferredHolder<MobEffect, MobEffect> ARMOR_REDUCTION = EFFECTS.register(
            "broken_armor", () -> new GenericMobEffect(MobEffectCategory.HARMFUL, 9719685)
                    .addAttributeModifier(Attributes.ARMOR,
                            ResourceLocation.fromNamespaceAndPath(Noxerna.MODID,
                                    "effect.broken_armor.armor"),
                            -0.2F, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(Attributes.ARMOR_TOUGHNESS,
                            ResourceLocation.fromNamespaceAndPath(Noxerna.MODID,
                                    "effect.broken_armor.toughness"),
                            -0.05F, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
    public static final DeferredHolder<MobEffect, MobEffect> FLAMMABLE = EFFECTS.register(
            "flammable", () -> new GenericMobEffect(MobEffectCategory.HARMFUL, 1246748)
                    .addAttributeModifier(Attributes.BURNING_TIME,
                            ResourceLocation.fromNamespaceAndPath(Noxerna.MODID,
                                    "effect.flammable.burning_time"),
                            1.0F, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
    public static final DeferredHolder<MobEffect, MobEffect> FROSTBITE = EFFECTS.register(
            "frostbite", () -> new FrostbiteEffect());
    public static final DeferredHolder<MobEffect, MobEffect> FLIGHT_CANCEL = EFFECTS.register(
            "grounded", () -> new GroundedEffect()
                    .addAttributeModifier(NeoForgeMod.CREATIVE_FLIGHT,
                            ResourceLocation.fromNamespaceAndPath(Noxerna.MODID,
                                    "effect.grounded.creative_flight"),
                            -1.0F, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
    public static final DeferredHolder<MobEffect, MobEffect> LEADWEIGHT = EFFECTS.register(
            "leadweight", () -> new  GenericMobEffect(MobEffectCategory.HARMFUL, 10531321)
                    .addAttributeModifier(Attributes.JUMP_STRENGTH,
                            ResourceLocation.fromNamespaceAndPath(Noxerna.MODID,
                                    "effect.leadweight.jump_strength"),
                            -0.1F, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(Attributes.SAFE_FALL_DISTANCE,
                            ResourceLocation.fromNamespaceAndPath(Noxerna.MODID,
                                    "effect.leadweight.safe_fall_distance"),
                            -1F, AttributeModifier.Operation.ADD_VALUE)
                    .addAttributeModifier(Attributes.FALL_DAMAGE_MULTIPLIER,
                            ResourceLocation.fromNamespaceAndPath(Noxerna.MODID,
                                    "effect.leadweight.fall_damage_multiplier"),
                            0.25F, AttributeModifier.Operation.ADD_VALUE)
                    .addAttributeModifier(Attributes.GRAVITY,
                            ResourceLocation.fromNamespaceAndPath(Noxerna.MODID,
                                    "effect.leadweight.gravity"),
                            0.1F, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
    public static final DeferredHolder<MobEffect, MobEffect> STUNNED = EFFECTS.register(
            "stunned", () -> new  GenericMobEffect(MobEffectCategory.HARMFUL, 16777079, ParticleTypes.ELECTRIC_SPARK));
}
