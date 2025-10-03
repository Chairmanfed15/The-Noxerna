package net.chairmanfed.noxerna.effect.beneficial;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class SubsistenceEffect extends MobEffect {
    public SubsistenceEffect() {
        super(MobEffectCategory.BENEFICIAL, 7295860);
    }
    @Override
    public boolean applyEffectTick(LivingEntity entity, int amplifier) {
        if (!(entity instanceof Player player)) return false;
        if (player.getFoodData().getFoodLevel() < 20) {
            player.getFoodData().eat(1, 0.0F);
        } else if (player.getFoodData().getFoodLevel() >= 20 && player.getFoodData().getSaturationLevel() < 20.0F) {
            player.getFoodData().eat(1, 0.5F);
        }
        return true;
    }
    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        int i = 100 >> amplifier;
        return i > 0 ? duration % i == 0 : true;
    }
}
