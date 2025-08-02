package net.chairmanfed.noxerna.data.generators.tags;

import net.chairmanfed.noxerna.Noxerna;
import net.chairmanfed.noxerna.block.NoxernaBlocks;
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
        super(output, lookupProvider, Noxerna.MODID, existingFileHelper);
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
                // Stone Types
                    // Soltra
                .add(NoxernaBlocks.SOLTRA.get())
                .add(NoxernaBlocks.SOLTRA_STAIRS.get())
                .add(NoxernaBlocks.SOLTRA_SLAB.get())
                .add(NoxernaBlocks.SOLTRA_WALL.get())
                .add(NoxernaBlocks.SOLTRA_PRESSURE_PLATE.get())
                .add(NoxernaBlocks.SOLTRA_BUTTON.get())
                .add(NoxernaBlocks.POLISHED_SOLTRA.get())
                .add(NoxernaBlocks.POLISHED_SOLTRA_STAIRS.get())
                .add(NoxernaBlocks.POLISHED_SOLTRA_SLAB.get())
                .add(NoxernaBlocks.POLISHED_SOLTRA_WALL.get())
                .add(NoxernaBlocks.SOLTRA_BRICKS.get())
                .add(NoxernaBlocks.SOLTRA_BRICK_STAIRS.get())
                .add(NoxernaBlocks.SOLTRA_BRICK_SLAB.get())
                .add(NoxernaBlocks.SOLTRA_BRICK_WALL.get())
                    // Noxum
                .add(NoxernaBlocks.NOXUM.get())
                .add(NoxernaBlocks.NOXUM_STAIRS.get())
                .add(NoxernaBlocks.NOXUM_SLAB.get())
                .add(NoxernaBlocks.NOXUM_WALL.get())
                .add(NoxernaBlocks.NOXUM_PRESSURE_PLATE.get())
                .add(NoxernaBlocks.NOXUM_BUTTON.get())
                .add(NoxernaBlocks.POLISHED_NOXUM.get())
                .add(NoxernaBlocks.POLISHED_NOXUM_STAIRS.get())
                .add(NoxernaBlocks.POLISHED_NOXUM_SLAB.get())
                .add(NoxernaBlocks.POLISHED_NOXUM_WALL.get())
                .add(NoxernaBlocks.NOXUM_BRICKS.get())
                .add(NoxernaBlocks.NOXUM_BRICK_STAIRS.get())
                .add(NoxernaBlocks.NOXUM_BRICK_SLAB.get())
                .add(NoxernaBlocks.NOXUM_BRICK_WALL.get())
                .add(NoxernaBlocks.NOXERNA_PORTAL_FRAME.get())
                    // Aestum
                .add(NoxernaBlocks.AESTUM.get())
                .add(NoxernaBlocks.AESTUM_STAIRS.get())
                .add(NoxernaBlocks.AESTUM_SLAB.get())
                .add(NoxernaBlocks.AESTUM_WALL.get())
                .add(NoxernaBlocks.AESTUM_PRESSURE_PLATE.get())
                .add(NoxernaBlocks.AESTUM_BUTTON.get())
                .add(NoxernaBlocks.POLISHED_AESTUM.get())
                .add(NoxernaBlocks.POLISHED_AESTUM_STAIRS.get())
                .add(NoxernaBlocks.POLISHED_AESTUM_SLAB.get())
                .add(NoxernaBlocks.POLISHED_AESTUM_WALL.get())
                .add(NoxernaBlocks.AESTUM_BRICKS.get())
                .add(NoxernaBlocks.AESTUM_BRICK_STAIRS.get())
                .add(NoxernaBlocks.AESTUM_BRICK_SLAB.get())
                .add(NoxernaBlocks.AESTUM_BRICK_WALL.get())
                    // Inetra
                .add(NoxernaBlocks.INETRA.get())
                .add(NoxernaBlocks.INETRA_STAIRS.get())
                .add(NoxernaBlocks.INETRA_SLAB.get())
                .add(NoxernaBlocks.INETRA_WALL.get())
                .add(NoxernaBlocks.INETRA_PRESSURE_PLATE.get())
                .add(NoxernaBlocks.INETRA_BUTTON.get())
                .add(NoxernaBlocks.POLISHED_INETRA.get())
                .add(NoxernaBlocks.POLISHED_INETRA_STAIRS.get())
                .add(NoxernaBlocks.POLISHED_INETRA_SLAB.get())
                .add(NoxernaBlocks.POLISHED_INETRA_WALL.get())
                .add(NoxernaBlocks.INETRA_BRICKS.get())
                .add(NoxernaBlocks.INETRA_BRICK_STAIRS.get())
                .add(NoxernaBlocks.INETRA_BRICK_SLAB.get())
                .add(NoxernaBlocks.INETRA_BRICK_WALL.get())
                .addTag(NoxernaTags.BlockTags.PEBBLES)
                // Metal Plating
                // Vanilla
                    // Iron
                .add(NoxernaBlocks.IRON_PLATING.get())
                .add(NoxernaBlocks.IRON_PLATING_STAIRS.get())
                .add(NoxernaBlocks.IRON_PLATING_SLAB.get())
                .add(NoxernaBlocks.IRON_PLATING_WALL.get())
                    // Gold
                .add(NoxernaBlocks.GOLD_PLATING.get())
                .add(NoxernaBlocks.GOLD_PLATING_STAIRS.get())
                .add(NoxernaBlocks.GOLD_PLATING_SLAB.get())
                .add(NoxernaBlocks.GOLD_PLATING_WALL.get())
                    // Netherite
                .add(NoxernaBlocks.NETHERITE_PLATING.get())
                .add(NoxernaBlocks.NETHERITE_PLATING_STAIRS.get())
                .add(NoxernaBlocks.NETHERITE_PLATING_SLAB.get())
                .add(NoxernaBlocks.NETHERITE_PLATING_WALL.get())
                // Noxerna
                    // Ferrebris
                .add(NoxernaBlocks.FERREBRIS_BLOCK.get())
                .add(NoxernaBlocks.FERREBRIS_BARS.get())
                .add(NoxernaBlocks.FERREBRIS_PLATING.get())
                .add(NoxernaBlocks.FERREBRIS_PLATING_STAIRS.get())
                .add(NoxernaBlocks.FERREBRIS_PLATING_SLAB.get())
                .add(NoxernaBlocks.FERREBRIS_PLATING_WALL.get())
                .add(NoxernaBlocks.UMBURAM_BLOCK.get())
                .add(NoxernaBlocks.UMBURAM_PLATING.get())
                .add(NoxernaBlocks.UMBURAM_PLATING_STAIRS.get())
                .add(NoxernaBlocks.UMBURAM_PLATING_SLAB.get())
                .add(NoxernaBlocks.UMBURAM_PLATING_WALL.get())
                .add(NoxernaBlocks.INPERLUM_BLOCK.get())
                .add(NoxernaBlocks.INPERLUM_PLATING.get())
                .add(NoxernaBlocks.INPERLUM_PLATING_STAIRS.get())
                .add(NoxernaBlocks.INPERLUM_PLATING_SLAB.get())
                .add(NoxernaBlocks.INPERLUM_PLATING_WALL.get())
                .add(NoxernaBlocks.NIHOXITE_BLOCK.get())
                .add(NoxernaBlocks.NIHOXITE_PLATING.get())
                .add(NoxernaBlocks.NIHOXITE_PLATING_STAIRS.get())
                .add(NoxernaBlocks.NIHOXITE_PLATING_SLAB.get())
                .add(NoxernaBlocks.NIHOXITE_PLATING_WALL.get())
                .add(NoxernaBlocks.MYSTERIOUS_ALLOY_PLATING.get())
                .add(NoxernaBlocks.MYSTERIOUS_ALLOY_PLATING_STAIRS.get())
                .add(NoxernaBlocks.MYSTERIOUS_ALLOY_PLATING_SLAB.get())
                .add(NoxernaBlocks.MYSTERIOUS_ALLOY_PLATING_WALL.get())
                .add(NoxernaBlocks.XENON_CONCRETE.get())
                .add(NoxernaBlocks.KRYPTON_CONCRETE.get())
                .add(NoxernaBlocks.ARGON_CONCRETE.get())
                .add(NoxernaBlocks.NEON_CONCRETE.get());
            // Required Tool Tier
        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(NoxernaBlocks.FERREBRIS_BLOCK.get())
                .add(NoxernaBlocks.VITRAGOR_BLOCK.get())
                .add(NoxernaBlocks.OBSCUPRUM_BLOCK.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(NoxernaBlocks.INETRA.get()).add(NoxernaBlocks.INETRA_STAIRS.get())
                .add(NoxernaBlocks.INETRA_SLAB.get()).add(NoxernaBlocks.INETRA_WALL.get())
                .add(NoxernaBlocks.POLISHED_INETRA.get()).add(NoxernaBlocks.POLISHED_INETRA_STAIRS.get())
                .add(NoxernaBlocks.POLISHED_INETRA_SLAB.get()).add(NoxernaBlocks.POLISHED_INETRA_WALL.get())
                .add(NoxernaBlocks.INETRA_BRICKS.get()).add(NoxernaBlocks.INETRA_BRICK_STAIRS.get())
                .add(NoxernaBlocks.INETRA_BRICK_SLAB.get()).add(NoxernaBlocks.INETRA_BRICK_WALL.get())
                .add(NoxernaBlocks.UMBURAM_BLOCK.get()).add(NoxernaBlocks.UMBURAM_PLATING.get())
                .add(NoxernaBlocks.UMBURAM_PLATING_STAIRS.get()).add(NoxernaBlocks.UMBURAM_PLATING_SLAB.get())
                .add(NoxernaBlocks.UMBURAM_PLATING_WALL.get()).add(NoxernaBlocks.TENERYL_BLOCK.get())
                .add(NoxernaBlocks.ADAMUNA_BLOCK.get());
        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(NoxernaBlocks.SOLTRA.get()).add(NoxernaBlocks.SOLTRA_STAIRS.get())
                .add(NoxernaBlocks.SOLTRA_SLAB.get()).add(NoxernaBlocks.POLISHED_SOLTRA.get())
                .add(NoxernaBlocks.POLISHED_SOLTRA_STAIRS.get()).add(NoxernaBlocks.POLISHED_SOLTRA_SLAB.get())
                .add(NoxernaBlocks.POLISHED_SOLTRA_WALL.get()).add(NoxernaBlocks.SOLTRA_BRICKS.get())
                .add(NoxernaBlocks.SOLTRA_BRICK_STAIRS.get()).add(NoxernaBlocks.SOLTRA_BRICK_SLAB.get())
                .add(NoxernaBlocks.SOLTRA_BRICK_WALL.get()).add(NoxernaBlocks.INPERLUM_BLOCK.get())
                .add(NoxernaBlocks.INPERLUM_PLATING.get()).add(NoxernaBlocks.INPERLUM_PLATING_STAIRS.get())
                .add(NoxernaBlocks.INPERLUM_PLATING_SLAB.get()).add(NoxernaBlocks.INPERLUM_PLATING_WALL.get())
                .add(NoxernaBlocks.NIHOXITE_BLOCK.get()).add(NoxernaBlocks.NIHOXITE_PLATING.get())
                .add(NoxernaBlocks.NIHOXITE_PLATING_STAIRS.get()).add(NoxernaBlocks.NIHOXITE_PLATING_SLAB.get())
                .add(NoxernaBlocks.NIHOXITE_PLATING_WALL.get());
        tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .addTag(NoxernaTags.BlockTags.NEEDS_ADAMUNA_TOOL);
        // Incorrect Tool Tier
        tag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .add(NoxernaBlocks.NOXERNA_PORTAL_FRAME.get());
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
                .add(NoxernaBlocks.SOLTRA_STAIRS.get())
                .add(NoxernaBlocks.POLISHED_SOLTRA_STAIRS.get())
                .add(NoxernaBlocks.SOLTRA_BRICK_STAIRS.get())
                .add(NoxernaBlocks.NOXUM_STAIRS.get())
                .add(NoxernaBlocks.POLISHED_NOXUM_STAIRS.get())
                .add(NoxernaBlocks.NOXUM_BRICK_STAIRS.get())
                .add(NoxernaBlocks.AESTUM_STAIRS.get())
                .add(NoxernaBlocks.POLISHED_AESTUM_STAIRS.get())
                .add(NoxernaBlocks.AESTUM_BRICK_STAIRS.get())
                .add(NoxernaBlocks.INETRA_STAIRS.get())
                .add(NoxernaBlocks.POLISHED_INETRA_STAIRS.get())
                .add(NoxernaBlocks.INETRA_BRICK_STAIRS.get())
                .add(NoxernaBlocks.IRON_PLATING_STAIRS.get())
                .add(NoxernaBlocks.GOLD_PLATING_STAIRS.get())
                .add(NoxernaBlocks.NETHERITE_PLATING_STAIRS.get())
                .add(NoxernaBlocks.FERREBRIS_PLATING_STAIRS.get())
                .add(NoxernaBlocks.UMBURAM_PLATING_STAIRS.get())
                .add(NoxernaBlocks.INPERLUM_PLATING_STAIRS.get())
                .add(NoxernaBlocks.NIHOXITE_PLATING_STAIRS.get());
        tag(BlockTags.SLABS)
                .add(NoxernaBlocks.SOLTRA_SLAB.get())
                .add(NoxernaBlocks.POLISHED_SOLTRA_SLAB.get())
                .add(NoxernaBlocks.SOLTRA_BRICK_SLAB.get())
                .add(NoxernaBlocks.NOXUM_SLAB.get())
                .add(NoxernaBlocks.POLISHED_NOXUM_SLAB.get())
                .add(NoxernaBlocks.NOXUM_BRICK_SLAB.get())
                .add(NoxernaBlocks.AESTUM_SLAB.get())
                .add(NoxernaBlocks.POLISHED_AESTUM_SLAB.get())
                .add(NoxernaBlocks.AESTUM_BRICK_SLAB.get())
                .add(NoxernaBlocks.INETRA_SLAB.get())
                .add(NoxernaBlocks.POLISHED_INETRA_SLAB.get())
                .add(NoxernaBlocks.INETRA_BRICK_SLAB.get())
                .add(NoxernaBlocks.IRON_PLATING_SLAB.get())
                .add(NoxernaBlocks.GOLD_PLATING_SLAB.get())
                .add(NoxernaBlocks.NETHERITE_PLATING_SLAB.get())
                .add(NoxernaBlocks.FERREBRIS_PLATING_SLAB.get())
                .add(NoxernaBlocks.UMBURAM_PLATING_SLAB.get())
                .add(NoxernaBlocks.INPERLUM_PLATING_SLAB.get())
                .add(NoxernaBlocks.NIHOXITE_PLATING_SLAB.get())
                .add(NoxernaBlocks.MYSTERIOUS_ALLOY_PLATING_SLAB.get());
        tag(BlockTags.WALLS)
                .add(NoxernaBlocks.SOLTRA_WALL.get())
                .add(NoxernaBlocks.POLISHED_SOLTRA_WALL.get())
                .add(NoxernaBlocks.SOLTRA_BRICK_WALL.get())
                .add(NoxernaBlocks.NOXUM_WALL.get())
                .add(NoxernaBlocks.POLISHED_NOXUM_WALL.get())
                .add(NoxernaBlocks.NOXUM_BRICK_WALL.get())
                .add(NoxernaBlocks.AESTUM_WALL.get())
                .add(NoxernaBlocks.POLISHED_AESTUM_WALL.get())
                .add(NoxernaBlocks.AESTUM_BRICK_WALL.get())
                .add(NoxernaBlocks.INETRA_WALL.get())
                .add(NoxernaBlocks.POLISHED_INETRA_WALL.get())
                .add(NoxernaBlocks.INETRA_BRICK_WALL.get())
                .add(NoxernaBlocks.IRON_PLATING_WALL.get())
                .add(NoxernaBlocks.GOLD_PLATING_WALL.get())
                .add(NoxernaBlocks.NETHERITE_PLATING_WALL.get())
                .add(NoxernaBlocks.FERREBRIS_PLATING_WALL.get())
                .add(NoxernaBlocks.UMBURAM_PLATING_WALL.get())
                .add(NoxernaBlocks.INPERLUM_PLATING_WALL.get())
                .add(NoxernaBlocks.NIHOXITE_PLATING_WALL.get())
                .add(NoxernaBlocks.MYSTERIOUS_ALLOY_PLATING_WALL.get());
        tag(BlockTags.STONE_PRESSURE_PLATES)
                .add(NoxernaBlocks.SOLTRA_PRESSURE_PLATE.get())
                .add(NoxernaBlocks.NOXUM_PRESSURE_PLATE.get())
                .add(NoxernaBlocks.AESTUM_PRESSURE_PLATE.get())
                .add(NoxernaBlocks.INETRA_PRESSURE_PLATE.get());
        tag(BlockTags.STONE_BUTTONS)
                .add(NoxernaBlocks.SOLTRA_BUTTON.get())
                .add(NoxernaBlocks.NOXUM_BUTTON.get())
                .add(NoxernaBlocks.AESTUM_BUTTON.get())
                .add(NoxernaBlocks.INETRA_BUTTON.get());
        // Wooden Blocks
        tag(BlockTags.LOGS)
                .addTag(NoxernaTags.BlockTags.XENON_LOGS).addTag(NoxernaTags.BlockTags.KRYPTON_LOGS)
                .addTag(NoxernaTags.BlockTags.ARGON_LOGS).addTag(NoxernaTags.BlockTags.NEON_LOGS);
        tag(BlockTags.PLANKS)
                .add(NoxernaBlocks.XENON_PLANKS.get()).add(NoxernaBlocks.KRYPTON_PLANKS.get())
                .add(NoxernaBlocks.ARGON_PLANKS.get()).add(NoxernaBlocks.NEON_PLANKS.get());
            // Wooden Block Variations
        tag(BlockTags.WOODEN_STAIRS)
                .add(NoxernaBlocks.XENON_STAIRS.get()).add(NoxernaBlocks.KRYPTON_STAIRS.get())
                .add(NoxernaBlocks.ARGON_STAIRS.get()).add(NoxernaBlocks.NEON_STAIRS.get());
        tag(BlockTags.WOODEN_SLABS)
                .add(NoxernaBlocks.XENON_SLAB.get()).add(NoxernaBlocks.KRYPTON_SLAB.get())
                .add(NoxernaBlocks.ARGON_SLAB.get()).add(NoxernaBlocks.NEON_SLAB.get());
        tag(BlockTags.WOODEN_FENCES)
                .add(NoxernaBlocks.XENON_FENCE.get()).add(NoxernaBlocks.KRYPTON_FENCE.get())
                .add(NoxernaBlocks.ARGON_FENCE.get()).add(NoxernaBlocks.NEON_FENCE.get());
        tag(BlockTags.FENCE_GATES)
                .add(NoxernaBlocks.XENON_FENCE_GATE.get()).add(NoxernaBlocks.KRYPTON_FENCE_GATE.get())
                .add(NoxernaBlocks.ARGON_FENCE_GATE.get()).add(NoxernaBlocks.NEON_FENCE_GATE.get());
        tag(BlockTags.WOODEN_DOORS)
                .add(NoxernaBlocks.XENON_DOOR.get()).add(NoxernaBlocks.KRYPTON_DOOR.get())
                .add(NoxernaBlocks.ARGON_DOOR.get()).add(NoxernaBlocks.NEON_DOOR.get());
        tag(BlockTags.WOODEN_TRAPDOORS)
                .add(NoxernaBlocks.XENON_TRAPDOOR.get()).add(NoxernaBlocks.KRYPTON_TRAPDOOR.get())
                .add(NoxernaBlocks.ARGON_TRAPDOOR.get()).add(NoxernaBlocks.NEON_TRAPDOOR.get());
        tag(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(NoxernaBlocks.XENON_PRESSURE_PLATE.get()).add(NoxernaBlocks.KRYPTON_PRESSURE_PLATE.get())
                .add(NoxernaBlocks.ARGON_PRESSURE_PLATE.get()).add(NoxernaBlocks.NEON_PRESSURE_PLATE.get());
        tag(BlockTags.WOODEN_BUTTONS)
                .add(NoxernaBlocks.XENON_BUTTON.get()).add(NoxernaBlocks.KRYPTON_BUTTON.get())
                .add(NoxernaBlocks.ARGON_BUTTON.get()).add(NoxernaBlocks.NEON_BUTTON.get());
        // Dye able Blocks
        tag(BlockTags.CONCRETE_POWDER)
                .add(NoxernaBlocks.ARGON_CONCRETE_POWDER.get());
        // Common Tags
        // Ores
        tag(Tags.Blocks.ORES)
                .addTag(NoxernaTags.BlockTags.BURIED_FUEL_CELLS)
                .addTag(NoxernaTags.BlockTags.ORES_FERREBRIS);
        tag(NoxernaTags.BlockTags.BURIED_FUEL_CELLS)
                .add(NoxernaBlocks.NOXUM_BURIED_FUEL_CELL.get())
                .add(NoxernaBlocks.AESTUM_BURIED_FUEL_CELL.get())
                .add(NoxernaBlocks.INETRA_BURIED_FUEL_CELL.get());
        tag(NoxernaTags.BlockTags.ORES_FERREBRIS)
                .addTag(NoxernaTags.BlockTags.FERREBRIS_ORES);
        // Material Storage Blocks
        tag(Tags.Blocks.STORAGE_BLOCKS)
                .addTag(NoxernaTags.BlockTags.FERREBRIS_STORAGE_BLOCKS)
                .addTag(NoxernaTags.BlockTags.UMBURAM_STORAGE_BLOCKS)
                .addTag(NoxernaTags.BlockTags.TENERYL_STORAGE_BLOCKS)
                .addTag(NoxernaTags.BlockTags.ADAMUNA_STORAGE_BLOCKS)
                .addTag(NoxernaTags.BlockTags.INPERLUM_STORAGE_BLOCKS)
                .addTag(NoxernaTags.BlockTags.NIHOXITE_STORAGE_BLOCKS)
                .addTag(NoxernaTags.BlockTags.VITRAGOR_STORAGE_BLOCKS)
                .addTag(NoxernaTags.BlockTags.OBSCUPRUM_STORAGE_BLOCKS);
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
        // Dyed Blocks
        tag(Tags.Blocks.CONCRETES)
                .add(NoxernaBlocks.XENON_CONCRETE.get()).add(NoxernaBlocks.KRYPTON_CONCRETE.get())
                .add(NoxernaBlocks.ARGON_CONCRETE.get()).add(NoxernaBlocks.NEON_CONCRETE.get());
        // Dyed <Colour> Blocks
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
            // Correct Tool Tiers
        tag(NoxernaTags.BlockTags.NEEDS_ADAMUNA_TOOL)
                .add(NoxernaBlocks.NOXERNA_PORTAL_FRAME.get());
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
                .addTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .remove(NoxernaTags.BlockTags.NEEDS_ADAMUNA_TOOL);
        tag(NoxernaTags.BlockTags.INCORRECT_FOR_NIHOXITE_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL);
        // Ores
        tag(NoxernaTags.BlockTags.FERREBRIS_ORES)
                .add(NoxernaBlocks.NOXUM_FERREBRIS_ORE.get())
                .add(NoxernaBlocks.AESTUM_FERREBRIS_ORE.get())
                .add(NoxernaBlocks.INETRA_FERREBRIS_ORE.get());
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
        tag(NoxernaTags.BlockTags.ARGON_LOGS)
                .add(NoxernaBlocks.ARGON_LOG.get()).add(NoxernaBlocks.ARGON_WOOD.get())
                .add(NoxernaBlocks.STRIPPED_ARGON_LOG.get()).add(NoxernaBlocks.STRIPPED_ARGON_WOOD.get());
        tag(NoxernaTags.BlockTags.NEON_LOGS)
                .add(NoxernaBlocks.NEON_LOG.get()).add(NoxernaBlocks.NEON_WOOD.get())
                .add(NoxernaBlocks.STRIPPED_NEON_LOG.get()).add(NoxernaBlocks.STRIPPED_NEON_WOOD.get());
    }
}