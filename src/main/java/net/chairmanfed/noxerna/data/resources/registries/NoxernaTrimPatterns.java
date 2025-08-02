package net.chairmanfed.noxerna.data.resources.registries;

import net.chairmanfed.noxerna.Noxerna;
import net.chairmanfed.noxerna.item.NoxernaItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.armortrim.TrimPattern;
import net.minecraft.world.item.armortrim.TrimPatterns;

public class NoxernaTrimPatterns extends TrimPatterns {
    public static final ResourceKey<TrimPattern> EXOTIC = registryKey("exotic");

    public static void bootstrap(BootstrapContext<TrimPattern> context) {
        register(context, NoxernaItems.EXOTIC_ARMOR_TRIM_SMITHING_TEMPLATE.get(), EXOTIC);
    }
    private static ResourceKey<TrimPattern> registryKey(String name) {
        return ResourceKey.create(Registries.TRIM_PATTERN,
                ResourceLocation.fromNamespaceAndPath(Noxerna.MODID, name));
    }
}
