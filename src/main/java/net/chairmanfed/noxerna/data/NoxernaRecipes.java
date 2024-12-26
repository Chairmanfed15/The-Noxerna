package net.chairmanfed.noxerna.data;

import net.chairmanfed.noxerna.TheNoxerna;
import net.chairmanfed.noxerna.data.providers.NoxernaRecipeProvider;
import net.chairmanfed.noxerna.registry.NoxernaBlocks;
import net.chairmanfed.noxerna.registry.NoxernaItems;
import net.chairmanfed.noxerna.registry.NoxernaTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.concurrent.CompletableFuture;

public class NoxernaRecipes extends NoxernaRecipeProvider {
    public NoxernaRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }
    private ResourceLocation name(String name) {
        return ResourceLocation.fromNamespaceAndPath(TheNoxerna.MODID, name);
    }
    @Override
    protected void buildRecipes (RecipeOutput output) {
        // Building Block Recipes
        // Xenon
        makePlanks(NoxernaTags.ItemTags.XENON_LOGS, NoxernaBlocks.XENON_PLANKS.get().asItem())
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
        // Noxum
        makeStairs(NoxernaBlocks.NOXUM.get().asItem(), NoxernaBlocks.NOXUM_STAIRS.get().asItem())
                .group("noxum")
                .save(output, name("crafting/noxum_stairs"));
        makeSlab(NoxernaBlocks.NOXUM.get().asItem(), NoxernaBlocks.NOXUM_SLAB.get().asItem())
                .group("noxum")
                .save(output, name("crafting/noxum_slab"));
        makeSlabIntoBlock(NoxernaBlocks.NOXUM_SLAB.get().asItem(), NoxernaBlocks.NOXUM.get().asItem())
                .group("noxum")
                .save(output, name("crafting/noxum_from_slab"));
        makeWall(NoxernaBlocks.NOXUM.get().asItem(), NoxernaBlocks.NOXUM_WALL.get().asItem())
                .group("noxum")
                .save(output, name("crafting/noxum_wall"));
        makePressurePlate(NoxernaItems.NOXUM.get(), NoxernaItems.NOXUM_PRESSURE_PLATE.get())
                .group("stone_pressure_plate")
                .save(output, name("crafting/noxum_pressure_plate"));
        makeButton(NoxernaItems.NOXUM.get(), NoxernaItems.NOXUM_BUTTON.get())
                .group("stone_button")
                .save(output, name("crafting/noxum_button"));
        unpacking3x3(NoxernaBlocks.NOXUM.get().asItem(), NoxernaBlocks.NOXUM_PEBBLE.get().asItem())
                .group("noxum")
                .save(output, name("crafting/noxum_pebble"));
        packing3x3(NoxernaBlocks.NOXUM_PEBBLE.get().asItem(), NoxernaBlocks.NOXUM.get().asItem())
                .group("noxum")
                .save(output, name("crafting/noxum_from_pebble"));
        makeBricks(NoxernaBlocks.NOXUM.get().asItem(), NoxernaBlocks.POLISHED_NOXUM.get().asItem())
                .group("polished_noxum")
                .save(output, name("crafting/polished_noxum"));
        makeStairs(NoxernaBlocks.POLISHED_NOXUM.get().asItem(), NoxernaBlocks.POLISHED_NOXUM_STAIRS.get().asItem())
                .group("polished_noxum")
                .save(output, name("crafting/polished_noxum_stairs"));
        makeSlab(NoxernaBlocks.POLISHED_NOXUM.get().asItem(), NoxernaBlocks.POLISHED_NOXUM_SLAB.get().asItem())
                .group("polished_noxum")
                .save(output, name("crafting/polished_noxum_slab"));
        makeSlabIntoBlock(NoxernaBlocks.POLISHED_NOXUM_SLAB.get().asItem(), NoxernaBlocks.POLISHED_NOXUM.get().asItem())
                .group("polished_noxum")
                .save(output, name("crafting/polished_noxum_from_slab"));
        makeWall(NoxernaBlocks.POLISHED_NOXUM.get().asItem(), NoxernaBlocks.POLISHED_NOXUM_WALL.get().asItem())
                .group("polished_noxum")
                .save(output, name("crafting/polished_noxum_wall"));
        makeBricks(NoxernaBlocks.POLISHED_NOXUM.get().asItem(), NoxernaBlocks.NOXUM_BRICKS.get().asItem())
                .group("noxum_bricks")
                .save(output, name("crafting/noxum_bricks"));
        makeStairs(NoxernaBlocks.NOXUM_BRICKS.get().asItem(), NoxernaBlocks.NOXUM_BRICK_STAIRS.get().asItem())
                .group("noxum_bricks")
                .save(output, name("crafting/noxum_brick_stairs"));
        makeSlab(NoxernaBlocks.NOXUM_BRICKS.get().asItem(), NoxernaBlocks.NOXUM_BRICK_SLAB.get().asItem())
                .group("noxum_bricks")
                .save(output, name("crafting/noxum_brick_slab"));
        makeSlabIntoBlock(NoxernaBlocks.NOXUM_BRICK_SLAB.get().asItem(), NoxernaBlocks.NOXUM_BRICKS.get().asItem())
                .group("noxum_brick")
                .save(output, name("crafting/noxum_bricks_from_slab"));
        makeWall(NoxernaBlocks.POLISHED_NOXUM.get().asItem(), NoxernaBlocks.NOXUM_BRICK_WALL.get().asItem())
                .group("noxum_bricks")
                .save(output, name("crafting/noxum_brick_wall"));
        packing3x3(NoxernaItems.FERREBRIS_INGOT.get(), NoxernaItems.FERREBRIS_BLOCK.get(),
                NoxernaTags.ItemTags.FERREBRIS_INGOTS)
                .group("ferrebris")
                .save(output, name("crafting/ferrebris_block"));

        // Noblewood Alt Recipes
        villagerWorkStation(NoxernaTags.ItemTags.ANY_IRON_INGOT, Items.SMITHING_TABLE)
                .group("smithing_tables")
                .save(output, name("crafting/noblewood_smithing_table"));
        packing2x2(NoxernaTags.ItemTags.NOBLEWOOD_PLANKS, Items.CRAFTING_TABLE)
                .group("crafting_tables")
                .save(output, name("crafting/noblewood_crafting_table"));

        // Ingredient Recipes
        makeSticks(NoxernaTags.ItemTags.NOBLEWOOD_PLANKS, NoxernaItems.NOBLEWOOD_STICK.get())
                .group("sticks")
                .save(output, name("crafting/noblewood_stick"));
        packing3x3(NoxernaItems.FERREBRIS_NUGGET.get(), NoxernaItems.FERREBRIS_INGOT.get(),
                NoxernaTags.ItemTags.FERREBRIS_NUGGETS)
                .group("ferrebris")
                .save(output, name("crafting/ferrebris_ingot_from_nugget"));
        unpacking3x3(NoxernaItems.FERREBRIS_BLOCK.get(), NoxernaItems.FERREBRIS_INGOT.get())
                .group("ferrebris")
                .save(output, name("crafting/ferrebris_ingot_from_block"));
        unpacking3x3(NoxernaItems.FERREBRIS_INGOT.get(), NoxernaItems.FERREBRIS_NUGGET.get())
                .group("ferrebris")
                .save(output, name("crafting/ferrebris_nugget"));
        smelting(NoxernaTags.ItemTags.RAW_FERREBRIS_MATERIALS, NoxernaItems.FERREBRIS_INGOT.get(),
                0.7f, 200)
                .group("ferrebris_ingot")
                .save(output, name("smelting/ferrebris_ingot"));
        blasting(NoxernaTags.ItemTags.RAW_FERREBRIS_MATERIALS, NoxernaItems.FERREBRIS_INGOT.get(),
                0.7f, 100)
                .group("ferrebris_ingot")
                .save(output, name("blasting/ferrebris_ingot"));
        // Smithing Templates
        cloneSmithingTemplate(NoxernaItems.INETRA.get(), NoxernaItems.NIHOXITE_UPGRADE_SMITHING_TEMPLATE.get())
                .group("smithing_template")
                .save(output, name("crafting/nihoxite_upgrade_smithing_template"));
        // Smithing Template Alt recipes
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
        stonecutting(NoxernaTags.ItemTags.NOXUM_STONE_TYPE, NoxernaBlocks.NOXUM.get().asItem())
                .save(output, name("stonecutting/noxum_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.NOXUM_STONE_TYPE, NoxernaBlocks.NOXUM_STAIRS.get().asItem())
                .save(output, name("stonecutting/noxum_stairs_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.NOXUM_STONE_TYPE, NoxernaBlocks.NOXUM_SLAB.get().asItem(), 2)
                .save(output, name("stonecutting/noxum_slab_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.NOXUM_STONE_TYPE, NoxernaBlocks.NOXUM_WALL.get().asItem())
                .save(output, name("stonecutting/noxum_wall_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.NOXUM_STONE_TYPE, NoxernaBlocks.NOXUM_PEBBLE.get().asItem(), 9)
                .save(output, name("stonecutting/noxum_pebble_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.NOXUM_STONE_TYPE, NoxernaBlocks.POLISHED_NOXUM.get().asItem())
                .save(output, name("stonecutting/polished_noxum_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.NOXUM_STONE_TYPE, NoxernaBlocks.POLISHED_NOXUM_STAIRS.get().asItem())
                .save(output, name("stonecutting/polished_noxum_stairs_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.NOXUM_STONE_TYPE, NoxernaBlocks.POLISHED_NOXUM_SLAB.get().asItem(), 2)
                .save(output, name("stonecutting/polished_noxum_slab_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.NOXUM_STONE_TYPE, NoxernaBlocks.POLISHED_NOXUM_WALL.get().asItem())
                .save(output, name("stonecutting/polished_noxum_wall_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.NOXUM_STONE_TYPE, NoxernaBlocks.NOXUM_BRICKS.get().asItem())
                .save(output, name("stonecutting/noxum_bricks_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.NOXUM_STONE_TYPE, NoxernaBlocks.NOXUM_BRICK_STAIRS.get().asItem())
                .save(output, name("stonecutting/noxum_brick_stairs_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.NOXUM_STONE_TYPE, NoxernaBlocks.NOXUM_BRICK_SLAB.get().asItem(), 2)
                .save(output, name("stonecutting/noxum_bricks_slab_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.NOXUM_STONE_TYPE, NoxernaBlocks.NOXUM_BRICK_WALL.get().asItem())
                .save(output, name("stonecutting/noxum_bricks_wall_from_stonecutting"));

        stonecutting(NoxernaTags.ItemTags.FERREBRIS_STORAGE_BLOCKS, NoxernaItems.FERREBRIS_PLATING.get(), 4)
                .save(output, name("stonecutting/ferrebris_plating_from_block"));
        stonecutting(NoxernaTags.ItemTags.FERREBRIS_METAL_PLATING, NoxernaItems.FERREBRIS_PLATING.get())
                .save(output, name("stonecutting/ferrebris_plating"));
        stonecutting(NoxernaTags.ItemTags.FERREBRIS_METAL_PLATING, NoxernaItems.FERREBRIS_PLATING_STAIRS.get())
                .save(output, name("stonecutting/ferrebris_plating_stairs"));
        stonecutting(NoxernaTags.ItemTags.FERREBRIS_METAL_PLATING,
                NoxernaItems.FERREBRIS_PLATING_SLAB.get(), 2)
                .save(output, name("stonecutting/ferrebris_plating_slab"));
        stonecutting(NoxernaTags.ItemTags.FERREBRIS_METAL_PLATING, NoxernaItems.FERREBRIS_PLATING_WALL.get())
                .save(output, name("stonecutting/ferrebris_plating_wall"));
    }
}
