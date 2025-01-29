package net.chairmanfed.noxerna.data.generators.tags;

import net.chairmanfed.noxerna.TheNoxerna;
import net.chairmanfed.noxerna.registry.NoxernaBlocks;
import net.chairmanfed.noxerna.registry.NoxernaTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

public class NoxernaBlockTags extends BlockTagsProvider {
    public NoxernaBlockTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                            ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TheNoxerna.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider lookupProvider) {
        // Minecraft Tags
        // World Generation
        tag(BlockTags.FEATURES_CANNOT_REPLACE)
                .add(NoxernaBlocks.VOIDROCK.get()).add(NoxernaBlocks.NOXERNA_PORTAL_FRAME.get());
        tag(BlockTags.GEODE_INVALID_BLOCKS)
                .add(NoxernaBlocks.VOIDROCK.get()).add(NoxernaBlocks.NOXERNA_PORTAL_FRAME.get());
        tag(BlockTags.LAVA_POOL_STONE_CANNOT_REPLACE)
                .add(NoxernaBlocks.VOIDROCK.get()).add(NoxernaBlocks.NOXERNA_PORTAL_FRAME.get());
        // Mining Logic
            // Valid Tool Assignment
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(NoxernaBlocks.NOXUM.get()).add(NoxernaBlocks.NOXUM_STAIRS.get())
                .add(NoxernaBlocks.NOXUM_SLAB.get()).add(NoxernaBlocks.NOXUM_WALL.get())
                .add(NoxernaBlocks.NOXUM_PRESSURE_PLATE.get()).add(NoxernaBlocks.POLISHED_NOXUM.get())
                .add(NoxernaBlocks.POLISHED_NOXUM_STAIRS.get()).add(NoxernaBlocks.POLISHED_NOXUM_SLAB.get())
                .add(NoxernaBlocks.POLISHED_NOXUM_WALL.get()).add(NoxernaBlocks.NOXUM_BRICKS.get())
                .add(NoxernaBlocks.NOXUM_BRICK_STAIRS.get()).add(NoxernaBlocks.NOXUM_BRICK_SLAB.get())
                .add(NoxernaBlocks.NOXUM_BRICK_WALL.get()).add(NoxernaBlocks.NOXUM_PEBBLE.get())
                .add(NoxernaBlocks.FERREBRIS_BLOCK.get()).add(NoxernaBlocks.FERREBRIS_PLATING.get())
                .add(NoxernaBlocks.FERREBRIS_PLATING_STAIRS.get()).add(NoxernaBlocks.FERREBRIS_PLATING_SLAB.get())
                .add(NoxernaBlocks.FERREBRIS_PLATING_WALL.get()).add(NoxernaBlocks.XENON_CONCRETE.get())
                .add(NoxernaBlocks.KRYPTON_CONCRETE.get()).add(NoxernaBlocks.ARGON_CONCRETE.get())
                .add(NoxernaBlocks.NEON_CONCRETE.get());
            // Required Tool Tier
        tag(BlockTags.NEEDS_STONE_TOOL)
                .addTag(NoxernaTags.BlockTags.FERREBRIS_STORAGE_BLOCKS).addTag(NoxernaTags.BlockTags.VITRAGOR_STORAGE_BLOCKS)
                .addTag(NoxernaTags.BlockTags.OBSCUPRUM_STORAGE_BLOCKS);
        // Logic
            // Entity Interaction
        tag(BlockTags.BLOCKS_WIND_CHARGE_EXPLOSIONS)
                .add(NoxernaBlocks.VOIDROCK.get()).add(NoxernaBlocks.NOXERNA_PORTAL_FRAME.get());
        tag(BlockTags.DRAGON_IMMUNE)
                .add(NoxernaBlocks.VOIDROCK.get()).add(NoxernaBlocks.NOXERNA_PORTAL_FRAME.get());
        tag(BlockTags.WITHER_IMMUNE)
                .add(NoxernaBlocks.VOIDROCK.get()).add(NoxernaBlocks.NOXERNA_PORTAL_FRAME.get());
        tag(BlockTags.PORTALS)
                .add(NoxernaBlocks.NOXERNA_PORTAL.get());
            // MultiBlock Formation
        tag(BlockTags.BEACON_BASE_BLOCKS)
                .addTag(NoxernaTags.BlockTags.FERREBRIS_STORAGE_BLOCKS).addTag(NoxernaTags.BlockTags.UMBURAM_STORAGE_BLOCKS);
            // Block Replacement
        tag(BlockTags.SCULK_REPLACEABLE)
                .addTag(NoxernaTags.BlockTags.BASE_STONE_NOXERNA);
        // Block Variations
        tag(BlockTags.STAIRS)
                .add(NoxernaBlocks.NOXUM_STAIRS.get()).add(NoxernaBlocks.POLISHED_NOXUM_STAIRS.get())
                .add(NoxernaBlocks.NOXUM_BRICK_STAIRS.get()).add(NoxernaBlocks.FERREBRIS_PLATING_STAIRS.get());
        tag(BlockTags.SLABS)
                .add(NoxernaBlocks.NOXUM_SLAB.get()).add(NoxernaBlocks.POLISHED_NOXUM_SLAB.get())
                .add(NoxernaBlocks.NOXUM_BRICK_SLAB.get()).add(NoxernaBlocks.FERREBRIS_PLATING_SLAB.get());
        tag(BlockTags.WALLS)
                .add(NoxernaBlocks.NOXUM_WALL.get()).add(NoxernaBlocks.POLISHED_NOXUM_WALL.get())
                .add(NoxernaBlocks.NOXUM_BRICK_WALL.get()).add(NoxernaBlocks.FERREBRIS_PLATING_WALL.get());
        tag(BlockTags.STONE_PRESSURE_PLATES)
                .add(NoxernaBlocks.NOXUM_PRESSURE_PLATE.get());
        tag(BlockTags.STONE_BUTTONS)
                .add(NoxernaBlocks.NOXUM_BUTTON.get());
        // Wooden Blocks
        tag(BlockTags.LOGS)
                .addTag(NoxernaTags.BlockTags.XENON_LOGS)
                .addTag(NoxernaTags.BlockTags.KRYPTON_LOGS);
        tag(BlockTags.PLANKS)
                .add(NoxernaBlocks.XENON_PLANKS.get())
                .add(NoxernaBlocks.KRYPTON_PLANKS.get());
            // Wooden Block Variations
        tag(BlockTags.WOODEN_STAIRS)
                .add(NoxernaBlocks.XENON_STAIRS.get()).add(NoxernaBlocks.KRYPTON_STAIRS.get())
                .add(NoxernaBlocks.ARGON_STAIRS.get());
        tag(BlockTags.WOODEN_SLABS)
                .add(NoxernaBlocks.XENON_SLAB.get()).add(NoxernaBlocks.KRYPTON_SLAB.get());
        tag(BlockTags.WOODEN_FENCES)
                .add(NoxernaBlocks.XENON_FENCE.get()).add(NoxernaBlocks.KRYPTON_FENCE.get());
        tag(BlockTags.FENCE_GATES)
                .add(NoxernaBlocks.XENON_FENCE_GATE.get()).add(NoxernaBlocks.KRYPTON_FENCE_GATE.get());
        tag(BlockTags.WOODEN_DOORS)
                .add(NoxernaBlocks.XENON_DOOR.get()).add(NoxernaBlocks.KRYPTON_DOOR.get());
        tag(BlockTags.WOODEN_TRAPDOORS)
                .add(NoxernaBlocks.XENON_TRAPDOOR.get()).add(NoxernaBlocks.KRYPTON_TRAPDOOR.get());
        tag(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(NoxernaBlocks.XENON_PRESSURE_PLATE.get()).add(NoxernaBlocks.KRYPTON_PRESSURE_PLATE.get());
        tag(BlockTags.WOODEN_BUTTONS)
                .add(NoxernaBlocks.XENON_BUTTON.get()).add(NoxernaBlocks.KRYPTON_BUTTON.get());
        // Dye able Blocks
        tag(BlockTags.CONCRETE_POWDER)
                .add(NoxernaBlocks.ARGON_CONCRETE_POWDER.get());
        // Common Tags
        // Material Storage Blocks
        tag(Tags.Blocks.STORAGE_BLOCKS)
                .addTag(NoxernaTags.BlockTags.FERREBRIS_STORAGE_BLOCKS).addTag(NoxernaTags.BlockTags.UMBURAM_STORAGE_BLOCKS)
                .addTag(NoxernaTags.BlockTags.TENERYL_STORAGE_BLOCKS).addTag(NoxernaTags.BlockTags.ADAMUNA_STORAGE_BLOCKS)
                .addTag(NoxernaTags.BlockTags.INPERLUM_STORAGE_BLOCKS).addTag(NoxernaTags.BlockTags.NIHOXITE_STORAGE_BLOCKS)
                .addTag(NoxernaTags.BlockTags.VITRAGOR_STORAGE_BLOCKS).addTag(NoxernaTags.BlockTags.OBSCUPRUM_STORAGE_BLOCKS);
        tag(NoxernaTags.BlockTags.FERREBRIS_STORAGE_BLOCKS)
                .add(NoxernaBlocks.FERREBRIS_BLOCK.get());
        tag(NoxernaTags.BlockTags.UMBURAM_STORAGE_BLOCKS)
                .add(NoxernaBlocks.UMBURAM_BLOCK.get());
        tag(NoxernaTags.BlockTags.TENERYL_STORAGE_BLOCKS)
                .add(NoxernaBlocks.TENERYL_BLOCK.get());
        tag(NoxernaTags.BlockTags.ADAMUNA_STORAGE_BLOCKS)
                .add(NoxernaBlocks.ADAMUNA_BLOCK.get());
        tag(NoxernaTags.BlockTags.INPERLUM_STORAGE_BLOCKS)
                .add(NoxernaBlocks.INPERLUM_BLOCK.get());
        tag(NoxernaTags.BlockTags.NIHOXITE_STORAGE_BLOCKS)
                .add(NoxernaBlocks.NIHOXITE_BLOCK.get());
        tag(NoxernaTags.BlockTags.VITRAGOR_STORAGE_BLOCKS)
                .add(NoxernaBlocks.VITRAGOR_BLOCK.get());
        tag(NoxernaTags.BlockTags.OBSCUPRUM_STORAGE_BLOCKS)
                .add(NoxernaBlocks.OBSCUPRUM_BLOCK.get());
        // Dye able Blocks
        tag(Tags.Blocks.CONCRETES)
                .add(NoxernaBlocks.XENON_CONCRETE.get()).add(NoxernaBlocks.KRYPTON_CONCRETE.get())
                .add(NoxernaBlocks.ARGON_CONCRETE.get()).add(NoxernaBlocks.NEON_CONCRETE.get());
        // Dyed Blocks
        tag(Tags.Blocks.DYED)
                .addTag(NoxernaTags.BlockTags.DYED_XENON).addTag(NoxernaTags.BlockTags.DYED_KRYPTON)
                .addTag(NoxernaTags.BlockTags.DYED_ARGON).addTag(NoxernaTags.BlockTags.DYED_NEON);
        tag(NoxernaTags.BlockTags.DYED_XENON)
                .add(NoxernaBlocks.XENON_CONCRETE.get()).add(NoxernaBlocks.XENON_CONCRETE_POWDER.get());
        tag(NoxernaTags.BlockTags.DYED_KRYPTON)
                .add(NoxernaBlocks.KRYPTON_CONCRETE.get()).add(NoxernaBlocks.KRYPTON_CONCRETE_POWDER.get());
        tag(NoxernaTags.BlockTags.DYED_ARGON)
                .add(NoxernaBlocks.ARGON_CONCRETE.get()).add(NoxernaBlocks.ARGON_CONCRETE_POWDER.get());
        tag(NoxernaTags.BlockTags.DYED_NEON)
                .add(NoxernaBlocks.NEON_CONCRETE.get()).add(NoxernaBlocks.NEON_CONCRETE_POWDER.get());

        // Noxerna Tags
        // Logic
            // Entity Interaction
        tag(NoxernaTags.BlockTags.BOSS_IMMUNE)
                .addTag(BlockTags.WITHER_IMMUNE);
            // World Changes
        tag(NoxernaTags.BlockTags.BASE_STONE_NOXERNA)
                .add(NoxernaBlocks.SOLTRA.get()).add(NoxernaBlocks.NOXUM.get()).add(NoxernaBlocks.AESTUM.get())
                .add(NoxernaBlocks.INETRA.get());
        tag(NoxernaTags.BlockTags.INFINIBURN_NOXERNA)
                .addTag(BlockTags.INFINIBURN_OVERWORLD)
                .add(NoxernaBlocks.VOIDROCK.get());
        tag(NoxernaTags.BlockTags.QUAKE_IMMUNE)
                .addTag(NoxernaTags.BlockTags.PEBBLES).addTag(NoxernaTags.BlockTags.BOSS_IMMUNE);
        tag(NoxernaTags.BlockTags.SOLAR_INCINERATION_IMMUNE)
                .add(NoxernaBlocks.SOLTRA.get()).add(NoxernaBlocks.POLISHED_SOLTRA.get())
                .add(NoxernaBlocks.SOLTRA_BRICKS.get()).addTag(NoxernaTags.BlockTags.PEBBLES)
                .addTag(NoxernaTags.BlockTags.BOSS_IMMUNE);
        // Mining Logic
            // Valid Tool Assignment
        tag(NoxernaTags.BlockTags.MINEABLE_WITH_PICKADZE)
                .addTag(BlockTags.MINEABLE_WITH_PICKAXE).addTag(BlockTags.MINEABLE_WITH_SHOVEL);
            // Incorrect Tool Tiers
        tag(NoxernaTags.BlockTags.INCORRECT_FOR_NOBLEWOOD_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_WOODEN_TOOL);
        tag(NoxernaTags.BlockTags.INCORRECT_FOR_NOXSTONE_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_STONE_TOOL);
        tag(NoxernaTags.BlockTags.INCORRECT_FOR_FERREBRIS_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_IRON_TOOL);
        tag(NoxernaTags.BlockTags.INCORRECT_FOR_UMBURAM_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_GOLD_TOOL);
        tag(NoxernaTags.BlockTags.INCORRECT_FOR_ADAMUNA_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL);
        tag(NoxernaTags.BlockTags.INCORRECT_FOR_NIHOXITE_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL);
        // Block Variations
        tag(NoxernaTags.BlockTags.PEBBLES)
                .add(NoxernaBlocks.SOLTRA_PEBBLE.get()).add(NoxernaBlocks.NOXUM_PEBBLE.get())
                .add(NoxernaBlocks.AESTUM_PEBBLE.get()).add(NoxernaBlocks.INETRA_PEBBLE.get());
        // Wooden Blocks
        tag(NoxernaTags.BlockTags.XENON_LOGS)
                .add(NoxernaBlocks.XENON_LOG.get()).add(NoxernaBlocks.XENON_WOOD.get())
                .add(NoxernaBlocks.STRIPPED_XENON_LOG.get()).add(NoxernaBlocks.STRIPPED_XENON_WOOD.get());
        tag(NoxernaTags.BlockTags.KRYPTON_LOGS)
                .add(NoxernaBlocks.KRYPTON_LOG.get()).add(NoxernaBlocks.KRYPTON_WOOD.get())
                .add(NoxernaBlocks.STRIPPED_KRYPTON_LOG.get()).add(NoxernaBlocks.STRIPPED_KRYPTON_WOOD.get());
    }
}