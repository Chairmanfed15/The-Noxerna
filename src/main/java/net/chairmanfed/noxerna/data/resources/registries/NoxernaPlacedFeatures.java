package net.chairmanfed.noxerna.data.resources.registries;

import net.chairmanfed.noxerna.Noxerna;
import net.chairmanfed.noxerna.data.resources.NoxernaPlacedFeatureBuilders;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.OrePlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.HeightmapPlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class NoxernaPlacedFeatures {
    private static ResourceKey<PlacedFeature> makeKey(String name){
        return ResourceKey.create(Registries.PLACED_FEATURE, Noxerna.prefix(name));
    }

    public static final ResourceKey<PlacedFeature> ORE_ACCELESLATE_PLACEMENT = makeKey("ore_acceleslate");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);
        register(context, ORE_ACCELESLATE_PLACEMENT, configuredFeatures.getOrThrow(
                NoxernaConfiguredFeatures.ORE_ACCELESLATE_CONFIGURATION
        ), NoxernaPlacedFeatureBuilders.commonOrePlacement(4, HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.TOP)));
    }
    private static void register(
            BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key,
            Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
