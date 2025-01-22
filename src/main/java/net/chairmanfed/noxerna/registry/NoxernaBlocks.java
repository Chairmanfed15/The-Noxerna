package net.chairmanfed.noxerna.registry;

import net.chairmanfed.noxerna.TheNoxerna;
import net.chairmanfed.noxerna.block.NoxernaBlockSetTypes;
import net.chairmanfed.noxerna.block.PebbleBlock;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class NoxernaBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(TheNoxerna.MODID);

    // Registers Blocks and assigns properties

    // Xenon Noblewood Set
    public static final DeferredBlock<Block> XENON_LOG = BLOCKS.register(
            "xenon_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .destroyTime(3.5f).explosionResistance(2.0f)
                    .sound(SoundType.CHERRY_WOOD).ignitedByLava().lightLevel(state -> 12)));
    public static final DeferredBlock<Block> XENON_WOOD = BLOCKS.register(
            "xenon_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(XENON_LOG.get())));
    public static final DeferredBlock<Block> STRIPPED_XENON_LOG = BLOCKS.register(
            "stripped_xenon_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .destroyTime(3.5f).explosionResistance(2.0f)
                    .sound(SoundType.CHERRY_WOOD).ignitedByLava().lightLevel(state -> 12)));
    public static final DeferredBlock<Block> STRIPPED_XENON_WOOD = BLOCKS.register(
            "stripped_xenon_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(STRIPPED_XENON_LOG.get())));
    public static final DeferredBlock<Block> XENON_PLANKS = BLOCKS.register(
            "xenon_planks", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(3.5f).explosionResistance(3.0f)
                    .sound(NoxernaSoundTypes.NOBLEWOOD).ignitedByLava().lightLevel(state -> 12)));
    public static final DeferredBlock<Block> XENON_STAIRS = BLOCKS.register(
            "xenon_stairs", () -> new StairBlock(XENON_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(XENON_PLANKS.get())));
    public static final DeferredBlock<Block> XENON_SLAB = BLOCKS.register(
            "xenon_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(XENON_PLANKS.get())));
    public static final DeferredBlock<Block> XENON_FENCE = BLOCKS.register(
            "xenon_fence", () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(XENON_PLANKS.get())));
    public static final DeferredBlock<Block> XENON_FENCE_GATE = BLOCKS.register(
            "xenon_fence_gate", () -> new FenceGateBlock(NoxernaBlockSetTypes.XENON_WOOD_SET,
                    BlockBehaviour.Properties.ofFullCopy(XENON_PLANKS.get())));
    public static final DeferredBlock<Block> XENON_DOOR = BLOCKS.register(
            "xenon_door", () -> new DoorBlock(NoxernaBlockSetTypes.XENON_BLOCK_SET,
                    BlockBehaviour.Properties.ofFullCopy(XENON_PLANKS.get()).noOcclusion()));
    public static final DeferredBlock<Block> XENON_TRAPDOOR = BLOCKS.register(
            "xenon_trapdoor", () -> new TrapDoorBlock(NoxernaBlockSetTypes.XENON_BLOCK_SET,
                    BlockBehaviour.Properties.ofFullCopy(XENON_PLANKS.get())));
    public static final DeferredBlock<Block> XENON_PRESSURE_PLATE = BLOCKS.register(
            "xenon_pressure_plate", () -> new PressurePlateBlock(NoxernaBlockSetTypes.XENON_BLOCK_SET,
                    BlockBehaviour.Properties.ofFullCopy(XENON_PLANKS.get())));
    public static final DeferredBlock<Block> XENON_BUTTON = BLOCKS.register(
            "xenon_button", () -> new ButtonBlock(NoxernaBlockSetTypes.XENON_BLOCK_SET, 30,
                    BlockBehaviour.Properties.ofFullCopy(XENON_PLANKS.get())));

    // Krypton Wood set
    public static final DeferredBlock<Block> KRYPTON_LOG = BLOCKS.register(
            "krypton_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .destroyTime(3.5f).explosionResistance(2.0f)
                    .sound(SoundType.CHERRY_WOOD).ignitedByLava().lightLevel(state -> 12)));
    public static final DeferredBlock<Block> KRYPTON_WOOD = BLOCKS.register(
            "krypton_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(KRYPTON_LOG.get())));
    public static final DeferredBlock<Block> STRIPPED_KRYPTON_LOG = BLOCKS.register(
            "stripped_krypton_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .destroyTime(3.5f).explosionResistance(2.0f)
                    .sound(SoundType.CHERRY_WOOD).ignitedByLava().lightLevel(state -> 12)));
    public static final DeferredBlock<Block> STRIPPED_KRYPTON_WOOD = BLOCKS.register(
            "stripped_krypton_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(STRIPPED_KRYPTON_LOG.get())));
    public static final DeferredBlock<Block> KRYPTON_PLANKS = BLOCKS.register(
            "krypton_planks", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(3.5f).explosionResistance(3.0f)
                    .sound(NoxernaSoundTypes.NOBLEWOOD).ignitedByLava().lightLevel(state -> 12)));
    public static final DeferredBlock<Block> KRYPTON_STAIRS = BLOCKS.register(
            "krypton_stairs", () -> new StairBlock(KRYPTON_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(KRYPTON_PLANKS.get())));
    public static final DeferredBlock<Block> KRYPTON_SLAB = BLOCKS.register(
            "krypton_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(KRYPTON_PLANKS.get())));
    public static final DeferredBlock<Block> KRYPTON_FENCE = BLOCKS.register(
            "krypton_fence", () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(KRYPTON_PLANKS.get())));
    public static final DeferredBlock<Block> KRYPTON_FENCE_GATE = BLOCKS.register(
            "krypton_fence_gate", () -> new FenceGateBlock(NoxernaBlockSetTypes.KRYPTON_WOOD_SET,
                    BlockBehaviour.Properties.ofFullCopy(KRYPTON_PLANKS.get())));
    public static final DeferredBlock<Block> KRYPTON_DOOR = BLOCKS.register(
            "krypton_door", () -> new DoorBlock(NoxernaBlockSetTypes.KRYPTON_BLOCK_SET,
                    BlockBehaviour.Properties.ofFullCopy(KRYPTON_PLANKS.get()).noOcclusion()));
    public static final DeferredBlock<Block> KRYPTON_TRAPDOOR = BLOCKS.register(
            "krypton_trapdoor", () -> new TrapDoorBlock(NoxernaBlockSetTypes.KRYPTON_BLOCK_SET,
                    BlockBehaviour.Properties.ofFullCopy(XENON_PLANKS.get())));
    public static final DeferredBlock<Block> KRYPTON_PRESSURE_PLATE = BLOCKS.register(
            "krypton_pressure_plate", () -> new PressurePlateBlock(NoxernaBlockSetTypes.KRYPTON_BLOCK_SET,
                    BlockBehaviour.Properties.ofFullCopy(XENON_PLANKS.get())));
    public static final DeferredBlock<Block> KRYPTON_BUTTON = BLOCKS.register(
            "krypton_button", () -> new ButtonBlock(NoxernaBlockSetTypes.KRYPTON_BLOCK_SET, 30,
                    BlockBehaviour.Properties.ofFullCopy(KRYPTON_PLANKS.get())));

    // Argon Wood set
    public static final DeferredBlock<Block> ARGON_PLANKS = BLOCKS.register(
            "argon_planks", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(3.5f).explosionResistance(3.0f)
                    .sound(NoxernaSoundTypes.NOBLEWOOD).ignitedByLava().lightLevel(state -> 12)));
    public static final DeferredBlock<Block> ARGON_STAIRS = BLOCKS.register(
            "argon_stairs", () -> new StairBlock(ARGON_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(ARGON_PLANKS.get())));

    // Neon Wood set
    public static final DeferredBlock<Block> NEON_PLANKS = BLOCKS.register(
            "neon_planks", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(3.5f).explosionResistance(3.0f)
                    .sound(NoxernaSoundTypes.NOBLEWOOD).ignitedByLava().lightLevel(state -> 12)));

    // Soltra Stone set
    public static final DeferredBlock<Block> SOLTRA = BLOCKS.register(
            "soltra", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(7.5f).explosionResistance(9.0f)
                    .sound(NoxernaSoundTypes.NOXUM).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> POLISHED_SOLTRA = BLOCKS.register(
            "polished_soltra", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(7.5f).explosionResistance(9.0f)
                    .sound(NoxernaSoundTypes.NOXUM).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SOLTRA_BRICKS = BLOCKS.register(
            "soltra_bricks", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(7.5f).explosionResistance(9.0f)
                    .sound(NoxernaSoundTypes.NOXUM).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SOLTRA_PEBBLE = BLOCKS.register("soltra_pebble", () ->
            new PebbleBlock(BlockBehaviour.Properties.ofFullCopy(SOLTRA.get())
                    .noOcclusion().pushReaction(PushReaction.DESTROY)));

    // Noxum Stone set
    public static final DeferredBlock<Block> NOXUM = BLOCKS.register(
            "noxum", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(4.5f).explosionResistance(6.0f)
                    .sound(NoxernaSoundTypes.NOXUM).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NOXUM_STAIRS = BLOCKS.register(
            "noxum_stairs", () -> new StairBlock(NOXUM.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(NOXUM.get())));
    public static final DeferredBlock<Block> NOXUM_SLAB = BLOCKS.register(
            "noxum_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(NOXUM.get())));
    public static final DeferredBlock<Block> NOXUM_WALL = BLOCKS.register(
            "noxum_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(NOXUM.get())));
    public static final DeferredBlock<Block> NOXUM_PRESSURE_PLATE = BLOCKS.register(
            "noxum_pressure_plate", () ->
                    new PressurePlateBlock(NoxernaBlockSetTypes.NOXUM_BLOCK_SET,
                            BlockBehaviour.Properties.ofFullCopy(NOXUM.get())));
    public static final DeferredBlock<Block> NOXUM_BUTTON = BLOCKS.register(
            "noxum_button", () ->
                    new ButtonBlock(NoxernaBlockSetTypes.NOXUM_BLOCK_SET, 20,
                            BlockBehaviour.Properties.ofFullCopy(NOXUM.get())));
    public static final DeferredBlock<Block> NOXUM_BRICK_WALL = BLOCKS.register(
            "noxum_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(NOXUM.get())));
    public static final DeferredBlock<Block> POLISHED_NOXUM = BLOCKS.register(
            "polished_noxum", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(4.5f).explosionResistance(6.0f)
                    .sound(NoxernaSoundTypes.NOXUM).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> POLISHED_NOXUM_STAIRS = BLOCKS.register(
            "polished_noxum_stairs", () -> new StairBlock(POLISHED_NOXUM.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(POLISHED_NOXUM.get())));
    public static final DeferredBlock<Block> POLISHED_NOXUM_SLAB = BLOCKS.register(
            "polished_noxum_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_NOXUM.get())));
    public static final DeferredBlock<Block> POLISHED_NOXUM_WALL = BLOCKS.register(
            "polished_noxum_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_NOXUM.get())));

    public static final DeferredBlock<Block> NOXUM_BRICKS = BLOCKS.register(
            "noxum_bricks", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(4.5f).explosionResistance(6.0f)
                    .sound(NoxernaSoundTypes.NOXUM).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NOXUM_BRICK_STAIRS = BLOCKS.register(
            "noxum_brick_stairs", () -> new StairBlock(NOXUM_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(NOXUM_BRICKS.get())));
    public static final DeferredBlock<Block> NOXUM_BRICK_SLAB = BLOCKS.register(
            "noxum_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(NOXUM_BRICKS.get())));
    public static final DeferredBlock<Block> NOXUM_PEBBLE = BLOCKS.register("noxum_pebble", () ->
            new PebbleBlock(BlockBehaviour.Properties.ofFullCopy(NOXUM.get())
                    .noOcclusion().pushReaction(PushReaction.DESTROY)));

    // Aestum Stone set
    public static final DeferredBlock<Block> AESTUM = BLOCKS.register(
            "aestum", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(6.0f).explosionResistance(7.5f)
                    .sound(NoxernaSoundTypes.NOXUM).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> POLISHED_AESTUM = BLOCKS.register(
            "polished_aestum", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(6.0f).explosionResistance(7.5f)
                    .sound(NoxernaSoundTypes.NOXUM).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> AESTUM_BRICKS = BLOCKS.register(
            "aestum_bricks", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(6.0f).explosionResistance(7.5f)
                    .sound(NoxernaSoundTypes.NOXUM).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> AESTUM_PEBBLE = BLOCKS.register("aestum_pebble", () ->
            new PebbleBlock(BlockBehaviour.Properties.ofFullCopy(AESTUM.get())
                    .noOcclusion().pushReaction(PushReaction.DESTROY)));

    // Inetra Stone set
    public static final DeferredBlock<Block> INETRA = BLOCKS.register(
            "inetra", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(7.5f).explosionResistance(9.0f)
                    .sound(NoxernaSoundTypes.NOXUM).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> POLISHED_INETRA = BLOCKS.register(
            "polished_inetra", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(7.5f).explosionResistance(9.0f)
                    .sound(NoxernaSoundTypes.NOXUM).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> INETRA_BRICKS = BLOCKS.register(
            "inetra_bricks", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(7.5f).explosionResistance(9.0f)
                    .sound(NoxernaSoundTypes.NOXUM).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> INETRA_PEBBLE = BLOCKS.register("inetra_pebble", () ->
            new PebbleBlock(BlockBehaviour.Properties.ofFullCopy(INETRA.get())
                    .noOcclusion().pushReaction(PushReaction.DESTROY)));

    // Resource Storage & Decorative Blocks
    // Ferrebris
    public static final DeferredBlock<Block> FERREBRIS_BLOCK = BLOCKS.register(
            "ferrebris_block", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(6.5f).explosionResistance(7.5f)
                    .sound(SoundType.NETHERITE_BLOCK).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> FERREBRIS_BARS = BLOCKS.register(
            "ferrebris_bars", () -> new IronBarsBlock(
                    BlockBehaviour.Properties.ofFullCopy(FERREBRIS_BLOCK.get()).noOcclusion()));
    public static final DeferredBlock<Block> FERREBRIS_PLATING = BLOCKS.register(
            "ferrebris_plating", () -> new Block(BlockBehaviour.Properties.ofFullCopy(FERREBRIS_BLOCK.get())));
    public static final DeferredBlock<Block> FERREBRIS_PLATING_STAIRS = BLOCKS.register(
            "ferrebris_plating_stairs", () -> new StairBlock(POLISHED_NOXUM.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(FERREBRIS_PLATING.get())));
    public static final DeferredBlock<Block> FERREBRIS_PLATING_SLAB = BLOCKS.register(
            "ferrebris_plating_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(FERREBRIS_PLATING.get())));
    public static final DeferredBlock<Block> FERREBRIS_PLATING_WALL = BLOCKS.register(
            "ferrebris_plating_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(FERREBRIS_PLATING.get())));
    // Umburam
    public static final DeferredBlock<Block> UMBURAM_BLOCK = BLOCKS.register(
            "umburam_block", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(6.5f).explosionResistance(7.5f)
                    .sound(SoundType.NETHERITE_BLOCK).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> UMBURAM_PLATING = BLOCKS.register(
            "umburam_plating", () -> new Block(BlockBehaviour.Properties.ofFullCopy(UMBURAM_BLOCK.get())));
    // Teneryl
    public static final DeferredBlock<Block> TENERYL_BLOCK = BLOCKS.register(
            "teneryl_block", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(6.5f).explosionResistance(7.5f)
                    .sound(SoundType.NETHERITE_BLOCK).requiresCorrectToolForDrops()));
    // Adamuna
    public static final DeferredBlock<Block> ADAMUNA_BLOCK = BLOCKS.register(
            "adamuna_block", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(6.5f).explosionResistance(7.5f)
                    .sound(SoundType.NETHERITE_BLOCK).requiresCorrectToolForDrops()));
    // Inperlum
    public static final DeferredBlock<Block> INPERLUM_BLOCK = BLOCKS.register(
            "inperlum_block", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(6.5f).explosionResistance(7.5f)
                    .sound(SoundType.NETHERITE_BLOCK).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> INPERLUM_PLATING = BLOCKS.register(
            "inperlum_plating", () -> new Block(BlockBehaviour.Properties.ofFullCopy(INPERLUM_BLOCK.get())));
    // Nihoxite
    public static final DeferredBlock<Block> NIHOXITE_BLOCK = BLOCKS.register(
            "nihoxite_block", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(6.5f).explosionResistance(7.5f)
                    .sound(NoxernaSoundTypes.HEAVY_METAL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIHOXITE_PLATING = BLOCKS.register(
            "nihoxite_plating", () -> new Block(BlockBehaviour.Properties.ofFullCopy(NIHOXITE_BLOCK.get())));
    // Vitragor
    public static final DeferredBlock<Block> VITRAGOR_BLOCK = BLOCKS.register(
            "vitragor_block", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(6.5f).explosionResistance(7.5f)
                    .sound(SoundType.NETHERITE_BLOCK).requiresCorrectToolForDrops()));

    // Obscuprum
    public static final DeferredBlock<Block> OBSCUPRUM_BLOCK = BLOCKS.register(
            "obscuprum_block", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.of()
                    .destroyTime(6.5f).explosionResistance(7.5f)
                    .sound(SoundType.NETHERITE_BLOCK).requiresCorrectToolForDrops().randomTicks()));
    public static final DeferredBlock<Block> EXPOSED_OBSCUPRUM_BLOCK = BLOCKS.register(
            "exposed_obscuprum_block", 
            () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.EXPOSED, 
                    BlockBehaviour.Properties.ofFullCopy(OBSCUPRUM_BLOCK.get())));
    public static final DeferredBlock<Block> WEATHERED_OBSCUPRUM_BLOCK = BLOCKS.register(
            "weathered_obscuprum_block",
            () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.ofFullCopy(OBSCUPRUM_BLOCK.get())));
    public static final DeferredBlock<Block> OXIDISED_OBSCUPRUM_BLOCK = BLOCKS.register(
            "oxidised_obscuprum_block",
            () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.ofFullCopy(OBSCUPRUM_BLOCK.get())));
    // Cut
    public static final DeferredBlock<Block> CUT_OBSCUPRUM_BLOCK = BLOCKS.register(
            "cut_obscuprum_block", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.of()
                            .destroyTime(6.5f).explosionResistance(7.5f)
                            .sound(SoundType.NETHERITE_BLOCK).requiresCorrectToolForDrops().randomTicks()));
    public static final DeferredBlock<Block> EXPOSED_CUT_OBSCUPRUM_BLOCK = BLOCKS.register(
            "exposed_cut_obscuprum_block",
            () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.ofFullCopy(CUT_OBSCUPRUM_BLOCK.get())));
    public static final DeferredBlock<Block> WEATHERED_CUT_OBSCUPRUM_BLOCK = BLOCKS.register(
            "weathered_cut_obscuprum_block",
            () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.ofFullCopy(CUT_OBSCUPRUM_BLOCK.get())));
    public static final DeferredBlock<Block> OXIDISED_CUT_OBSCUPRUM_BLOCK = BLOCKS.register(
            "oxidised_cut_obscuprum_block",
            () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.ofFullCopy(CUT_OBSCUPRUM_BLOCK.get())));
    // Bricks
    public static final DeferredBlock<Block> OBSCUPRUM_BRICKS = BLOCKS.register(
            "obscuprum_bricks", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.of()
                            .destroyTime(6.5f).explosionResistance(7.5f)
                            .sound(SoundType.NETHERITE_BLOCK).requiresCorrectToolForDrops().randomTicks()));
    public static final DeferredBlock<Block> EXPOSED_OBSCUPRUM_BRICKS = BLOCKS.register(
            "exposed_obscuprum_bricks",
            () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.ofFullCopy(OBSCUPRUM_BRICKS.get())));
    public static final DeferredBlock<Block> WEATHERED_OBSCUPRUM_BRICKS = BLOCKS.register(
            "weathered_obscuprum_bricks",
            () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.ofFullCopy(OBSCUPRUM_BRICKS.get())));
    public static final DeferredBlock<Block> OXIDISED_OBSCUPRUM_BRICKS = BLOCKS.register(
            "oxidised_obscuprum_bricks",
            () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.ofFullCopy(OBSCUPRUM_BRICKS.get())));
    // Plating
    public static final DeferredBlock<Block> OBSCUPRUM_PLATING = BLOCKS.register(
            "obscuprum_plating", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.of()
                            .destroyTime(6.5f).explosionResistance(7.5f)
                            .sound(SoundType.NETHERITE_BLOCK).requiresCorrectToolForDrops().randomTicks()));
    public static final DeferredBlock<Block> EXPOSED_OBSCUPRUM_PLATING = BLOCKS.register(
            "exposed_obscuprum_plating",
            () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.ofFullCopy(OBSCUPRUM_PLATING.get())));
    public static final DeferredBlock<Block> WEATHERED_OBSCUPRUM_PLATING = BLOCKS.register(
            "weathered_obscuprum_plating",
            () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.ofFullCopy(OBSCUPRUM_PLATING.get())));
    public static final DeferredBlock<Block> OXIDISED_OBSCUPRUM_PLATING = BLOCKS.register(
            "oxidised_obscuprum_plating",
            () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.ofFullCopy(OBSCUPRUM_PLATING.get())));
    // Coloured Blocks
    public static final DeferredBlock<Block> ARGON_CONCRETE = BLOCKS.register(
            "argon_concrete", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE)
                    .lightLevel(state -> 12)));
    public static final DeferredBlock<Block> ARGON_CONCRETE_POWDER = BLOCKS.register(
            "argon_concrete_powder",
            () -> new ConcretePowderBlock(NoxernaBlocks.ARGON_CONCRETE.get(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE_POWDER)
                    .lightLevel(state -> 12)));
    // Special Dimension Blocks
    public static final DeferredBlock<Block> VOIDROCK = BLOCKS.register(
            "voidrock", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BEDROCK)));
    public static final DeferredBlock<Block> NOXERNA_PORTAL_FRAME = BLOCKS.register(
            "noxerna_portal_frame",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.REINFORCED_DEEPSLATE).noLootTable()));
    public static final DeferredBlock<Block> NOXERNA_PORTAL = BLOCKS.register(
            "noxerna_portal",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_PORTAL).noLootTable()));
}
