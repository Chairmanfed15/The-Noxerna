package net.chairmanfed.noxerna.effect.harmful;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class GroundedEffect extends MobEffect {
    public GroundedEffect() {
        super(MobEffectCategory.HARMFUL, 9408435);
    }

    @Override
    public boolean applyEffectTick(LivingEntity entity, int amplifier) {
        if (!(entity instanceof Player player)) return false;
        boolean isGliding = player.isFallFlying();
        boolean isTryingToGlide = player.tryToStartFallFlying();
        if (isGliding || isTryingToGlide) {
            player.stopFallFlying();
        }
        return true;
    }
    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) { return true; }
}
