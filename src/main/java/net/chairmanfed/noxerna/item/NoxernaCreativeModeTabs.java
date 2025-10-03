package net.chairmanfed.noxerna.item;

import net.chairmanfed.noxerna.Noxerna;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class NoxernaCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(
            BuiltInRegistries.CREATIVE_MODE_TAB, Noxerna.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab>
            NOXERNA_BUILDING_BLOCKS = CREATIVE_TABS.register(
            "noxerna_building_blocks", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + Noxerna.MODID + ".building_blocks"))
                    .icon(()-> new ItemStack(NoxernaItems.NOXUM_BRICKS.get()))
                    .displayItems((params, output) -> {
                        // Wood Sets
                        // Xenon
                        output.accept(NoxernaItems.XENON_LOG);
                        output.accept(NoxernaItems.XENON_WOOD);
                        output.accept(NoxernaItems.STRIPPED_XENON_LOG);
                        output.accept(NoxernaItems.STRIPPED_XENON_WOOD);

                        output.accept(NoxernaItems.XENON_PLANKS);
                        output.accept(NoxernaItems.XENON_STAIRS);
                        output.accept(NoxernaItems.XENON_SLAB);
                        output.accept(NoxernaItems.XENON_FENCE);
                        output.accept(NoxernaItems.XENON_FENCE_GATE);
                        output.accept(NoxernaItems.XENON_DOOR);
                        output.accept(NoxernaItems.XENON_TRAPDOOR);
                        output.accept(NoxernaItems.XENON_PRESSURE_PLATE);
                        output.accept(NoxernaItems.XENON_BUTTON);
                        // Krypton
                        output.accept(NoxernaItems.KRYPTON_LOG);
                        output.accept(NoxernaItems.KRYPTON_WOOD);
                        output.accept(NoxernaItems.STRIPPED_KRYPTON_LOG);
                        output.accept(NoxernaItems.STRIPPED_KRYPTON_WOOD);

                        output.accept(NoxernaItems.KRYPTON_PLANKS);
                        output.accept(NoxernaItems.KRYPTON_STAIRS);
                        output.accept(NoxernaItems.KRYPTON_SLAB);
                        output.accept(NoxernaItems.KRYPTON_FENCE);
                        output.accept(NoxernaItems.KRYPTON_FENCE_GATE);
                        output.accept(NoxernaItems.KRYPTON_DOOR);
                        output.accept(NoxernaItems.KRYPTON_TRAPDOOR);
                        output.accept(NoxernaItems.KRYPTON_PRESSURE_PLATE);
                        output.accept(NoxernaItems.KRYPTON_BUTTON);
                        // Argon
                        output.accept(NoxernaItems.ARGON_LOG);
                        output.accept(NoxernaItems.ARGON_WOOD);
                        output.accept(NoxernaItems.STRIPPED_ARGON_LOG);
                        output.accept(NoxernaItems.STRIPPED_ARGON_WOOD);
                        output.accept(NoxernaItems.ARGON_PLANKS);
                        output.accept(NoxernaItems.ARGON_STAIRS);
                        output.accept(NoxernaItems.ARGON_SLAB);
                        output.accept(NoxernaItems.ARGON_FENCE);
                        output.accept(NoxernaItems.ARGON_FENCE_GATE);
                        output.accept(NoxernaItems.ARGON_DOOR);
                        output.accept(NoxernaItems.ARGON_TRAPDOOR);
                        output.accept(NoxernaItems.ARGON_PRESSURE_PLATE);
                        output.accept(NoxernaItems.ARGON_BUTTON);
                        // Neon
                        output.accept(NoxernaItems.NEON_LOG);
                        output.accept(NoxernaItems.NEON_WOOD);
                        output.accept(NoxernaItems.STRIPPED_NEON_LOG);
                        output.accept(NoxernaItems.STRIPPED_NEON_WOOD);
                        output.accept(NoxernaItems.NEON_PLANKS);
                        output.accept(NoxernaItems.NEON_STAIRS);
                        output.accept(NoxernaItems.NEON_SLAB);
                        output.accept(NoxernaItems.NEON_FENCE);
                        output.accept(NoxernaItems.NEON_FENCE_GATE);
                        output.accept(NoxernaItems.NEON_DOOR);
                        output.accept(NoxernaItems.NEON_TRAPDOOR);
                        output.accept(NoxernaItems.NEON_PRESSURE_PLATE);
                        output.accept(NoxernaItems.NEON_BUTTON);
                        // Stone Sets
                        // Soltra
                        output.accept(NoxernaItems.SOLTRA);
                        output.accept(NoxernaItems.SOLTRA_STAIRS);
                        output.accept(NoxernaItems.SOLTRA_SLAB);
                        output.accept(NoxernaItems.SOLTRA_WALL);
                        output.accept(NoxernaItems.SOLTRA_PRESSURE_PLATE);
                        output.accept(NoxernaItems.SOLTRA_BUTTON);
                        output.accept(NoxernaItems.SOLTRA_PEBBLE);

                        output.accept(NoxernaItems.POLISHED_SOLTRA);
                        output.accept(NoxernaItems.POLISHED_SOLTRA_STAIRS);
                        output.accept(NoxernaItems.POLISHED_SOLTRA_SLAB);
                        output.accept(NoxernaItems.POLISHED_SOLTRA_WALL);

                        output.accept(NoxernaItems.SOLTRA_BRICKS);
                        output.accept(NoxernaItems.SOLTRA_BRICK_STAIRS);
                        output.accept(NoxernaItems.SOLTRA_BRICK_SLAB);
                        output.accept(NoxernaItems.SOLTRA_BRICK_WALL);
                        // Noxum
                        output.accept(NoxernaItems.NOXUM);
                        output.accept(NoxernaItems.NOXUM_STAIRS);
                        output.accept(NoxernaItems.NOXUM_SLAB);
                        output.accept(NoxernaItems.NOXUM_WALL);
                        output.accept(NoxernaItems.NOXUM_PRESSURE_PLATE);
                        output.accept(NoxernaItems.NOXUM_BUTTON);
                        output.accept(NoxernaItems.NOXUM_PEBBLE);

                        output.accept(NoxernaItems.POLISHED_NOXUM);
                        output.accept(NoxernaItems.POLISHED_NOXUM_STAIRS);
                        output.accept(NoxernaItems.POLISHED_NOXUM_SLAB);
                        output.accept(NoxernaItems.POLISHED_NOXUM_WALL);

                        output.accept(NoxernaItems.NOXUM_BRICKS);
                        output.accept(NoxernaItems.NOXUM_BRICK_STAIRS);
                        output.accept(NoxernaItems.NOXUM_BRICK_SLAB);
                        output.accept(NoxernaItems.NOXUM_BRICK_WALL);

                        output.accept(NoxernaItems.NOXERNA_PORTAL_FRAME);
                        // Aestum
                        output.accept(NoxernaItems.AESTUM);
                        output.accept(NoxernaItems.AESTUM_STAIRS);
                        output.accept(NoxernaItems.AESTUM_SLAB);
                        output.accept(NoxernaItems.AESTUM_WALL);
                        output.accept(NoxernaItems.AESTUM_PRESSURE_PLATE);
                        output.accept(NoxernaItems.AESTUM_BUTTON);
                        output.accept(NoxernaItems.AESTUM_PEBBLE);

                        output.accept(NoxernaItems.POLISHED_AESTUM);
                        output.accept(NoxernaItems.POLISHED_AESTUM_STAIRS);
                        output.accept(NoxernaItems.POLISHED_AESTUM_SLAB);
                        output.accept(NoxernaItems.POLISHED_AESTUM_WALL);

                        output.accept(NoxernaItems.AESTUM_BRICKS);
                        output.accept(NoxernaItems.AESTUM_BRICK_STAIRS);
                        output.accept(NoxernaItems.AESTUM_BRICK_SLAB);
                        output.accept(NoxernaItems.AESTUM_BRICK_WALL);
                        // Inetra
                        output.accept(NoxernaItems.INETRA);
                        output.accept(NoxernaItems.INETRA_STAIRS);
                        output.accept(NoxernaItems.INETRA_SLAB);
                        output.accept(NoxernaItems.INETRA_WALL);
                        output.accept(NoxernaItems.INETRA_PRESSURE_PLATE);
                        output.accept(NoxernaItems.INETRA_BUTTON);
                        output.accept(NoxernaItems.INETRA_PEBBLE);

                        output.accept(NoxernaItems.POLISHED_INETRA);
                        output.accept(NoxernaItems.POLISHED_INETRA_STAIRS);
                        output.accept(NoxernaItems.POLISHED_INETRA_SLAB);
                        output.accept(NoxernaItems.POLISHED_INETRA_WALL);

                        output.accept(NoxernaItems.INETRA_BRICKS);
                        output.accept(NoxernaItems.INETRA_BRICK_STAIRS);
                        output.accept(NoxernaItems.INETRA_BRICK_SLAB);
                        output.accept(NoxernaItems.INETRA_BRICK_WALL);
                        // Special Blocks

                        // Material Storage & Decorative Blocks
                        // Iron
                        output.accept(NoxernaItems.IRON_PLATING);
                        output.accept(NoxernaItems.PLATED_IRON_PILLAR);
                        output.accept(NoxernaItems.IRON_PLATING_STAIRS);
                        output.accept(NoxernaItems.IRON_PLATING_SLAB);
                        output.accept(NoxernaItems.IRON_PLATING_WALL);
                        // Gold
                        output.accept(NoxernaItems.GOLD_PLATING);
                        output.accept(NoxernaItems.PLATED_GOLD_PILLAR);
                        output.accept(NoxernaItems.GOLD_PLATING_STAIRS);
                        output.accept(NoxernaItems.GOLD_PLATING_SLAB);
                        output.accept(NoxernaItems.GOLD_PLATING_WALL);
                        // Netherite
                        output.accept(NoxernaItems.NETHERITE_PLATING);
                        output.accept(NoxernaItems.PLATED_NETHERITE_PILLAR);
                        output.accept(NoxernaItems.NETHERITE_PLATING_STAIRS);
                        output.accept(NoxernaItems.NETHERITE_PLATING_SLAB);
                        output.accept(NoxernaItems.NETHERITE_PLATING_WALL);
                        // Copper
                            // Unaffected
                            // Exposed
                            // Weathered
                            // Oxidised
                        // Waxed Copper
                            // Unaffected
                            // Exposed
                            // Weathered
                            // Oxidised
                        // Ferrebris
                        output.accept(NoxernaItems.FERREBRIS_BLOCK);
                        output.accept(NoxernaItems.FERREBRIS_BARS);
                        output.accept(NoxernaItems.FERREBRIS_PLATING);
                        output.accept(NoxernaItems.PLATED_FERREBRIS_PILLAR);
                        output.accept(NoxernaItems.FERREBRIS_PLATING_STAIRS);
                        output.accept(NoxernaItems.FERREBRIS_PLATING_SLAB);
                        output.accept(NoxernaItems.FERREBRIS_PLATING_WALL);
                        // Umburam
                        output.accept(NoxernaItems.UMBURAM_BLOCK);
                        output.accept(NoxernaItems.UMBURAM_PLATING);
                        output.accept(NoxernaItems.PLATED_UMBURAM_PILLAR);
                        output.accept(NoxernaItems.UMBURAM_PLATING_STAIRS);
                        output.accept(NoxernaItems.UMBURAM_PLATING_SLAB);
                        output.accept(NoxernaItems.UMBURAM_PLATING_WALL);
                        // Teneryl
                        output.accept(NoxernaItems.TENERYL_BLOCK);
                        // Adamuna
                        output.accept(NoxernaItems.ADAMUNA_BLOCK);
                        // Inperlum
                        output.accept(NoxernaItems.INPERLUM_BLOCK);
                        output.accept(NoxernaItems.INPERLUM_PLATING);
                        output.accept(NoxernaItems.PLATED_INPERLUM_PILLAR);
                        output.accept(NoxernaItems.INPERLUM_PLATING_STAIRS);
                        output.accept(NoxernaItems.INPERLUM_PLATING_SLAB);
                        output.accept(NoxernaItems.INPERLUM_PLATING_WALL);
                        // Nihoxite
                        output.accept(NoxernaItems.NIHOXITE_BLOCK);
                        output.accept(NoxernaItems.NIHOXITE_PLATING);
                        output.accept(NoxernaItems.PLATED_NIHOXITE_PILLAR);
                        output.accept(NoxernaItems.NIHOXITE_PLATING_STAIRS);
                        output.accept(NoxernaItems.NIHOXITE_PLATING_SLAB);
                        output.accept(NoxernaItems.NIHOXITE_PLATING_WALL);
                        // Mysterious Alloy
                        output.accept(NoxernaItems.MYSTERIOUS_ALLOY_PLATING);
                        output.accept(NoxernaItems.PLATED_MYSTERIOUS_ALLOY_PILLAR);
                        output.accept(NoxernaItems.MYSTERIOUS_ALLOY_PLATING_STAIRS);
                        output.accept(NoxernaItems.MYSTERIOUS_ALLOY_PLATING_SLAB);
                        output.accept(NoxernaItems.MYSTERIOUS_ALLOY_PLATING_WALL);
                        // Vitragor
                        output.accept(NoxernaItems.VITRAGOR_BLOCK);
                        // Obscuprum
                            // Unaffected
                        output.accept(NoxernaItems.OBSCUPRUM_BLOCK);
                        output.accept(NoxernaItems.CUT_OBSCUPRUM_BLOCK);
                        output.accept(NoxernaItems.OBSCUPRUM_BRICKS);
                        output.accept(NoxernaItems.OBSCUPRUM_PLATING);
                            // Exposed
                        output.accept(NoxernaItems.EXPOSED_OBSCUPRUM_BLOCK);
                        output.accept(NoxernaItems.EXPOSED_CUT_OBSCUPRUM_BLOCK);
                        output.accept(NoxernaItems.EXPOSED_OBSCUPRUM_BRICKS);
                        output.accept(NoxernaItems.EXPOSED_OBSCUPRUM_PLATING);
                            // Weathered
                        output.accept(NoxernaItems.WEATHERED_OBSCUPRUM_BLOCK);
                        output.accept(NoxernaItems.WEATHERED_CUT_OBSCUPRUM_BLOCK);
                        output.accept(NoxernaItems.WEATHERED_OBSCUPRUM_BRICKS);
                        output.accept(NoxernaItems.WEATHERED_OBSCUPRUM_PLATING);
                            // Oxidised
                        output.accept(NoxernaItems.OXIDISED_OBSCUPRUM_BLOCK);
                        output.accept(NoxernaItems.OXIDISED_CUT_OBSCUPRUM_BLOCK);
                        output.accept(NoxernaItems.OXIDISED_OBSCUPRUM_BRICKS);
                        output.accept(NoxernaItems.OXIDIZED_OBSCUPRUM_PLATING);
                        // Waxed Obscuprum
                            // Unaffected
                        output.accept(NoxernaItems.WAXED_OBSCUPRUM_BLOCK);
                            // Exposed
                            // Weathered
                            // Oxidised
                    }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab>
            NOXERNA_COLORED_BLOCKS = CREATIVE_TABS.register(
                    "noxerna_colored_blocks", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + Noxerna.MODID + ".colored_blocks"))
                    .icon(()-> new ItemStack(NoxernaItems.XENON_CONCRETE.get()))
                    .displayItems((params, output) -> {
                        output.accept(NoxernaItems.XENON_WOOL);
                        output.accept(NoxernaItems.KRYPTON_WOOL);
                        output.accept(NoxernaItems.ARGON_WOOL);
                        output.accept(NoxernaItems.NEON_WOOL);

                        output.accept(NoxernaItems.XENON_CARPET);

                        output.accept(NoxernaItems.XENON_TERRACOTTA);
                        output.accept(NoxernaItems.KRYPTON_TERRACOTTA);
                        output.accept(NoxernaItems.ARGON_TERRACOTTA);
                        output.accept(NoxernaItems.NEON_TERRACOTTA);

                        output.accept(NoxernaItems.XENON_CONCRETE);
                        output.accept(NoxernaItems.KRYPTON_CONCRETE);
                        output.accept(NoxernaItems.ARGON_CONCRETE);
                        output.accept(NoxernaItems.NEON_CONCRETE);
                        output.accept(NoxernaItems.XENON_CONCRETE_POWDER);
                        output.accept(NoxernaItems.KRYPTON_CONCRETE_POWDER);
                        output.accept(NoxernaItems.ARGON_CONCRETE_POWDER);
                        output.accept(NoxernaItems.NEON_CONCRETE_POWDER);

                        output.accept(NoxernaItems.RADIANT_PLATED_IRON_PILLAR);
                        output.accept(NoxernaItems.LUMINOUS_PLATED_IRON_PILLAR);
                        output.accept(NoxernaItems.WHITE_GLOWING_PLATED_IRON_PILLAR);
                        output.accept(NoxernaItems.LIGHT_GRAY_GLOWING_PLATED_IRON_PILLAR);
                        output.accept(NoxernaItems.GRAY_GLOWING_PLATED_IRON_PILLAR);
                        output.accept(NoxernaItems.BLACK_GLOWING_PLATED_IRON_PILLAR);
                        output.accept(NoxernaItems.BROWN_GLOWING_PLATED_IRON_PILLAR);
                        output.accept(NoxernaItems.RED_GLOWING_PLATED_IRON_PILLAR);
                        output.accept(NoxernaItems.ORANGE_GLOWING_PLATED_IRON_PILLAR);
                        output.accept(NoxernaItems.YELLOW_GLOWING_PLATED_IRON_PILLAR);
                        output.accept(NoxernaItems.LIME_GLOWING_PLATED_IRON_PILLAR);
                        output.accept(NoxernaItems.GREEN_GLOWING_PLATED_IRON_PILLAR);
                        output.accept(NoxernaItems.CYAN_GLOWING_PLATED_IRON_PILLAR);
                        output.accept(NoxernaItems.LIGHT_BLUE_GLOWING_PLATED_IRON_PILLAR);
                        output.accept(NoxernaItems.BLUE_GLOWING_PLATED_IRON_PILLAR);
                        output.accept(NoxernaItems.PURPLE_GLOWING_PLATED_IRON_PILLAR);
                        output.accept(NoxernaItems.MAGENTA_GLOWING_PLATED_IRON_PILLAR);
                        output.accept(NoxernaItems.PINK_GLOWING_PLATED_IRON_PILLAR);
                        output.accept(NoxernaItems.XENON_GLOWING_IRON_PILLAR);
                        output.accept(NoxernaItems.KRYPTON_GLOWING_IRON_PILLAR);
                        output.accept(NoxernaItems.ARGON_GLOWING_IRON_PILLAR);
                        output.accept(NoxernaItems.NEON_GLOWING_IRON_PILLAR);

                        output.accept(NoxernaItems.RADIANT_PLATED_FERREBRIS_PILLAR);
                        output.accept(NoxernaItems.LUMINOUS_PLATED_FERREBRIS_PILLAR);
                        output.accept(NoxernaItems.WHITE_GLOWING_PLATED_FERREBRIS_PILLAR);
                        output.accept(NoxernaItems.LIGHT_GRAY_GLOWING_PLATED_FERREBRIS_PILLAR);
                        output.accept(NoxernaItems.GRAY_GLOWING_PLATED_FERREBRIS_PILLAR);
                        output.accept(NoxernaItems.BLACK_GLOWING_PLATED_FERREBRIS_PILLAR);
                        output.accept(NoxernaItems.BROWN_GLOWING_PLATED_FERREBRIS_PILLAR);
                        output.accept(NoxernaItems.RED_GLOWING_PLATED_FERREBRIS_PILLAR);
                        output.accept(NoxernaItems.ORANGE_GLOWING_PLATED_FERREBRIS_PILLAR);
                        output.accept(NoxernaItems.YELLOW_GLOWING_PLATED_FERREBRIS_PILLAR);
                        output.accept(NoxernaItems.LIME_GLOWING_PLATED_FERREBRIS_PILLAR);
                        output.accept(NoxernaItems.GREEN_GLOWING_PLATED_FERREBRIS_PILLAR);
                        output.accept(NoxernaItems.CYAN_GLOWING_PLATED_FERREBRIS_PILLAR);
                        output.accept(NoxernaItems.LIGHT_BLUE_GLOWING_PLATED_FERREBRIS_PILLAR);
                        output.accept(NoxernaItems.BLUE_GLOWING_PLATED_FERREBRIS_PILLAR);
                        output.accept(NoxernaItems.PURPLE_GLOWING_PLATED_FERREBRIS_PILLAR);
                        output.accept(NoxernaItems.MAGENTA_GLOWING_PLATED_FERREBRIS_PILLAR);
                        output.accept(NoxernaItems.PINK_GLOWING_PLATED_FERREBRIS_PILLAR);
                        output.accept(NoxernaItems.XENON_GLOWING_FERREBRIS_PILLAR);
                        output.accept(NoxernaItems.KRYPTON_GLOWING_FERREBRIS_PILLAR);
                        output.accept(NoxernaItems.ARGON_GLOWING_FERREBRIS_PILLAR);
                        output.accept(NoxernaItems.NEON_GLOWING_FERREBRIS_PILLAR);
                    }).withTabsBefore(NOXERNA_BUILDING_BLOCKS.getKey()).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab>
            NOXERNA_NATURAL_BLOCKS = CREATIVE_TABS.register(
                    "noxerna_natural_blocks", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + Noxerna.MODID + ".natural_blocks"))
                    .icon(()-> new ItemStack(NoxernaItems.NOXUM.get()))
                    .displayItems((params, output) -> {
                        // Stones
                        output.accept(NoxernaItems.SOLTRA);
                        output.accept(NoxernaItems.SOLTRA_PEBBLE);
                        output.accept(NoxernaItems.NOXUM);
                        output.accept(NoxernaItems.NOXUM_PEBBLE);
                        output.accept(NoxernaItems.AESTUM);
                        output.accept(NoxernaItems.AESTUM_PEBBLE);
                        output.accept(NoxernaItems.INETRA);
                        output.accept(NoxernaItems.INETRA_PEBBLE);
                        // Ores
                        output.accept(NoxernaItems.NOXUM_BURIED_FUEL_CELL);
                        output.accept(NoxernaItems.AESTUM_BURIED_FUEL_CELL);
                        output.accept(NoxernaItems.INETRA_BURIED_FUEL_CELL);
                        output.accept(NoxernaItems.NOXUM_FERREBRIS_ORE);
                        output.accept(NoxernaItems.AESTUM_FERREBRIS_ORE);
                        output.accept(NoxernaItems.INETRA_FERREBRIS_ORE);
                        output.accept(NoxernaItems.NOXUM_OBSCUPRUM_ORE);
                        output.accept(NoxernaItems.AESTUM_OBSCUPRUM_ORE);
                        output.accept(NoxernaItems.INETRA_OBSCUPRUM_ORE);
                        output.accept(NoxernaItems.NOXUM_UMBURAM_ORE);
                        output.accept(NoxernaItems.AESTUM_UMBURAM_ORE);
                        output.accept(NoxernaItems.INETRA_UMBURAM_ORE);
                        output.accept(NoxernaItems.RAW_FERREBRIS_BLOCK);
                        output.accept(NoxernaItems.RAW_OBSCUPRUM_BLOCK);
                        output.accept(NoxernaItems.RAW_UMBURAM_BLOCK);
                        output.accept(NoxernaItems.RAW_INPERLUM_BLOCK);
                        // Wood
                        output.accept(NoxernaItems.XENON_LOG);
                        output.accept(NoxernaItems.KRYPTON_LOG);
                        output.accept(NoxernaItems.ARGON_LOG);
                        output.accept(NoxernaItems.NEON_LOG);
                        // Other
                        output.accept(NoxernaItems.VOIDROCK);
                    })
                    .withTabsBefore(NOXERNA_COLORED_BLOCKS.getKey()).build());
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab>
            NOXERNA_FUNCTIONAL_BLOCKS = CREATIVE_TABS.register(
                    "noxerna_functional_blocks", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + Noxerna.MODID + ".functional_blocks"))
                    .icon(()-> new ItemStack(NoxernaItems.LUMAI_FUEL_CELL.get()))
                    .displayItems((params, output) -> {
                        output.accept(NoxernaItems.LUMAI_FUEL_CELL);
                        output.accept(NoxernaItems.RADIANT_PLATED_IRON_PILLAR);
                        output.accept(NoxernaItems.LUMINOUS_PLATED_IRON_PILLAR);
                        output.accept(NoxernaItems.RADIANT_PLATED_FERREBRIS_PILLAR);
                        output.accept(NoxernaItems.LUMINOUS_PLATED_FERREBRIS_PILLAR);
                        output.accept(NoxernaItems.NOBLEWOOD_CRAFTING_TABLE);
                    })
                    .withTabsBefore(NOXERNA_NATURAL_BLOCKS.getKey()).build());
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab>
            NOXERNA_TOOLS_AND_UTILITIES = CREATIVE_TABS.register(
            "noxerna_tools_and_utilities", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + Noxerna.MODID + ".tools_and_utilities"))
                    .icon(()-> new ItemStack(NoxernaItems.ADAMUNA_PICKAXE.get()))
                    .displayItems((params, output) -> {
                        output.accept(NoxernaItems.NOBLEWOOD_SHOVEL.get());
                        output.accept(NoxernaItems.NOBLEWOOD_PICKAXE.get());
                        output.accept(NoxernaItems.NOBLEWOOD_AXE.get());
                        output.accept(NoxernaItems.NOBLEWOOD_HOE.get());
                        output.accept(NoxernaItems.NOXSTONE_SHOVEL.get());
                        output.accept(NoxernaItems.NOXSTONE_PICKAXE.get());
                        output.accept(NoxernaItems.NOXSTONE_AXE.get());
                        output.accept(NoxernaItems.NOXSTONE_HOE.get());
                        output.accept(NoxernaItems.FERREBRIS_SHOVEL.get());
                        output.accept(NoxernaItems.FERREBRIS_PICKAXE.get());
                        output.accept(NoxernaItems.FERREBRIS_AXE.get());
                        output.accept(NoxernaItems.FERREBRIS_HOE.get());
                        output.accept(NoxernaItems.UMBURAM_SHOVEL.get());
                        output.accept(NoxernaItems.UMBURAM_PICKAXE.get());
                        output.accept(NoxernaItems.UMBURAM_AXE.get());
                        output.accept(NoxernaItems.UMBURAM_HOE.get());
                        output.accept(NoxernaItems.ADAMUNA_SHOVEL.get());
                        output.accept(NoxernaItems.ADAMUNA_PICKAXE.get());
                        output.accept(NoxernaItems.ADAMUNA_AXE.get());
                        output.accept(NoxernaItems.ADAMUNA_HOE.get());
                        output.accept(NoxernaItems.NIHOXITE_SHOVEL.get());
                        output.accept(NoxernaItems.NIHOXITE_PICKAXE.get());
                        output.accept(NoxernaItems.NIHOXITE_AXE.get());
                        output.accept(NoxernaItems.NIHOXITE_HOE.get());
                        output.accept(NoxernaItems.PYROCHARGE.get());
                        output.accept(NoxernaItems.PICKADZE.get());
                        output.accept(NoxernaItems.VITRALISK.get());
                    })
                    .withTabsBefore(NOXERNA_FUNCTIONAL_BLOCKS.getKey()).build());
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab>
            NOXERNA_COMBAT = CREATIVE_TABS.register(
            "noxerna_combat", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + Noxerna.MODID + ".combat"))
                    .icon(()-> new ItemStack(NoxernaItems.NIHOXITE_SWORD.get()))
                    .displayItems((params, output) -> {
                        output.accept(NoxernaItems.NOBLEWOOD_SWORD.get());
                        output.accept(NoxernaItems.NOBLEWOOD_AXE.get());
                        output.accept(NoxernaItems.NOXSTONE_SWORD.get());
                        output.accept(NoxernaItems.NOXSTONE_AXE.get());
                        output.accept(NoxernaItems.FERREBRIS_SWORD.get());
                        output.accept(NoxernaItems.FERREBRIS_AXE.get());
                        output.accept(NoxernaItems.UMBURAM_SWORD.get());
                        output.accept(NoxernaItems.UMBURAM_AXE.get());
                        output.accept(NoxernaItems.ADAMUNA_SWORD.get());
                        output.accept(NoxernaItems.ADAMUNA_AXE.get());
                        output.accept(NoxernaItems.NIHOXITE_SWORD.get());
                        output.accept(NoxernaItems.NIHOXITE_AXE.get());
                        output.accept(NoxernaItems.FERREBRIS_SHIELD);
                        output.accept(NoxernaItems.ROCKHIDE_HELMET.get());
                        output.accept(NoxernaItems.ROCKHIDE_CHESTPLATE.get());
                        output.accept(NoxernaItems.ROCKHIDE_LEGGINGS.get());
                        output.accept(NoxernaItems.ROCKHIDE_BOOTS.get());
                        output.accept(NoxernaItems.EXOSKELETON_HELMET.get());
                        output.accept(NoxernaItems.EXOSKELETON_CHESTPLATE.get());
                        output.accept(NoxernaItems.EXOSKELETON_LEGGINGS.get());
                        output.accept(NoxernaItems.EXOSKELETON_BOOTS.get());
                        output.accept(NoxernaItems.FERREBRIS_HELMET.get());
                        output.accept(NoxernaItems.FERREBRIS_CHESTPLATE.get());
                        output.accept(NoxernaItems.FERREBRIS_LEGGINGS.get());
                        output.accept(NoxernaItems.FERREBRIS_BOOTS.get());
                        output.accept(NoxernaItems.UMBURAM_HELMET.get());
                        output.accept(NoxernaItems.UMBURAM_CHESTPLATE.get());
                        output.accept(NoxernaItems.UMBURAM_LEGGINGS.get());
                        output.accept(NoxernaItems.UMBURAM_BOOTS.get());
                        output.accept(NoxernaItems.ADAMUNA_HELMET.get());
                        output.accept(NoxernaItems.ADAMUNA_CHESTPLATE.get());
                        output.accept(NoxernaItems.ADAMUNA_LEGGINGS.get());
                        output.accept(NoxernaItems.ADAMUNA_BOOTS.get());
                        output.accept(NoxernaItems.NIHOXITE_HELMET.get());
                        output.accept(NoxernaItems.NIHOXITE_CHESTPLATE.get());
                        output.accept(NoxernaItems.NIHOXITE_LEGGINGS.get());
                        output.accept(NoxernaItems.NIHOXITE_BOOTS.get());
                        output.accept(NoxernaItems.HEART_HELMET.get());
                        output.accept(NoxernaItems.HEART_CHESTPLATE.get());
                        output.accept(NoxernaItems.HEART_LEGGINGS.get());
                        output.accept(NoxernaItems.HEART_BOOTS.get());
                        output.accept(NoxernaItems.VITRALISK.get());
                    })
                    .withTabsBefore(NOXERNA_TOOLS_AND_UTILITIES.getKey()).build());
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab>
            NOXERNA_FOOD_AND_DRINK = CREATIVE_TABS.register(
            "noxerna_food_and_drink", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + Noxerna.MODID + ".food_and_drink"))
                    .icon(()-> new ItemStack(NoxernaItems.GLOWGRAIN.get()))
                    .displayItems((params, output) -> {
                        output.accept(NoxernaItems.XENON_NOBLEPHYTE);
                    })
                    .withTabsBefore(NOXERNA_COMBAT.getKey()).build());
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab>
            NOXERNA_INGREDIENTS = CREATIVE_TABS.register(
            "noxerna_ingredients", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + Noxerna.MODID + ".ingredients"))
                    .icon(()-> new ItemStack(NoxernaItems.FERREBRIS_INGOT.get()))
                    .displayItems((params, output) -> {
                        output.accept(NoxernaItems.LUMAI_CRYSTAL);
                        output.accept(NoxernaItems.LUMAI_FUEL_CELL);
                        output.accept(NoxernaItems.RAW_FERREBRIS);
                        output.accept(NoxernaItems.RAW_OBSCUPRUM);
                        output.accept(NoxernaItems.RAW_UMBURAM);
                        output.accept(NoxernaItems.RAW_INPERLUM);
                        output.accept(NoxernaItems.TENERYL);
                        output.accept(NoxernaItems.ADAMUNA);
                        output.accept(NoxernaItems.VITRAGOR);
                        output.accept(NoxernaItems.FERREBRIS_NUGGET);
                        output.accept(NoxernaItems.OBSCUPRUM_NUGGET);
                        output.accept(NoxernaItems.UMBURAM_NUGGET);
                        output.accept(NoxernaItems.INPERLUM_NUGGET);
                        output.accept(NoxernaItems.NIHOXITE_NUGGET);
                        output.accept(NoxernaItems.FERREBRIS_INGOT);
                        output.accept(NoxernaItems.OBSCUPRUM_INGOT);
                        output.accept(NoxernaItems.UMBURAM_INGOT);
                        output.accept(NoxernaItems.INPERLUM_INGOT);
                        output.accept(NoxernaItems.NIHOXITE_INGOT);
                        output.accept(NoxernaItems.MYSTERIOUS_SCRAP);
                        output.accept(NoxernaItems.MYSTERIOUS_ALLOY_PLATE);
                        output.accept(NoxernaItems.NOBLEWOOD_STICK);
                        output.accept(NoxernaItems.GLOWGRAIN);
                        output.accept(NoxernaItems.ROCKHIDE);
                        output.accept(NoxernaItems.SULAZE_CORE);
                        output.accept(NoxernaItems.XENON_DYE);
                        output.accept(NoxernaItems.KRYPTON_DYE);
                        output.accept(NoxernaItems.ARGON_DYE);
                        output.accept(NoxernaItems.NEON_DYE);
                        output.accept(NoxernaItems.NOBLEWOOD_BOWL);
                        output.accept(NoxernaItems.CUT_TENERYL);
                        output.accept(NoxernaItems.VITRAGOR_DUST);
                        output.accept(NoxernaItems.SULAZE_POWDER);
                        output.accept(NoxernaItems.NIHOXITE_UPGRADE_SMITHING_TEMPLATE);
                        output.accept(NoxernaItems.EXOTIC_ARMOR_TRIM_SMITHING_TEMPLATE);
                        output.accept(NoxernaItems.ENERGIZED_TENERYL_DRIVE);
                    })
                    .withTabsBefore(NOXERNA_FOOD_AND_DRINK.getKey()).build());
}
