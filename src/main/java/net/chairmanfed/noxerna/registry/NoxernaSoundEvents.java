package net.chairmanfed.noxerna.registry;

import net.chairmanfed.noxerna.TheNoxerna;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

public class NoxernaSoundEvents {
    public static final SoundEvent HEAVY_METAL_BREAK = register("block.heavy_metal.break");
    public static final SoundEvent HEAVY_METAL_PLACE = register("block.heavy_metal.place");
    public static final SoundEvent NOBLEWOOD_BREAK = register("block.noblewood.break");
    public static final SoundEvent NOBLEWOOD_FALL = register("block.noblewood.fall");
    public static final SoundEvent NOBLEWOOD_HIT = register("block.noblewood.hit");
    public static final SoundEvent NOBLEWOOD_PLACE = register("block.noblewood.place");
    public static final SoundEvent NOBLEWOOD_STEP = register("block.noblewood.step");
    public static final SoundEvent NOXUM_PLACE = register("block.noxum.place");
    public static final SoundEvent NOXUM_STEP = register("block.noxum.step");

    private static Holder<SoundEvent> register(ResourceLocation pName, ResourceLocation pLocation, float pRange) {
        return net.minecraft.core.Registry.registerForHolder(
                BuiltInRegistries.SOUND_EVENT, pName, SoundEvent.createFixedRangeEvent(pLocation, pRange));
    }
    private static SoundEvent register(String name) {
        return register(ResourceLocation.fromNamespaceAndPath(TheNoxerna.MODID, name));
    }
    private static SoundEvent register(ResourceLocation name) {
        return register(name, name);
    }

    private static SoundEvent register(ResourceLocation name, ResourceLocation location) {
        return Registry.register(BuiltInRegistries.SOUND_EVENT, name, SoundEvent.createVariableRangeEvent(location));
    }
}
