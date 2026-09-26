package net.chairmanfed.noxerna.data.resources.registries;

import net.chairmanfed.noxerna.Noxerna;
import net.chairmanfed.noxerna.block.NoxernaBlocks;
import net.chairmanfed.noxerna.data.resources.NoxernaFeatureRules;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

public class NoxernaConfiguredFeatures {
    private static ResourceKey<ConfiguredFeature<?, ?>> makeKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, Noxerna.prefix(name));
    }

    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_ACCELESLATE_CONFIGURATION = makeKey("ore_acceleslate");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        register(context, ORE_ACCELESLATE_CONFIGURATION, Feature.ORE,
                new OreConfiguration(NoxernaFeatureRules.NOXUM_REPLACEMENT,
                        NoxernaBlocks.ACCELESLATE.get().defaultBlockState(), 64));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>>
    void register(BootstrapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key,
                  F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
