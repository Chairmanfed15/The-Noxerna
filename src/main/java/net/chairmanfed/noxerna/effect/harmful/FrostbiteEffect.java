package net.chairmanfed.noxerna.effect.harmful;

import net.chairmanfed.noxerna.Noxerna;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class FrostbiteEffect extends MobEffect {
    public FrostbiteEffect() {
        super(MobEffectCategory.HARMFUL, 6864599);
    }
    @Override
    public boolean applyEffectTick(LivingEntity entity, int amplifier) {
        entity.setIsInPowderSnow(true);
        return true;
    }
    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) { return true; }
    @Override
    public void onEffectStarted(LivingEntity entity, int pAmplifier) {
        if (entity.canFreeze()) {
            entity.setTicksFrozen(140);
        }
    }
}
