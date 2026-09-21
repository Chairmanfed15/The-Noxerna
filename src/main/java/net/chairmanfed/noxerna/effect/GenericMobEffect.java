package net.chairmanfed.noxerna.effect;

import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;

public class GenericMobEffect extends MobEffect {
    public GenericMobEffect(MobEffectCategory category, int color) {
        super(category, color);
    }
    public GenericMobEffect(MobEffectCategory category, int color, ParticleOptions particle) {
        super(category, color, particle);
    }
}
