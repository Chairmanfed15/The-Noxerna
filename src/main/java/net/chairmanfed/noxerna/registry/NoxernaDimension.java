package net.chairmanfed.noxerna.registry;

import net.chairmanfed.noxerna.TheNoxerna;
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

import java.util.List;
import java.util.OptionalLong;

public class NoxernaDimension {
    public static final ResourceLocation DIMENSION_RENDERER = TheNoxerna.prefix("renderer");
    public static final ResourceKey<Level> DIMENSION_KEY = ResourceKey.create(
            Registries.DIMENSION, TheNoxerna.prefix("the_noxerna"));
    public static final ResourceKey<DimensionType> DIMENSION_TYPE = ResourceKey.create(
            Registries.DIMENSION_TYPE, TheNoxerna.prefix("the_noxerna"));
    public static final ResourceKey<NoiseGeneratorSettings> NOISE_SETTINGS = ResourceKey.create(
            Registries.NOISE_SETTINGS, TheNoxerna.prefix("the_noxerna"));
    public static final ResourceKey<LevelStem> LEVEL_STEM = ResourceKey.create(
            Registries.LEVEL_STEM, TheNoxerna.prefix("the_noxerna"));
    public static void bootstrapType(BootstrapContext<DimensionType> context) {
        context.register(DIMENSION_TYPE, new DimensionType(
                OptionalLong.empty(),
                false,
                true,
                false,
                true,
                0.4D,
                false,
                true,
                0,
                192,
                192,
                NoxernaTags.BlockTags.INFINIBURN_NOXERNA,
                DIMENSION_RENDERER,
                0.0f,
                new DimensionType.MonsterSettings(false, false, UniformInt.of(0, 7), 0)
        ));
    }
    public static void bootstrapNoise(BootstrapContext<NoiseGeneratorSettings> context) {
        context.register(NOISE_SETTINGS, new NoiseGeneratorSettings(
                NoiseSettings.create(0, 192, 2, 2),
                NoxernaBlocks.NOXUM.get().defaultBlockState(),
                Blocks.WATER.defaultBlockState(),
                new NoiseRouter(
                        DensityFunctions.zero(), // TODO Add density functions
                        DensityFunctions.zero(),
                        DensityFunctions.zero(),
                        DensityFunctions.zero(),
                        DensityFunctions.zero(),
                        DensityFunctions.zero(),
                        DensityFunctions.zero(),
                        DensityFunctions.zero(),
                        DensityFunctions.zero(),
                        DensityFunctions.zero(),
                        DensityFunctions.zero(),
                        DensityFunctions.zero(),
                        DensityFunctions.zero(),
                        DensityFunctions.zero(),
                        DensityFunctions.zero()
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
