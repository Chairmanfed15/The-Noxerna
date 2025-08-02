package net.chairmanfed.noxerna.data.generators.tags;

import net.chairmanfed.noxerna.Noxerna;
import net.chairmanfed.noxerna.registry.NoxernaTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.EntityTypeTagsProvider;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.world.entity.EntityType;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

public class NoxernaEntityTags extends EntityTypeTagsProvider {
    public NoxernaEntityTags(PackOutput output, CompletableFuture<HolderLookup.Provider> provider,
                             ExistingFileHelper existingFileHelper) {
        super(output, provider, Noxerna.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(NoxernaTags.EntityTags.SENSITIVE_TO_DISMANTLE)
                .add(EntityType.IRON_GOLEM)
                .add(EntityType.SNOW_GOLEM)
                .add(EntityType.SHULKER)
                .add(EntityType.GUARDIAN)
                .add(EntityType.ELDER_GUARDIAN)
                .add(EntityType.WITHER)
                .addOptionalTag(NoxernaTags.EntityTags.AUTOMATONS);
        tag(NoxernaTags.EntityTags.QUAKE_IMMUNE)
                .addTag(EntityTypeTags.IMPACT_PROJECTILES)
                .addTag(EntityTypeTags.REDIRECTABLE_PROJECTILE)
                .addTag(Tags.EntityTypes.BOSSES)
                .addTag(Tags.EntityTypes.MINECARTS)
                .addTag(Tags.EntityTypes.BOATS)
                .add(EntityType.END_CRYSTAL);
    }
}
