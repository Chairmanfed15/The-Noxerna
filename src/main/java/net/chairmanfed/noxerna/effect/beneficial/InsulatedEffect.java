package net.chairmanfed.noxerna.effect.beneficial;

import net.chairmanfed.noxerna.effect.NoxernaEffects;
import net.chairmanfed.noxerna.registry.NoxernaTags;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;

public class InsulatedEffect extends MobEffect {
    public InsulatedEffect() {
        super(MobEffectCategory.BENEFICIAL, 14123368);
    }
    @Override
    public boolean applyEffectTick(LivingEntity entity, int amplifier) {
        entity.setTicksFrozen(0);
        entity.removeEffect(NoxernaEffects.FROSTBITE);
        return true;
    }
    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) { return true; }
    @Override
    public void onEffectStarted(LivingEntity entity, int pAmplifier) {}
}
