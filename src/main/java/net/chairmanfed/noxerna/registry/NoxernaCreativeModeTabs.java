package net.chairmanfed.noxerna.registry;

import net.chairmanfed.noxerna.TheNoxerna;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class NoxernaCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(
            BuiltInRegistries.CREATIVE_MODE_TAB, TheNoxerna.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab>
            NOXERNA_BUILDING_BLOCKS = CREATIVE_TABS.register(
            "noxerna_building_blocks", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + TheNoxerna.MODID + ".building_blocks"))
                    .icon(()-> new ItemStack(NoxernaBlocks.NOXUM_BRICKS.get()))
                    .displayItems((params, output) -> {
                        // Wood Sets
                        // Xenon
                        output.accept(NoxernaBlocks.XENON_LOG);
                        output.accept(NoxernaBlocks.XENON_WOOD);
                        output.accept(NoxernaBlocks.STRIPPED_XENON_LOG);
                        output.accept(NoxernaBlocks.STRIPPED_XENON_WOOD);
                        output.accept(NoxernaBlocks.XENON_PLANKS);
                        output.accept(NoxernaBlocks.XENON_STAIRS);
                        output.accept(NoxernaBlocks.XENON_SLAB);
                        output.accept(NoxernaBlocks.XENON_FENCE);
                        output.accept(NoxernaBlocks.XENON_FENCE_GATE);
                        output.accept(NoxernaBlocks.XENON_DOOR);
                        output.accept(NoxernaBlocks.XENON_TRAPDOOR);
                        output.accept(NoxernaBlocks.XENON_PRESSURE_PLATE);
                        output.accept(NoxernaBlocks.XENON_BUTTON);
                        // Krypton
                        output.accept(NoxernaBlocks.KRYPTON_LOG);
                        output.accept(NoxernaBlocks.KRYPTON_WOOD);
                        output.accept(NoxernaBlocks.STRIPPED_KRYPTON_LOG);
                        output.accept(NoxernaBlocks.STRIPPED_KRYPTON_WOOD);
                        output.accept(NoxernaBlocks.KRYPTON_PLANKS);
                        output.accept(NoxernaBlocks.KRYPTON_STAIRS);
                        output.accept(NoxernaBlocks.KRYPTON_SLAB);
                        output.accept(NoxernaBlocks.KRYPTON_FENCE);
                        output.accept(NoxernaBlocks.KRYPTON_FENCE_GATE);
                        output.accept(NoxernaBlocks.KRYPTON_DOOR);
                        output.accept(NoxernaBlocks.KRYPTON_TRAPDOOR);
                        output.accept(NoxernaBlocks.KRYPTON_PRESSURE_PLATE);
                        output.accept(NoxernaBlocks.KRYPTON_BUTTON);
                        // Argon
                        output.accept(NoxernaBlocks.ARGON_PLANKS);
                        output.accept(NoxernaBlocks.ARGON_STAIRS);
                        // Neon
                        output.accept(NoxernaBlocks.NEON_PLANKS);
                        // Stone Sets
                        // Soltra
                        output.accept(NoxernaBlocks.SOLTRA);
                            // Polished
                        output.accept(NoxernaBlocks.POLISHED_SOLTRA);
                            // Bricks
                        output.accept(NoxernaBlocks.SOLTRA_BRICKS);
                        // Noxum
                        output.accept(NoxernaBlocks.NOXUM);
                        output.accept(NoxernaBlocks.NOXUM_STAIRS);
                        output.accept(NoxernaBlocks.NOXUM_SLAB);
                        output.accept(NoxernaBlocks.NOXUM_WALL);
                        output.accept(NoxernaBlocks.NOXUM_PRESSURE_PLATE);
                        output.accept(NoxernaBlocks.NOXUM_BUTTON);
                            // Polished
                        output.accept(NoxernaBlocks.POLISHED_NOXUM);
                        output.accept(NoxernaBlocks.POLISHED_NOXUM_STAIRS);
                        output.accept(NoxernaBlocks.POLISHED_NOXUM_SLAB);
                        output.accept(NoxernaBlocks.POLISHED_NOXUM_WALL);
                            // Bricks
                        output.accept(NoxernaBlocks.NOXUM_BRICKS);
                        output.accept(NoxernaBlocks.NOXUM_BRICK_STAIRS);
                        output.accept(NoxernaBlocks.NOXUM_BRICK_SLAB);
                        output.accept(NoxernaBlocks.NOXUM_BRICK_WALL);
                        // Aestum
                        output.accept(NoxernaBlocks.AESTUM);
                        // Polished
                        output.accept(NoxernaBlocks.POLISHED_AESTUM);
                        // Bricks
                        output.accept(NoxernaBlocks.AESTUM_BRICKS);
                        // Inetra
                        output.accept(NoxernaBlocks.INETRA);
                        // Polished
                        output.accept(NoxernaBlocks.POLISHED_INETRA);
                        // Bricks
                        output.accept(NoxernaBlocks.INETRA_BRICKS);
                        // Special Blocks
                        output.accept(NoxernaBlocks.NOXERNA_PORTAL_FRAME);
                        // Material Storage & Decoration Blocks
                        // Ferrebris
                        output.accept(NoxernaBlocks.FERREBRIS_BLOCK);
                        output.accept(NoxernaBlocks.FERREBRIS_BARS);
                        output.accept(NoxernaBlocks.FERREBRIS_PLATING);
                        output.accept(NoxernaBlocks.FERREBRIS_PLATING_STAIRS);
                        output.accept(NoxernaBlocks.FERREBRIS_PLATING_SLAB);
                        output.accept(NoxernaBlocks.FERREBRIS_PLATING_WALL);
                        // Umburam
                        output.accept(NoxernaBlocks.UMBURAM_BLOCK);
                        output.accept(NoxernaBlocks.UMBURAM_PLATING);
                        // Teneryl
                        output.accept(NoxernaBlocks.TENERYL_BLOCK);
                        // Adamuna
                        output.accept(NoxernaBlocks.ADAMUNA_BLOCK);
                        // Inperlum
                        output.accept(NoxernaBlocks.INPERLUM_BLOCK);
                        output.accept(NoxernaBlocks.INPERLUM_PLATING);
                        // Nihoxite
                        output.accept(NoxernaBlocks.NIHOXITE_BLOCK);
                        output.accept(NoxernaBlocks.NIHOXITE_PLATING);
                        // Vitragor
                        output.accept(NoxernaBlocks.VITRAGOR_BLOCK);
                        // Obscuprum
                            // Unaffected
                        output.accept(NoxernaBlocks.OBSCUPRUM_BLOCK);
                        output.accept(NoxernaBlocks.CUT_OBSCUPRUM_BLOCK);
                        output.accept(NoxernaBlocks.OBSCUPRUM_BRICKS);
                        output.accept(NoxernaBlocks.OBSCUPRUM_PLATING);
                            // Exposed
                        output.accept(NoxernaBlocks.EXPOSED_OBSCUPRUM_BLOCK);
                        output.accept(NoxernaBlocks.EXPOSED_CUT_OBSCUPRUM_BLOCK);
                        output.accept(NoxernaBlocks.EXPOSED_OBSCUPRUM_BRICKS);
                        output.accept(NoxernaBlocks.EXPOSED_OBSCUPRUM_PLATING);
                            // Weathered
                        output.accept(NoxernaBlocks.WEATHERED_OBSCUPRUM_BLOCK);
                        output.accept(NoxernaBlocks.WEATHERED_CUT_OBSCUPRUM_BLOCK);
                        output.accept(NoxernaBlocks.WEATHERED_OBSCUPRUM_BRICKS);
                        output.accept(NoxernaBlocks.WEATHERED_OBSCUPRUM_PLATING);
                            // Oxidized
                        output.accept(NoxernaBlocks.OXIDIZED_OBSCUPRUM_BLOCK);
                        output.accept(NoxernaBlocks.OXIDIZED_CUT_OBSCUPRUM_BLOCK);
                        output.accept(NoxernaBlocks.OXIDIZED_OBSCUPRUM_BRICKS);
                        output.accept(NoxernaBlocks.OXIDIZED_OBSCUPRUM_PLATING);
                        // Waxed Obscuprum
                            // Unaffected
                            // Exposed
                            // Weathered
                            // Oxidized
                    }).build());
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab>
            NOXERNA_COLORED_BLOCKS = CREATIVE_TABS.register(
                    "noxerna_colored_blocks", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + TheNoxerna.MODID + ".colored_blocks"))
                    .icon(()-> new ItemStack(NoxernaBlocks.ARGON_CONCRETE.get()))
                    .displayItems((params, output) -> {
                        output.accept(NoxernaBlocks.ARGON_CONCRETE);
                        output.accept(NoxernaBlocks.ARGON_CONCRETE_POWDER);
                    }).withTabsBefore(NOXERNA_BUILDING_BLOCKS.getKey()).build());
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab>
            NOXERNA_NATURAL_BLOCKS = CREATIVE_TABS.register(
                    "noxerna_natural_blocks", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + TheNoxerna.MODID + ".natural_blocks"))
                    .icon(()-> new ItemStack(NoxernaBlocks.NOXUM.get()))
                    .displayItems((params, output) -> {
                        output.accept(NoxernaBlocks.SOLTRA);
                        output.accept(NoxernaBlocks.NOXUM);
                        output.accept(NoxernaBlocks.AESTUM);
                        output.accept(NoxernaBlocks.INETRA);
                        output.accept(NoxernaBlocks.SOLTRA_PEBBLE);
                        output.accept(NoxernaBlocks.NOXUM_PEBBLE);
                        output.accept(NoxernaBlocks.AESTUM_PEBBLE);
                        output.accept(NoxernaBlocks.INETRA_PEBBLE);
                        output.accept(NoxernaBlocks.XENON_LOG);
                        output.accept(NoxernaBlocks.KRYPTON_LOG);
                        output.accept(NoxernaBlocks.VOIDROCK);
                    })
                    .withTabsBefore(NOXERNA_COLORED_BLOCKS.getKey()).build());
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab>
            NOXERNA_TOOLS_AND_UTILITIES = CREATIVE_TABS.register(
            "noxerna_tools_and_utilities", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + TheNoxerna.MODID + ".tools_and_utilities"))
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
                        output.accept(NoxernaItems.VITRALISK.get());
                    })
                    .withTabsBefore(NOXERNA_NATURAL_BLOCKS.getKey()).build());
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab>
            NOXERNA_COMBAT = CREATIVE_TABS.register(
            "noxerna_combat", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + TheNoxerna.MODID + ".combat"))
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
            NOXERNA_INGREDIENTS = CREATIVE_TABS.register(
            "noxerna_ingredients", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + TheNoxerna.MODID + ".ingredients"))
                    .icon(()-> new ItemStack(NoxernaItems.FERREBRIS_INGOT.get()))
                    .displayItems((params, output) -> {
                        output.accept(NoxernaItems.RAW_FERREBRIS.get());
                        output.accept(NoxernaItems.RAW_OBSCUPRUM.get());
                        output.accept(NoxernaItems.RAW_UMBURAM.get());
                        output.accept(NoxernaItems.RAW_INPERLUM.get());
                        output.accept(NoxernaItems.TENERYL.get());
                        output.accept(NoxernaItems.ADAMUNA.get());
                        output.accept(NoxernaItems.VITRAGOR.get());
                        output.accept(NoxernaItems.FERREBRIS_NUGGET.get());
                        output.accept(NoxernaItems.OBSCUPRUM_NUGGET.get());
                        output.accept(NoxernaItems.UMBURAM_NUGGET.get());
                        output.accept(NoxernaItems.INPERLUM_NUGGET.get());
                        output.accept(NoxernaItems.NIHOXITE_NUGGET.get());
                        output.accept(NoxernaItems.FERREBRIS_INGOT.get());
                        output.accept(NoxernaItems.OBSCUPRUM_INGOT.get());
                        output.accept(NoxernaItems.UMBURAM_INGOT.get());
                        output.accept(NoxernaItems.INPERLUM_INGOT.get());
                        output.accept(NoxernaItems.NIHOXITE_INGOT.get());
                        output.accept(NoxernaItems.MYSTERIOUS_SCRAP.get());
                        output.accept(NoxernaItems.MYSTERIOUS_ALLOY_PLATE.get());
                        output.accept(NoxernaItems.NOBLEWOOD_STICK.get());
                        output.accept(NoxernaItems.GLOWGRAIN.get());
                        output.accept(NoxernaItems.ROCKHIDE.get());
                        output.accept(NoxernaItems.SULAZE_CORE);
                        output.accept(NoxernaItems.XENON_DYE);
                        output.accept(NoxernaItems.KRYPTON_DYE);
                        output.accept(NoxernaItems.ARGON_DYE);
                        output.accept(NoxernaItems.NEON_DYE);
                        output.accept(NoxernaItems.NOBLEWOOD_BOWL);
                        output.accept(NoxernaItems.VITRAGOR_DUST);
                        output.accept(NoxernaItems.SULAZE_POWDER);
                        output.accept(NoxernaItems.NIHOXITE_UPGRADE_SMITHING_TEMPLATE);
                    })
                    .withTabsBefore(NOXERNA_COMBAT.getKey()).build());
}
