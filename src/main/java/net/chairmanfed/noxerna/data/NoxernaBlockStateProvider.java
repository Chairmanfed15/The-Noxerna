package net.chairmanfed.noxerna.data;

import net.chairmanfed.noxerna.Noxerna;
import net.chairmanfed.noxerna.block.NoxernaBlocks;
import net.chairmanfed.noxerna.block.natural.PebbleBlock;
import net.minecraft.core.Direction;
import net.minecraft.core.Direction.Axis;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class NoxernaBlockStateProvider extends BlockStateProvider {
    public NoxernaBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Noxerna.MODID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // Xenon Wood set
        logBlockWithItem(NoxernaBlocks.XENON_LOG);
        woodBlockWithItem(NoxernaBlocks.XENON_WOOD, NoxernaBlocks.XENON_LOG);
        logBlockWithItem(NoxernaBlocks.STRIPPED_XENON_LOG);
        woodBlockWithItem(NoxernaBlocks.STRIPPED_XENON_WOOD, NoxernaBlocks.STRIPPED_XENON_LOG);
        blockWithItem(NoxernaBlocks.XENON_PLANKS);
        stairBlockWithItem(NoxernaBlocks.XENON_STAIRS, NoxernaBlocks.XENON_PLANKS);
        slabBlockWithItem(NoxernaBlocks.XENON_SLAB, NoxernaBlocks.XENON_PLANKS);
        fenceBlockWithItem(NoxernaBlocks.XENON_FENCE, NoxernaBlocks.XENON_PLANKS);
        fenceGateWithItem(NoxernaBlocks.XENON_FENCE_GATE, NoxernaBlocks.XENON_PLANKS);
        doorBlockWithItem(NoxernaBlocks.XENON_DOOR, "cutout");
        trapDoorWithItem(NoxernaBlocks.XENON_TRAPDOOR, "cutout");
        pressurePlateWithItem(NoxernaBlocks.XENON_PRESSURE_PLATE, NoxernaBlocks.XENON_PLANKS);
        buttonWithItem(NoxernaBlocks.XENON_BUTTON, NoxernaBlocks.XENON_PLANKS);

        // Krypton Wood set
        logBlockWithItem(NoxernaBlocks.KRYPTON_LOG);
        woodBlockWithItem(NoxernaBlocks.KRYPTON_WOOD, NoxernaBlocks.KRYPTON_LOG);
        logBlockWithItem(NoxernaBlocks.STRIPPED_KRYPTON_LOG);
        woodBlockWithItem(NoxernaBlocks.STRIPPED_KRYPTON_WOOD, NoxernaBlocks.STRIPPED_KRYPTON_LOG);
        blockWithItem(NoxernaBlocks.KRYPTON_PLANKS);
        stairBlockWithItem(NoxernaBlocks.KRYPTON_STAIRS, NoxernaBlocks.KRYPTON_PLANKS);
        slabBlockWithItem(NoxernaBlocks.KRYPTON_SLAB, NoxernaBlocks.KRYPTON_PLANKS);
        fenceBlockWithItem(NoxernaBlocks.KRYPTON_FENCE, NoxernaBlocks.KRYPTON_PLANKS);
        fenceGateWithItem(NoxernaBlocks.KRYPTON_FENCE_GATE, NoxernaBlocks.KRYPTON_PLANKS);
        doorBlockWithItem(NoxernaBlocks.KRYPTON_DOOR, "cutout");
        trapDoorWithItem(NoxernaBlocks.KRYPTON_TRAPDOOR, "cutout");
        pressurePlateWithItem(NoxernaBlocks.KRYPTON_PRESSURE_PLATE, NoxernaBlocks.KRYPTON_PLANKS);
        buttonWithItem(NoxernaBlocks.KRYPTON_BUTTON, NoxernaBlocks.KRYPTON_PLANKS);

        // Argon Wood set
        logBlockWithItem(NoxernaBlocks.ARGON_LOG);
        woodBlockWithItem(NoxernaBlocks.ARGON_WOOD, NoxernaBlocks.ARGON_LOG);
        logBlockWithItem(NoxernaBlocks.STRIPPED_ARGON_LOG);
        woodBlockWithItem(NoxernaBlocks.STRIPPED_ARGON_WOOD, NoxernaBlocks.STRIPPED_ARGON_LOG);
        blockWithItem(NoxernaBlocks.ARGON_PLANKS);
        stairBlockWithItem(NoxernaBlocks.ARGON_STAIRS, NoxernaBlocks.ARGON_PLANKS);
        slabBlockWithItem(NoxernaBlocks.ARGON_SLAB, NoxernaBlocks.ARGON_PLANKS);
        fenceBlockWithItem(NoxernaBlocks.ARGON_FENCE, NoxernaBlocks.ARGON_PLANKS);
        fenceGateWithItem(NoxernaBlocks.ARGON_FENCE_GATE, NoxernaBlocks.ARGON_PLANKS);
        doorBlockWithItem(NoxernaBlocks.ARGON_DOOR, "cutout");
        trapDoorWithItem(NoxernaBlocks.ARGON_TRAPDOOR, "cutout");
        pressurePlateWithItem(NoxernaBlocks.ARGON_PRESSURE_PLATE, NoxernaBlocks.ARGON_PLANKS);
        buttonWithItem(NoxernaBlocks.ARGON_BUTTON, NoxernaBlocks.ARGON_PLANKS);

        // Neon Wood set
        logBlockWithItem(NoxernaBlocks.NEON_LOG);
        woodBlockWithItem(NoxernaBlocks.NEON_WOOD, NoxernaBlocks.NEON_LOG);
        logBlockWithItem(NoxernaBlocks.STRIPPED_NEON_LOG);
        woodBlockWithItem(NoxernaBlocks.STRIPPED_NEON_WOOD, NoxernaBlocks.STRIPPED_NEON_LOG);
        blockWithItem(NoxernaBlocks.NEON_PLANKS);
        stairBlockWithItem(NoxernaBlocks.NEON_STAIRS, NoxernaBlocks.NEON_PLANKS);
        slabBlockWithItem(NoxernaBlocks.NEON_SLAB, NoxernaBlocks.NEON_PLANKS);
        fenceBlockWithItem(NoxernaBlocks.NEON_FENCE, NoxernaBlocks.NEON_PLANKS);
        fenceGateWithItem(NoxernaBlocks.NEON_FENCE_GATE, NoxernaBlocks.NEON_PLANKS);
        doorBlockWithItem(NoxernaBlocks.NEON_DOOR, "cutout");
        trapDoorWithItem(NoxernaBlocks.NEON_TRAPDOOR, "cutout");
        pressurePlateWithItem(NoxernaBlocks.NEON_PRESSURE_PLATE, NoxernaBlocks.NEON_PLANKS);
        buttonWithItem(NoxernaBlocks.NEON_BUTTON, NoxernaBlocks.NEON_PLANKS);

        // Soltra Stone set
        blockWithItem(NoxernaBlocks.SOLTRA);
        stairBlockWithItem(NoxernaBlocks.SOLTRA_STAIRS, NoxernaBlocks.SOLTRA);
        slabBlockWithItem(NoxernaBlocks.SOLTRA_SLAB, NoxernaBlocks.SOLTRA);
        wallBlockWithItem(NoxernaBlocks.SOLTRA_WALL, NoxernaBlocks.SOLTRA);
        pressurePlateWithItem(NoxernaBlocks.SOLTRA_PRESSURE_PLATE, NoxernaBlocks.SOLTRA);
        buttonWithItem(NoxernaBlocks.SOLTRA_BUTTON, NoxernaBlocks.SOLTRA);
        blockWithItem(NoxernaBlocks.POLISHED_SOLTRA);
        stairBlockWithItem(NoxernaBlocks.POLISHED_SOLTRA_STAIRS, NoxernaBlocks.POLISHED_SOLTRA);
        slabBlockWithItem(NoxernaBlocks.POLISHED_SOLTRA_SLAB, NoxernaBlocks.POLISHED_SOLTRA);
        wallBlockWithItem(NoxernaBlocks.POLISHED_SOLTRA_WALL, NoxernaBlocks.POLISHED_SOLTRA);
        blockWithItem(NoxernaBlocks.SOLTRA_BRICKS);
        stairBlockWithItem(NoxernaBlocks.SOLTRA_BRICK_STAIRS, NoxernaBlocks.SOLTRA_BRICKS);
        slabBlockWithItem(NoxernaBlocks.SOLTRA_BRICK_SLAB, NoxernaBlocks.SOLTRA_BRICKS);
        wallBlockWithItem(NoxernaBlocks.SOLTRA_BRICK_WALL, NoxernaBlocks.SOLTRA_BRICKS);
        pebbleBlock(NoxernaBlocks.SOLTRA_PEBBLE, NoxernaBlocks.SOLTRA);

        // Noxum Stone set
        blockWithItem(NoxernaBlocks.NOXUM);
        stairBlockWithItem(NoxernaBlocks.NOXUM_STAIRS, NoxernaBlocks.NOXUM);
        slabBlockWithItem(NoxernaBlocks.NOXUM_SLAB, NoxernaBlocks.NOXUM);
        wallBlockWithItem(NoxernaBlocks.NOXUM_WALL, NoxernaBlocks.NOXUM);
        pressurePlateWithItem(NoxernaBlocks.NOXUM_PRESSURE_PLATE, NoxernaBlocks.NOXUM);
        buttonWithItem(NoxernaBlocks.NOXUM_BUTTON, NoxernaBlocks.NOXUM);
        pebbleBlock(NoxernaBlocks.NOXUM_PEBBLE, NoxernaBlocks.NOXUM);
        blockWithItem(NoxernaBlocks.POLISHED_NOXUM);
        stairBlockWithItem(NoxernaBlocks.POLISHED_NOXUM_STAIRS, NoxernaBlocks.POLISHED_NOXUM);
        slabBlockWithItem(NoxernaBlocks.POLISHED_NOXUM_SLAB, NoxernaBlocks.POLISHED_NOXUM);
        wallBlockWithItem(NoxernaBlocks.POLISHED_NOXUM_WALL, NoxernaBlocks.POLISHED_NOXUM);
        blockWithItem(NoxernaBlocks.NOXUM_BRICKS);
        stairBlockWithItem(NoxernaBlocks.NOXUM_BRICK_STAIRS, NoxernaBlocks.NOXUM_BRICKS);
        slabBlockWithItem(NoxernaBlocks.NOXUM_BRICK_SLAB, NoxernaBlocks.NOXUM_BRICKS);
        wallBlockWithItem(NoxernaBlocks.NOXUM_BRICK_WALL, NoxernaBlocks.NOXUM_BRICKS);

        // Aestum Stone set
        blockWithItem(NoxernaBlocks.AESTUM);
        stairBlockWithItem(NoxernaBlocks.AESTUM_STAIRS, NoxernaBlocks.AESTUM);
        slabBlockWithItem(NoxernaBlocks.AESTUM_SLAB, NoxernaBlocks.AESTUM);
        wallBlockWithItem(NoxernaBlocks.AESTUM_WALL, NoxernaBlocks.AESTUM);
        pressurePlateWithItem(NoxernaBlocks.AESTUM_PRESSURE_PLATE, NoxernaBlocks.AESTUM);
        buttonWithItem(NoxernaBlocks.AESTUM_BUTTON, NoxernaBlocks.AESTUM);
        pebbleBlock(NoxernaBlocks.AESTUM_PEBBLE, NoxernaBlocks.AESTUM);
        blockWithItem(NoxernaBlocks.POLISHED_AESTUM);
        stairBlockWithItem(NoxernaBlocks.POLISHED_AESTUM_STAIRS, NoxernaBlocks.POLISHED_AESTUM);
        slabBlockWithItem(NoxernaBlocks.POLISHED_AESTUM_SLAB, NoxernaBlocks.POLISHED_AESTUM);
        wallBlockWithItem(NoxernaBlocks.POLISHED_AESTUM_WALL, NoxernaBlocks.POLISHED_AESTUM);
        blockWithItem(NoxernaBlocks.AESTUM_BRICKS);
        stairBlockWithItem(NoxernaBlocks.AESTUM_BRICK_STAIRS, NoxernaBlocks.AESTUM_BRICKS);
        slabBlockWithItem(NoxernaBlocks.AESTUM_BRICK_SLAB, NoxernaBlocks.AESTUM_BRICKS);
        wallBlockWithItem(NoxernaBlocks.AESTUM_BRICK_WALL, NoxernaBlocks.AESTUM_BRICKS);

        // Inetra Stone set
        blockWithItem(NoxernaBlocks.INETRA);
        stairBlockWithItem(NoxernaBlocks.INETRA_STAIRS, NoxernaBlocks.INETRA);
        slabBlockWithItem(NoxernaBlocks.INETRA_SLAB, NoxernaBlocks.INETRA);
        wallBlockWithItem(NoxernaBlocks.INETRA_WALL, NoxernaBlocks.INETRA);
        pressurePlateWithItem(NoxernaBlocks.INETRA_PRESSURE_PLATE, NoxernaBlocks.INETRA);
        buttonWithItem(NoxernaBlocks.INETRA_BUTTON, NoxernaBlocks.INETRA);
        pebbleBlock(NoxernaBlocks.INETRA_PEBBLE, NoxernaBlocks.INETRA);
        blockWithItem(NoxernaBlocks.POLISHED_INETRA);
        stairBlockWithItem(NoxernaBlocks.POLISHED_INETRA_STAIRS, NoxernaBlocks.POLISHED_INETRA);
        slabBlockWithItem(NoxernaBlocks.POLISHED_INETRA_SLAB, NoxernaBlocks.POLISHED_INETRA);
        wallBlockWithItem(NoxernaBlocks.POLISHED_INETRA_WALL, NoxernaBlocks.POLISHED_INETRA);
        blockWithItem(NoxernaBlocks.INETRA_BRICKS);
        stairBlockWithItem(NoxernaBlocks.INETRA_BRICK_STAIRS, NoxernaBlocks.INETRA_BRICKS);
        slabBlockWithItem(NoxernaBlocks.INETRA_BRICK_SLAB, NoxernaBlocks.INETRA_BRICKS);
        wallBlockWithItem(NoxernaBlocks.INETRA_BRICK_WALL, NoxernaBlocks.INETRA_BRICKS);

        // Vanilla Metal Plating
        blockWithItem(NoxernaBlocks.IRON_PLATING);
        logBlockWithItem(NoxernaBlocks.PLATED_IRON_PILLAR);
        stairBlockWithItem(NoxernaBlocks.IRON_PLATING_STAIRS, NoxernaBlocks.IRON_PLATING);
        slabBlockWithItem(NoxernaBlocks.IRON_PLATING_SLAB, NoxernaBlocks.IRON_PLATING);
        wallBlockWithItem(NoxernaBlocks.IRON_PLATING_WALL, NoxernaBlocks.IRON_PLATING);
        blockWithItem(NoxernaBlocks.GOLD_PLATING);
        logBlockWithItem(NoxernaBlocks.PLATED_GOLD_PILLAR);
        stairBlockWithItem(NoxernaBlocks.GOLD_PLATING_STAIRS, NoxernaBlocks.GOLD_PLATING);
        slabBlockWithItem(NoxernaBlocks.GOLD_PLATING_SLAB, NoxernaBlocks.GOLD_PLATING);
        wallBlockWithItem(NoxernaBlocks.GOLD_PLATING_WALL, NoxernaBlocks.GOLD_PLATING);
        blockWithItem(NoxernaBlocks.NETHERITE_PLATING);
        logBlockWithItem(NoxernaBlocks.PLATED_NETHERITE_PILLAR);
        stairBlockWithItem(NoxernaBlocks.NETHERITE_PLATING_STAIRS, NoxernaBlocks.NETHERITE_PLATING);
        slabBlockWithItem(NoxernaBlocks.NETHERITE_PLATING_SLAB, NoxernaBlocks.NETHERITE_PLATING);
        wallBlockWithItem(NoxernaBlocks.NETHERITE_PLATING_WALL, NoxernaBlocks.NETHERITE_PLATING);
        // Ferrebris Metal set
        blockWithItem(NoxernaBlocks.RAW_FERREBRIS_BLOCK);
        blockWithItem(NoxernaBlocks.FERREBRIS_BLOCK);
        paneBlockWithItem(NoxernaBlocks.FERREBRIS_BARS, "cutout");
        blockWithItem(NoxernaBlocks.FERREBRIS_PLATING);
        logBlockWithItem(NoxernaBlocks.PLATED_FERREBRIS_PILLAR);
        stairBlockWithItem(NoxernaBlocks.FERREBRIS_PLATING_STAIRS, NoxernaBlocks.FERREBRIS_PLATING);
        slabBlockWithItem(NoxernaBlocks.FERREBRIS_PLATING_SLAB, NoxernaBlocks.FERREBRIS_PLATING);
        wallBlockWithItem(NoxernaBlocks.FERREBRIS_PLATING_WALL, NoxernaBlocks.FERREBRIS_PLATING);

        // Umburam Metal set
        blockWithItem(NoxernaBlocks.RAW_UMBURAM_BLOCK);
        blockWithItem(NoxernaBlocks.UMBURAM_BLOCK);
        blockWithItem(NoxernaBlocks.UMBURAM_PLATING);
        logBlockWithItem(NoxernaBlocks.PLATED_UMBURAM_PILLAR);
        stairBlockWithItem(NoxernaBlocks.UMBURAM_PLATING_STAIRS, NoxernaBlocks.UMBURAM_PLATING);
        slabBlockWithItem(NoxernaBlocks.UMBURAM_PLATING_SLAB, NoxernaBlocks.UMBURAM_PLATING);
        wallBlockWithItem(NoxernaBlocks.UMBURAM_PLATING_WALL, NoxernaBlocks.UMBURAM_PLATING);

        // Teneryl Gem set
        blockWithItem(NoxernaBlocks.TENERYL_BLOCK);

        // Adamuna Gem set
        blockWithItem(NoxernaBlocks.ADAMUNA_BLOCK);

        // Inperlum Metal set
        blockWithItem(NoxernaBlocks.RAW_INPERLUM_BLOCK);
        blockWithItem(NoxernaBlocks.INPERLUM_BLOCK);
        blockWithItem(NoxernaBlocks.INPERLUM_PLATING);
        logBlockWithItem(NoxernaBlocks.PLATED_INPERLUM_PILLAR);
        stairBlockWithItem(NoxernaBlocks.INPERLUM_PLATING_STAIRS, NoxernaBlocks.INPERLUM_PLATING);
        slabBlockWithItem(NoxernaBlocks.INPERLUM_PLATING_SLAB, NoxernaBlocks.INPERLUM_PLATING);
        wallBlockWithItem(NoxernaBlocks.INPERLUM_PLATING_WALL, NoxernaBlocks.INPERLUM_PLATING);

        // Nihoxite Metal set
        blockWithItem(NoxernaBlocks.NIHOXITE_BLOCK);
        blockWithItem(NoxernaBlocks.NIHOXITE_PLATING);
        logBlockWithItem(NoxernaBlocks.PLATED_NIHOXITE_PILLAR);
        stairBlockWithItem(NoxernaBlocks.NIHOXITE_PLATING_STAIRS, NoxernaBlocks.NIHOXITE_PLATING);
        slabBlockWithItem(NoxernaBlocks.NIHOXITE_PLATING_SLAB, NoxernaBlocks.NIHOXITE_PLATING);
        wallBlockWithItem(NoxernaBlocks.NIHOXITE_PLATING_WALL, NoxernaBlocks.NIHOXITE_PLATING);
        // Mysterious Alloy Metal set
        blockWithItem(NoxernaBlocks.MYSTERIOUS_ALLOY_PLATING);
        logBlockWithItem(NoxernaBlocks.PLATED_MYSTERIOUS_ALLOY_PILLAR);
        stairBlockWithItem(NoxernaBlocks.MYSTERIOUS_ALLOY_PLATING_STAIRS, NoxernaBlocks.MYSTERIOUS_ALLOY_PLATING);
        slabBlockWithItem(NoxernaBlocks.MYSTERIOUS_ALLOY_PLATING_SLAB, NoxernaBlocks.MYSTERIOUS_ALLOY_PLATING);
        wallBlockWithItem(NoxernaBlocks.MYSTERIOUS_ALLOY_PLATING_WALL, NoxernaBlocks.MYSTERIOUS_ALLOY_PLATING);
        // Vitragor Gem set
        blockWithItem(NoxernaBlocks.VITRAGOR_BLOCK);

        // Obscuprum Metal set
        blockWithItem(NoxernaBlocks.RAW_OBSCUPRUM_BLOCK);
        blockWithItem(NoxernaBlocks.OBSCUPRUM_BLOCK);
        blockWithItem(NoxernaBlocks.EXPOSED_OBSCUPRUM_BLOCK);
        blockWithItem(NoxernaBlocks.WEATHERED_OBSCUPRUM_BLOCK);
        blockWithItem(NoxernaBlocks.OXIDISED_OBSCUPRUM_BLOCK);
            // Cut
        blockWithItem(NoxernaBlocks.CUT_OBSCUPRUM_BLOCK);
        blockWithItem(NoxernaBlocks.EXPOSED_CUT_OBSCUPRUM_BLOCK);
        blockWithItem(NoxernaBlocks.WEATHERED_CUT_OBSCUPRUM_BLOCK);
        blockWithItem(NoxernaBlocks.OXIDISED_CUT_OBSCUPRUM_BLOCK);
            // Bricks
        blockWithItem(NoxernaBlocks.OBSCUPRUM_BRICKS);
        blockWithItem(NoxernaBlocks.EXPOSED_OBSCUPRUM_BRICKS);
        blockWithItem(NoxernaBlocks.WEATHERED_OBSCUPRUM_BRICKS);
        blockWithItem(NoxernaBlocks.OXIDISED_OBSCUPRUM_BRICKS);
            // Plating
        blockWithItem(NoxernaBlocks.OBSCUPRUM_PLATING);
        blockWithItem(NoxernaBlocks.EXPOSED_OBSCUPRUM_PLATING);
        blockWithItem(NoxernaBlocks.WEATHERED_OBSCUPRUM_PLATING);
        blockWithItem(NoxernaBlocks.OXIDIZED_OBSCUPRUM_PLATING);

        // Coloured Blocks
            // Wool
        blockWithItem(NoxernaBlocks.XENON_WOOL);
        blockWithItem(NoxernaBlocks.KRYPTON_WOOL);
        blockWithItem(NoxernaBlocks.ARGON_WOOL);
        blockWithItem(NoxernaBlocks.NEON_WOOL);
            // Terracotta
        blockWithItem(NoxernaBlocks.XENON_TERRACOTTA);
        blockWithItem(NoxernaBlocks.KRYPTON_TERRACOTTA);
        blockWithItem(NoxernaBlocks.ARGON_TERRACOTTA);
        blockWithItem(NoxernaBlocks.NEON_TERRACOTTA);
            // Concrete
        blockWithItem(NoxernaBlocks.XENON_CONCRETE);
        blockWithItem(NoxernaBlocks.KRYPTON_CONCRETE);
        blockWithItem(NoxernaBlocks.ARGON_CONCRETE);
        blockWithItem(NoxernaBlocks.NEON_CONCRETE);
            // Concrete Powder
        blockWithItem(NoxernaBlocks.XENON_CONCRETE_POWDER);
        blockWithItem(NoxernaBlocks.KRYPTON_CONCRETE_POWDER);
        blockWithItem(NoxernaBlocks.ARGON_CONCRETE_POWDER);
        blockWithItem(NoxernaBlocks.NEON_CONCRETE_POWDER);
            // Glowing Pillar
        logBlockWithItem(NoxernaBlocks.RADIANT_PLATED_IRON_PILLAR);
        logBlockWithItem(NoxernaBlocks.LUMINOUS_PLATED_IRON_PILLAR);
        logBlockWithItem(NoxernaBlocks.WHITE_GLOWING_PLATED_IRON_PILLAR);
        logBlockWithItem(NoxernaBlocks.LIGHT_GRAY_GLOWING_PLATED_IRON_PILLAR);
        logBlockWithItem(NoxernaBlocks.GRAY_GLOWING_PLATED_IRON_PILLAR);
        logBlockWithItem(NoxernaBlocks.BLACK_GLOWING_PLATED_IRON_PILLAR);
        logBlockWithItem(NoxernaBlocks.BROWN_GLOWING_PLATED_IRON_PILLAR);
        logBlockWithItem(NoxernaBlocks.RED_GLOWING_PLATED_IRON_PILLAR);
        logBlockWithItem(NoxernaBlocks.ORANGE_GLOWING_PLATED_IRON_PILLAR);
        logBlockWithItem(NoxernaBlocks.YELLOW_GLOWING_PLATED_IRON_PILLAR);
        logBlockWithItem(NoxernaBlocks.LIME_GLOWING_PLATED_IRON_PILLAR);
        logBlockWithItem(NoxernaBlocks.GREEN_GLOWING_PLATED_IRON_PILLAR);
        logBlockWithItem(NoxernaBlocks.CYAN_GLOWING_PLATED_IRON_PILLAR);
        logBlockWithItem(NoxernaBlocks.LIGHT_BLUE_GLOWING_PLATED_IRON_PILLAR);
        logBlockWithItem(NoxernaBlocks.BLUE_GLOWING_PLATED_IRON_PILLAR);
        logBlockWithItem(NoxernaBlocks.PURPLE_GLOWING_PLATED_IRON_PILLAR);
        logBlockWithItem(NoxernaBlocks.MAGENTA_GLOWING_PLATED_IRON_PILLAR);
        logBlockWithItem(NoxernaBlocks.PINK_GLOWING_PLATED_IRON_PILLAR);
        logBlockWithItem(NoxernaBlocks.XENON_GLOWING_PLATED_IRON_PILLAR);
        logBlockWithItem(NoxernaBlocks.KRYPTON_GLOWING_PLATED_IRON_PILLAR);
        logBlockWithItem(NoxernaBlocks.ARGON_GLOWING_PLATED_IRON_PILLAR);
        logBlockWithItem(NoxernaBlocks.NEON_GLOWING_PLATED_IRON_PILLAR);

        logBlockWithItem(NoxernaBlocks.RADIANT_PLATED_FERREBRIS_PILLAR);
        logBlockWithItem(NoxernaBlocks.LUMINOUS_PLATED_FERREBRIS_PILLAR);
        logBlockWithItem(NoxernaBlocks.WHITE_GLOWING_PLATED_FERREBRIS_PILLAR);
        logBlockWithItem(NoxernaBlocks.LIGHT_GRAY_GLOWING_PLATED_FERREBRIS_PILLAR);
        logBlockWithItem(NoxernaBlocks.GRAY_GLOWING_PLATED_FERREBRIS_PILLAR);
        logBlockWithItem(NoxernaBlocks.BLACK_GLOWING_PLATED_FERREBRIS_PILLAR);
        logBlockWithItem(NoxernaBlocks.BROWN_GLOWING_PLATED_FERREBRIS_PILLAR);
        logBlockWithItem(NoxernaBlocks.RED_GLOWING_PLATED_FERREBRIS_PILLAR);
        logBlockWithItem(NoxernaBlocks.ORANGE_GLOWING_PLATED_FERREBRIS_PILLAR);
        logBlockWithItem(NoxernaBlocks.YELLOW_GLOWING_PLATED_FERREBRIS_PILLAR);
        logBlockWithItem(NoxernaBlocks.LIME_GLOWING_PLATED_FERREBRIS_PILLAR);
        logBlockWithItem(NoxernaBlocks.GREEN_GLOWING_PLATED_FERREBRIS_PILLAR);
        logBlockWithItem(NoxernaBlocks.CYAN_GLOWING_PLATED_FERREBRIS_PILLAR);
        logBlockWithItem(NoxernaBlocks.LIGHT_BLUE_GLOWING_PLATED_FERREBRIS_PILLAR);
        logBlockWithItem(NoxernaBlocks.BLUE_GLOWING_PLATED_FERREBRIS_PILLAR);
        logBlockWithItem(NoxernaBlocks.PURPLE_GLOWING_PLATED_FERREBRIS_PILLAR);
        logBlockWithItem(NoxernaBlocks.MAGENTA_GLOWING_PLATED_FERREBRIS_PILLAR);
        logBlockWithItem(NoxernaBlocks.PINK_GLOWING_PLATED_FERREBRIS_PILLAR);
        logBlockWithItem(NoxernaBlocks.XENON_GLOWING_PLATED_FERREBRIS_PILLAR);
        logBlockWithItem(NoxernaBlocks.KRYPTON_GLOWING_PLATED_FERREBRIS_PILLAR);
        logBlockWithItem(NoxernaBlocks.ARGON_GLOWING_PLATED_FERREBRIS_PILLAR);
        logBlockWithItem(NoxernaBlocks.NEON_GLOWING_PLATED_FERREBRIS_PILLAR);

        // Natural Blocks
            // Ores
        blockWithItem(NoxernaBlocks.NOXUM_BURIED_FUEL_CELL);
        blockWithItem(NoxernaBlocks.AESTUM_BURIED_FUEL_CELL);
        blockWithItem(NoxernaBlocks.INETRA_BURIED_FUEL_CELL);
        blockWithItem(NoxernaBlocks.NOXUM_FERREBRIS_ORE);
        blockWithItem(NoxernaBlocks.AESTUM_FERREBRIS_ORE);
        blockWithItem(NoxernaBlocks.INETRA_FERREBRIS_ORE);
        blockWithItem(NoxernaBlocks.NOXUM_OBSCUPRUM_ORE);
        blockWithItem(NoxernaBlocks.AESTUM_OBSCUPRUM_ORE);
        blockWithItem(NoxernaBlocks.INETRA_OBSCUPRUM_ORE);

        // Set-less Blocks
        blockWithItem(NoxernaBlocks.VOIDROCK);
        blockWithItem(NoxernaBlocks.NOXERNA_PORTAL_FRAME);
        basicBlock(NoxernaBlocks.NOXERNA_PORTAL);
    }
    private void blockWithItem(DeferredBlock<Block> block) {
        simpleBlockWithItem(block.get(), cubeAll(block.get()));
    }
    public void basicBlock(DeferredBlock<Block> block) {
        this.simpleBlock(block.get(), cubeAll(block.get()));
    }
    public void simpleBlockItem(DeferredBlock<Block> block) {
        this.itemModels().withExistingParent(block.getId().toString(),
                this.modLoc("block/" + block.getId().getPath()));
    }

    public void logBlockWithItem(DeferredBlock<Block> block) {
        this.logBlock((RotatedPillarBlock) block.get());
        this.simpleBlockItem(block);
    }
    public void woodBlockWithItem(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {
        this.axisBlock((RotatedPillarBlock) block.get(),
                blockTexture(baseBlock.get()), extend(blockTexture(baseBlock.get()), ""));
        this.simpleBlockItem(block);
    }
    public void stairBlockWithItem(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {
        this.stairsBlock((StairBlock) block.get(), this.blockTexture(baseBlock.get()));
        this.simpleBlockItem(block);
    }
    public void slabBlockWithItem(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {
        this.slabBlock((SlabBlock) block.get(), this.blockTexture(baseBlock.get()), this.blockTexture(baseBlock.get()));
        this.simpleBlockItem(block);
    }
    public void fenceBlockWithItem(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {
        this.fenceBlock((FenceBlock) block.get(), this.blockTexture(baseBlock.get()));
        this.itemModels().fenceInventory(block.getId().toString(), this.blockTexture(baseBlock.get()));
    }
    public void fenceGateWithItem(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {
        this.fenceGateBlock((FenceGateBlock) block.get(), this.blockTexture(baseBlock.get()));
        this.itemModels().fenceGate(block.getId().toString(), this.blockTexture(baseBlock.get()));
    }
    public void wallBlockWithItem(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {
        this.wallBlock((WallBlock) block.get(), this.blockTexture(baseBlock.get()));
        this.itemModels().wallInventory(block.getId().toString(), this.blockTexture(baseBlock.get()));
    }
    public void carpetBlockWithItem(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {}
    public void paneBlockWithItem(DeferredBlock<Block> block, String renderType) {
        this.paneBlockWithRenderType((IronBarsBlock) block.get(),
                this.blockTexture(block.get()),
                this.blockTexture(block.get()), renderType);
        this.itemModels().basicItem(block.get().asItem());
    }
    public void doorBlockWithItem(DeferredBlock<Block> block) {
        this.doorBlock((DoorBlock) block.get(),
                this.blockTexture(block.get()).withSuffix("_bottom"),
                this.blockTexture(block.get()).withSuffix("_top"));
        this.itemModels().basicItem(ResourceLocation.parse(block.getId().toString()));
    }
    public void doorBlockWithItem(DeferredBlock<Block> block, String renderType) {
        this.doorBlockWithRenderType((DoorBlock) block.get(),
                this.blockTexture(block.get()).withSuffix("_bottom"),
                this.blockTexture(block.get()).withSuffix("_top"), renderType);
        this.itemModels().basicItem(ResourceLocation.parse(block.getId().toString()));
    }
    public void trapDoorWithItem(DeferredBlock<Block> block) {
        this.trapdoorBlock((TrapDoorBlock) block.get(), this.blockTexture(block.get()), true);
        this.itemModels().trapdoorOrientableBottom(block.getId().toString(), this.blockTexture(block.get()));
    }
    public void trapDoorWithItem(DeferredBlock<Block> block, String renderType) {
        this.trapdoorBlockWithRenderType((TrapDoorBlock) block.get(), this.blockTexture(block.get()),
                true, renderType);
        this.itemModels().trapdoorOrientableBottom(block.getId().toString(), this.blockTexture(block.get()));
    }
    public void pressurePlateWithItem(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {
        this.pressurePlateBlock((PressurePlateBlock) block.get(), this.blockTexture(baseBlock.get()));
        this.itemModels().pressurePlate(block.getId().toString(), this.blockTexture(baseBlock.get()));
    }
    public void buttonWithItem(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {
        this.buttonBlock((ButtonBlock) block.get(), this.blockTexture(baseBlock.get()));
        this.itemModels().buttonInventory(block.getId().toString(), this.blockTexture(baseBlock.get()));
    }
    public void pebbleBlock(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock){
        this.getVariantBuilder(block.get()).forAllStatesExcept((blockState) -> {
            int pebbles = blockState.getValue(PebbleBlock.PEBBLES);
            switch (pebbles) {
                case 4 -> {
                    return ConfiguredModel.builder().modelFile(this.models()
                            .withExistingParent(
                                    "four_" + baseBlock.getId().getPath() + "_pebbles",
                                    this.modLoc("block/four_pebbles"))
                            .texture("all", this.blockTexture(baseBlock.get()))).build();
                }
                case 3 -> {
                    return ConfiguredModel.builder().modelFile(this.models()
                            .withExistingParent(
                                    "three_" + baseBlock.getId().getPath() + "_pebbles",
                                    this.modLoc("block/three_pebbles"))
                            .texture("all", this.blockTexture(baseBlock.get()))).build();
                }
                case 2 -> {
                    return ConfiguredModel.builder().modelFile(this.models()
                            .withExistingParent(
                                    "two_" + baseBlock.getId().getPath() + "_pebbles",
                                    this.modLoc("block/two_pebbles"))
                            .texture("all", this.blockTexture(baseBlock.get()))).build();
                }
                default -> {
                    return ConfiguredModel.builder().modelFile(this.models()
                            .withExistingParent(
                                    baseBlock.getId().getPath() + "_pebble",
                                    this.modLoc("block/pebble"))
                            .texture("all", this.blockTexture(baseBlock.get()))).build();
                }
            }
        }, PebbleBlock.WATERLOGGED);
        this.itemModels().basicItem(ResourceLocation.parse(block.getId().toString()));
    }

    private ResourceLocation extend(ResourceLocation resourceLocation, String suffix) {
        return ResourceLocation.fromNamespaceAndPath(resourceLocation.getNamespace(),
                resourceLocation.getPath() + suffix);
    }
}
