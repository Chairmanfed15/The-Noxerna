package net.chairmanfed.noxerna.registry;

import net.chairmanfed.noxerna.Noxerna;
import net.chairmanfed.noxerna.block.NoxernaBlocks;
import net.chairmanfed.noxerna.data.resources.registries.NoxernaBiomes;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.FixedBiomeSource;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.levelgen.*;
import net.minecraft.world.level.levelgen.synth.BlendedNoise;

import java.util.List;
import java.util.OptionalLong;

public class NoxernaDimension {
    public static final ResourceLocation DIMENSION_RENDERER = Noxerna.prefix("renderer");
    public static final ResourceKey<Level> DIMENSION_KEY = ResourceKey.create(
            Registries.DIMENSION, Noxerna.prefix("the_noxerna"));
    public static final ResourceKey<DimensionType> DIMENSION_TYPE = ResourceKey.create(
            Registries.DIMENSION_TYPE, Noxerna.prefix("the_noxerna"));
    public static final ResourceKey<NoiseGeneratorSettings> NOISE_SETTINGS = ResourceKey.create(
            Registries.NOISE_SETTINGS, Noxerna.prefix("the_noxerna"));
    public static final ResourceKey<LevelStem> LEVEL_STEM = ResourceKey.create(
            Registries.LEVEL_STEM, Noxerna.prefix("the_noxerna"));
    public static void bootstrapType(BootstrapContext<DimensionType> context) {
        context.register(DIMENSION_TYPE, new DimensionType(
                OptionalLong.empty(),
                false,
                true,
                false,
                true,
                0.4D, // This makes Noxerna roughly 2.5x "bigger" than The Overworld
                false,
                true,
                0,
                256,
                192,
                NoxernaTags.BlockTags.INFINIBURN_NOXERNA,
                DIMENSION_RENDERER,
                0.01f,
                new DimensionType.MonsterSettings(false, false, UniformInt.of(0, 7), 0)
        ));
    }
    public static void bootstrapNoise(BootstrapContext<NoiseGeneratorSettings> context) {
        context.register(NOISE_SETTINGS, new NoiseGeneratorSettings(
                NoiseSettings.create(0, 192, 2, 2),
                NoxernaBlocks.NOXUM.get().defaultBlockState(),
                Blocks.WATER.defaultBlockState(),
                new NoiseRouter(
                        // TODO Add density functions
                        DensityFunctions.zero(), // barrier
                        DensityFunctions.zero(), // fluid level floodedness
                        DensityFunctions.zero(), // fluid level spread
                        DensityFunctions.zero(), // lava
                        DensityFunctions.zero(), // temperature
                        DensityFunctions.zero(), // vegetation
                        DensityFunctions.zero(), // continents
                        DensityFunctions.zero(), // erosion
                        DensityFunctions.zero(), // depth
                        DensityFunctions.zero(), // ridges
                        DensityFunctions.zero(), // initial density
                        DensityFunctions.mul(
                                DensityFunctions.constant(0.64),
                                DensityFunctions.interpolated(
                                        DensityFunctions.blendDensity(
                                                DensityFunctions.add(
                                                        DensityFunctions.constant(2.5),
                                                        DensityFunctions.mul(
                                                                DensityFunctions.yClampedGradient(16, 48, 0.0D, 1.0D),
                                                                DensityFunctions.add(
                                                                        DensityFunctions.constant(-2.5),
                                                                        DensityFunctions.add(
                                                                                DensityFunctions.constant(0.9375),
                                                                                DensityFunctions.mul(
                                                                                        DensityFunctions.yClampedGradient(160, 192, 1.0D, 0.0D),
                                                                                        DensityFunctions.add(
                                                                                                DensityFunctions.constant(-0.9375),
                                                                                                BlendedNoise.createUnseeded(0.25, 0.375, 80.0, 60.0, 8.0)
                                                                                        )
                                                                                )
                                                                        )
                                                                )
                                                        )
                                                )
                                        )
                                )
                        ).squeeze(), // final density
                        DensityFunctions.zero(), // vein toggle
                        DensityFunctions.zero(), // vein ridged
                        DensityFunctions.zero()  // vein gap
                ),
                NoxernaSurfaceRuleData.noxerna(),
                List.of(),
                64,
                false,
                false,
                false,
                false
        ));
    }
    public static void bootstrapStem(BootstrapContext<LevelStem> context) {
        HolderGetter<DimensionType> dimensionType = context.lookup(Registries.DIMENSION_TYPE);
        HolderGetter<NoiseGeneratorSettings> noiseSettings = context.lookup(Registries.NOISE_SETTINGS);
        HolderGetter<Biome> biome = context.lookup(Registries.BIOME);
        context.register(LEVEL_STEM, new LevelStem(
                dimensionType.getOrThrow(DIMENSION_TYPE),
                new NoiseBasedChunkGenerator(new FixedBiomeSource(biome.getOrThrow(NoxernaBiomes.NOXUM_DEPTHS)),
                        noiseSettings.getOrThrow(NOISE_SETTINGS))));
    }
}
