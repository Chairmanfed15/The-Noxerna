package net.chairmanfed.noxerna.data.generators;

import net.chairmanfed.noxerna.Noxerna;
import net.chairmanfed.noxerna.data.providers.NoxernaRecipeProvider;
import net.chairmanfed.noxerna.item.NoxernaItems;
import net.chairmanfed.noxerna.registry.NoxernaTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.Tags;

import java.util.concurrent.CompletableFuture;

public class NoxernaRecipeData extends NoxernaRecipeProvider {
    public NoxernaRecipeData(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }
    private ResourceLocation name(String name) {
        return ResourceLocation.fromNamespaceAndPath(Noxerna.MODID, name);
    }
    @Override
    protected void buildRecipes (RecipeOutput output) {
        // Building Block Recipes
        // Xenon
        makePlanks(NoxernaTags.ItemTags.XENON_LOGS, NoxernaItems.XENON_PLANKS.get())
                .group("planks")
                .save(output, name("crafting/xenon_planks"));
        makeStairs(NoxernaItems.XENON_PLANKS.get(), NoxernaItems.XENON_STAIRS.get())
                .group("wooden_stairs")
                .save(output, name("crafting/xenon_stairs"));
        makeSlab(NoxernaItems.XENON_PLANKS.get(), NoxernaItems.XENON_SLAB.get())
                .group("wooden_slab")
                .save(output, name("crafting/xenon_slab"));
        makeSlabIntoBlock(NoxernaItems.XENON_SLAB.get(), NoxernaItems.XENON_PLANKS.get())
                .group("planks")
                .save(output, name("crafting/xenon_planks_from_slab"));
        makeWoodenFence(NoxernaItems.XENON_PLANKS.get(), NoxernaItems.XENON_FENCE.get())
                .group("wooden_fence")
                .save(output, name("crafting/xenon_fence"));
        makeWoodenFenceGate(NoxernaItems.XENON_PLANKS.get(), NoxernaItems.XENON_FENCE_GATE.get())
                .group("wooden_fence_gate")
                .save(output, name("crafting/xenon_fence_gate"));
        makeDoor(NoxernaItems.XENON_PLANKS.get(), NoxernaItems.XENON_DOOR.get())
                .group("wooden_door")
                .save(output, name("crafting/xenon_door"));
        makeTrapdoor(NoxernaItems.XENON_PLANKS.get(), NoxernaItems.XENON_TRAPDOOR.get())
                .group("wooden_trapdoor")
                .save(output, name("crafting/xenon_trapdoor"));
        makePressurePlate(NoxernaItems.XENON_PLANKS.get(), NoxernaItems.XENON_PRESSURE_PLATE.get())
                .group("wooden_pressure_plate")
                .save(output, name("crafting/xenon_pressure_plate"));
        makeButton(NoxernaItems.XENON_PLANKS.get(), NoxernaItems.XENON_BUTTON.get())
                .group("wooden_button")
                .save(output, name("crafting/xenon_button"));
        // Krypton
        makePlanks(NoxernaTags.ItemTags.KRYPTON_LOGS, NoxernaItems.KRYPTON_PLANKS.get())
                .group("planks")
                .save(output, name("crafting/krypton_planks"));
        makeStairs(NoxernaItems.KRYPTON_PLANKS.get(), NoxernaItems.KRYPTON_STAIRS.get())
                .group("wooden_stairs")
                .save(output, name("crafting/krypton_stairs"));
        makeSlab(NoxernaItems.KRYPTON_PLANKS.get(), NoxernaItems.KRYPTON_SLAB.get())
                .group("wooden_slab")
                .save(output, name("crafting/krypton_slab"));
        makeSlabIntoBlock(NoxernaItems.KRYPTON_SLAB.get(), NoxernaItems.KRYPTON_PLANKS.get())
                .group("planks")
                .save(output, name("crafting/krypton_planks_from_slab"));
        makeWoodenFence(NoxernaItems.KRYPTON_PLANKS.get(), NoxernaItems.KRYPTON_FENCE.get())
                .group("wooden_fence")
                .save(output, name("crafting/krypton_fence"));
        makeWoodenFenceGate(NoxernaItems.KRYPTON_PLANKS.get(), NoxernaItems.KRYPTON_FENCE_GATE.get())
                .group("wooden_fence_gate")
                .save(output, name("crafting/krypton_fence_gate"));
        makeDoor(NoxernaItems.KRYPTON_PLANKS.get(), NoxernaItems.KRYPTON_DOOR.get())
                .group("wooden_door")
                .save(output, name("crafting/krypton_door"));
        makeTrapdoor(NoxernaItems.KRYPTON_PLANKS.get(), NoxernaItems.KRYPTON_TRAPDOOR.get())
                .group("wooden_trapdoor")
                .save(output, name("crafting/krypton_trapdoor"));
        makePressurePlate(NoxernaItems.KRYPTON_PLANKS.get(), NoxernaItems.KRYPTON_PRESSURE_PLATE.get())
                .group("wooden_pressure_plate")
                .save(output, name("crafting/krypton_pressure_plate"));
        makeButton(NoxernaItems.KRYPTON_PLANKS.get(), NoxernaItems.KRYPTON_BUTTON.get())
                .group("wooden_button")
                .save(output, name("crafting/krypton_button"));
        // Argon
        makePlanks(NoxernaTags.ItemTags.ARGON_LOGS, NoxernaItems.ARGON_PLANKS.get())
                .group("planks")
                .save(output, name("crafting/argon_planks"));
        makeStairs(NoxernaItems.ARGON_PLANKS.get(), NoxernaItems.ARGON_STAIRS.get())
                .group("wooden_stairs")
                .save(output, name("crafting/argon_stairs"));
        makeSlab(NoxernaItems.ARGON_PLANKS.get(), NoxernaItems.ARGON_SLAB.get())
                .group("wooden_slab")
                .save(output, name("crafting/argon_slab"));
        makeSlabIntoBlock(NoxernaItems.ARGON_SLAB.get(), NoxernaItems.ARGON_PLANKS.get())
                .group("planks")
                .save(output, name("crafting/argon_planks_from_slab"));
        makeWoodenFence(NoxernaItems.ARGON_PLANKS.get(), NoxernaItems.ARGON_FENCE.get())
                .group("wooden_fence")
                .save(output, name("crafting/argon_fence"));
        makeWoodenFenceGate(NoxernaItems.ARGON_PLANKS.get(), NoxernaItems.ARGON_FENCE_GATE.get())
                .group("wooden_fence_gate")
                .save(output, name("crafting/argon_fence_gate"));
        makeDoor(NoxernaItems.ARGON_PLANKS.get(), NoxernaItems.ARGON_DOOR.get())
                .group("wooden_door")
                .save(output, name("crafting/argon_door"));
        makeTrapdoor(NoxernaItems.ARGON_PLANKS.get(), NoxernaItems.ARGON_TRAPDOOR.get())
                .group("wooden_trapdoor")
                .save(output, name("crafting/argon_trapdoor"));
        makePressurePlate(NoxernaItems.ARGON_PLANKS.get(), NoxernaItems.ARGON_PRESSURE_PLATE.get())
                .group("wooden_pressure_plate")
                .save(output, name("crafting/argon_pressure_plate"));
        makeButton(NoxernaItems.ARGON_PLANKS.get(), NoxernaItems.ARGON_BUTTON.get())
                .group("wooden_button")
                .save(output, name("crafting/argon_button"));
        // Neon
        makePlanks(NoxernaTags.ItemTags.NEON_LOGS, NoxernaItems.NEON_PLANKS.get())
                .group("planks")
                .save(output, name("crafting/neon_planks"));
        makeStairs(NoxernaItems.NEON_PLANKS.get(), NoxernaItems.NEON_STAIRS.get())
                .group("wooden_stairs")
                .save(output, name("crafting/neon_stairs"));
        makeSlab(NoxernaItems.NEON_PLANKS.get(), NoxernaItems.NEON_SLAB.get())
                .group("wooden_slab")
                .save(output, name("crafting/neon_slab"));
        makeSlabIntoBlock(NoxernaItems.NEON_SLAB.get(), NoxernaItems.NEON_PLANKS.get())
                .group("planks")
                .save(output, name("crafting/neon_planks_from_slab"));
        makeWoodenFence(NoxernaItems.NEON_PLANKS.get(), NoxernaItems.NEON_FENCE.get())
                .group("wooden_fence")
                .save(output, name("crafting/neon_fence"));
        makeWoodenFenceGate(NoxernaItems.NEON_PLANKS.get(), NoxernaItems.NEON_FENCE_GATE.get())
                .group("wooden_fence_gate")
                .save(output, name("crafting/neon_fence_gate"));
        makeDoor(NoxernaItems.NEON_PLANKS.get(), NoxernaItems.NEON_DOOR.get())
                .group("wooden_door")
                .save(output, name("crafting/neon_door"));
        makeTrapdoor(NoxernaItems.NEON_PLANKS.get(), NoxernaItems.NEON_TRAPDOOR.get())
                .group("wooden_trapdoor")
                .save(output, name("crafting/neon_trapdoor"));
        makePressurePlate(NoxernaItems.NEON_PLANKS.get(), NoxernaItems.NEON_PRESSURE_PLATE.get())
                .group("wooden_pressure_plate")
                .save(output, name("crafting/neon_pressure_plate"));
        makeButton(NoxernaItems.NEON_PLANKS.get(), NoxernaItems.NEON_BUTTON.get())
                .group("wooden_button")
                .save(output, name("crafting/neon_button"));
        // Soltra
        makeStairs(NoxernaItems.SOLTRA.get(), NoxernaItems.SOLTRA_STAIRS.get())
                .group("soltra")
                .save(output, name("crafting/soltra_stairs"));
        makeSlab(NoxernaItems.SOLTRA.get(), NoxernaItems.SOLTRA_SLAB.get())
                .group("soltra")
                .save(output, name("crafting/soltra_slab"));
        makeSlabIntoBlock(NoxernaItems.SOLTRA_SLAB.get(), NoxernaItems.SOLTRA.get())
                .group("soltra")
                .save(output, name("crafting/soltra_from_slab"));
        makeWall(NoxernaItems.SOLTRA.get(), NoxernaItems.SOLTRA_WALL.get())
                .group("soltra")
                .save(output, name("crafting/soltra_wall"));
        makePressurePlate(NoxernaItems.SOLTRA.get(), NoxernaItems.SOLTRA_PRESSURE_PLATE)
                .group("stone_pressure_plate")
                .save(output, name("crafting/soltra_pressure_plate"));
        makeButton(NoxernaItems.SOLTRA_PEBBLE.get(), NoxernaItems.SOLTRA_BUTTON.get())
                .group("stone_button")
                .save(output, name("crafting/soltra_button"));
        unpacking3x3(NoxernaItems.SOLTRA.get(), NoxernaItems.SOLTRA_PEBBLE.get())
                .group("soltra")
                .save(output, name("crafting/soltra_pebble"));
        packing3x3(NoxernaItems.SOLTRA_PEBBLE.get(), NoxernaItems.SOLTRA.get())
                .group("soltra")
                .save(output, name("crafting/soltra_from_pebble"));
        makeBricks(NoxernaItems.SOLTRA.get(), NoxernaItems.POLISHED_SOLTRA.get())
                .group("polished_soltra")
                .save(output, name("crafting/polished_soltra"));
        makeStairs(NoxernaItems.POLISHED_SOLTRA.get(), NoxernaItems.POLISHED_SOLTRA_STAIRS.get())
                .group("polished_soltra")
                .save(output, name("crafting/polished_soltra_stairs"));
        makeSlab(NoxernaItems.POLISHED_SOLTRA.get(), NoxernaItems.POLISHED_SOLTRA_SLAB.get())
                .group("polished_soltra")
                .save(output, name("crafting/polished_soltra_slab"));
        makeSlabIntoBlock(NoxernaItems.POLISHED_SOLTRA_SLAB.get(), NoxernaItems.POLISHED_SOLTRA.get())
                .group("polished_soltra")
                .save(output, name("crafting/polished_soltra_from_slab"));
        makeWall(NoxernaItems.POLISHED_SOLTRA.get(), NoxernaItems.POLISHED_SOLTRA_WALL.get())
                .group("polished_soltra")
                .save(output, name("crafting/polished_soltra_wall"));
        makeBricks(NoxernaItems.POLISHED_SOLTRA.get(), NoxernaItems.SOLTRA_BRICKS.get())
                .group("soltra_bricks")
                .save(output, name("crafting/soltra_bricks"));
        makeStairs(NoxernaItems.SOLTRA_BRICKS.get(), NoxernaItems.SOLTRA_BRICK_STAIRS.get())
                .group("soltra_bricks")
                .save(output, name("crafting/soltra_brick_stairs"));
        makeSlab(NoxernaItems.SOLTRA_BRICKS.get(), NoxernaItems.SOLTRA_BRICK_SLAB.get())
                .group("soltra_bricks")
                .save(output, name("crafting/soltra_brick_slab"));
        makeSlabIntoBlock(NoxernaItems.SOLTRA_BRICK_SLAB.get(), NoxernaItems.SOLTRA_BRICKS.get())
                .group("soltra_bricks")
                .save(output, name("crafting/soltra_bricks_from_slab"));
        makeWall(NoxernaItems.SOLTRA_BRICKS.get(), NoxernaItems.SOLTRA_BRICK_WALL.get())
                .group("soltra_bricks")
                .save(output, name("crafting/soltra_brick_wall"));
        // Noxum
        makeStairs(NoxernaItems.NOXUM.get(), NoxernaItems.NOXUM_STAIRS.get())
                .group("noxum")
                .save(output, name("crafting/noxum_stairs"));
        makeSlab(NoxernaItems.NOXUM.get(), NoxernaItems.NOXUM_SLAB.get())
                .group("noxum")
                .save(output, name("crafting/noxum_slab"));
        makeSlabIntoBlock(NoxernaItems.NOXUM_SLAB.get(), NoxernaItems.NOXUM.get())
                .group("noxum")
                .save(output, name("crafting/noxum_from_slab"));
        makeWall(NoxernaItems.NOXUM.get(), NoxernaItems.NOXUM_WALL.get())
                .group("noxum")
                .save(output, name("crafting/noxum_wall"));
        makePressurePlate(NoxernaItems.NOXUM.get(), NoxernaItems.NOXUM_PRESSURE_PLATE)
                .group("stone_pressure_plate")
                .save(output, name("crafting/noxum_pressure_plate"));
        makeButton(NoxernaItems.NOXUM_PEBBLE.get(), NoxernaItems.NOXUM_BUTTON.get())
                .group("stone_button")
                .save(output, name("crafting/noxum_button"));
        unpacking3x3(NoxernaItems.NOXUM.get(), NoxernaItems.NOXUM_PEBBLE.get())
                .group("noxum")
                .save(output, name("crafting/noxum_pebble"));
        packing3x3(NoxernaItems.NOXUM_PEBBLE.get(), NoxernaItems.NOXUM.get())
                .group("noxum")
                .save(output, name("crafting/noxum_from_pebble"));
        makeBricks(NoxernaItems.NOXUM.get(), NoxernaItems.POLISHED_NOXUM.get())
                .group("polished_noxum")
                .save(output, name("crafting/polished_noxum"));
        makeStairs(NoxernaItems.POLISHED_NOXUM.get(), NoxernaItems.POLISHED_NOXUM_STAIRS.get())
                .group("polished_noxum")
                .save(output, name("crafting/polished_noxum_stairs"));
        makeSlab(NoxernaItems.POLISHED_NOXUM.get(), NoxernaItems.POLISHED_NOXUM_SLAB.get())
                .group("polished_noxum")
                .save(output, name("crafting/polished_noxum_slab"));
        makeSlabIntoBlock(NoxernaItems.POLISHED_NOXUM_SLAB.get(), NoxernaItems.POLISHED_NOXUM.get())
                .group("polished_noxum")
                .save(output, name("crafting/polished_noxum_from_slab"));
        makeWall(NoxernaItems.POLISHED_NOXUM.get(), NoxernaItems.POLISHED_NOXUM_WALL.get())
                .group("polished_noxum")
                .save(output, name("crafting/polished_noxum_wall"));
        makeBricks(NoxernaItems.POLISHED_NOXUM.get(), NoxernaItems.NOXUM_BRICKS.get())
                .group("noxum_bricks")
                .save(output, name("crafting/noxum_bricks"));
        makeStairs(NoxernaItems.NOXUM_BRICKS.get(), NoxernaItems.NOXUM_BRICK_STAIRS.get())
                .group("noxum_bricks")
                .save(output, name("crafting/noxum_brick_stairs"));
        makeSlab(NoxernaItems.NOXUM_BRICKS.get(), NoxernaItems.NOXUM_BRICK_SLAB.get())
                .group("noxum_bricks")
                .save(output, name("crafting/noxum_brick_slab"));
        makeSlabIntoBlock(NoxernaItems.NOXUM_BRICK_SLAB.get(), NoxernaItems.NOXUM_BRICKS.get())
                .group("noxum_bricks")
                .save(output, name("crafting/noxum_bricks_from_slab"));
        makeWall(NoxernaItems.NOXUM_BRICKS.get(), NoxernaItems.NOXUM_BRICK_WALL.get())
                .group("noxum_bricks")
                .save(output, name("crafting/noxum_brick_wall"));
        // Aestum
        makeStairs(NoxernaItems.AESTUM.get(), NoxernaItems.AESTUM_STAIRS.get())
                .group("aestum")
                .save(output, name("crafting/aestum_stairs"));
        makeSlab(NoxernaItems.AESTUM.get(), NoxernaItems.AESTUM_SLAB.get())
                .group("aestum")
                .save(output, name("crafting/aestum_slab"));
        makeSlabIntoBlock(NoxernaItems.AESTUM_SLAB.get(), NoxernaItems.AESTUM.get())
                .group("aestum")
                .save(output, name("crafting/aestum_from_slab"));
        makeWall(NoxernaItems.AESTUM.get(), NoxernaItems.AESTUM_WALL.get())
                .group("aestum")
                .save(output, name("crafting/aestum_wall"));
        makePressurePlate(NoxernaItems.AESTUM.get(), NoxernaItems.AESTUM_PRESSURE_PLATE)
                .group("stone_pressure_plate")
                .save(output, name("crafting/aestum_pressure_plate"));
        makeButton(NoxernaItems.AESTUM_PEBBLE.get(), NoxernaItems.AESTUM_BUTTON.get())
                .group("stone_button")
                .save(output, name("crafting/aestum_button"));
        unpacking3x3(NoxernaItems.AESTUM.get(), NoxernaItems.AESTUM_PEBBLE.get())
                .group("aestum")
                .save(output, name("crafting/aestum_pebble"));
        packing3x3(NoxernaItems.AESTUM_PEBBLE.get(), NoxernaItems.AESTUM.get())
                .group("aestum")
                .save(output, name("crafting/aestum_from_pebble"));
        makeBricks(NoxernaItems.AESTUM.get(), NoxernaItems.POLISHED_AESTUM.get())
                .group("polished_aestum")
                .save(output, name("crafting/polished_aestum"));
        makeStairs(NoxernaItems.POLISHED_AESTUM.get(), NoxernaItems.POLISHED_AESTUM_STAIRS.get())
                .group("polished_aestum")
                .save(output, name("crafting/polished_aestum_stairs"));
        makeSlab(NoxernaItems.POLISHED_AESTUM.get(), NoxernaItems.POLISHED_AESTUM_SLAB.get())
                .group("polished_aestum")
                .save(output, name("crafting/polished_aestum_slab"));
        makeSlabIntoBlock(NoxernaItems.POLISHED_AESTUM_SLAB.get(), NoxernaItems.POLISHED_AESTUM.get())
                .group("polished_aestum")
                .save(output, name("crafting/polished_aestum_from_slab"));
        makeWall(NoxernaItems.POLISHED_AESTUM.get(), NoxernaItems.POLISHED_AESTUM_WALL.get())
                .group("polished_aestum")
                .save(output, name("crafting/polished_aestum_wall"));
        makeBricks(NoxernaItems.POLISHED_AESTUM.get(), NoxernaItems.AESTUM_BRICKS.get())
                .group("aestum_bricks")
                .save(output, name("crafting/aestum_bricks"));
        makeStairs(NoxernaItems.AESTUM_BRICKS.get(), NoxernaItems.AESTUM_BRICK_STAIRS.get())
                .group("aestum_bricks")
                .save(output, name("crafting/aestum_brick_stairs"));
        makeSlab(NoxernaItems.AESTUM_BRICKS.get(), NoxernaItems.AESTUM_BRICK_SLAB.get())
                .group("aestum_bricks")
                .save(output, name("crafting/aestum_brick_slab"));
        makeSlabIntoBlock(NoxernaItems.AESTUM_BRICK_SLAB.get(), NoxernaItems.AESTUM_BRICKS.get())
                .group("aestum_bricks")
                .save(output, name("crafting/aestum_bricks_from_slab"));
        makeWall(NoxernaItems.AESTUM_BRICKS.get(), NoxernaItems.AESTUM_BRICK_WALL.get())
                .group("aestum_bricks")
                .save(output, name("crafting/aestum_brick_wall"));
        // Inetra
        makeStairs(NoxernaItems.INETRA.get(), NoxernaItems.INETRA_STAIRS.get())
                .group("inetra")
                .save(output, name("crafting/inetra_stairs"));
        makeSlab(NoxernaItems.INETRA.get(), NoxernaItems.INETRA_SLAB.get())
                .group("inetra")
                .save(output, name("crafting/inetra_slab"));
        makeSlabIntoBlock(NoxernaItems.INETRA_SLAB.get(), NoxernaItems.INETRA.get())
                .group("inetra")
                .save(output, name("crafting/inetra_from_slab"));
        makeWall(NoxernaItems.INETRA.get(), NoxernaItems.INETRA_WALL.get())
                .group("inetra")
                .save(output, name("crafting/inetra_wall"));
        makePressurePlate(NoxernaItems.INETRA.get(), NoxernaItems.INETRA_PRESSURE_PLATE)
                .group("stone_pressure_plate")
                .save(output, name("crafting/inetra_pressure_plate"));
        makeButton(NoxernaItems.INETRA_PEBBLE.get(), NoxernaItems.INETRA_BUTTON.get())
                .group("stone_button")
                .save(output, name("crafting/inetra_button"));
        unpacking3x3(NoxernaItems.INETRA.get(), NoxernaItems.INETRA_PEBBLE.get())
                .group("inetra")
                .save(output, name("crafting/inetra_pebble"));
        packing3x3(NoxernaItems.INETRA_PEBBLE.get(), NoxernaItems.INETRA.get())
                .group("inetra")
                .save(output, name("crafting/inetra_from_pebble"));
        makeBricks(NoxernaItems.INETRA.get(), NoxernaItems.POLISHED_INETRA.get())
                .group("polished_inetra")
                .save(output, name("crafting/polished_inetra"));
        makeStairs(NoxernaItems.POLISHED_INETRA.get(), NoxernaItems.POLISHED_INETRA_STAIRS.get())
                .group("polished_inetra")
                .save(output, name("crafting/polished_inetra_stairs"));
        makeSlab(NoxernaItems.POLISHED_INETRA.get(), NoxernaItems.POLISHED_INETRA_SLAB.get())
                .group("polished_inetra")
                .save(output, name("crafting/polished_inetra_slab"));
        makeSlabIntoBlock(NoxernaItems.POLISHED_INETRA_SLAB.get(), NoxernaItems.POLISHED_INETRA.get())
                .group("polished_inetra")
                .save(output, name("crafting/polished_inetra_from_slab"));
        makeWall(NoxernaItems.POLISHED_INETRA.get(), NoxernaItems.POLISHED_INETRA_WALL.get())
                .group("polished_inetra")
                .save(output, name("crafting/polished_inetra_wall"));
        makeBricks(NoxernaItems.POLISHED_INETRA.get(), NoxernaItems.INETRA_BRICKS.get())
                .group("inetra_bricks")
                .save(output, name("crafting/inetra_bricks"));
        makeStairs(NoxernaItems.INETRA_BRICKS.get(), NoxernaItems.INETRA_BRICK_STAIRS.get())
                .group("inetra_bricks")
                .save(output, name("crafting/inetra_brick_stairs"));
        makeSlab(NoxernaItems.INETRA_BRICKS.get(), NoxernaItems.INETRA_BRICK_SLAB.get())
                .group("inetra_bricks")
                .save(output, name("crafting/inetra_brick_slab"));
        makeSlabIntoBlock(NoxernaItems.INETRA_BRICK_SLAB.get(), NoxernaItems.INETRA_BRICKS.get())
                .group("inetra_bricks")
                .save(output, name("crafting/inetra_bricks_from_slab"));
        makeWall(NoxernaItems.INETRA_BRICKS.get(), NoxernaItems.INETRA_BRICK_WALL.get())
                .group("inetra_bricks")
                .save(output, name("crafting/inetra_brick_wall"));
        // Plating
        makeSlabIntoBlock(NoxernaItems.IRON_PLATING_SLAB.get(), NoxernaItems.IRON_PLATING.get())
                .group("plating")
                .save(output, name("crafting/iron_plating_from_slab"));
        makeSlabIntoBlock(NoxernaItems.FERREBRIS_PLATING_SLAB.get(), NoxernaItems.FERREBRIS_PLATING.get())
                .group("plating")
                .save(output, name("crafting/ferrebris_plating_from_slab"));
        makeSlabIntoBlock(NoxernaItems.UMBURAM_PLATING_SLAB.get(), NoxernaItems.UMBURAM_PLATING.get())
                .group("plating")
                .save(output, name("crafting/umburam_plating_from_slab"));
        makeSlabIntoBlock(NoxernaItems.INPERLUM_PLATING_SLAB.get(), NoxernaItems.INPERLUM_PLATING.get())
                .group("plating")
                .save(output, name("crafting/inperlum_plating_from_slab"));
        makeSlabIntoBlock(NoxernaItems.NIHOXITE_PLATING_SLAB.get(), NoxernaItems.NIHOXITE_PLATING.get())
                .group("plating")
                .save(output, name("crafting/nihoxite_plating_from_slab"));
        packing2x2(NoxernaTags.ItemTags.MYSTERIOUS_ALLOY_PLATES, NoxernaItems.MYSTERIOUS_ALLOY_PLATING.get(), 4)
                .group("plating")
                .save(output, name("crafting/mysterious_alloy_plating"));
        makeSlabIntoBlock(NoxernaItems.MYSTERIOUS_ALLOY_PLATING_SLAB.get(), NoxernaItems.MYSTERIOUS_ALLOY_PLATING.get())
                .group("plating")
                .save(output, name("crafting/mysterious_alloy_plating_from_slab"));
        // Storage Blocks
        packing3x3(NoxernaItems.RAW_FERREBRIS.get(), NoxernaItems.RAW_FERREBRIS_BLOCK.get(),
                NoxernaTags.ItemTags.RAW_FERREBRIS_MATERIALS)
                .group("raw_ferrebris")
                .save(output, name("crafting/raw_ferrebris_block"));
        packing3x3(NoxernaItems.RAW_OBSCUPRUM.get(), NoxernaItems.RAW_OBSCUPRUM_BLOCK.get(),
                NoxernaTags.ItemTags.RAW_OBSCUPRUM_MATERIALS)
                .group("raw_obscuprum")
                .save(output, name("crafting/raw_obscuprum_block"));
        packing3x3(NoxernaItems.RAW_UMBURAM.get(), NoxernaItems.RAW_UMBURAM_BLOCK.get(),
                NoxernaTags.ItemTags.RAW_UMBURAM_MATERIALS)
                .group("raw_umburam")
                .save(output, name("crafting/raw_umburam_block"));
        packing3x3(NoxernaItems.RAW_INPERLUM.get(), NoxernaItems.RAW_INPERLUM_BLOCK.get(),
                NoxernaTags.ItemTags.RAW_INPERLUM_MATERIALS)
                .group("raw_inperlum")
                .save(output, name("crafting/raw_inperlum_block"));
        packing3x3(NoxernaItems.FERREBRIS_INGOT.get(), NoxernaItems.FERREBRIS_BLOCK.get(),
                NoxernaTags.ItemTags.FERREBRIS_INGOTS)
                .group("ferrebris")
                .save(output, name("crafting/ferrebris_block"));
        packing3x3(NoxernaItems.OBSCUPRUM_INGOT.get(), NoxernaItems.OBSCUPRUM_BLOCK.get(),
                NoxernaTags.ItemTags.OBSCUPRUM_INGOTS)
                .group("obscuprum")
                .save(output, name("crafting/obscuprum_block"));
        packing3x3(NoxernaItems.UMBURAM_INGOT.get(), NoxernaItems.UMBURAM_BLOCK.get(),
                NoxernaTags.ItemTags.UMBURAM_INGOTS)
                .group("umburam")
                .save(output, name("crafting/umburam_block"));
        packing3x3(NoxernaItems.INPERLUM_INGOT.get(), NoxernaItems.INPERLUM_BLOCK.get(),
                NoxernaTags.ItemTags.INPERLUM_INGOTS)
                .group("inperlum")
                .save(output, name("crafting/inperlum_block"));
        packing3x3(NoxernaItems.NIHOXITE_INGOT.get(), NoxernaItems.NIHOXITE_BLOCK.get(),
                NoxernaTags.ItemTags.NIHOXITE_INGOTS)
                .group("nihoxite")
                .save(output, name("crafting/nihoxite_block"));

        // Noblewood Alt Recipes
        villagerWorkStation(NoxernaTags.ItemTags.ANY_IRON_INGOT, Items.SMITHING_TABLE)
                .group("smithing_tables")
                .save(output, name("crafting/noblewood_smithing_table"));
        packing2x2(NoxernaTags.ItemTags.NOBLEWOOD_PLANKS, Items.CRAFTING_TABLE)
                .group("crafting_tables")
                .save(output, name("crafting/noblewood_crafting_table"));

        // Ingredient Recipes
        // Crafting
        makeSticks(NoxernaTags.ItemTags.NOBLEWOOD_PLANKS, NoxernaItems.NOBLEWOOD_STICK.get())
                .group("sticks")
                .save(output, name("crafting/noblewood_stick"));
        // Packing 2x2
        packing2x2(NoxernaItems.MYSTERIOUS_SCRAP.get(), NoxernaItems.MYSTERIOUS_ALLOY_PLATE.get(), 2)
                .group("mysterious_alloy_plate")
                .save(output, name("crafting/mysterious_alloy_plate"));
        // Packing 3x3
        packing3x3(NoxernaItems.FERREBRIS_NUGGET.get(), NoxernaItems.FERREBRIS_INGOT.get(),
                NoxernaTags.ItemTags.FERREBRIS_NUGGETS)
                .group("ferrebris")
                .save(output, name("crafting/ferrebris_ingot_from_nugget"));
        packing3x3(NoxernaItems.OBSCUPRUM_NUGGET.get(), NoxernaItems.OBSCUPRUM_INGOT.get(),
                NoxernaTags.ItemTags.OBSCUPRUM_NUGGETS)
                .group("obscuprum")
                .save(output, name("crafting/obscuprum_ingot_from_nugget"));
        packing3x3(NoxernaItems.UMBURAM_NUGGET.get(), NoxernaItems.UMBURAM_INGOT.get(),
                NoxernaTags.ItemTags.UMBURAM_NUGGETS)
                .group("umburam")
                .save(output, name("crafting/umburam_ingot_from_nugget"));
        packing3x3(NoxernaItems.INPERLUM_NUGGET.get(), NoxernaItems.INPERLUM_INGOT.get(),
                NoxernaTags.ItemTags.INPERLUM_NUGGETS)
                .group("inperlum")
                .save(output, name("crafting/inperlum_ingot_from_nugget"));
        packing3x3(NoxernaItems.NIHOXITE_NUGGET.get(), NoxernaItems.NIHOXITE_INGOT.get(),
                NoxernaTags.ItemTags.NIHOXITE_NUGGETS)
                .group("nihoxite")
                .save(output, name("crafting/nihoxite_ingot_from_nugget"));
        // Unpacking 3x3
        unpacking3x3(NoxernaItems.RAW_FERREBRIS_BLOCK.get(), NoxernaItems.RAW_FERREBRIS)
                .group("raw_ferrebris")
                .save(output, name("crafting/raw_ferrebris_from_block"));
        unpacking3x3(NoxernaItems.RAW_OBSCUPRUM_BLOCK.get(), NoxernaItems.RAW_OBSCUPRUM)
                .group("raw_obscuprum")
                .save(output, name("crafting/raw_obscuprum_from_block"));
        unpacking3x3(NoxernaItems.RAW_UMBURAM_BLOCK.get(), NoxernaItems.RAW_UMBURAM)
                .group("raw_umburam")
                .save(output, name("crafting/raw_umburam_from_block"));
        unpacking3x3(NoxernaItems.RAW_INPERLUM_BLOCK.get(), NoxernaItems.RAW_INPERLUM)
                .group("raw_inperlum")
                .save(output, name("crafting/raw_inperlum_from_block"));
        unpacking3x3(NoxernaItems.FERREBRIS_BLOCK.get(), NoxernaItems.FERREBRIS_INGOT.get())
                .group("ferrebris")
                .save(output, name("crafting/ferrebris_ingot_from_block"));
        unpacking3x3(NoxernaItems.FERREBRIS_INGOT.get(), NoxernaItems.FERREBRIS_NUGGET.get())
                .group("ferrebris")
                .save(output, name("crafting/ferrebris_nugget"));
        unpacking3x3(NoxernaItems.OBSCUPRUM_BLOCK.get(), NoxernaItems.OBSCUPRUM_INGOT.get())
                .group("obscuprum")
                .save(output, name("crafting/obscuprum_ingot_from_block"));
        unpacking3x3(NoxernaItems.OBSCUPRUM_INGOT.get(), NoxernaItems.OBSCUPRUM_NUGGET.get())
                .group("obscuprum")
                .save(output, name("crafting/obscuprum_nugget"));
        unpacking3x3(NoxernaItems.UMBURAM_BLOCK.get(), NoxernaItems.UMBURAM_INGOT.get())
                .group("umburam")
                .save(output, name("crafting/umburam_ingot_from_block"));
        unpacking3x3(NoxernaItems.UMBURAM_INGOT.get(), NoxernaItems.UMBURAM_NUGGET.get())
                .group("umburam")
                .save(output, name("crafting/umburam_nugget"));
        // Smelting
        smelting(NoxernaTags.ItemTags.FERREBRIS_ORES, NoxernaItems.FERREBRIS_INGOT.get(),
                0.7f, 200)
                .group("ferrebris_ingot")
                .save(output, name("smelting/ferrebris_ingot_from_ore"));
        smelting(NoxernaTags.ItemTags.RAW_FERREBRIS_MATERIALS, NoxernaItems.FERREBRIS_INGOT.get(),
                0.7f, 200)
                .group("ferrebris_ingot")
                .save(output, name("smelting/ferrebris_ingot_from_raw"));
        smelting(NoxernaTags.ItemTags.RAW_OBSCUPRUM_MATERIALS, NoxernaItems.OBSCUPRUM_INGOT.get(),
                0.7f, 200)
                .group("obscuprum_ingot")
                .save(output, name("smelting/obscuprum_ingot"));
        smelting(NoxernaTags.ItemTags.RAW_UMBURAM_MATERIALS, NoxernaItems.UMBURAM_INGOT.get(),
                0.7f, 200)
                .group("umburam_ingot")
                .save(output, name("smelting/umburam_ingot"));
        // Blasting
        blasting(NoxernaTags.ItemTags.FERREBRIS_ORES, NoxernaItems.FERREBRIS_INGOT.get(),
                0.7f, 100)
                .group("ferrebris_ingot")
                .save(output, name("blasting/ferrebris_ingot_from_ore"));
        blasting(NoxernaTags.ItemTags.RAW_FERREBRIS_MATERIALS, NoxernaItems.FERREBRIS_INGOT.get(),
                0.7f, 100)
                .group("ferrebris_ingot")
                .save(output, name("blasting/ferrebris_ingot_from_raw"));
        blasting(NoxernaTags.ItemTags.RAW_OBSCUPRUM_MATERIALS, NoxernaItems.OBSCUPRUM_INGOT.get(),
                0.7f, 100)
                .group("obscuprum_ingot")
                .save(output, name("blasting/obscuprum_ingot"));
        blasting(NoxernaTags.ItemTags.RAW_UMBURAM_MATERIALS, NoxernaItems.UMBURAM_INGOT.get(),
                0.7f, 100)
                .group("umburam_ingot")
                .save(output, name("blasting/umburam_ingot"));
        blasting(NoxernaTags.ItemTags.RECYCLABLE_LOOT, NoxernaItems.MYSTERIOUS_SCRAP.get(),
                0.0f, 200)
                .group("mysterious_scrap")
                .save(output, name("blasting/mysterious_scrap_from_loot"));
        // Cutting
        stonecutting(NoxernaTags.ItemTags.TENERYL_GEMS, NoxernaItems.CUT_TENERYL)
                .save(output, name("stonecutting/cut_teneryl"));
        stonecutting(NoxernaTags.ItemTags.VITRAGOR_GEMS, NoxernaItems.VITRAGOR_DUST)
                .save(output, name("stonecutting/vitragor_dust"));

        // Smithing Templates
        cloneSmithingTemplate(NoxernaItems.INETRA.get(), NoxernaItems.NIHOXITE_UPGRADE_SMITHING_TEMPLATE.get())
                .group("smithing_template")
                .save(output, name("crafting/nihoxite_upgrade_smithing_template"));
        cloneSmithingTemplate(NoxernaItems.MYSTERIOUS_ALLOY_PLATE.get(), NoxernaItems.EXOTIC_ARMOR_TRIM_SMITHING_TEMPLATE.get())
                .group("smithing_template")
                .save(output, name("crafting/exotic_armor_trim_smithing_template"));
        // Armour Trims
        trimRecipe(NoxernaItems.EXOTIC_ARMOR_TRIM_SMITHING_TEMPLATE.get())
                .save(output, name("smithing/exotic_armor_trim_smithing"));
            // Alt recipes
        cloneSmithingTemplate(Items.NETHERRACK, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE)
                .group("smithing_template")
                .save(output, name("crafting/netherite_upgrade_smithing_template_from_any_diamond"));
        cloneSmithingTemplate(Items.COBBLESTONE, Items.SENTRY_ARMOR_TRIM_SMITHING_TEMPLATE)
                .group("smithing_template")
                .save(output, name("crafting/sentry_upgrade_smithing_template_from_any_diamond"));
        cloneSmithingTemplate(Items.COBBLESTONE, Items.VEX_ARMOR_TRIM_SMITHING_TEMPLATE)
                .group("smithing_template")
                .save(output, name("crafting/vex_upgrade_smithing_template_from_any_diamond"));
        cloneSmithingTemplate(Items.MOSSY_COBBLESTONE, Items.WILD_ARMOR_TRIM_SMITHING_TEMPLATE)
                .group("smithing_template")
                .save(output, name("crafting/wild_upgrade_smithing_template_from_any_diamond"));
        cloneSmithingTemplate(Items.COBBLESTONE, Items.COAST_ARMOR_TRIM_SMITHING_TEMPLATE)
                .group("smithing_template")
                .save(output, name("crafting/coast_upgrade_smithing_template_from_any_diamond"));
        cloneSmithingTemplate(Items.SANDSTONE, Items.DUNE_ARMOR_TRIM_SMITHING_TEMPLATE)
                .group("smithing_template")
                .save(output, name("crafting/dune_upgrade_smithing_template_from_any_diamond"));
        cloneSmithingTemplate(Items.TERRACOTTA, Items.WAYFINDER_ARMOR_TRIM_SMITHING_TEMPLATE)
                .group("smithing_template")
                .save(output, name("crafting/wayfinder_upgrade_smithing_template_from_any_diamond"));
        cloneSmithingTemplate(Items.TERRACOTTA, Items.RAISER_ARMOR_TRIM_SMITHING_TEMPLATE)
                .group("smithing_template")
                .save(output, name("crafting/raiser_upgrade_smithing_template_from_any_diamond"));
        cloneSmithingTemplate(Items.TERRACOTTA, Items.SHAPER_ARMOR_TRIM_SMITHING_TEMPLATE)
                .group("smithing_template")
                .save(output, name("crafting/shaper_upgrade_smithing_template_from_any_diamond"));
        cloneSmithingTemplate(Items.TERRACOTTA, Items.HOST_ARMOR_TRIM_SMITHING_TEMPLATE)
                .group("smithing_template")
                .save(output, name("crafting/host_upgrade_smithing_template_from_any_diamond"));
        cloneSmithingTemplate(Items.COBBLED_DEEPSLATE, Items.WARD_ARMOR_TRIM_SMITHING_TEMPLATE)
                .group("smithing_template")
                .save(output, name("crafting/ward_upgrade_smithing_template_from_any_diamond"));
        cloneSmithingTemplate(Items.COBBLED_DEEPSLATE, Items.SILENCE_ARMOR_TRIM_SMITHING_TEMPLATE)
                .group("smithing_template")
                .save(output, name("crafting/silence_upgrade_smithing_template_from_any_diamond"));
        cloneSmithingTemplate(Items.PRISMARINE, Items.TIDE_ARMOR_TRIM_SMITHING_TEMPLATE)
                .group("smithing_template")
                .save(output, name("crafting/tide_upgrade_smithing_template_from_any_diamond"));
        cloneSmithingTemplate(Items.BLACKSTONE, Items.SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE)
                .group("smithing_template")
                .save(output, name("crafting/snout_upgrade_smithing_template_from_any_diamond"));
        cloneSmithingTemplate(Items.NETHERRACK, Items.RIB_ARMOR_TRIM_SMITHING_TEMPLATE)
                .group("smithing_template")
                .save(output, name("crafting/rib_upgrade_smithing_template_from_any_diamond"));
        cloneSmithingTemplate(Items.END_STONE, Items.EYE_ARMOR_TRIM_SMITHING_TEMPLATE)
                .group("smithing_template")
                .save(output, name("crafting/eye_upgrade_smithing_template_from_any_diamond"));
        cloneSmithingTemplate(Items.PURPUR_BLOCK, Items.SPIRE_ARMOR_TRIM_SMITHING_TEMPLATE)
                .group("smithing_template")
                .save(output, name("crafting/spire_upgrade_smithing_template_from_any_diamond"));
        cloneSmithingTemplate(Items.BREEZE_ROD, Items.FLOW_ARMOR_TRIM_SMITHING_TEMPLATE)
                .group("smithing_template")
                .save(output, name("crafting/flow_upgrade_smithing_template_from_any_diamond"));
        cloneSmithingTemplate(Items.COPPER_BLOCK, Items.BOLT_ARMOR_TRIM_SMITHING_TEMPLATE)
                .group("smithing_template")
                .save(output, name("crafting/bolt_upgrade_smithing_template_from_any_diamond"));

        // Tool Recipes
        makeAxe(NoxernaTags.ItemTags.NOBLEWOOD_PLANKS, NoxernaItems.NOBLEWOOD_AXE.get())
                .group("noblewood_tools")
                .save(output, name("crafting/noblewood_axe"));
        makeHoe(NoxernaTags.ItemTags.NOBLEWOOD_PLANKS, NoxernaItems.NOBLEWOOD_HOE.get())
                .group("noblewood_tools")
                .save(output, name("crafting/noblewood_hoe"));
        makePickaxe(NoxernaTags.ItemTags.NOBLEWOOD_PLANKS, NoxernaItems.NOBLEWOOD_PICKAXE.get())
                .group("noblewood_tools")
                .save(output, name("crafting/noblewood_pickaxe"));
        makeShovel(NoxernaTags.ItemTags.NOBLEWOOD_PLANKS, NoxernaItems.NOBLEWOOD_SHOVEL.get())
                .group("noblewood_tools")
                .save(output, name("crafting/noblewood_shovel"));
        makeSword(NoxernaTags.ItemTags.NOBLEWOOD_PLANKS, NoxernaItems.NOBLEWOOD_SWORD.get())
                .group("noblewood_tools")
                .save(output, name("crafting/noblewood_sword"));

        makeAxe(NoxernaTags.ItemTags.NOXSTONE_TOOL_MATERIALS, NoxernaItems.NOXSTONE_AXE.get())
                .group("noxstone_tools")
                .save(output, name("crafting/noxstone_axe"));
        makeHoe(NoxernaTags.ItemTags.NOXSTONE_TOOL_MATERIALS, NoxernaItems.NOXSTONE_HOE.get())
                .group("noxstone_tools")
                .save(output, name("crafting/noxstone_hoe"));
        makePickaxe(NoxernaTags.ItemTags.NOXSTONE_TOOL_MATERIALS, NoxernaItems.NOXSTONE_PICKAXE.get())
                .group("noxstone_tools")
                .save(output, name("crafting/noxstone_pickaxe"));
        makeShovel(NoxernaTags.ItemTags.NOXSTONE_TOOL_MATERIALS, NoxernaItems.NOXSTONE_SHOVEL.get())
                .group("noxstone_tools")
                .save(output, name("crafting/noxstone_shovel"));
        makeSword(NoxernaTags.ItemTags.NOXSTONE_TOOL_MATERIALS, NoxernaItems.NOXSTONE_SWORD.get())
                .group("noxstone_tools")
                .save(output, name("crafting/noxstone_sword"));

        makeAxe(NoxernaTags.ItemTags.FERREBRIS_TOOL_MATERIALS, NoxernaItems.FERREBRIS_AXE.get())
                .group("ferrebris_tools")
                .save(output, name("crafting/ferrebris_axe"));
        makeHoe(NoxernaTags.ItemTags.FERREBRIS_TOOL_MATERIALS, NoxernaItems.FERREBRIS_HOE.get())
                .group("ferrebris_tools")
                .save(output, name("crafting/ferrebris_hoe"));
        makePickaxe(NoxernaTags.ItemTags.FERREBRIS_TOOL_MATERIALS, NoxernaItems.FERREBRIS_PICKAXE.get())
                .group("ferrebris_tools")
                .save(output, name("crafting/ferrebris_pickaxe"));
        makeShovel(NoxernaTags.ItemTags.FERREBRIS_TOOL_MATERIALS, NoxernaItems.FERREBRIS_SHOVEL.get())
                .group("ferrebris_tools")
                .save(output, name("crafting/ferrebris_shovel"));
        makeSword(NoxernaTags.ItemTags.FERREBRIS_TOOL_MATERIALS, NoxernaItems.FERREBRIS_SWORD.get())
                .group("ferrebris_tools")
                .save(output, name("crafting/ferrebris_sword"));

        makeAxe(NoxernaTags.ItemTags.UMBURAM_TOOL_MATERIALS, NoxernaItems.UMBURAM_AXE.get())
                .group("umburam_tools")
                .save(output, name("crafting/umburam_axe"));
        makeHoe(NoxernaTags.ItemTags.UMBURAM_TOOL_MATERIALS, NoxernaItems.UMBURAM_HOE.get())
                .group("umburam_tools")
                .save(output, name("crafting/umburam_hoe"));
        makePickaxe(NoxernaTags.ItemTags.UMBURAM_TOOL_MATERIALS, NoxernaItems.UMBURAM_PICKAXE.get())
                .group("umburam_tools")
                .save(output, name("crafting/umburam_pickaxe"));
        makeShovel(NoxernaTags.ItemTags.UMBURAM_TOOL_MATERIALS, NoxernaItems.UMBURAM_SHOVEL.get())
                .group("umburam_tools")
                .save(output, name("crafting/umburam_shovel"));
        makeSword(NoxernaTags.ItemTags.UMBURAM_TOOL_MATERIALS, NoxernaItems.UMBURAM_SWORD.get())
                .group("umburam_tools")
                .save(output, name("crafting/umburam_sword"));

        makeAxe(NoxernaTags.ItemTags.ADAMUNA_TOOL_MATERIALS, NoxernaItems.ADAMUNA_AXE.get())
                .group("adamuna_tools")
                .save(output, name("crafting/adamuna_axe"));
        makeHoe(NoxernaTags.ItemTags.ADAMUNA_TOOL_MATERIALS, NoxernaItems.ADAMUNA_HOE.get())
                .group("adamuna_tools")
                .save(output, name("crafting/adamuna_hoe"));
        makePickaxe(NoxernaTags.ItemTags.ADAMUNA_TOOL_MATERIALS, NoxernaItems.ADAMUNA_PICKAXE.get())
                .group("adamuna_tools")
                .save(output, name("crafting/adamuna_pickaxe"));
        makeShovel(NoxernaTags.ItemTags.ADAMUNA_TOOL_MATERIALS, NoxernaItems.ADAMUNA_SHOVEL.get())
                .group("adamuna_tools")
                .save(output, name("crafting/adamuna_shovel"));
        makeSword(NoxernaTags.ItemTags.ADAMUNA_TOOL_MATERIALS, NoxernaItems.ADAMUNA_SWORD.get())
                .group("adamuna_tools")
                .save(output, name("crafting/adamuna_sword"));
        // Nihoxite
        nihoxiteUpgrade(NoxernaItems.ADAMUNA_AXE.get(), NoxernaItems.NIHOXITE_AXE.get())
                .save(output, name("smithing/nihoxite_axe"));
        nihoxiteUpgrade(NoxernaItems.ADAMUNA_HOE.get(), NoxernaItems.NIHOXITE_HOE.get())
                .save(output, name("smithing/nihoxite_hoe"));
        nihoxiteUpgrade(NoxernaItems.ADAMUNA_PICKAXE.get(), NoxernaItems.NIHOXITE_PICKAXE.get())
                .save(output, name("smithing/nihoxite_pickaxe"));
        nihoxiteUpgrade(NoxernaItems.ADAMUNA_SHOVEL.get(), NoxernaItems.NIHOXITE_SHOVEL.get())
                .save(output, name("smithing/nihoxite_shovel"));
        nihoxiteUpgrade(NoxernaItems.ADAMUNA_SWORD.get(), NoxernaItems.NIHOXITE_SWORD.get())
                .save(output, name("smithing/nihoxite_sword"));
        // Nihoxite Alt recipes
        nihoxiteUpgrade(Items.DIAMOND_AXE, NoxernaItems.NIHOXITE_AXE.get())
                .save(output, name("smithing/diamond_nihoxite_axe"));
        nihoxiteUpgrade(Items.DIAMOND_HOE, NoxernaItems.NIHOXITE_HOE.get())
                .save(output, name("smithing/diamond_nihoxite_hoe"));
        nihoxiteUpgrade(Items.DIAMOND_PICKAXE, NoxernaItems.NIHOXITE_PICKAXE.get())
                .save(output, name("smithing/diamond_nihoxite_pickaxe"));
        nihoxiteUpgrade(Items.DIAMOND_SHOVEL, NoxernaItems.NIHOXITE_SHOVEL.get())
                .save(output, name("smithing/diamond_nihoxite_shovel"));
        nihoxiteUpgrade(Items.DIAMOND_SWORD, NoxernaItems.NIHOXITE_SWORD.get())
                .save(output, name("smithing/diamond_nihoxite_sword"));
        // Netherite Alt recipes
        netheriteUpgrade(NoxernaItems.ADAMUNA_AXE.get(), Items.NETHERITE_AXE)
                .save(output, name("smithing/adamuna_netherite_axe"));
        netheriteUpgrade(NoxernaItems.ADAMUNA_HOE.get(), Items.NETHERITE_HOE)
                .save(output, name("smithing/adamuna_netherite_hoe"));
        netheriteUpgrade(NoxernaItems.ADAMUNA_PICKAXE.get(), Items.NETHERITE_PICKAXE)
                .save(output, name("smithing/adamuna_netherite_pickaxe"));
        netheriteUpgrade(NoxernaItems.ADAMUNA_SHOVEL.get(), Items.NETHERITE_SHOVEL)
                .save(output, name("smithing/adamuna_netherite_shovel"));
        netheriteUpgrade(NoxernaItems.ADAMUNA_SWORD.get(), Items.NETHERITE_SWORD)
                .save(output, name("smithing/adamuna_netherite_sword"));

        // Stonecutting Recipes
        // Soltra
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_SOLTRA, NoxernaItems.SOLTRA.get())
                .save(output, name("stonecutting/soltra_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_SOLTRA, NoxernaItems.SOLTRA_STAIRS.get())
                .save(output, name("stonecutting/soltra_stairs_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_SOLTRA, NoxernaItems.SOLTRA_SLAB.get(), 2)
                .save(output, name("stonecutting/soltra_slab_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_SOLTRA, NoxernaItems.SOLTRA_WALL.get())
                .save(output, name("stonecutting/soltra_wall_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_SOLTRA, NoxernaItems.SOLTRA_PEBBLE.get(), 9)
                .save(output, name("stonecutting/soltra_pebble_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_SOLTRA, NoxernaItems.POLISHED_SOLTRA.get())
                .save(output, name("stonecutting/polished_soltra_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_SOLTRA, NoxernaItems.POLISHED_SOLTRA_STAIRS.get())
                .save(output, name("stonecutting/polished_soltra_stairs_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_SOLTRA, NoxernaItems.POLISHED_SOLTRA_SLAB.get(), 2)
                .save(output, name("stonecutting/polished_soltra_slab_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_SOLTRA, NoxernaItems.POLISHED_SOLTRA_WALL.get())
                .save(output, name("stonecutting/polished_soltra_wall_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_SOLTRA, NoxernaItems.SOLTRA_BRICKS.get())
                .save(output, name("stonecutting/soltra_bricks_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_SOLTRA, NoxernaItems.SOLTRA_BRICK_STAIRS.get())
                .save(output, name("stonecutting/soltra_brick_stairs_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_SOLTRA, NoxernaItems.SOLTRA_BRICK_SLAB.get(), 2)
                .save(output, name("stonecutting/soltra_brick_slab_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_SOLTRA, NoxernaItems.SOLTRA_BRICK_WALL.get())
                .save(output, name("stonecutting/soltra_brick_wall_from_stonecutting"));
        // Noxum
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_NOXUM, NoxernaItems.NOXUM.get())
                .save(output, name("stonecutting/noxum_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_NOXUM, NoxernaItems.NOXUM_STAIRS.get())
                .save(output, name("stonecutting/noxum_stairs_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_NOXUM, NoxernaItems.NOXUM_SLAB.get(), 2)
                .save(output, name("stonecutting/noxum_slab_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_NOXUM, NoxernaItems.NOXUM_WALL.get())
                .save(output, name("stonecutting/noxum_wall_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_NOXUM, NoxernaItems.NOXUM_PEBBLE.get(), 9)
                .save(output, name("stonecutting/noxum_pebble_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_NOXUM, NoxernaItems.POLISHED_NOXUM.get())
                .save(output, name("stonecutting/polished_noxum_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_NOXUM, NoxernaItems.POLISHED_NOXUM_STAIRS.get())
                .save(output, name("stonecutting/polished_noxum_stairs_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_NOXUM, NoxernaItems.POLISHED_NOXUM_SLAB.get(), 2)
                .save(output, name("stonecutting/polished_noxum_slab_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_NOXUM, NoxernaItems.POLISHED_NOXUM_WALL.get())
                .save(output, name("stonecutting/polished_noxum_wall_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_NOXUM, NoxernaItems.NOXUM_BRICKS.get())
                .save(output, name("stonecutting/noxum_bricks_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_NOXUM, NoxernaItems.NOXUM_BRICK_STAIRS.get())
                .save(output, name("stonecutting/noxum_brick_stairs_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_NOXUM, NoxernaItems.NOXUM_BRICK_SLAB.get(), 2)
                .save(output, name("stonecutting/noxum_brick_slab_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_NOXUM, NoxernaItems.NOXUM_BRICK_WALL.get())
                .save(output, name("stonecutting/noxum_brick_wall_from_stonecutting"));
        // Aestum
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_AESTUM, NoxernaItems.AESTUM.get())
                .save(output, name("stonecutting/aestum_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_AESTUM, NoxernaItems.AESTUM_STAIRS.get())
                .save(output, name("stonecutting/aestum_stairs_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_AESTUM, NoxernaItems.AESTUM_SLAB.get(), 2)
                .save(output, name("stonecutting/aestum_slab_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_AESTUM, NoxernaItems.AESTUM_WALL.get())
                .save(output, name("stonecutting/aestum_wall_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_AESTUM, NoxernaItems.AESTUM_PEBBLE.get(), 9)
                .save(output, name("stonecutting/aestum_pebble_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_AESTUM, NoxernaItems.POLISHED_AESTUM.get())
                .save(output, name("stonecutting/polished_aestum_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_AESTUM, NoxernaItems.POLISHED_AESTUM_STAIRS.get())
                .save(output, name("stonecutting/polished_aestum_stairs_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_AESTUM, NoxernaItems.POLISHED_AESTUM_SLAB.get(), 2)
                .save(output, name("stonecutting/polished_aestum_slab_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_AESTUM, NoxernaItems.POLISHED_AESTUM_WALL.get())
                .save(output, name("stonecutting/polished_aestum_wall_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_AESTUM, NoxernaItems.AESTUM_BRICKS.get())
                .save(output, name("stonecutting/aestum_bricks_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_AESTUM, NoxernaItems.AESTUM_BRICK_STAIRS.get())
                .save(output, name("stonecutting/aestum_brick_stairs_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_AESTUM, NoxernaItems.AESTUM_BRICK_SLAB.get(), 2)
                .save(output, name("stonecutting/aestum_brick_slab_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_AESTUM, NoxernaItems.AESTUM_BRICK_WALL.get())
                .save(output, name("stonecutting/aestum_brick_wall_from_stonecutting"));
        // Inetra
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_INETRA, NoxernaItems.INETRA.get())
                .save(output, name("stonecutting/inetra_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_INETRA, NoxernaItems.INETRA_STAIRS.get())
                .save(output, name("stonecutting/inetra_stairs_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_INETRA, NoxernaItems.INETRA_SLAB.get(), 2)
                .save(output, name("stonecutting/inetra_slab_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_INETRA, NoxernaItems.INETRA_WALL.get())
                .save(output, name("stonecutting/inetra_wall_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_INETRA, NoxernaItems.INETRA_PEBBLE.get(), 9)
                .save(output, name("stonecutting/inetra_pebble_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_INETRA, NoxernaItems.POLISHED_INETRA.get())
                .save(output, name("stonecutting/polished_inetra_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_INETRA, NoxernaItems.POLISHED_INETRA_STAIRS.get())
                .save(output, name("stonecutting/polished_inetra_stairs_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_INETRA, NoxernaItems.POLISHED_INETRA_SLAB.get(), 2)
                .save(output, name("stonecutting/polished_inetra_slab_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_INETRA, NoxernaItems.POLISHED_INETRA_WALL.get())
                .save(output, name("stonecutting/polished_inetra_wall_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_INETRA, NoxernaItems.INETRA_BRICKS.get())
                .save(output, name("stonecutting/inetra_bricks_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_INETRA, NoxernaItems.INETRA_BRICK_STAIRS.get())
                .save(output, name("stonecutting/inetra_brick_stairs_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_INETRA, NoxernaItems.INETRA_BRICK_SLAB.get(), 2)
                .save(output, name("stonecutting/inetra_brick_slab_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_INETRA, NoxernaItems.INETRA_BRICK_WALL.get())
                .save(output, name("stonecutting/inetra_brick_wall_from_stonecutting"));
        // Plating
        // Iron
        stonecutting(Tags.Items.STORAGE_BLOCKS_IRON, NoxernaItems.IRON_PLATING.get(), 9)
                .save(output, name("stonecutting/iron_plating_from_block"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_IRON_PLATING, NoxernaItems.IRON_PLATING.get())
                .save(output, name("stonecutting/iron_plating"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_IRON_PLATING, NoxernaItems.IRON_PLATING_STAIRS.get())
                .save(output, name("stonecutting/iron_plating_stairs"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_IRON_PLATING,
                NoxernaItems.IRON_PLATING_SLAB.get(), 2)
                .save(output, name("stonecutting/iron_plating_slab"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_IRON_PLATING, NoxernaItems.IRON_PLATING_WALL.get())
                .save(output, name("stonecutting/iron_plating_wall"));
        // Ferrebris
        stonecutting(NoxernaTags.ItemTags.FERREBRIS_STORAGE_BLOCKS, NoxernaItems.FERREBRIS_PLATING.get(), 9)
                .save(output, name("stonecutting/ferrebris_plating_from_block"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_FERREBRIS_PLATING, NoxernaItems.FERREBRIS_PLATING.get())
                .save(output, name("stonecutting/ferrebris_plating"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_FERREBRIS_PLATING, NoxernaItems.FERREBRIS_PLATING_STAIRS.get())
                .save(output, name("stonecutting/ferrebris_plating_stairs"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_FERREBRIS_PLATING,
                NoxernaItems.FERREBRIS_PLATING_SLAB.get(), 2)
                .save(output, name("stonecutting/ferrebris_plating_slab"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_FERREBRIS_PLATING, NoxernaItems.FERREBRIS_PLATING_WALL.get())
                .save(output, name("stonecutting/ferrebris_plating_wall"));
        // Umburam
        stonecutting(NoxernaTags.ItemTags.UMBURAM_STORAGE_BLOCKS, NoxernaItems.UMBURAM_PLATING.get(), 9)
                .save(output, name("stonecutting/umburam_plating_from_block"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_UMBURAM_PLATING, NoxernaItems.UMBURAM_PLATING.get())
                .save(output, name("stonecutting/umburam_plating"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_UMBURAM_PLATING, NoxernaItems.UMBURAM_PLATING_STAIRS.get())
                .save(output, name("stonecutting/umburam_plating_stairs"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_UMBURAM_PLATING,
                NoxernaItems.UMBURAM_PLATING_SLAB.get(), 2)
                .save(output, name("stonecutting/umburam_plating_slab"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_UMBURAM_PLATING, NoxernaItems.UMBURAM_PLATING_WALL.get())
                .save(output, name("stonecutting/umburam_plating_wall"));
        // Inperlum
        stonecutting(NoxernaTags.ItemTags.INPERLUM_STORAGE_BLOCKS, NoxernaItems.INPERLUM_PLATING.get(), 9)
                .save(output, name("stonecutting/inperlum_plating_from_block"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_INPERLUM_PLATING, NoxernaItems.INPERLUM_PLATING.get())
                .save(output, name("stonecutting/inperlum_plating"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_INPERLUM_PLATING, NoxernaItems.INPERLUM_PLATING_STAIRS.get())
                .save(output, name("stonecutting/inperlum_plating_stairs"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_INPERLUM_PLATING,
                NoxernaItems.INPERLUM_PLATING_SLAB.get(), 2)
                .save(output, name("stonecutting/inperlum_plating_slab"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_INPERLUM_PLATING, NoxernaItems.INPERLUM_PLATING_WALL.get())
                .save(output, name("stonecutting/inperlum_plating_wall"));
        // Nihoxite
        stonecutting(NoxernaTags.ItemTags.NIHOXITE_STORAGE_BLOCKS, NoxernaItems.NIHOXITE_PLATING.get(), 9)
                .save(output, name("stonecutting/nihoxite_plating_from_block"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_NIHOXITE_PLATING, NoxernaItems.NIHOXITE_PLATING.get())
                .save(output, name("stonecutting/nihoxite_plating"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_NIHOXITE_PLATING, NoxernaItems.NIHOXITE_PLATING_STAIRS.get())
                .save(output, name("stonecutting/nihoxite_plating_stairs"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_NIHOXITE_PLATING,
                NoxernaItems.NIHOXITE_PLATING_SLAB.get(), 2)
                .save(output, name("stonecutting/nihoxite_plating_slab"));
        stonecutting(NoxernaTags.ItemTags.BLOCKSET_NIHOXITE_PLATING, NoxernaItems.NIHOXITE_PLATING_WALL.get())
                .save(output, name("stonecutting/nihoxite_plating_wall"));
    }
}
