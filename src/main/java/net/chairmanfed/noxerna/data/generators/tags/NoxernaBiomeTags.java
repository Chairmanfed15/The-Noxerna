package net.chairmanfed.noxerna.data.generators.tags;

import net.chairmanfed.noxerna.Noxerna;
import net.chairmanfed.noxerna.data.resources.registries.NoxernaBiomes;
import net.chairmanfed.noxerna.registry.NoxernaTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.BiomeTagsProvider;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class NoxernaBiomeTags extends BiomeTagsProvider {
    public NoxernaBiomeTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                            @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Noxerna.MODID, existingFileHelper);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void addTags(HolderLookup.Provider lookupProvider) {
        // Minecraft Tags

        // Common Tags
        tag(Tags.Biomes.IS_HOT)
                .addTag(NoxernaTags.BiomeTags.IS_HOT_NOXERNA);
        tag(NoxernaTags.BiomeTags.IS_HOT_NOXERNA)
                .add(NoxernaBiomes.SURFACE)
                .add(NoxernaBiomes.AESTUM_WASTES);
        // Noxerna Tags
        tag(NoxernaTags.BiomeTags.IS_NOXERNA)
                .addTag(NoxernaTags.BiomeTags.SURFACE_LAYER_BIOMES)
                .addTag(NoxernaTags.BiomeTags.IS_UNDERGROUND_NOXERNA);
        tag(NoxernaTags.BiomeTags.IS_UNDERGROUND_NOXERNA)
                .addTag(NoxernaTags.BiomeTags.NOXUM_LAYER_BIOMES)
                .addTag(NoxernaTags.BiomeTags.AESTUM_LAYER_BIOMES)
                .addTag(NoxernaTags.BiomeTags.INETRA_LAYER_BIOMES);
        tag(NoxernaTags.BiomeTags.SURFACE_LAYER_BIOMES)
                .add(NoxernaBiomes.SURFACE);
        tag(NoxernaTags.BiomeTags.NOXUM_LAYER_BIOMES)
                .add(NoxernaBiomes.NOXUM_DEPTHS)
                .add(NoxernaBiomes.XENON_GROTTO)
                .add(NoxernaBiomes.KRYPTON_GROTTO);
        tag(NoxernaTags.BiomeTags.AESTUM_LAYER_BIOMES)
                .add(NoxernaBiomes.AESTUM_WASTES)
                .add(NoxernaBiomes.ARGON_GROVE)
                .add(NoxernaBiomes.NEON_GROVE);
        tag(NoxernaTags.BiomeTags.INETRA_LAYER_BIOMES)
                .add(NoxernaBiomes.INETRA_CRAGS);
        tag(NoxernaTags.BiomeTags.HAS_DENSE_FOG)
                .addTag(NoxernaTags.BiomeTags.IS_UNDERGROUND_NOXERNA);
        tag(NoxernaTags.BiomeTags.IS_NOBLEPHYTE_BIOME)
                .add(NoxernaBiomes.XENON_GROTTO)
                .add(NoxernaBiomes.KRYPTON_GROTTO)
                .add(NoxernaBiomes.ARGON_GROVE)
                .add(NoxernaBiomes.NEON_GROVE);
    }
}
