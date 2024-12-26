package net.chairmanfed.noxerna.registry;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.SoundType;

public class NoxernaSoundTypes {
    public static final SoundType HEAVY_METAL = new SoundType(
            1.0F, 1.0F,
            NoxernaSoundEvents.HEAVY_METAL_BREAK,
            SoundEvents.HEAVY_CORE_STEP,
            NoxernaSoundEvents.HEAVY_METAL_PLACE,
            SoundEvents.HEAVY_CORE_HIT,
            SoundEvents.HEAVY_CORE_FALL);
    public static final SoundType NOBLEWOOD = new SoundType(
            1.0F, 1.0F, NoxernaSoundEvents.NOBLEWOOD_BREAK, NoxernaSoundEvents.NOBLEWOOD_STEP,
            NoxernaSoundEvents.NOBLEWOOD_PLACE, NoxernaSoundEvents.NOBLEWOOD_HIT, NoxernaSoundEvents.NOBLEWOOD_FALL
    );
    public static final SoundType NOXUM = new SoundType(
            1.0F, 1.0F, SoundEvents.DEEPSLATE_BREAK, NoxernaSoundEvents.NOXUM_STEP,
            NoxernaSoundEvents.NOXUM_PLACE, SoundEvents.DEEPSLATE_HIT, SoundEvents.DEEPSLATE_FALL);
}
