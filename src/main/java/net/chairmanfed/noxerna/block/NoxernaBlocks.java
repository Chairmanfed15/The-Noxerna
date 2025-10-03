package net.chairmanfed.noxerna.block;

import net.chairmanfed.noxerna.Noxerna;
import net.chairmanfed.noxerna.block.natural.PebbleBlock;
import net.chairmanfed.noxerna.block.portal.NoxernaPortalBlock;
import net.chairmanfed.noxerna.block.utility.FuelCellBlock;
import net.chairmanfed.noxerna.registry.NoxernaSoundTypes;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class NoxernaBlocks {
    // Registers Blocks and assigns properties
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Noxerna.MODID);

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
            "xenon_fence_gate", () -> new FenceGateBlock(NoxernaBlockSetTypes.NOBLEWOOD_WOOD,
                    BlockBehaviour.Properties.ofFullCopy(XENON_PLANKS.get())));
    public static final DeferredBlock<Block> XENON_DOOR = BLOCKS.register(
            "xenon_door", () -> new DoorBlock(NoxernaBlockSetTypes.NOBLEWOOD_SET,
                    BlockBehaviour.Properties.ofFullCopy(XENON_PLANKS.get()).noOcclusion()));
    public static final DeferredBlock<Block> XENON_TRAPDOOR = BLOCKS.register(
            "xenon_trapdoor", () -> new TrapDoorBlock(NoxernaBlockSetTypes.NOBLEWOOD_SET,
                    BlockBehaviour.Properties.ofFullCopy(XENON_PLANKS.get()).noOcclusion()));
    public static final DeferredBlock<Block> XENON_PRESSURE_PLATE = BLOCKS.register(
            "xenon_pressure_plate", () -> new PressurePlateBlock(NoxernaBlockSetTypes.NOBLEWOOD_SET,
                    BlockBehaviour.Properties.ofFullCopy(XENON_PLANKS.get())));
    public static final DeferredBlock<Block> XENON_BUTTON = BLOCKS.register(
            "xenon_button", () -> new ButtonBlock(NoxernaBlockSetTypes.NOBLEWOOD_SET, 30,
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
            "krypton_fence_gate", () -> new FenceGateBlock(NoxernaBlockSetTypes.NOBLEWOOD_WOOD,
                    BlockBehaviour.Properties.ofFullCopy(KRYPTON_PLANKS.get())));
    public static final DeferredBlock<Block> KRYPTON_DOOR = BLOCKS.register(
            "krypton_door", () -> new DoorBlock(NoxernaBlockSetTypes.NOBLEWOOD_SET,
                    BlockBehaviour.Properties.ofFullCopy(KRYPTON_PLANKS.get()).noOcclusion()));
    public static final DeferredBlock<Block> KRYPTON_TRAPDOOR = BLOCKS.register(
            "krypton_trapdoor", () -> new TrapDoorBlock(NoxernaBlockSetTypes.NOBLEWOOD_SET,
                    BlockBehaviour.Properties.ofFullCopy(XENON_PLANKS.get()).noOcclusion()));
    public static final DeferredBlock<Block> KRYPTON_PRESSURE_PLATE = BLOCKS.register(
            "krypton_pressure_plate", () -> new PressurePlateBlock(NoxernaBlockSetTypes.NOBLEWOOD_SET,
                    BlockBehaviour.Properties.ofFullCopy(XENON_PLANKS.get())));
    public static final DeferredBlock<Block> KRYPTON_BUTTON = BLOCKS.register(
            "krypton_button", () -> new ButtonBlock(NoxernaBlockSetTypes.NOBLEWOOD_SET, 30,
                    BlockBehaviour.Properties.ofFullCopy(KRYPTON_PLANKS.get())));

    // Argon Wood set
    public static final DeferredBlock<Block> ARGON_LOG = BLOCKS.register(
            "argon_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .destroyTime(3.5f).explosionResistance(2.0f)
                    .sound(SoundType.CHERRY_WOOD).ignitedByLava().lightLevel(state -> 12)));
    public static final DeferredBlock<Block> ARGON_WOOD = BLOCKS.register(
            "argon_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(ARGON_LOG.get())));
    public static final DeferredBlock<Block> STRIPPED_ARGON_LOG = BLOCKS.register(
            "stripped_argon_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .destroyTime(3.5f).explosionResistance(2.0f)
                    .sound(SoundType.CHERRY_WOOD).ignitedByLava().lightLevel(state -> 12)));
    public static final DeferredBlock<Block> STRIPPED_ARGON_WOOD = BLOCKS.register(
            "stripped_argon_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(STRIPPED_ARGON_LOG.get())));
    public static final DeferredBlock<Block> ARGON_PLANKS = BLOCKS.register(
            "argon_planks", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(3.5f).explosionResistance(3.0f)
                    .sound(NoxernaSoundTypes.NOBLEWOOD).ignitedByLava().lightLevel(state -> 12)));
    public static final DeferredBlock<Block> ARGON_STAIRS = BLOCKS.register(
            "argon_stairs", () -> new StairBlock(ARGON_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(ARGON_PLANKS.get())));
    public static final DeferredBlock<Block> ARGON_SLAB = BLOCKS.register(
            "argon_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(ARGON_PLANKS.get())));
    public static final DeferredBlock<Block> ARGON_FENCE = BLOCKS.register(
            "argon_fence", () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(ARGON_PLANKS.get())));
    public static final DeferredBlock<Block> ARGON_FENCE_GATE = BLOCKS.register(
            "argon_fence_gate", () -> new FenceGateBlock(NoxernaBlockSetTypes.NOBLEWOOD_WOOD,
                    BlockBehaviour.Properties.ofFullCopy(ARGON_PLANKS.get())));
    public static final DeferredBlock<Block> ARGON_DOOR = BLOCKS.register(
            "argon_door", () -> new DoorBlock(NoxernaBlockSetTypes.NOBLEWOOD_SET,
                    BlockBehaviour.Properties.ofFullCopy(ARGON_PLANKS.get()).noOcclusion()));
    public static final DeferredBlock<Block> ARGON_TRAPDOOR = BLOCKS.register(
            "argon_trapdoor", () -> new TrapDoorBlock(NoxernaBlockSetTypes.NOBLEWOOD_SET,
                    BlockBehaviour.Properties.ofFullCopy(ARGON_PLANKS.get()).noOcclusion()));
    public static final DeferredBlock<Block> ARGON_PRESSURE_PLATE = BLOCKS.register(
            "argon_pressure_plate", () -> new PressurePlateBlock(NoxernaBlockSetTypes.NOBLEWOOD_SET,
                    BlockBehaviour.Properties.ofFullCopy(ARGON_PLANKS.get())));
    public static final DeferredBlock<Block> ARGON_BUTTON = BLOCKS.register(
            "argon_button", () -> new ButtonBlock(NoxernaBlockSetTypes.NOBLEWOOD_SET, 30,
                    BlockBehaviour.Properties.ofFullCopy(ARGON_PLANKS.get())));

    // Neon Wood set
    public static final DeferredBlock<Block> NEON_LOG = BLOCKS.register(
            "neon_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .destroyTime(3.5f).explosionResistance(2.0f)
                    .sound(SoundType.CHERRY_WOOD).ignitedByLava().lightLevel(state -> 12)));
    public static final DeferredBlock<Block> NEON_WOOD = BLOCKS.register(
            "neon_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(NEON_LOG.get())));
    public static final DeferredBlock<Block> STRIPPED_NEON_LOG = BLOCKS.register(
            "stripped_neon_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .destroyTime(3.5f).explosionResistance(2.0f)
                    .sound(SoundType.CHERRY_WOOD).ignitedByLava().lightLevel(state -> 12)));
    public static final DeferredBlock<Block> STRIPPED_NEON_WOOD = BLOCKS.register(
            "stripped_neon_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(STRIPPED_NEON_LOG.get())));
    public static final DeferredBlock<Block> NEON_PLANKS = BLOCKS.register(
            "neon_planks", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(3.5f).explosionResistance(3.0f)
                    .sound(NoxernaSoundTypes.NOBLEWOOD).ignitedByLava().lightLevel(state -> 12)));
    public static final DeferredBlock<Block> NEON_STAIRS = BLOCKS.register(
            "neon_stairs", () -> new StairBlock(NEON_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(NEON_PLANKS.get())));
    public static final DeferredBlock<Block> NEON_SLAB = BLOCKS.register(
            "neon_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(NEON_PLANKS.get())));
    public static final DeferredBlock<Block> NEON_FENCE = BLOCKS.register(
            "neon_fence", () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(NEON_PLANKS.get())));
    public static final DeferredBlock<Block> NEON_FENCE_GATE = BLOCKS.register(
            "neon_fence_gate", () -> new FenceGateBlock(NoxernaBlockSetTypes.NOBLEWOOD_WOOD,
                    BlockBehaviour.Properties.ofFullCopy(NEON_PLANKS.get())));
    public static final DeferredBlock<Block> NEON_DOOR = BLOCKS.register(
            "neon_door", () -> new DoorBlock(NoxernaBlockSetTypes.NOBLEWOOD_SET,
                    BlockBehaviour.Properties.ofFullCopy(NEON_PLANKS.get()).noOcclusion()));
    public static final DeferredBlock<Block> NEON_TRAPDOOR = BLOCKS.register(
            "neon_trapdoor", () -> new TrapDoorBlock(NoxernaBlockSetTypes.NOBLEWOOD_SET,
                    BlockBehaviour.Properties.ofFullCopy(NEON_PLANKS.get()).noOcclusion()));
    public static final DeferredBlock<Block> NEON_PRESSURE_PLATE = BLOCKS.register(
            "neon_pressure_plate", () -> new PressurePlateBlock(NoxernaBlockSetTypes.NOBLEWOOD_SET,
                    BlockBehaviour.Properties.ofFullCopy(NEON_PLANKS.get())));
    public static final DeferredBlock<Block> NEON_BUTTON = BLOCKS.register(
            "neon_button", () -> new ButtonBlock(NoxernaBlockSetTypes.NOBLEWOOD_SET, 30,
                    BlockBehaviour.Properties.ofFullCopy(NEON_PLANKS.get())));

    // Soltra Stone set
    public static final DeferredBlock<Block> SOLTRA = BLOCKS.register(
            "soltra", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(7.5f).explosionResistance(9.0f)
                    .sound(NoxernaSoundTypes.NOXUM).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SOLTRA_STAIRS = BLOCKS.register(
            "soltra_stairs", () -> new StairBlock(SOLTRA.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(SOLTRA.get())));
    public static final DeferredBlock<Block> SOLTRA_SLAB = BLOCKS.register(
            "soltra_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(SOLTRA.get())));
    public static final DeferredBlock<Block> SOLTRA_WALL = BLOCKS.register(
            "soltra_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(SOLTRA.get())));
    public static final DeferredBlock<Block> SOLTRA_PRESSURE_PLATE = BLOCKS.register(
            "soltra_pressure_plate", () ->
                    new PressurePlateBlock(NoxernaBlockSetTypes.NOXUM_SET,
                            BlockBehaviour.Properties.ofFullCopy(SOLTRA.get())));
    public static final DeferredBlock<Block> SOLTRA_BUTTON = BLOCKS.register(
            "soltra_button", () ->
                    new ButtonBlock(NoxernaBlockSetTypes.NOXUM_SET, 20,
                            BlockBehaviour.Properties.ofFullCopy(SOLTRA.get())));
    public static final DeferredBlock<Block> POLISHED_SOLTRA = BLOCKS.register(
            "polished_soltra", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(7.5f).explosionResistance(9.0f)
                    .sound(NoxernaSoundTypes.NOXUM).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> POLISHED_SOLTRA_STAIRS = BLOCKS.register(
            "polished_soltra_stairs", () -> new StairBlock(POLISHED_SOLTRA.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(POLISHED_SOLTRA.get())));
    public static final DeferredBlock<Block> POLISHED_SOLTRA_SLAB = BLOCKS.register(
            "polished_soltra_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_SOLTRA.get())));
    public static final DeferredBlock<Block> POLISHED_SOLTRA_WALL = BLOCKS.register(
            "polished_soltra_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_SOLTRA.get())));
    public static final DeferredBlock<Block> SOLTRA_BRICKS = BLOCKS.register(
            "soltra_bricks", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(7.5f).explosionResistance(9.0f)
                    .sound(NoxernaSoundTypes.NOXUM).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SOLTRA_BRICK_STAIRS = BLOCKS.register(
            "soltra_brick_stairs", () -> new StairBlock(SOLTRA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(SOLTRA_BRICKS.get())));
    public static final DeferredBlock<Block> SOLTRA_BRICK_SLAB = BLOCKS.register(
            "soltra_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(SOLTRA_BRICKS.get())));
    public static final DeferredBlock<Block> SOLTRA_BRICK_WALL = BLOCKS.register(
            "soltra_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(SOLTRA_BRICKS.get())));
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
                    new PressurePlateBlock(NoxernaBlockSetTypes.NOXUM_SET,
                            BlockBehaviour.Properties.ofFullCopy(NOXUM.get())));
    public static final DeferredBlock<Block> NOXUM_BUTTON = BLOCKS.register(
            "noxum_button", () ->
                    new ButtonBlock(NoxernaBlockSetTypes.NOXUM_SET, 20,
                            BlockBehaviour.Properties.ofFullCopy(NOXUM.get())));
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
    public static final DeferredBlock<Block> NOXUM_BRICK_WALL = BLOCKS.register(
            "noxum_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(NOXUM_BRICKS.get())));
    public static final DeferredBlock<Block> NOXUM_PEBBLE = BLOCKS.register("noxum_pebble", () ->
            new PebbleBlock(BlockBehaviour.Properties.ofFullCopy(NOXUM.get())
                    .noOcclusion().pushReaction(PushReaction.DESTROY)));

    // Aestum Stone set
    public static final DeferredBlock<Block> AESTUM = BLOCKS.register(
            "aestum", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(6.0f).explosionResistance(7.5f)
                    .sound(NoxernaSoundTypes.NOXUM).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> AESTUM_STAIRS = BLOCKS.register(
            "aestum_stairs", () -> new StairBlock(AESTUM.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(AESTUM.get())));
    public static final DeferredBlock<Block> AESTUM_SLAB = BLOCKS.register(
            "aestum_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(AESTUM.get())));
    public static final DeferredBlock<Block> AESTUM_WALL = BLOCKS.register(
            "aestum_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(AESTUM.get())));
    public static final DeferredBlock<Block> AESTUM_PRESSURE_PLATE = BLOCKS.register(
            "aestum_pressure_plate", () ->
                    new PressurePlateBlock(NoxernaBlockSetTypes.NOXUM_SET,
                            BlockBehaviour.Properties.ofFullCopy(AESTUM.get())));
    public static final DeferredBlock<Block> AESTUM_BUTTON = BLOCKS.register(
            "aestum_button", () ->
                    new ButtonBlock(NoxernaBlockSetTypes.NOXUM_SET, 20,
                            BlockBehaviour.Properties.ofFullCopy(AESTUM.get())));
    public static final DeferredBlock<Block> POLISHED_AESTUM = BLOCKS.register(
            "polished_aestum", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(6.0f).explosionResistance(7.5f)
                    .sound(NoxernaSoundTypes.NOXUM).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> POLISHED_AESTUM_STAIRS = BLOCKS.register(
            "polished_aestum_stairs", () -> new StairBlock(POLISHED_AESTUM.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(POLISHED_AESTUM.get())));
    public static final DeferredBlock<Block> POLISHED_AESTUM_SLAB = BLOCKS.register(
            "polished_aestum_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_AESTUM.get())));
    public static final DeferredBlock<Block> POLISHED_AESTUM_WALL = BLOCKS.register(
            "polished_aestum_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_AESTUM.get())));
    public static final DeferredBlock<Block> AESTUM_BRICKS = BLOCKS.register(
            "aestum_bricks", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(6.0f).explosionResistance(7.5f)
                    .sound(NoxernaSoundTypes.NOXUM).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> AESTUM_BRICK_STAIRS = BLOCKS.register(
            "aestum_brick_stairs", () -> new StairBlock(AESTUM_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(AESTUM_BRICKS.get())));
    public static final DeferredBlock<Block> AESTUM_BRICK_SLAB = BLOCKS.register(
            "aestum_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(AESTUM_BRICKS.get())));
    public static final DeferredBlock<Block> AESTUM_BRICK_WALL = BLOCKS.register(
            "aestum_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(AESTUM_BRICKS.get())));
    public static final DeferredBlock<Block> AESTUM_PEBBLE = BLOCKS.register("aestum_pebble", () ->
            new PebbleBlock(BlockBehaviour.Properties.ofFullCopy(AESTUM.get())
                    .noOcclusion().pushReaction(PushReaction.DESTROY)));

    // Inetra Stone set
    public static final DeferredBlock<Block> INETRA = BLOCKS.register(
            "inetra", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(7.5f).explosionResistance(9.0f)
                    .sound(NoxernaSoundTypes.NOXUM).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> INETRA_STAIRS = BLOCKS.register(
            "inetra_stairs", () -> new StairBlock(INETRA.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(INETRA.get())));
    public static final DeferredBlock<Block> INETRA_SLAB = BLOCKS.register(
            "inetra_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(INETRA.get())));
    public static final DeferredBlock<Block> INETRA_WALL = BLOCKS.register(
            "inetra_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(INETRA.get())));
    public static final DeferredBlock<Block> INETRA_PRESSURE_PLATE = BLOCKS.register(
            "inetra_pressure_plate", () ->
                    new PressurePlateBlock(NoxernaBlockSetTypes.NOXUM_SET,
                            BlockBehaviour.Properties.ofFullCopy(INETRA.get())));
    public static final DeferredBlock<Block> INETRA_BUTTON = BLOCKS.register(
            "inetra_button", () ->
                    new ButtonBlock(NoxernaBlockSetTypes.NOXUM_SET, 20,
                            BlockBehaviour.Properties.ofFullCopy(INETRA.get())));
    public static final DeferredBlock<Block> POLISHED_INETRA = BLOCKS.register(
            "polished_inetra", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(7.5f).explosionResistance(9.0f)
                    .sound(NoxernaSoundTypes.NOXUM).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> POLISHED_INETRA_STAIRS = BLOCKS.register(
            "polished_inetra_stairs", () -> new StairBlock(POLISHED_INETRA.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(POLISHED_INETRA.get())));
    public static final DeferredBlock<Block> POLISHED_INETRA_SLAB = BLOCKS.register(
            "polished_inetra_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_INETRA.get())));
    public static final DeferredBlock<Block> POLISHED_INETRA_WALL = BLOCKS.register(
            "polished_inetra_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_INETRA.get())));
    public static final DeferredBlock<Block> INETRA_BRICKS = BLOCKS.register(
            "inetra_bricks", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(7.5f).explosionResistance(9.0f)
                    .sound(NoxernaSoundTypes.NOXUM).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> INETRA_BRICK_STAIRS = BLOCKS.register(
            "inetra_brick_stairs", () -> new StairBlock(INETRA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(INETRA_BRICKS.get())));
    public static final DeferredBlock<Block> INETRA_BRICK_SLAB = BLOCKS.register(
            "inetra_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(INETRA_BRICKS.get())));
    public static final DeferredBlock<Block> INETRA_BRICK_WALL = BLOCKS.register(
            "inetra_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(INETRA_BRICKS.get())));
    public static final DeferredBlock<Block> INETRA_PEBBLE = BLOCKS.register("inetra_pebble", () ->
            new PebbleBlock(BlockBehaviour.Properties.ofFullCopy(INETRA.get())
                    .noOcclusion().pushReaction(PushReaction.DESTROY)));

    // Resource Storage & Decorative Blocks
    // Iron
    public static final DeferredBlock<Block> IRON_PLATING = BLOCKS.register(
            "iron_plating", ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    public static final DeferredBlock<Block> PLATED_IRON_PILLAR = BLOCKS.register(
            "plated_iron_pillar", () -> new
                    RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(IRON_PLATING.get())));
    public static final DeferredBlock<Block> IRON_PLATING_STAIRS = BLOCKS.register(
            "iron_plating_stairs", () -> new StairBlock(IRON_PLATING.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(IRON_PLATING.get())));
    public static final DeferredBlock<Block> IRON_PLATING_SLAB = BLOCKS.register(
            "iron_plating_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(IRON_PLATING.get())));
    public static final DeferredBlock<Block> IRON_PLATING_WALL = BLOCKS.register(
            "iron_plating_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(IRON_PLATING.get())));
    // Gold
    public static final DeferredBlock<Block> GOLD_PLATING = BLOCKS.register(
            "gold_plating", ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_BLOCK)));
    public static final DeferredBlock<Block> PLATED_GOLD_PILLAR = BLOCKS.register(
            "plated_gold_pillar", () -> new
                    RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(GOLD_PLATING.get())));
    public static final DeferredBlock<Block> GOLD_PLATING_STAIRS = BLOCKS.register(
            "gold_plating_stairs", () -> new StairBlock(GOLD_PLATING.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(GOLD_PLATING.get())));
    public static final DeferredBlock<Block> GOLD_PLATING_SLAB = BLOCKS.register(
            "gold_plating_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(GOLD_PLATING.get())));
    public static final DeferredBlock<Block> GOLD_PLATING_WALL = BLOCKS.register(
            "gold_plating_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(GOLD_PLATING.get())));
    // Netherite
    public static final DeferredBlock<Block> NETHERITE_PLATING = BLOCKS.register(
            "netherite_plating", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERITE_BLOCK)));
    public static final DeferredBlock<Block> PLATED_NETHERITE_PILLAR = BLOCKS.register(
            "plated_netherite_pillar", () -> new
                    RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(NETHERITE_PLATING.get())));
    public static final DeferredBlock<Block> NETHERITE_PLATING_STAIRS = BLOCKS.register(
            "netherite_plating_stairs", () -> new StairBlock(NETHERITE_PLATING.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(NETHERITE_PLATING.get())));
    public static final DeferredBlock<Block> NETHERITE_PLATING_SLAB = BLOCKS.register(
            "netherite_plating_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(NETHERITE_PLATING.get())));
    public static final DeferredBlock<Block> NETHERITE_PLATING_WALL = BLOCKS.register(
            "netherite_plating_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(NETHERITE_PLATING.get())));
    // Ferrebris
    public static final DeferredBlock<Block> RAW_FERREBRIS_BLOCK = BLOCKS.register(
            "raw_ferrebris_block", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(6.5f).explosionResistance(7.5f)
                    .sound(SoundType.ANCIENT_DEBRIS).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> FERREBRIS_BLOCK = BLOCKS.register(
            "ferrebris_block", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(6.5f).explosionResistance(7.5f)
                    .sound(NoxernaSoundTypes.LIGHT_METAL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> FERREBRIS_BARS = BLOCKS.register(
            "ferrebris_bars", () -> new IronBarsBlock(
                    BlockBehaviour.Properties.ofFullCopy(FERREBRIS_BLOCK.get()).noOcclusion()));
    public static final DeferredBlock<Block> FERREBRIS_PLATING = BLOCKS.register(
            "ferrebris_plating", () -> new Block(BlockBehaviour.Properties.ofFullCopy(FERREBRIS_BLOCK.get())));
    public static final DeferredBlock<Block> PLATED_FERREBRIS_PILLAR = BLOCKS.register(
            "plated_ferrebris_pillar", () -> new
                    RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(FERREBRIS_PLATING.get())));
    public static final DeferredBlock<Block> FERREBRIS_PLATING_STAIRS = BLOCKS.register(
            "ferrebris_plating_stairs", () -> new StairBlock(FERREBRIS_PLATING.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(FERREBRIS_PLATING.get())));
    public static final DeferredBlock<Block> FERREBRIS_PLATING_SLAB = BLOCKS.register(
            "ferrebris_plating_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(FERREBRIS_PLATING.get())));
    public static final DeferredBlock<Block> FERREBRIS_PLATING_WALL = BLOCKS.register(
            "ferrebris_plating_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(FERREBRIS_PLATING.get())));
    // Umburam
    public static final DeferredBlock<Block> RAW_UMBURAM_BLOCK = BLOCKS.register(
            "raw_umburam_block", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(6.5f).explosionResistance(7.5f)
                    .sound(SoundType.ANCIENT_DEBRIS).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> UMBURAM_BLOCK = BLOCKS.register(
            "umburam_block", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(6.5f).explosionResistance(7.5f)
                    .sound(NoxernaSoundTypes.LIGHT_METAL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> UMBURAM_PLATING = BLOCKS.register(
            "umburam_plating", () -> new Block(BlockBehaviour.Properties.ofFullCopy(UMBURAM_BLOCK.get())));
    public static final DeferredBlock<Block> PLATED_UMBURAM_PILLAR = BLOCKS.register(
            "plated_umburam_pillar", () -> new
                    RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(UMBURAM_PLATING.get())));
    public static final DeferredBlock<Block> UMBURAM_PLATING_STAIRS = BLOCKS.register(
            "umburam_plating_stairs", () -> new StairBlock(UMBURAM_PLATING.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(UMBURAM_PLATING.get())));
    public static final DeferredBlock<Block> UMBURAM_PLATING_SLAB = BLOCKS.register(
            "umburam_plating_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(UMBURAM_PLATING.get())));
    public static final DeferredBlock<Block> UMBURAM_PLATING_WALL = BLOCKS.register(
            "umburam_plating_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(UMBURAM_PLATING.get())));
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
    public static final DeferredBlock<Block> RAW_INPERLUM_BLOCK = BLOCKS.register(
            "raw_inperlum_block", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(6.5f).explosionResistance(7.5f)
                    .sound(SoundType.ANCIENT_DEBRIS).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> INPERLUM_BLOCK = BLOCKS.register(
            "inperlum_block", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(6.5f).explosionResistance(7.5f)
                    .sound(NoxernaSoundTypes.LIGHT_METAL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> INPERLUM_PLATING = BLOCKS.register(
            "inperlum_plating", () -> new Block(BlockBehaviour.Properties.ofFullCopy(INPERLUM_BLOCK.get())));
    public static final DeferredBlock<Block> PLATED_INPERLUM_PILLAR = BLOCKS.register(
            "plated_inperlum_pillar", () -> new
                    RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(INPERLUM_PLATING.get())));
    public static final DeferredBlock<Block> INPERLUM_PLATING_STAIRS = BLOCKS.register(
            "inperlum_plating_stairs", () -> new StairBlock(INPERLUM_PLATING.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(INPERLUM_PLATING.get())));
    public static final DeferredBlock<Block> INPERLUM_PLATING_SLAB = BLOCKS.register(
            "inperlum_plating_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(INPERLUM_PLATING.get())));
    public static final DeferredBlock<Block> INPERLUM_PLATING_WALL = BLOCKS.register(
            "inperlum_plating_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(INPERLUM_PLATING.get())));
    // Nihoxite
    public static final DeferredBlock<Block> NIHOXITE_BLOCK = BLOCKS.register(
            "nihoxite_block", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(50.0f).explosionResistance(1200.0f)
                    .sound(NoxernaSoundTypes.HEAVY_METAL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIHOXITE_PLATING = BLOCKS.register(
            "nihoxite_plating", () -> new Block(BlockBehaviour.Properties.ofFullCopy(NIHOXITE_BLOCK.get())));
    public static final DeferredBlock<Block> PLATED_NIHOXITE_PILLAR = BLOCKS.register(
            "plated_nihoxite_pillar", () -> new
                    RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(NIHOXITE_PLATING.get())));
    public static final DeferredBlock<Block> NIHOXITE_PLATING_STAIRS = BLOCKS.register(
            "nihoxite_plating_stairs", () -> new StairBlock(NIHOXITE_PLATING.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(NIHOXITE_PLATING.get())));
    public static final DeferredBlock<Block> NIHOXITE_PLATING_SLAB = BLOCKS.register(
            "nihoxite_plating_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(NIHOXITE_PLATING.get())));
    public static final DeferredBlock<Block> NIHOXITE_PLATING_WALL = BLOCKS.register(
            "nihoxite_plating_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(NIHOXITE_PLATING.get())));
    // Mysterious Alloy
    public static final DeferredBlock<Block> MYSTERIOUS_ALLOY_PLATING = BLOCKS.register(
            "mysterious_alloy_plating",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(NIHOXITE_BLOCK.get())));
    public static final DeferredBlock<Block> PLATED_MYSTERIOUS_ALLOY_PILLAR = BLOCKS.register(
            "plated_mysterious_alloy_pillar", () -> new
                    RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(MYSTERIOUS_ALLOY_PLATING.get())));
    public static final DeferredBlock<Block> MYSTERIOUS_ALLOY_PLATING_STAIRS = BLOCKS.register(
            "mysterious_alloy_plating_stairs",
            () -> new StairBlock(MYSTERIOUS_ALLOY_PLATING.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(MYSTERIOUS_ALLOY_PLATING.get())));
    public static final DeferredBlock<Block> MYSTERIOUS_ALLOY_PLATING_SLAB = BLOCKS.register(
            "mysterious_alloy_plating_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(MYSTERIOUS_ALLOY_PLATING.get())));
    public static final DeferredBlock<Block> MYSTERIOUS_ALLOY_PLATING_WALL = BLOCKS.register(
            "mysterious_alloy_plating_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(MYSTERIOUS_ALLOY_PLATING.get())));
    // Vitragor
    public static final DeferredBlock<Block> VITRAGOR_BLOCK = BLOCKS.register(
            "vitragor_block", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(6.5f).explosionResistance(7.5f)
                    .sound(SoundType.NETHERITE_BLOCK).requiresCorrectToolForDrops()));

    // Obscuprum
    public static final DeferredBlock<Block> RAW_OBSCUPRUM_BLOCK = BLOCKS.register(
            "raw_obscuprum_block", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(6.5f).explosionResistance(7.5f)
                    .sound(SoundType.ANCIENT_DEBRIS).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> OBSCUPRUM_BLOCK = BLOCKS.register(
            "obscuprum_block", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.of()
                    .destroyTime(6.5f).explosionResistance(7.5f)
                    .sound(NoxernaSoundTypes.LIGHT_METAL).requiresCorrectToolForDrops().randomTicks()));
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
        // Waxed
        public static final DeferredBlock<Block> WAXED_OBSCUPRUM_BLOCK = BLOCKS.register(
                "waxed_obscuprum_block",
                () -> new Block(BlockBehaviour.Properties.ofFullCopy(OBSCUPRUM_BLOCK.get())));
    // Cut
    public static final DeferredBlock<Block> CUT_OBSCUPRUM_BLOCK = BLOCKS.register(
            "cut_obscuprum_block", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.of()
                            .destroyTime(6.5f).explosionResistance(7.5f)
                            .sound(NoxernaSoundTypes.LIGHT_METAL).requiresCorrectToolForDrops().randomTicks()));
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
                            .sound(NoxernaSoundTypes.LIGHT_METAL).requiresCorrectToolForDrops().randomTicks()));
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
                            .sound(NoxernaSoundTypes.LIGHT_METAL).requiresCorrectToolForDrops().randomTicks()));
    public static final DeferredBlock<Block> EXPOSED_OBSCUPRUM_PLATING = BLOCKS.register(
            "exposed_obscuprum_plating",
            () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.ofFullCopy(OBSCUPRUM_PLATING.get())));
    public static final DeferredBlock<Block> WEATHERED_OBSCUPRUM_PLATING = BLOCKS.register(
            "weathered_obscuprum_plating",
            () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.ofFullCopy(OBSCUPRUM_PLATING.get())));
    public static final DeferredBlock<Block> OXIDIZED_OBSCUPRUM_PLATING = BLOCKS.register(
            "oxidized_obscuprum_plating",
            () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.ofFullCopy(OBSCUPRUM_PLATING.get())));
    // Coloured Blocks
    public static final DeferredBlock<Block> XENON_WOOL = BLOCKS.register(
            "xenon_wool", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_WOOL)
                    .lightLevel(state -> 12)));
    public static final DeferredBlock<Block> KRYPTON_WOOL = BLOCKS.register(
            "krypton_wool", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_WOOL)
                    .lightLevel(state -> 12)));
    public static final DeferredBlock<Block> ARGON_WOOL = BLOCKS.register(
            "argon_wool", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_WOOL)
                    .lightLevel(state -> 12)));
    public static final DeferredBlock<Block> NEON_WOOL = BLOCKS.register(
            "neon_wool", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_WOOL)
                    .lightLevel(state -> 12)));
    public static final DeferredBlock<Block> XENON_CARPET = BLOCKS.register(
            "xenon_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CARPET)
                    .lightLevel(state -> 12)));
    public static final DeferredBlock<Block> XENON_TERRACOTTA = BLOCKS.register(
            "xenon_terracotta", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_TERRACOTTA)
                    .lightLevel(state -> 12)));
    public static final DeferredBlock<Block> KRYPTON_TERRACOTTA = BLOCKS.register(
            "krypton_terracotta", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_TERRACOTTA)
                    .lightLevel(state -> 12)));
    public static final DeferredBlock<Block> ARGON_TERRACOTTA = BLOCKS.register(
            "argon_terracotta", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_TERRACOTTA)
                    .lightLevel(state -> 12)));
    public static final DeferredBlock<Block> NEON_TERRACOTTA = BLOCKS.register(
            "neon_terracotta", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_TERRACOTTA)
                    .lightLevel(state -> 12)));
    public static final DeferredBlock<Block> XENON_CONCRETE = BLOCKS.register(
            "xenon_concrete", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE)
                    .lightLevel(state -> 12)));
    public static final DeferredBlock<Block> KRYPTON_CONCRETE = BLOCKS.register(
            "krypton_concrete", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE)
                    .lightLevel(state -> 12)));
    public static final DeferredBlock<Block> ARGON_CONCRETE = BLOCKS.register(
            "argon_concrete", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE)
                    .lightLevel(state -> 12)));
    public static final DeferredBlock<Block> NEON_CONCRETE = BLOCKS.register(
            "neon_concrete", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE)
                    .lightLevel(state -> 12)));
    public static final DeferredBlock<Block> XENON_CONCRETE_POWDER = BLOCKS.register(
            "xenon_concrete_powder",
            () -> new ConcretePowderBlock(NoxernaBlocks.XENON_CONCRETE.get(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE_POWDER)
                    .lightLevel(state -> 12)));
    public static final DeferredBlock<Block> KRYPTON_CONCRETE_POWDER = BLOCKS.register(
            "krypton_concrete_powder",
            () -> new ConcretePowderBlock(NoxernaBlocks.KRYPTON_CONCRETE.get(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE_POWDER)
                            .lightLevel(state -> 12)));
    public static final DeferredBlock<Block> ARGON_CONCRETE_POWDER = BLOCKS.register(
            "argon_concrete_powder",
            () -> new ConcretePowderBlock(NoxernaBlocks.ARGON_CONCRETE.get(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE_POWDER)
                            .lightLevel(state -> 12)));
    public static final DeferredBlock<Block> NEON_CONCRETE_POWDER = BLOCKS.register(
            "neon_concrete_powder",
            () -> new ConcretePowderBlock(NoxernaBlocks.NEON_CONCRETE.get(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE_POWDER)
                            .lightLevel(state -> 12)));

    public static final DeferredBlock<Block> RADIANT_PLATED_IRON_PILLAR = BLOCKS.register(
            "radiant_plated_iron_pillar", () -> new
                    RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(PLATED_IRON_PILLAR.get())
                    .lightLevel(state -> 15)));
    public static final DeferredBlock<Block> LUMINOUS_PLATED_IRON_PILLAR = BLOCKS.register(
            "luminous_plated_iron_pillar", () -> new
                    RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(PLATED_IRON_PILLAR.get())
                    .lightLevel(state -> 15)));
    public static final DeferredBlock<Block> WHITE_GLOWING_PLATED_IRON_PILLAR =
            registerColouredGlowingMetalPillar("white", "iron", PLATED_IRON_PILLAR);
    public static final DeferredBlock<Block> LIGHT_GRAY_GLOWING_PLATED_IRON_PILLAR =
            registerColouredGlowingMetalPillar("light_gray", "iron", PLATED_IRON_PILLAR);
    public static final DeferredBlock<Block> GRAY_GLOWING_PLATED_IRON_PILLAR =
            registerColouredGlowingMetalPillar("gray", "iron", PLATED_IRON_PILLAR);
    public static final DeferredBlock<Block> BLACK_GLOWING_PLATED_IRON_PILLAR =
            registerColouredGlowingMetalPillar("black", "iron", PLATED_IRON_PILLAR);
    public static final DeferredBlock<Block> BROWN_GLOWING_PLATED_IRON_PILLAR =
            registerColouredGlowingMetalPillar("brown", "iron", PLATED_IRON_PILLAR);
    public static final DeferredBlock<Block> RED_GLOWING_PLATED_IRON_PILLAR =
            registerColouredGlowingMetalPillar("red", "iron", PLATED_IRON_PILLAR);
    public static final DeferredBlock<Block> ORANGE_GLOWING_PLATED_IRON_PILLAR =
            registerColouredGlowingMetalPillar("orange", "iron", PLATED_IRON_PILLAR);
    public static final DeferredBlock<Block> YELLOW_GLOWING_PLATED_IRON_PILLAR =
            registerColouredGlowingMetalPillar("yellow", "iron", PLATED_IRON_PILLAR);
    public static final DeferredBlock<Block> LIME_GLOWING_PLATED_IRON_PILLAR =
            registerColouredGlowingMetalPillar("lime", "iron", PLATED_IRON_PILLAR);
    public static final DeferredBlock<Block> GREEN_GLOWING_PLATED_IRON_PILLAR =
            registerColouredGlowingMetalPillar("green", "iron", PLATED_IRON_PILLAR);
    public static final DeferredBlock<Block> CYAN_GLOWING_PLATED_IRON_PILLAR =
            registerColouredGlowingMetalPillar("cyan", "iron", PLATED_IRON_PILLAR);
    public static final DeferredBlock<Block> LIGHT_BLUE_GLOWING_PLATED_IRON_PILLAR =
            registerColouredGlowingMetalPillar("light_blue", "iron", PLATED_IRON_PILLAR);
    public static final DeferredBlock<Block> BLUE_GLOWING_PLATED_IRON_PILLAR =
            registerColouredGlowingMetalPillar("blue", "iron", PLATED_IRON_PILLAR);
    public static final DeferredBlock<Block> PURPLE_GLOWING_PLATED_IRON_PILLAR =
            registerColouredGlowingMetalPillar("purple", "iron", PLATED_IRON_PILLAR);
    public static final DeferredBlock<Block> MAGENTA_GLOWING_PLATED_IRON_PILLAR =
            registerColouredGlowingMetalPillar("magenta", "iron", PLATED_IRON_PILLAR);
    public static final DeferredBlock<Block> PINK_GLOWING_PLATED_IRON_PILLAR =
            registerColouredGlowingMetalPillar("pink", "iron", PLATED_IRON_PILLAR);
    public static final DeferredBlock<Block> XENON_GLOWING_PLATED_IRON_PILLAR =
            registerColouredGlowingMetalPillar("xenon", "iron", PLATED_IRON_PILLAR);
    public static final DeferredBlock<Block> KRYPTON_GLOWING_PLATED_IRON_PILLAR =
            registerColouredGlowingMetalPillar("krypton", "iron", PLATED_IRON_PILLAR);
    public static final DeferredBlock<Block> ARGON_GLOWING_PLATED_IRON_PILLAR =
            registerColouredGlowingMetalPillar("argon", "iron", PLATED_IRON_PILLAR);
    public static final DeferredBlock<Block> NEON_GLOWING_PLATED_IRON_PILLAR =
            registerColouredGlowingMetalPillar("neon", "iron", PLATED_IRON_PILLAR);

    public static final DeferredBlock<Block> RADIANT_PLATED_FERREBRIS_PILLAR = BLOCKS.register(
            "radiant_plated_ferrebris_pillar", () -> new
                    RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(PLATED_FERREBRIS_PILLAR.get())
                    .lightLevel(state -> 15)));
    public static final DeferredBlock<Block> LUMINOUS_PLATED_FERREBRIS_PILLAR = BLOCKS.register(
            "luminous_plated_ferrebris_pillar", () -> new
                    RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(PLATED_FERREBRIS_PILLAR.get())
                    .lightLevel(state -> 15)));
    public static final DeferredBlock<Block> WHITE_GLOWING_PLATED_FERREBRIS_PILLAR =
            registerColouredGlowingMetalPillar("white", "ferrebris", PLATED_FERREBRIS_PILLAR);
    public static final DeferredBlock<Block> LIGHT_GRAY_GLOWING_PLATED_FERREBRIS_PILLAR =
            registerColouredGlowingMetalPillar("light_gray", "ferrebris", PLATED_FERREBRIS_PILLAR);
    public static final DeferredBlock<Block> GRAY_GLOWING_PLATED_FERREBRIS_PILLAR =
            registerColouredGlowingMetalPillar("gray", "ferrebris", PLATED_FERREBRIS_PILLAR);
    public static final DeferredBlock<Block> BLACK_GLOWING_PLATED_FERREBRIS_PILLAR =
            registerColouredGlowingMetalPillar("black", "ferrebris", PLATED_FERREBRIS_PILLAR);
    public static final DeferredBlock<Block> BROWN_GLOWING_PLATED_FERREBRIS_PILLAR =
            registerColouredGlowingMetalPillar("brown", "ferrebris", PLATED_FERREBRIS_PILLAR);
    public static final DeferredBlock<Block> RED_GLOWING_PLATED_FERREBRIS_PILLAR =
            registerColouredGlowingMetalPillar("red", "ferrebris", PLATED_FERREBRIS_PILLAR);
    public static final DeferredBlock<Block> ORANGE_GLOWING_PLATED_FERREBRIS_PILLAR =
            registerColouredGlowingMetalPillar("orange", "ferrebris", PLATED_FERREBRIS_PILLAR);
    public static final DeferredBlock<Block> YELLOW_GLOWING_PLATED_FERREBRIS_PILLAR =
            registerColouredGlowingMetalPillar("yellow", "ferrebris", PLATED_FERREBRIS_PILLAR);
    public static final DeferredBlock<Block> LIME_GLOWING_PLATED_FERREBRIS_PILLAR =
            registerColouredGlowingMetalPillar("lime", "ferrebris", PLATED_FERREBRIS_PILLAR);
    public static final DeferredBlock<Block> GREEN_GLOWING_PLATED_FERREBRIS_PILLAR =
            registerColouredGlowingMetalPillar("green", "ferrebris", PLATED_FERREBRIS_PILLAR);
    public static final DeferredBlock<Block> CYAN_GLOWING_PLATED_FERREBRIS_PILLAR =
            registerColouredGlowingMetalPillar("cyan", "ferrebris", PLATED_FERREBRIS_PILLAR);
    public static final DeferredBlock<Block> LIGHT_BLUE_GLOWING_PLATED_FERREBRIS_PILLAR =
            registerColouredGlowingMetalPillar("light_blue", "ferrebris", PLATED_FERREBRIS_PILLAR);
    public static final DeferredBlock<Block> BLUE_GLOWING_PLATED_FERREBRIS_PILLAR =
            registerColouredGlowingMetalPillar("blue", "ferrebris", PLATED_FERREBRIS_PILLAR);
    public static final DeferredBlock<Block> PURPLE_GLOWING_PLATED_FERREBRIS_PILLAR =
            registerColouredGlowingMetalPillar("purple", "ferrebris", PLATED_FERREBRIS_PILLAR);
    public static final DeferredBlock<Block> MAGENTA_GLOWING_PLATED_FERREBRIS_PILLAR =
            registerColouredGlowingMetalPillar("magenta", "ferrebris", PLATED_FERREBRIS_PILLAR);
    public static final DeferredBlock<Block> PINK_GLOWING_PLATED_FERREBRIS_PILLAR =
            registerColouredGlowingMetalPillar("pink", "ferrebris", PLATED_FERREBRIS_PILLAR);
    public static final DeferredBlock<Block> XENON_GLOWING_PLATED_FERREBRIS_PILLAR =
            registerColouredGlowingMetalPillar("xenon", "ferrebris", PLATED_FERREBRIS_PILLAR);
    public static final DeferredBlock<Block> KRYPTON_GLOWING_PLATED_FERREBRIS_PILLAR =
            registerColouredGlowingMetalPillar("krypton", "ferrebris", PLATED_FERREBRIS_PILLAR);
    public static final DeferredBlock<Block> ARGON_GLOWING_PLATED_FERREBRIS_PILLAR =
            registerColouredGlowingMetalPillar("argon", "ferrebris", PLATED_FERREBRIS_PILLAR);
    public static final DeferredBlock<Block> NEON_GLOWING_PLATED_FERREBRIS_PILLAR =
            registerColouredGlowingMetalPillar("neon", "ferrebris", PLATED_FERREBRIS_PILLAR);
    // Ores
    public static final DeferredBlock<Block> NOXUM_BURIED_FUEL_CELL = BLOCKS.register(
            "noxum_buried_fuel_cell", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(6.0f).explosionResistance(3.0f)
                    .sound(NoxernaSoundTypes.NOXUM).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> AESTUM_BURIED_FUEL_CELL = BLOCKS.register(
            "aestum_buried_fuel_cell", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(7.5f).explosionResistance(3.0f)
                    .sound(NoxernaSoundTypes.NOXUM).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> INETRA_BURIED_FUEL_CELL = BLOCKS.register(
            "inetra_buried_fuel_cell", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(9.0f).explosionResistance(3.0f)
                    .sound(NoxernaSoundTypes.NOXUM).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NOXUM_FERREBRIS_ORE = BLOCKS.register(
            "noxum_ferrebris_ore", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(6.0f).explosionResistance(3.0f)
                    .sound(NoxernaSoundTypes.NOXUM).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> AESTUM_FERREBRIS_ORE = BLOCKS.register(
            "aestum_ferrebris_ore", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(7.5f).explosionResistance(3.0f)
                    .sound(NoxernaSoundTypes.NOXUM).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> INETRA_FERREBRIS_ORE = BLOCKS.register(
            "inetra_ferrebris_ore", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(9.0f).explosionResistance(3.0f)
                    .sound(NoxernaSoundTypes.NOXUM).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NOXUM_OBSCUPRUM_ORE = BLOCKS.register(
            "noxum_obscuprum_ore", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(6.0f).explosionResistance(3.0f)
                    .sound(NoxernaSoundTypes.NOXUM).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> AESTUM_OBSCUPRUM_ORE = BLOCKS.register(
            "aestum_obscuprum_ore", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(7.5f).explosionResistance(3.0f)
                    .sound(NoxernaSoundTypes.NOXUM).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> INETRA_OBSCUPRUM_ORE = BLOCKS.register(
            "inetra_obscuprum_ore", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(9.0f).explosionResistance(3.0f)
                    .sound(NoxernaSoundTypes.NOXUM).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NOXUM_UMBURAM_ORE = BLOCKS.register(
            "noxum_umburam_ore", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(6.0f).explosionResistance(3.0f)
                    .sound(NoxernaSoundTypes.NOXUM).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> AESTUM_UMBURAM_ORE = BLOCKS.register(
            "aestum_umburam_ore", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(7.5f).explosionResistance(3.0f)
                    .sound(NoxernaSoundTypes.NOXUM).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> INETRA_UMBURAM_ORE = BLOCKS.register(
            "inetra_umburam_ore", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(9.0f).explosionResistance(3.0f)
                    .sound(NoxernaSoundTypes.NOXUM).requiresCorrectToolForDrops()));
    // Functional Blocks
    public static final DeferredBlock<Block> LUMAI_FUEL_CELL = BLOCKS.register(
            "lumai_fuel_cell", () -> new FuelCellBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LANTERN)));
    public static final DeferredBlock<Block> NOBLEWOOD_CRAFTING_TABLE = BLOCKS.register(
            "noblewood_crafting_table",
            () -> new CraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(NoxernaBlocks.XENON_PLANKS.get())));
    // Special Dimension Blocks
    public static final DeferredBlock<Block> VOIDROCK = BLOCKS.register(
            "voidrock", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BEDROCK)));
    public static final DeferredBlock<Block> NOXERNA_PORTAL_FRAME = BLOCKS.register(
            "noxerna_portal_frame",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.REINFORCED_DEEPSLATE)
                    .requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NOXERNA_PORTAL = BLOCKS.register(
            "noxerna_portal",
            () -> new NoxernaPortalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_PORTAL).noLootTable()));
    public static DeferredBlock<Block> registerColouredGlowingMetalPillar(
            String colour, String material, Supplier<Block> baseBlock) {
        return BLOCKS.register(colour + "_glowing_plated_" + material + "_pillar",
                () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(baseBlock.get())
                        .lightLevel(state -> 15)));
    }
}
