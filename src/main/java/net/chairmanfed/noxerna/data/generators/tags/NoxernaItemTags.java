package net.chairmanfed.noxerna.data.generators.tags;

import net.chairmanfed.noxerna.Noxerna;
import net.chairmanfed.noxerna.item.NoxernaItems;
import net.chairmanfed.noxerna.registry.NoxernaTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

public class NoxernaItemTags extends ItemTagsProvider {
    public NoxernaItemTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                           CompletableFuture<TagLookup<Block>> blockTags,
                           ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, Noxerna.MODID, existingFileHelper);
    }
    @Override
    protected void addTags(HolderLookup.Provider lookupProvider) {
        // Minecraft Tags
        // Copy from Block Tags
        this.copy(BlockTags.LOGS, ItemTags.LOGS);
        this.copy(BlockTags.STAIRS, ItemTags.STAIRS);
        this.copy(BlockTags.WOODEN_STAIRS, ItemTags.WOODEN_STAIRS);
        this.copy(BlockTags.SLABS, ItemTags.SLABS);
        this.copy(BlockTags.WOODEN_SLABS, ItemTags.WOODEN_SLABS);
        this.copy(BlockTags.WOODEN_FENCES, ItemTags.WOODEN_FENCES);
        this.copy(BlockTags.WALLS, ItemTags.WALLS);
        this.copy(BlockTags.FENCE_GATES, ItemTags.FENCE_GATES);
        this.copy(BlockTags.WOODEN_PRESSURE_PLATES, ItemTags.WOODEN_PRESSURE_PLATES);
        this.copy(BlockTags.WOODEN_BUTTONS, ItemTags.WOODEN_BUTTONS);
        this.copy(BlockTags.STONE_BUTTONS, ItemTags.STONE_BUTTONS);
        // Enchanting
        tag(ItemTags.DURABILITY_ENCHANTABLE)
                .addTag(NoxernaTags.ItemTags.PICKADZES);
        // Tools
        tag(ItemTags.AXES)
                .add(NoxernaItems.NOBLEWOOD_AXE.get()).add(NoxernaItems.NOXSTONE_AXE.get())
                .add(NoxernaItems.FERREBRIS_AXE.get()).add(NoxernaItems.UMBURAM_AXE.get())
                .add(NoxernaItems.ADAMUNA_AXE.get()).add(NoxernaItems.NIHOXITE_AXE.get());
        tag(ItemTags.HOES)
                .add(NoxernaItems.NOBLEWOOD_HOE.get()).add(NoxernaItems.NOXSTONE_HOE.get())
                .add(NoxernaItems.FERREBRIS_HOE.get()).add(NoxernaItems.UMBURAM_HOE.get())
                .add(NoxernaItems.ADAMUNA_HOE.get()).add(NoxernaItems.NIHOXITE_HOE.get());
        tag(ItemTags.PICKAXES)
                .add(NoxernaItems.NOBLEWOOD_PICKAXE.get()).add(NoxernaItems.NOXSTONE_PICKAXE.get())
                .add(NoxernaItems.FERREBRIS_PICKAXE.get()).add(NoxernaItems.UMBURAM_PICKAXE.get())
                .add(NoxernaItems.ADAMUNA_PICKAXE.get()).add(NoxernaItems.NIHOXITE_PICKAXE.get());
        tag(ItemTags.SHOVELS)
                .add(NoxernaItems.NOBLEWOOD_SHOVEL.get()).add(NoxernaItems.NOXSTONE_SHOVEL.get())
                .add(NoxernaItems.FERREBRIS_SHOVEL.get()).add(NoxernaItems.UMBURAM_SHOVEL.get())
                .add(NoxernaItems.ADAMUNA_SHOVEL.get()).add(NoxernaItems.NIHOXITE_SHOVEL.get());
        tag(ItemTags.SWORDS)
                .add(NoxernaItems.NOBLEWOOD_SWORD.get()).add(NoxernaItems.NOXSTONE_SWORD.get())
                .add(NoxernaItems.FERREBRIS_SWORD.get()).add(NoxernaItems.UMBURAM_SWORD.get())
                .add(NoxernaItems.ADAMUNA_SWORD.get()).add(NoxernaItems.NIHOXITE_SWORD.get());
        tag(ItemTags.STONE_CRAFTING_MATERIALS)
                .addTag(NoxernaTags.ItemTags.COMPLETES_MINE_HARD_STONE_ADVANCEMENT);
        // Armour
        tag(ItemTags.HEAD_ARMOR)
                .add(NoxernaItems.ROCKHIDE_HELMET.get()).add(NoxernaItems.EXOSKELETON_HELMET.get())
                .add(NoxernaItems.FERREBRIS_HELMET.get()).add(NoxernaItems.UMBURAM_HELMET.get())
                .add(NoxernaItems.ADAMUNA_HELMET.get()).add(NoxernaItems.NIHOXITE_HELMET.get())
                .add(NoxernaItems.HEART_HELMET.get());
        tag(ItemTags.CHEST_ARMOR)
                .add(NoxernaItems.ROCKHIDE_CHESTPLATE.get()).add(NoxernaItems.EXOSKELETON_CHESTPLATE.get())
                .add(NoxernaItems.FERREBRIS_CHESTPLATE.get()).add(NoxernaItems.UMBURAM_CHESTPLATE.get())
                .add(NoxernaItems.ADAMUNA_CHESTPLATE.get()).add(NoxernaItems.NIHOXITE_CHESTPLATE.get())
                .add(NoxernaItems.HEART_CHESTPLATE.get());
        tag(ItemTags.LEG_ARMOR)
                .add(NoxernaItems.ROCKHIDE_LEGGINGS.get()).add(NoxernaItems.EXOSKELETON_LEGGINGS.get())
                .add(NoxernaItems.FERREBRIS_LEGGINGS.get()).add(NoxernaItems.UMBURAM_LEGGINGS.get())
                .add(NoxernaItems.ADAMUNA_LEGGINGS.get()).add(NoxernaItems.NIHOXITE_LEGGINGS.get())
                .add(NoxernaItems.HEART_LEGGINGS.get());
        tag(ItemTags.FOOT_ARMOR)
                .add(NoxernaItems.ROCKHIDE_BOOTS.get()).add(NoxernaItems.EXOSKELETON_BOOTS.get())
                .add(NoxernaItems.FERREBRIS_BOOTS.get()).add(NoxernaItems.UMBURAM_BOOTS.get())
                .add(NoxernaItems.ADAMUNA_BOOTS.get()).add(NoxernaItems.NIHOXITE_BOOTS.get())
                .add(NoxernaItems.HEART_BOOTS.get());
        // Materials
        tag(ItemTags.TRIM_TEMPLATES)
                .add(NoxernaItems.EXOTIC_ARMOR_TRIM_SMITHING_TEMPLATE.get());
        tag(ItemTags.TRIM_MATERIALS)
                .add(NoxernaItems.ARGON_DYE.get()).add(NoxernaItems.KRYPTON_DYE.get())
                .add(NoxernaItems.NEON_DYE.get()).add(NoxernaItems.OBSCUPRUM_INGOT.get())
                .add(NoxernaItems.RAW_OBSCUPRUM.get()).add(NoxernaItems.XENON_DYE.get());
        // Common tags
        // Copy from Block Tags
        this.copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);
        this.copy(NoxernaTags.BlockTags.FERREBRIS_STORAGE_BLOCKS, NoxernaTags.ItemTags.FERREBRIS_STORAGE_BLOCKS);
        this.copy(NoxernaTags.BlockTags.UMBURAM_STORAGE_BLOCKS, NoxernaTags.ItemTags.UMBURAM_STORAGE_BLOCKS);
        this.copy(NoxernaTags.BlockTags.TENERYL_STORAGE_BLOCKS, NoxernaTags.ItemTags.TENERYL_STORAGE_BLOCKS);
        this.copy(NoxernaTags.BlockTags.ADAMUNA_STORAGE_BLOCKS, NoxernaTags.ItemTags.ADAMUNA_STORAGE_BLOCKS);
        this.copy(NoxernaTags.BlockTags.INPERLUM_STORAGE_BLOCKS, NoxernaTags.ItemTags.INPERLUM_STORAGE_BLOCKS);
        this.copy(NoxernaTags.BlockTags.NIHOXITE_STORAGE_BLOCKS, NoxernaTags.ItemTags.NIHOXITE_STORAGE_BLOCKS);
        this.copy(NoxernaTags.BlockTags.VITRAGOR_STORAGE_BLOCKS, NoxernaTags.ItemTags.VITRAGOR_STORAGE_BLOCKS);
        this.copy(NoxernaTags.BlockTags.OBSCUPRUM_STORAGE_BLOCKS, NoxernaTags.ItemTags.OBSCUPRUM_STORAGE_BLOCKS);
        this.copy(Tags.Blocks.ORES, Tags.Items.ORES);
        this.copy(NoxernaTags.BlockTags.ORES_FERREBRIS, NoxernaTags.ItemTags.ORES_FERREBRIS);
        this.copy(NoxernaTags.BlockTags.BURIED_FUEL_CELLS, NoxernaTags.ItemTags.BURIED_FUEL_CELLS);
        // Tools
        tag(Tags.Items.TOOLS)
                .addTag(NoxernaTags.ItemTags.PICKADZES);
        // Ingredient Groupings
        tag(Tags.Items.GUNPOWDERS)
                .addTag(NoxernaTags.ItemTags.VITRAGOR_DUSTS);
            // Raw Materials
        tag(Tags.Items.RAW_MATERIALS)
                .addTag(NoxernaTags.ItemTags.RAW_FERREBRIS_MATERIALS)
                .addTag(NoxernaTags.ItemTags.RAW_OBSCUPRUM_MATERIALS)
                .addTag(NoxernaTags.ItemTags.RAW_UMBURAM_MATERIALS)
                .addTag(NoxernaTags.ItemTags.RAW_INPERLUM_MATERIALS);
        tag(NoxernaTags.ItemTags.RAW_FERREBRIS_MATERIALS)
                .add(NoxernaItems.RAW_FERREBRIS.get());
        tag(NoxernaTags.ItemTags.RAW_OBSCUPRUM_MATERIALS)
                .add(NoxernaItems.RAW_OBSCUPRUM.get());
        tag(NoxernaTags.ItemTags.RAW_UMBURAM_MATERIALS)
                .add(NoxernaItems.RAW_UMBURAM.get());
        tag(NoxernaTags.ItemTags.RAW_INPERLUM_MATERIALS)
                .add(NoxernaItems.RAW_INPERLUM.get());
            // Gems
        tag(Tags.Items.GEMS)
                .addTag(NoxernaTags.ItemTags.LUMAI_CRYSTALS).addTag(NoxernaTags.ItemTags.TENERYL_GEMS)
                .addTag(NoxernaTags.ItemTags.ADAMUNA_GEMS).addTag(NoxernaTags.ItemTags.VITRAGOR_GEMS);
        tag(NoxernaTags.ItemTags.LUMAI_CRYSTALS)
                .add(NoxernaItems.LUMAI_CRYSTAL.get());
        tag(NoxernaTags.ItemTags.TENERYL_GEMS)
                .add(NoxernaItems.TENERYL.get());
        tag(NoxernaTags.ItemTags.ADAMUNA_GEMS)
                .add(NoxernaItems.ADAMUNA.get());
        tag(NoxernaTags.ItemTags.VITRAGOR_GEMS)
                .add(NoxernaItems.VITRAGOR.get());
            // Nuggets
        tag(Tags.Items.NUGGETS)
                .addTag(NoxernaTags.ItemTags.FERREBRIS_NUGGETS).addTag(NoxernaTags.ItemTags.OBSCUPRUM_NUGGETS)
                .addTag(NoxernaTags.ItemTags.UMBURAM_NUGGETS).addTag(NoxernaTags.ItemTags.INPERLUM_NUGGETS)
                .addTag(NoxernaTags.ItemTags.NIHOXITE_NUGGETS);
        tag(NoxernaTags.ItemTags.FERREBRIS_NUGGETS)
                .add(NoxernaItems.FERREBRIS_NUGGET.get());
        tag(NoxernaTags.ItemTags.OBSCUPRUM_NUGGETS)
                .add(NoxernaItems.OBSCUPRUM_NUGGET.get());
        tag(NoxernaTags.ItemTags.UMBURAM_NUGGETS)
                .add(NoxernaItems.UMBURAM_NUGGET.get());
        tag(NoxernaTags.ItemTags.INPERLUM_NUGGETS)
                .add(NoxernaItems.INPERLUM_NUGGET.get());
        tag(NoxernaTags.ItemTags.NIHOXITE_NUGGETS)
                .add(NoxernaItems.NIHOXITE_NUGGET.get());
            // Ingots
        tag(Tags.Items.INGOTS)
                .addTag(NoxernaTags.ItemTags.FERREBRIS_INGOTS).addTag(NoxernaTags.ItemTags.OBSCUPRUM_INGOTS)
                .addTag(NoxernaTags.ItemTags.UMBURAM_INGOTS).addTag(NoxernaTags.ItemTags.INPERLUM_INGOTS)
                .addTag(NoxernaTags.ItemTags.NIHOXITE_INGOTS);
        tag(NoxernaTags.ItemTags.FERREBRIS_INGOTS)
                .add(NoxernaItems.FERREBRIS_INGOT.get());
        tag(NoxernaTags.ItemTags.OBSCUPRUM_INGOTS)
                .add(NoxernaItems.OBSCUPRUM_INGOT.get());
        tag(NoxernaTags.ItemTags.UMBURAM_INGOTS)
                .add(NoxernaItems.UMBURAM_INGOT.get());
        tag(NoxernaTags.ItemTags.INPERLUM_INGOTS)
                .add(NoxernaItems.INPERLUM_INGOT.get());
        tag(NoxernaTags.ItemTags.NIHOXITE_INGOTS)
                .add(NoxernaItems.NIHOXITE_INGOT.get());
            // Dusts
        tag(Tags.Items.DUSTS)
                .addTag(NoxernaTags.ItemTags.VITRAGOR_DUSTS);
        tag(NoxernaTags.ItemTags.VITRAGOR_DUSTS)
                .add(NoxernaItems.VITRAGOR_DUST.get());
            // Plates
        tag(NoxernaTags.ItemTags.MYSTERIOUS_ALLOY_PLATES)
                .add(NoxernaItems.MYSTERIOUS_ALLOY_PLATE.get());
            // Rods
        tag(Tags.Items.RODS_WOODEN)
                .addTag(NoxernaTags.ItemTags.NOBLEWOOD_RODS);
        tag(NoxernaTags.ItemTags.NOBLEWOOD_RODS)
                .add(NoxernaItems.NOBLEWOOD_STICK.get());
            // Dyes
        tag(Tags.Items.DYES)
                .addTag(NoxernaTags.ItemTags.XENON_DYES).addTag(NoxernaTags.ItemTags.KRYPTON_DYES)
                .addTag(NoxernaTags.ItemTags.ARGON_DYES).addTag(NoxernaTags.ItemTags.NEON_DYES);
        tag(NoxernaTags.ItemTags.XENON_DYES)
                .add(NoxernaItems.XENON_DYE.get());
        tag(NoxernaTags.ItemTags.KRYPTON_DYES)
                .add(NoxernaItems.KRYPTON_DYE.get());
        tag(NoxernaTags.ItemTags.ARGON_DYES)
                .add(NoxernaItems.ARGON_DYE.get());
        tag(NoxernaTags.ItemTags.NEON_DYES)
                .add(NoxernaItems.NEON_DYE.get());
        // Noxerna Tags
        // Copy from Block Tags
        this.copy(NoxernaTags.BlockTags.PEBBLES, NoxernaTags.ItemTags.PEBBLES);
        this.copy(NoxernaTags.BlockTags.FERREBRIS_ORES, NoxernaTags.ItemTags.FERREBRIS_ORES);
        this.copy(NoxernaTags.BlockTags.XENON_LOGS, NoxernaTags.ItemTags.XENON_LOGS);
        this.copy(NoxernaTags.BlockTags.KRYPTON_LOGS, NoxernaTags.ItemTags.KRYPTON_LOGS);
        this.copy(NoxernaTags.BlockTags.ARGON_LOGS, NoxernaTags.ItemTags.ARGON_LOGS);
        this.copy(NoxernaTags.BlockTags.NEON_LOGS, NoxernaTags.ItemTags.NEON_LOGS);
        // Advancement Logic
        tag(NoxernaTags.ItemTags.COMPLETES_MINE_HARD_STONE_ADVANCEMENT)
                .addTag(NoxernaTags.ItemTags.NOXSTONE_TOOL_MATERIALS);
        tag(NoxernaTags.ItemTags.COMPLETES_NOXERNA_TOOLS_ADVANCEMENT)
                .add(NoxernaItems.NOBLEWOOD_PICKAXE.get()).add(NoxernaItems.NOXSTONE_PICKAXE.get())
                .add(NoxernaItems.FERREBRIS_PICKAXE.get()).add(NoxernaItems.UMBURAM_PICKAXE.get())
                .add(NoxernaItems.ADAMUNA_PICKAXE.get()).add(NoxernaItems.NIHOXITE_PICKAXE.get());
        // Tools
        tag(NoxernaTags.ItemTags.PICKADZES)
                .add(NoxernaItems.PICKADZE.get());
        // Alt Material Grouping
        tag(NoxernaTags.ItemTags.ANY_IRON_INGOT)
                .addTag(Tags.Items.INGOTS_IRON).addTag(NoxernaTags.ItemTags.FERREBRIS_INGOTS);
        tag(NoxernaTags.ItemTags.ANY_DIAMOND_GEM)
                .addTag(NoxernaTags.ItemTags.DIAMOND_GEMS).addTag(NoxernaTags.ItemTags.ADAMUNA_GEMS);
        // Tool Material Grouping
        tag(NoxernaTags.ItemTags.NOBLEWOOD_PLANKS)
                .add(NoxernaItems.XENON_PLANKS.get()).add(NoxernaItems.KRYPTON_PLANKS.get())
                .add(NoxernaItems.ARGON_PLANKS.get()).add(NoxernaItems.NEON_PLANKS.get());
        tag(NoxernaTags.ItemTags.NOXSTONE_TOOL_MATERIALS)
                .add(NoxernaItems.SOLTRA.get()).add(NoxernaItems.NOXUM.get())
                .add(NoxernaItems.AESTUM.get()).add(NoxernaItems.INETRA.get());
        tag(NoxernaTags.ItemTags.FERREBRIS_TOOL_MATERIALS)
                .addTag(NoxernaTags.ItemTags.FERREBRIS_INGOTS);
        tag(NoxernaTags.ItemTags.UMBURAM_TOOL_MATERIALS)
                .addTag(NoxernaTags.ItemTags.UMBURAM_INGOTS);
        tag(NoxernaTags.ItemTags.ADAMUNA_TOOL_MATERIALS)
                .addTag(NoxernaTags.ItemTags.ADAMUNA_GEMS);
        tag(NoxernaTags.ItemTags.NIHOXITE_TOOL_MATERIALS)
                .addTag(NoxernaTags.ItemTags.NIHOXITE_INGOTS);
        tag(NoxernaTags.ItemTags.RECYCLABLE_LOOT)
                .add(NoxernaItems.EXOSKELETON_HELMET.get()).add(NoxernaItems.EXOSKELETON_CHESTPLATE.get())
                .add(NoxernaItems.EXOSKELETON_LEGGINGS.get()).add(NoxernaItems.EXOSKELETON_BOOTS.get())
                .add(NoxernaItems.HEART_HELMET.get()).add(NoxernaItems.HEART_CHESTPLATE.get())
                .add(NoxernaItems.HEART_LEGGINGS.get()).add(NoxernaItems.HEART_BOOTS.get())
                .add(NoxernaItems.EXOTIC_ARMOR_TRIM_SMITHING_TEMPLATE.get());
        // Interchangeable Blocksets
        tag(NoxernaTags.ItemTags.BLOCKSET_SOLTRA)
                .add(NoxernaItems.SOLTRA.get()).add(NoxernaItems.SOLTRA_STAIRS.get())
                .add(NoxernaItems.SOLTRA_WALL.get()).add(NoxernaItems.POLISHED_SOLTRA.get())
                .add(NoxernaItems.POLISHED_SOLTRA_STAIRS.get()).add(NoxernaItems.POLISHED_SOLTRA_WALL.get())
                .add(NoxernaItems.SOLTRA_BRICKS.get()).add(NoxernaItems.SOLTRA_BRICK_STAIRS.get())
                .add(NoxernaItems.SOLTRA_BRICK_WALL.get());
        tag(NoxernaTags.ItemTags.BLOCKSET_NOXUM)
                .add(NoxernaItems.NOXUM.get()).add(NoxernaItems.NOXUM_STAIRS.get())
                .add(NoxernaItems.NOXUM_WALL.get()).add(NoxernaItems.POLISHED_NOXUM.get())
                .add(NoxernaItems.POLISHED_NOXUM_STAIRS.get()).add(NoxernaItems.POLISHED_NOXUM_WALL.get())
                .add(NoxernaItems.NOXUM_BRICKS.get()).add(NoxernaItems.NOXUM_BRICK_STAIRS.get())
                .add(NoxernaItems.NOXUM_BRICK_WALL.get());
        tag(NoxernaTags.ItemTags.BLOCKSET_AESTUM)
                .add(NoxernaItems.AESTUM.get()).add(NoxernaItems.AESTUM_STAIRS.get())
                .add(NoxernaItems.AESTUM_WALL.get()).add(NoxernaItems.POLISHED_AESTUM.get())
                .add(NoxernaItems.POLISHED_AESTUM_STAIRS.get()).add(NoxernaItems.POLISHED_AESTUM_WALL.get())
                .add(NoxernaItems.AESTUM_BRICKS.get()).add(NoxernaItems.AESTUM_BRICK_STAIRS.get())
                .add(NoxernaItems.AESTUM_BRICK_WALL.get());
        tag(NoxernaTags.ItemTags.BLOCKSET_INETRA)
                .add(NoxernaItems.INETRA.get()).add(NoxernaItems.INETRA_STAIRS.get())
                .add(NoxernaItems.INETRA_WALL.get()).add(NoxernaItems.POLISHED_INETRA.get())
                .add(NoxernaItems.POLISHED_INETRA_STAIRS.get()).add(NoxernaItems.POLISHED_INETRA_WALL.get())
                .add(NoxernaItems.INETRA_BRICKS.get()).add(NoxernaItems.INETRA_BRICK_STAIRS.get())
                .add(NoxernaItems.INETRA_BRICK_WALL.get());
        tag(NoxernaTags.ItemTags.BLOCKSET_IRON_PLATING)
                .add(NoxernaItems.IRON_PLATING.get()).add(NoxernaItems.IRON_PLATING_STAIRS.get())
                .add(NoxernaItems.IRON_PLATING_WALL.get());
        tag(NoxernaTags.ItemTags.BLOCKSET_GOLD_PLATING)
                .add(NoxernaItems.GOLD_PLATING.get()).add(NoxernaItems.GOLD_PLATING_STAIRS.get())
                .add(NoxernaItems.GOLD_PLATING_WALL.get());
        tag(NoxernaTags.ItemTags.BLOCKSET_FERREBRIS_PLATING)
                .add(NoxernaItems.FERREBRIS_PLATING.get()).add(NoxernaItems.FERREBRIS_PLATING_STAIRS.get())
                .add(NoxernaItems.FERREBRIS_PLATING_WALL.get());
        tag(NoxernaTags.ItemTags.BLOCKSET_UMBURAM_PLATING)
                .add(NoxernaItems.UMBURAM_PLATING.get()).add(NoxernaItems.UMBURAM_PLATING_STAIRS.get())
                .add(NoxernaItems.UMBURAM_PLATING_WALL.get());
        tag(NoxernaTags.ItemTags.BLOCKSET_INPERLUM_PLATING)
                .add(NoxernaItems.INPERLUM_PLATING.get()).add(NoxernaItems.INPERLUM_PLATING_STAIRS.get())
                .add(NoxernaItems.INPERLUM_PLATING_WALL.get());
        tag(NoxernaTags.ItemTags.BLOCKSET_NIHOXITE_PLATING)
                .add(NoxernaItems.NIHOXITE_PLATING.get()).add(NoxernaItems.NIHOXITE_PLATING_STAIRS.get())
                .add(NoxernaItems.NIHOXITE_PLATING_WALL.get());
    }
}