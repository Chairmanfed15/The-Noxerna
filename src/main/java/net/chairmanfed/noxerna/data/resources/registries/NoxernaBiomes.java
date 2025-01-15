package net.chairmanfed.noxerna.data.resources.registries;

import net.chairmanfed.noxerna.TheNoxerna;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.levelgen.carver.ConfiguredWorldCarver;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class NoxernaBiomes {
    private static ResourceKey<Biome> makeKey(String name) {
        return ResourceKey.create(Registries.BIOME, TheNoxerna.prefix(name));
    }

    // Surface Layer Biomes
    public static final ResourceKey<Biome> SURFACE = makeKey("surface");
    // Noxum Layer Biomes
    public static final ResourceKey<Biome> NOXUM_DEPTHS = makeKey("noxum_depths");
    public static final ResourceKey<Biome> XENON_GROTTO = makeKey("xenon_grotto");
    public static final ResourceKey<Biome> KRYPTON_GROTTO = makeKey("krypton_grotto");
    /* TODO Reserved for after 1.0
    public static final ResourceKey<Biome> ACID_DELTAS = makeKey("acid_deltas");
    public static final ResourceKey<Biome> FULGUR_DUNES = makeKey("fulgur_dunes");
     */
    // Aestum layer Biomes
    public static final ResourceKey<Biome> AESTUM_WASTES = makeKey("aestum_wastes");
    public static final ResourceKey<Biome> ARGON_GROVE = makeKey("argon_grove");
    public static final ResourceKey<Biome> NEON_GROVE = makeKey("neon_grove");
    /* TODO Reserved for after 1.0
    public static final ResourceKey<Biome> CALOLITH_CAVES = makeKey("calolith_caves");
    public static final ResourceKey<Biome> IRIDESERT = makeKey("iridesert");
     */
    // Inetra Layer Biomes
    public static final ResourceKey<Biome> INETRA_CRAGS = makeKey("inetra_crags");
    /* TODO Reserved for after 1.0
    public static final ResourceKey<Biome> FORGOTTEN_VALLEY = makeKey("forgotten_valley");
    public static final ResourceKey<Biome> FURLUM_GLACIERS = makeKey("furlum_glaciers");
    public static final ResourceKey<Biome> ORIGIN_FOREST = makeKey("origin_forest");
    public static final ResourceKey<Biome> GLOOMING_SPIRES = makeKey("glooming_spires");
     */
    // TODO This one will be relevant when I get to adding Void Tyrant
    // public static final ResourceKey<Biome> VOID_THRONE = makeKey("void_throne");

    public static void bootstrap(BootstrapContext<Biome> context) {
        HolderGetter<PlacedFeature> placedFeature = context.lookup(Registries.PLACED_FEATURE);
        HolderGetter<ConfiguredWorldCarver> configuredCarver = context.lookup(Registries.CONFIGURED_CARVER);

        context.register(SURFACE, new Biome.BiomeBuilder()
                .temperature(2.0f)
                .downfall(0.0f)
                .specialEffects(new BiomeSpecialEffects.Builder()
                        .waterColor(15590878)
                        .foliageColorOverride(0)
                        .grassColorOverride(0)
                        .waterFogColor(14536384)
                        .fogColor(0)
                        .skyColor(0)
                        .build())
                .mobSpawnSettings(MobSpawnSettings.EMPTY) // TODO Populate with entries
                .generationSettings(BiomeGenerationSettings.EMPTY) // TODO Populate with entries
                .build());
        context.register(NOXUM_DEPTHS, new Biome.BiomeBuilder()
                .temperature(0.8f)
                .downfall(0.0f)
                .specialEffects(new BiomeSpecialEffects.Builder()
                        .waterColor(2304829)
                        .foliageColorOverride(3350798)
                        .grassColorOverride(4271125)
                        .waterFogColor(1909551)
                        .fogColor(3092530)
                        .skyColor(2631723)
                        .build())
                .mobSpawnSettings(MobSpawnSettings.EMPTY) // TODO Populate with entries
                .generationSettings(BiomeGenerationSettings.EMPTY) // TODO Populate with entries
                .build());
        context.register(XENON_GROTTO, new Biome.BiomeBuilder()
                .temperature(0.8f)
                .downfall(0.0f)
                .specialEffects(new BiomeSpecialEffects.Builder()
                        .waterColor(2304829)
                        .foliageColorOverride(335667)
                        .grassColorOverride(799311)
                        .waterFogColor(1909551)
                        .fogColor(559807)
                        .skyColor(29866)
                        .build())
                .mobSpawnSettings(MobSpawnSettings.EMPTY) // TODO Populate with entries
                .generationSettings(BiomeGenerationSettings.EMPTY) // TODO Populate with entries
                .build());
        context.register(KRYPTON_GROTTO, new Biome.BiomeBuilder()
                .temperature(0.8f)
                .downfall(0.0f)
                .specialEffects(new BiomeSpecialEffects.Builder()
                        .waterColor(2304829)
                        .foliageColorOverride(86788)
                        .grassColorOverride(484362)
                        .waterFogColor(1909551)
                        .fogColor(1473342)
                        .skyColor(28198)
                        .build())
                .mobSpawnSettings(MobSpawnSettings.EMPTY) // TODO Populate with entries
                .generationSettings(BiomeGenerationSettings.EMPTY) // TODO Populate with entries
                .build());
        context.register(AESTUM_WASTES, new Biome.BiomeBuilder()
                .temperature(0.8f)
                .downfall(0.0f)
                .specialEffects(new BiomeSpecialEffects.Builder()
                        .waterColor(13155539)
                        .foliageColorOverride(2299151)
                        .grassColorOverride(3219223)
                        .waterFogColor(12236988)
                        .fogColor(4537422)
                        .skyColor(2629935)
                        .build())
                .mobSpawnSettings(MobSpawnSettings.EMPTY) // TODO Populate with entries
                .generationSettings(BiomeGenerationSettings.EMPTY) // TODO Populate with entries
                .build());
        context.register(ARGON_GROVE, new Biome.BiomeBuilder()
                .temperature(0.8f)
                .downfall(0.0f)
                .specialEffects(new BiomeSpecialEffects.Builder()
                        .waterColor(13155539)
                        .foliageColorOverride(2296611)
                        .grassColorOverride(3412788)
                        .waterFogColor(12236988)
                        .fogColor(9175151)
                        .skyColor(7209054)
                        .build())
                .mobSpawnSettings(MobSpawnSettings.EMPTY) // TODO Populate with entries
                .generationSettings(BiomeGenerationSettings.EMPTY) // TODO Populate with entries
                .build());
        context.register(NEON_GROVE, new Biome.BiomeBuilder()
                .temperature(0.8f)
                .downfall(0.0f)
                .specialEffects(new BiomeSpecialEffects.Builder()
                        .waterColor(13155539)
                        .foliageColorOverride(1444643)
                        .grassColorOverride(2758719)
                        .waterFogColor(12236988)
                        .fogColor(8530092)
                        .skyColor(7608488)
                        .build())
                .mobSpawnSettings(MobSpawnSettings.EMPTY) // TODO Populate with entries
                .generationSettings(BiomeGenerationSettings.EMPTY) // TODO Populate with entries
                .build());
        context.register(INETRA_CRAGS, new Biome.BiomeBuilder()
                .temperature(0.8f)
                .downfall(0.0f)
                .specialEffects(new BiomeSpecialEffects.Builder()
                        .waterColor(2434345)
                        .foliageColorOverride(985877)
                        .grassColorOverride(1446173)
                        .waterFogColor(1710622)
                        .fogColor(2697513)
                        .skyColor(1052688)
                        .build())
                .mobSpawnSettings(MobSpawnSettings.EMPTY) // TODO Populate with entries
                .generationSettings(BiomeGenerationSettings.EMPTY) // TODO Populate with entries
                .build());
    }
}
