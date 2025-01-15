package net.chairmanfed.noxerna.registry;

import net.chairmanfed.noxerna.TheNoxerna;
import net.chairmanfed.noxerna.item.NoxernaArmorMaterials;
import net.chairmanfed.noxerna.item.NoxernaSmithingTemplateItem;
import net.chairmanfed.noxerna.item.NoxernaToolMaterials;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class NoxernaItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TheNoxerna.MODID);
    public static DeferredItem<Item> registerSimpleItem(String name, Item.Properties properties) {
        return ITEMS.register(name, () -> new Item(new Item.Properties()));
    }
    public static DeferredItem<Item> registerItemWithRarity(String name, Rarity rarity, Item.Properties properties) {
        return ITEMS.register(name, () -> new Item(new Item.Properties().rarity(rarity)));
    }
    public static DeferredItem<Item> registerBlockItem(String name, Supplier<Block> block) {
        return ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    @SuppressWarnings("Unused")
    // Intermediates
    public static final DeferredItem<Item> RAW_FERREBRIS = registerSimpleItem(
            "raw_ferrebris", new Item.Properties());
    public static final DeferredItem<Item> RAW_OBSCUPRUM = registerSimpleItem(
            "raw_obscuprum", new Item.Properties());
    public static final DeferredItem<Item> RAW_UMBURAM = registerSimpleItem(
            "raw_umburam", new Item.Properties());
    public static final DeferredItem<Item> RAW_INPERLUM = registerSimpleItem(
            "raw_inperlum", new Item.Properties());
    public static final DeferredItem<Item> TENERYL = registerSimpleItem(
            "teneryl", new Item.Properties());
    public static final DeferredItem<Item> ADAMUNA = registerSimpleItem(
            "adamuna", new Item.Properties());
    public static final DeferredItem<Item> VITRAGOR = registerSimpleItem(
            "vitragor", new Item.Properties());
    public static final DeferredItem<Item> FERREBRIS_NUGGET = registerSimpleItem(
            "ferrebris_nugget", new Item.Properties());
    public static final DeferredItem<Item> OBSCUPRUM_NUGGET = registerSimpleItem(
            "obscuprum_nugget", new Item.Properties());
    public static final DeferredItem<Item> UMBURAM_NUGGET = registerSimpleItem(
            "umburam_nugget", new Item.Properties());
    public static final DeferredItem<Item> INPERLUM_NUGGET = registerSimpleItem(
            "inperlum_nugget", new Item.Properties());
    public static final DeferredItem<Item> NIHOXITE_NUGGET = registerSimpleItem(
            "nihoxite_nugget", new Item.Properties());
    public static final DeferredItem<Item> FERREBRIS_INGOT = registerSimpleItem(
            "ferrebris_ingot", new Item.Properties());
    public static final DeferredItem<Item> OBSCUPRUM_INGOT = registerSimpleItem(
            "obscuprum_ingot", new Item.Properties());
    public static final DeferredItem<Item> UMBURAM_INGOT = registerSimpleItem(
            "umburam_ingot", new Item.Properties());
    public static final DeferredItem<Item> INPERLUM_INGOT = registerSimpleItem(
            "inperlum_ingot", new Item.Properties());
    public static final DeferredItem<Item> NIHOXITE_INGOT = registerSimpleItem(
            "nihoxite_ingot", new Item.Properties());
    public static final DeferredItem<Item> MYSTERIOUS_SCRAP = registerItemWithRarity(
            "mysterious_scrap", Rarity.UNCOMMON, new Item.Properties());
    public static final DeferredItem<Item> MYSTERIOUS_ALLOY_PLATE = registerItemWithRarity(
            "mysterious_alloy_plate", Rarity.UNCOMMON, new Item.Properties());
    public static final DeferredItem<Item> NOBLEWOOD_STICK = registerSimpleItem(
            "noblewood_stick", new Item.Properties());
    public static final DeferredItem<Item> GLOWGRAIN = registerSimpleItem(
            "glowgrain", new Item.Properties());
    public static final DeferredItem<Item> ROCKHIDE = registerSimpleItem(
            "rockhide", new Item.Properties());
    public static final DeferredItem<Item> SULAZE_CORE = registerSimpleItem(
            "sulaze_core", new Item.Properties());
    public static final DeferredItem<Item> XENON_DYE = registerSimpleItem(
            "xenon_dye", new Item.Properties());
    public static final DeferredItem<Item> KRYPTON_DYE = registerSimpleItem(
            "krypton_dye", new Item.Properties());
    public static final DeferredItem<Item> ARGON_DYE = registerSimpleItem(
            "argon_dye", new Item.Properties());
    public static final DeferredItem<Item> NEON_DYE = registerSimpleItem(
            "neon_dye", new Item.Properties());
    public static final DeferredItem<Item> NOBLEWOOD_BOWL = registerSimpleItem(
            "noblewood_bowl", new Item.Properties());
    public static final DeferredItem<Item> VITRAGOR_DUST = registerSimpleItem(
            "vitragor_dust", new Item.Properties());
    public static final DeferredItem<Item> SULAZE_POWDER = registerSimpleItem(
            "sulaze_powder", new Item.Properties());
    public static final DeferredItem<Item> NIHOXITE_UPGRADE_SMITHING_TEMPLATE = ITEMS.register(
            "nihoxite_upgrade_smithing_template", () -> NoxernaSmithingTemplateItem.createNihoxiteUpgradeTemplate());

    // Tools, sorted by tier
    // Noblewood
    public static final DeferredItem<Item> NOBLEWOOD_SHOVEL = ITEMS.register(
            "noblewood_shovel", () -> new ShovelItem(NoxernaToolMaterials.NOBLEWOOD,
                    new Item.Properties().attributes(ShovelItem.createAttributes(
                            NoxernaToolMaterials.NOBLEWOOD, 1.5f, -3.2f))));
    public static final DeferredItem<Item> NOBLEWOOD_PICKAXE = ITEMS.register(
            "noblewood_pickaxe", () -> new PickaxeItem(NoxernaToolMaterials.NOBLEWOOD,
                    new Item.Properties().attributes(PickaxeItem.createAttributes(
                            NoxernaToolMaterials.NOBLEWOOD, 1, -3.2f))));
    public static final DeferredItem<Item> NOBLEWOOD_AXE = ITEMS.register(
            "noblewood_axe", () -> new AxeItem(NoxernaToolMaterials.NOBLEWOOD,
                    new Item.Properties().attributes(AxeItem.createAttributes(
                            NoxernaToolMaterials.NOBLEWOOD, 4.5f, -3.2f))));
    public static final DeferredItem<Item> NOBLEWOOD_HOE = ITEMS.register(
            "noblewood_hoe", () -> new HoeItem(NoxernaToolMaterials.NOBLEWOOD,
                    new Item.Properties().attributes(HoeItem.createAttributes(
                            NoxernaToolMaterials.NOBLEWOOD, 1, -2.0f))));
    public static final DeferredItem<Item> NOBLEWOOD_SWORD = ITEMS.register(
            "noblewood_sword", () -> new SwordItem(NoxernaToolMaterials.NOBLEWOOD,
                    new Item.Properties().attributes(SwordItem.createAttributes(
                            NoxernaToolMaterials.NOBLEWOOD, 2, -2.8f))));
    // Noxstone
    public static final DeferredItem<Item> NOXSTONE_AXE = ITEMS.register(
            "noxstone_axe", () -> new AxeItem(NoxernaToolMaterials.NOXSTONE,
                    new Item.Properties().attributes(AxeItem.createAttributes(
                            NoxernaToolMaterials.NOXSTONE, 4.5f, -3.2f))));
    public static final DeferredItem<Item> NOXSTONE_HOE = ITEMS.register(
            "noxstone_hoe", () -> new HoeItem(NoxernaToolMaterials.NOXSTONE,
                    new Item.Properties().attributes(HoeItem.createAttributes(
                            NoxernaToolMaterials.NOXSTONE, 1, -2.0f))));
    public static final DeferredItem<Item> NOXSTONE_PICKAXE = ITEMS.register(
            "noxstone_pickaxe", () -> new PickaxeItem(NoxernaToolMaterials.NOXSTONE,
                    new Item.Properties().attributes(PickaxeItem.createAttributes(
                            NoxernaToolMaterials.NOXSTONE, 1, -3.2f))));
    public static final DeferredItem<Item> NOXSTONE_SHOVEL = ITEMS.register(
            "noxstone_shovel", () -> new ShovelItem(NoxernaToolMaterials.NOXSTONE,
                    new Item.Properties().attributes(ShovelItem.createAttributes(
                            NoxernaToolMaterials.NOXSTONE, 1.5f, -3.2f))));
    public static final DeferredItem<Item> NOXSTONE_SWORD = ITEMS.register(
            "noxstone_sword", () -> new SwordItem(NoxernaToolMaterials.NOXSTONE,
                    new Item.Properties().attributes(SwordItem.createAttributes(
                            NoxernaToolMaterials.NOXSTONE, 3, -2.8f))));
    // Ferrebris
    public static final DeferredItem<Item> FERREBRIS_AXE = ITEMS.register(
            "ferrebris_axe", () -> new AxeItem(NoxernaToolMaterials.FERREBRIS,
                    new Item.Properties().attributes(AxeItem.createAttributes(
                            NoxernaToolMaterials.FERREBRIS, 5.5f, -3.2f))));
    public static final DeferredItem<Item> FERREBRIS_HOE = ITEMS.register(
            "ferrebris_hoe", () -> new HoeItem(NoxernaToolMaterials.FERREBRIS,
                    new Item.Properties().attributes(HoeItem.createAttributes(
                            NoxernaToolMaterials.FERREBRIS, 0, -2.0f))));
    public static final DeferredItem<Item> FERREBRIS_PICKAXE = ITEMS.register(
            "ferrebris_pickaxe", () -> new PickaxeItem(NoxernaToolMaterials.FERREBRIS,
                    new Item.Properties().attributes(PickaxeItem.createAttributes(
                            NoxernaToolMaterials.FERREBRIS, 1, -3.2f))));
    public static final DeferredItem<Item> FERREBRIS_SHOVEL = ITEMS.register(
            "ferrebris_shovel", () -> new ShovelItem(NoxernaToolMaterials.FERREBRIS,
                    new Item.Properties().attributes(ShovelItem.createAttributes(
                            NoxernaToolMaterials.FERREBRIS, 1.5f, -3.2f))));
    public static final DeferredItem<Item> FERREBRIS_SWORD = ITEMS.register(
            "ferrebris_sword", () -> new SwordItem(NoxernaToolMaterials.FERREBRIS,
                    new Item.Properties().attributes(SwordItem.createAttributes(
                            NoxernaToolMaterials.FERREBRIS, 3, -2.8f))));
    // Umburam
    public static final DeferredItem<Item> UMBURAM_AXE = ITEMS.register(
            "umburam_axe", () -> new AxeItem(NoxernaToolMaterials.UMBURAM,
                    new Item.Properties().attributes(AxeItem.createAttributes(
                            NoxernaToolMaterials.UMBURAM, 4.5f, -3.2f))));
    public static final DeferredItem<Item> UMBURAM_HOE = ITEMS.register(
            "umburam_hoe", () -> new HoeItem(NoxernaToolMaterials.UMBURAM,
                    new Item.Properties().attributes(HoeItem.createAttributes(
                            NoxernaToolMaterials.UMBURAM, 1, -2.0f))));
    public static final DeferredItem<Item> UMBURAM_PICKAXE = ITEMS.register(
            "umburam_pickaxe", () -> new PickaxeItem(NoxernaToolMaterials.UMBURAM,
                    new Item.Properties().attributes(PickaxeItem.createAttributes(
                            NoxernaToolMaterials.UMBURAM, 1, -3.2f))));
    public static final DeferredItem<Item> UMBURAM_SHOVEL = ITEMS.register(
            "umburam_shovel", () -> new ShovelItem(NoxernaToolMaterials.UMBURAM,
                    new Item.Properties().attributes(ShovelItem.createAttributes(
                            NoxernaToolMaterials.UMBURAM, 1.5f, -3.2f))));
    public static final DeferredItem<Item> UMBURAM_SWORD = ITEMS.register(
            "umburam_sword", () -> new SwordItem(NoxernaToolMaterials.UMBURAM,
                    new Item.Properties().attributes(SwordItem.createAttributes(
                            NoxernaToolMaterials.UMBURAM, 2, -2.8f))));
    // Adamuna
    public static final DeferredItem<Item> ADAMUNA_AXE = ITEMS.register(
            "adamuna_axe", () -> new AxeItem(NoxernaToolMaterials.ADAMUNA,
                    new Item.Properties().attributes(AxeItem.createAttributes(
                            NoxernaToolMaterials.ADAMUNA, 4.5f, -3.2f))));
    public static final DeferredItem<Item> ADAMUNA_HOE = ITEMS.register(
            "adamuna_hoe", () -> new HoeItem(NoxernaToolMaterials.ADAMUNA,
                    new Item.Properties().attributes(HoeItem.createAttributes(
                            NoxernaToolMaterials.ADAMUNA, -1, -2.0f))));
    public static final DeferredItem<Item> ADAMUNA_PICKAXE = ITEMS.register(
            "adamuna_pickaxe", () -> new PickaxeItem(NoxernaToolMaterials.ADAMUNA,
                    new Item.Properties().attributes(PickaxeItem.createAttributes(
                            NoxernaToolMaterials.ADAMUNA, 1, -3.2f))));
    public static final DeferredItem<Item> ADAMUNA_SHOVEL = ITEMS.register(
            "adamuna_shovel", () -> new ShovelItem(NoxernaToolMaterials.FERREBRIS,
                    new Item.Properties().attributes(ShovelItem.createAttributes(
                            NoxernaToolMaterials.ADAMUNA, 1.5f, -3.2f))));
    public static final DeferredItem<Item> ADAMUNA_SWORD = ITEMS.register(
            "adamuna_sword", () -> new SwordItem(NoxernaToolMaterials.FERREBRIS,
                    new Item.Properties().attributes(SwordItem.createAttributes(
                            NoxernaToolMaterials.ADAMUNA, 3, -2.8f))));
    // Nihoxite
    public static final DeferredItem<Item> NIHOXITE_AXE = ITEMS.register(
            "nihoxite_axe", () -> new AxeItem(NoxernaToolMaterials.NIHOXITE,
                    new Item.Properties().attributes(AxeItem.createAttributes(
                            NoxernaToolMaterials.NIHOXITE, 4.5f, -3.2f))));
    public static final DeferredItem<Item> NIHOXITE_HOE = ITEMS.register(
            "nihoxite_hoe", () -> new HoeItem(NoxernaToolMaterials.NIHOXITE,
                    new Item.Properties().attributes(HoeItem.createAttributes(
                            NoxernaToolMaterials.NIHOXITE, -2, -2.0f))));
    public static final DeferredItem<Item> NIHOXITE_PICKAXE = ITEMS.register(
            "nihoxite_pickaxe", () -> new PickaxeItem(NoxernaToolMaterials.NIHOXITE,
                    new Item.Properties().attributes(PickaxeItem.createAttributes(
                            NoxernaToolMaterials.NIHOXITE, 1, -3.2f))));
    public static final DeferredItem<Item> NIHOXITE_SHOVEL = ITEMS.register(
            "nihoxite_shovel", () -> new ShovelItem(NoxernaToolMaterials.NIHOXITE,
                    new Item.Properties().attributes(ShovelItem.createAttributes(
                            NoxernaToolMaterials.NIHOXITE, 1.5f, -3.2f))));
    public static final DeferredItem<Item> NIHOXITE_SWORD = ITEMS.register(
            "nihoxite_sword", () -> new SwordItem(NoxernaToolMaterials.NIHOXITE,
                    new Item.Properties().attributes(SwordItem.createAttributes(
                            NoxernaToolMaterials.NIHOXITE, 3, -2.8f))));
    // Misc
    // Check your mailbox chucklenuts
    public static final DeferredItem<Item> PYROCHARGE = registerSimpleItem(
            "pyrocharge", new Item.Properties());
    public static final DeferredItem<Item> VITRALISK = registerSimpleItem(
            "vitralisk", new Item.Properties().stacksTo(16));

    // Armour, sorted by tier
    // Rockhide
    public static final DeferredItem<Item> ROCKHIDE_HELMET = ITEMS.register(
            "rockhide_helmet", () -> new ArmorItem(
                    NoxernaArmorMaterials.ROCKHIDE,
                    ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(8))
            ));
    public static final DeferredItem<Item> ROCKHIDE_CHESTPLATE = ITEMS.register(
            "rockhide_chestplate", () -> new ArmorItem(
                    NoxernaArmorMaterials.ROCKHIDE,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(8))
            ));
    public static final DeferredItem<Item> ROCKHIDE_LEGGINGS = ITEMS.register(
            "rockhide_leggings", () -> new ArmorItem(
                    NoxernaArmorMaterials.ROCKHIDE,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(8))
            ));
    public static final DeferredItem<Item> ROCKHIDE_BOOTS = ITEMS.register(
            "rockhide_boots", () -> new ArmorItem(
                    NoxernaArmorMaterials.ROCKHIDE,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(8))
            ));
    // Heart
    public static final DeferredItem<Item> HEART_HELMET = ITEMS.register(
            "heart_helmet", () -> new ArmorItem(
                    NoxernaArmorMaterials.HEART,
                    ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(26))
                            .rarity(Rarity.UNCOMMON)
            ));
    public static final DeferredItem<Item> HEART_CHESTPLATE = ITEMS.register(
            "heart_chestplate", () -> new ArmorItem(
                    NoxernaArmorMaterials.HEART,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(26))
                            .rarity(Rarity.UNCOMMON)
            ));
    public static final DeferredItem<Item> HEART_LEGGINGS = ITEMS.register(
            "heart_leggings", () -> new ArmorItem(
                    NoxernaArmorMaterials.HEART,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(26))
                            .rarity(Rarity.UNCOMMON)
            ));
    public static final DeferredItem<Item> HEART_BOOTS = ITEMS.register(
            "heart_boots", () -> new ArmorItem(
                    NoxernaArmorMaterials.HEART,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(26))
                            .rarity(Rarity.UNCOMMON)
            ));
    // Exoskeleton
    public static final DeferredItem<Item> EXOSKELETON_HELMET = ITEMS.register(
            "exoskeleton_helmet", () -> new ArmorItem(
                    NoxernaArmorMaterials.EXOSKELETON,
                    ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(23))
                            .rarity(Rarity.UNCOMMON)
            ));
    public static final DeferredItem<Item> EXOSKELETON_CHESTPLATE = ITEMS.register(
            "exoskeleton_chestplate", () -> new ArmorItem(
                    NoxernaArmorMaterials.EXOSKELETON,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(23))
                            .rarity(Rarity.UNCOMMON)
            ));
    public static final DeferredItem<Item> EXOSKELETON_LEGGINGS = ITEMS.register(
            "exoskeleton_leggings", () -> new ArmorItem(
                    NoxernaArmorMaterials.EXOSKELETON,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(23))
                            .rarity(Rarity.UNCOMMON)
            ));
    public static final DeferredItem<Item> EXOSKELETON_BOOTS = ITEMS.register(
            "exoskeleton_boots", () -> new ArmorItem(
                    NoxernaArmorMaterials.EXOSKELETON,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(23))
                            .rarity(Rarity.UNCOMMON)
            ));
    // Ferrebris
    public static final DeferredItem<Item> FERREBRIS_HELMET = ITEMS.register(
            "ferrebris_helmet", () -> new ArmorItem(
                    NoxernaArmorMaterials.FERREBRIS,
                    ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(23))
            ));
    public static final DeferredItem<Item> FERREBRIS_CHESTPLATE = ITEMS.register(
            "ferrebris_chestplate", () -> new ArmorItem(
                    NoxernaArmorMaterials.FERREBRIS,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(23))
            ));
    public static final DeferredItem<Item> FERREBRIS_LEGGINGS = ITEMS.register(
            "ferrebris_leggings", () -> new ArmorItem(
                    NoxernaArmorMaterials.FERREBRIS,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(23))
            ));
    public static final DeferredItem<Item> FERREBRIS_BOOTS = ITEMS.register(
            "ferrebris_boots", () -> new ArmorItem(
                    NoxernaArmorMaterials.FERREBRIS,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(23))
            ));
    // Umburam
    public static final DeferredItem<Item> UMBURAM_HELMET = ITEMS.register(
            "umburam_helmet", () -> new ArmorItem(
                    NoxernaArmorMaterials.UMBURAM,
                    ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(11))
            ));
    public static final DeferredItem<Item> UMBURAM_CHESTPLATE = ITEMS.register(
            "umburam_chestplate", () -> new ArmorItem(
                    NoxernaArmorMaterials.UMBURAM,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(11))
            ));
    public static final DeferredItem<Item> UMBURAM_LEGGINGS = ITEMS.register(
            "umburam_leggings", () -> new ArmorItem(
                    NoxernaArmorMaterials.UMBURAM,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(11))
            ));
    public static final DeferredItem<Item> UMBURAM_BOOTS = ITEMS.register(
            "umburam_boots", () -> new ArmorItem(
                    NoxernaArmorMaterials.UMBURAM,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(11))
            ));
    // Adamuna
    public static final DeferredItem<Item> ADAMUNA_HELMET = ITEMS.register(
            "adamuna_helmet", () -> new ArmorItem(
                    NoxernaArmorMaterials.ADAMUNA,
                    ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(50))
            ));
    public static final DeferredItem<Item> ADAMUNA_CHESTPLATE = ITEMS.register(
            "adamuna_chestplate", () -> new ArmorItem(
                    NoxernaArmorMaterials.ADAMUNA,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(50))
            ));
    public static final DeferredItem<Item> ADAMUNA_LEGGINGS = ITEMS.register(
            "adamuna_leggings", () -> new ArmorItem(
                    NoxernaArmorMaterials.ADAMUNA,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(50))
            ));
    public static final DeferredItem<Item> ADAMUNA_BOOTS = ITEMS.register(
            "adamuna_boots", () -> new ArmorItem(
                    NoxernaArmorMaterials.ADAMUNA,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(50))
            ));
    // Nihoxite
    public static final DeferredItem<Item> NIHOXITE_HELMET = ITEMS.register(
            "nihoxite_helmet", () -> new ArmorItem(
                    NoxernaArmorMaterials.NIHOXITE,
                    ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(56))
            ));
    public static final DeferredItem<Item> NIHOXITE_CHESTPLATE = ITEMS.register(
            "nihoxite_chestplate", () -> new ArmorItem(
                    NoxernaArmorMaterials.NIHOXITE,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(56))
            ));
    public static final DeferredItem<Item> NIHOXITE_LEGGINGS = ITEMS.register(
            "nihoxite_leggings", () -> new ArmorItem(
                    NoxernaArmorMaterials.NIHOXITE,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(56))
            ));
    public static final DeferredItem<Item> NIHOXITE_BOOTS = ITEMS.register(
            "nihoxite_boots", () -> new ArmorItem(
                    NoxernaArmorMaterials.NIHOXITE,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(56))
            ));
    // Advancement Dummy Items
    public static final DeferredItem<Item> ROOT = registerItemWithRarity(
            "root", Rarity.EPIC, new Item.Properties());
    public static final DeferredItem<Item> MINE_NATIVE_MINERALS = registerItemWithRarity(
            "mine_native_minerals", Rarity.EPIC, new Item.Properties());
    public static final DeferredItem<Item> COMPLETE_ALL_CHALLENGES = registerItemWithRarity(
            "complete_all_challenges", Rarity.EPIC, new Item.Properties());
    // Block Items
    // Xenon Wood set
    public static final DeferredItem<Item> XENON_LOG = registerBlockItem(
            "xenon_log", NoxernaBlocks.XENON_LOG);
    public static final DeferredItem<Item> XENON_WOOD = registerBlockItem(
            "xenon_wood", NoxernaBlocks.XENON_WOOD);
    public static final DeferredItem<Item> STRIPPED_XENON_LOG = registerBlockItem(
            "stripped_xenon_log", NoxernaBlocks.STRIPPED_XENON_LOG);
    public static final DeferredItem<Item> STRIPPED_XENON_WOOD = registerBlockItem(
            "stripped_xenon_wood", NoxernaBlocks.STRIPPED_XENON_WOOD);
    public static final DeferredItem<Item> XENON_PLANKS = registerBlockItem(
            "xenon_planks", NoxernaBlocks.XENON_PLANKS);
    public static final DeferredItem<Item> XENON_STAIRS = registerBlockItem(
            "xenon_stairs", NoxernaBlocks.XENON_STAIRS);
    public static final DeferredItem<Item> XENON_SLAB = registerBlockItem(
            "xenon_slab", NoxernaBlocks.XENON_SLAB);
    public static final DeferredItem<Item> XENON_FENCE = registerBlockItem(
            "xenon_fence", NoxernaBlocks.XENON_FENCE);
    public static final DeferredItem<Item> XENON_FENCE_GATE = registerBlockItem(
            "xenon_fence_gate", NoxernaBlocks.XENON_FENCE_GATE);
    public static final DeferredItem<Item> XENON_DOOR = registerBlockItem(
            "xenon_door", NoxernaBlocks.XENON_DOOR);
    public static final DeferredItem<Item> XENON_TRAPDOOR = registerBlockItem(
            "xenon_trapdoor", NoxernaBlocks.XENON_TRAPDOOR);
    public static final DeferredItem<Item> XENON_PRESSURE_PLATE = registerBlockItem(
            "xenon_pressure_plate", NoxernaBlocks.XENON_PRESSURE_PLATE);
    public static final DeferredItem<Item> XENON_BUTTON = registerBlockItem(
            "xenon_button", NoxernaBlocks.XENON_BUTTON);
    // Krypton Wood set
    public static final DeferredItem<Item> KRYPTON_LOG = registerBlockItem(
            "krypton_log", NoxernaBlocks.KRYPTON_LOG);
    public static final DeferredItem<Item> KRYPTON_WOOD = registerBlockItem(
            "krypton_wood", NoxernaBlocks.KRYPTON_WOOD);
    public static final DeferredItem<Item> STRIPPED_KRYPTON_LOG = registerBlockItem(
            "stripped_krypton_log", NoxernaBlocks.STRIPPED_KRYPTON_LOG);
    public static final DeferredItem<Item> STRIPPED_KRYPTON_WOOD = registerBlockItem(
            "stripped_krypton_wood", NoxernaBlocks.STRIPPED_KRYPTON_WOOD);
    public static final DeferredItem<Item> KRYPTON_PLANKS = registerBlockItem(
            "krypton_planks", NoxernaBlocks.KRYPTON_PLANKS);
    public static final DeferredItem<Item> KRYPTON_STAIRS = registerBlockItem(
            "krypton_stairs", NoxernaBlocks.KRYPTON_STAIRS);
    public static final DeferredItem<Item> KRYPTON_SLAB = registerBlockItem(
            "krypton_slab", NoxernaBlocks.KRYPTON_SLAB);
    public static final DeferredItem<Item> KRYPTON_FENCE = registerBlockItem(
            "krypton_fence", NoxernaBlocks.KRYPTON_FENCE);
    public static final DeferredItem<Item> KRYPTON_FENCE_GATE = registerBlockItem(
            "krypton_fence_gate", NoxernaBlocks.KRYPTON_FENCE_GATE);
    public static final DeferredItem<Item> KRYPTON_DOOR = registerBlockItem(
            "krypton_door", NoxernaBlocks.KRYPTON_DOOR);
    public static final DeferredItem<Item> KRYPTON_TRAPDOOR = registerBlockItem(
            "krypton_trapdoor", NoxernaBlocks.KRYPTON_TRAPDOOR);
    public static final DeferredItem<Item> KRYPTON_PRESSURE_PLATE = registerBlockItem(
            "krypton_pressure_plate", NoxernaBlocks.KRYPTON_PRESSURE_PLATE);
    public static final DeferredItem<Item> KRYPTON_BUTTON = registerBlockItem(
            "krypton_button", NoxernaBlocks.KRYPTON_BUTTON);
    // Argon Wood set
    public static final DeferredItem<Item> ARGON_PLANKS = registerBlockItem(
            "argon_planks", NoxernaBlocks.ARGON_PLANKS);
    public static final DeferredItem<Item> ARGON_STAIRS = registerBlockItem(
            "argon_stairs", NoxernaBlocks.ARGON_STAIRS);
    // Neon Wood set
    public static final DeferredItem<Item> NEON_PLANKS = registerBlockItem(
            "neon_planks", NoxernaBlocks.NEON_PLANKS);
    // Soltra Block set
    public static final DeferredItem<Item> SOLTRA = registerBlockItem(
            "soltra", NoxernaBlocks.SOLTRA);
    public static final DeferredItem<Item> POLISHED_SOLTRA = registerBlockItem(
            "polished_soltra", NoxernaBlocks.POLISHED_SOLTRA);
    public static final DeferredItem<Item> SOLTRA_BRICKS = registerBlockItem(
            "soltra_bricks", NoxernaBlocks.SOLTRA_BRICKS);
    public static final DeferredItem<Item> SOLTRA_PEBBLE = registerBlockItem(
            "soltra_pebble", NoxernaBlocks.SOLTRA_PEBBLE);
    // Noxum Block set
    public static final DeferredItem<Item> NOXUM = registerBlockItem(
            "noxum", NoxernaBlocks.NOXUM);
    public static final DeferredItem<Item> NOXUM_STAIRS = registerBlockItem(
            "noxum_stairs", NoxernaBlocks.NOXUM_STAIRS);
    public static final DeferredItem<Item> NOXUM_SLAB = registerBlockItem(
            "noxum_slab", NoxernaBlocks.NOXUM_SLAB);
    public static final DeferredItem<Item> NOXUM_WALL = registerBlockItem(
            "noxum_wall", NoxernaBlocks.NOXUM_WALL);
    public static final DeferredItem<Item> NOXUM_PRESSURE_PLATE = registerBlockItem(
            "noxum_pressure_plate", NoxernaBlocks.NOXUM_PRESSURE_PLATE);
    public static final DeferredItem<Item> NOXUM_BUTTON = registerBlockItem(
            "noxum_button", NoxernaBlocks.NOXUM_BUTTON);
    public static final DeferredItem<Item> NOXUM_PEBBLE = registerBlockItem(
            "noxum_pebble", NoxernaBlocks.NOXUM_PEBBLE);
    // Polished
    public static final DeferredItem<Item> POLISHED_NOXUM = registerBlockItem(
            "polished_noxum", NoxernaBlocks.POLISHED_NOXUM);
    public static final DeferredItem<Item> POLISHED_NOXUM_STAIRS = registerBlockItem(
            "polished_noxum_stairs", NoxernaBlocks.POLISHED_NOXUM_STAIRS);
    public static final DeferredItem<Item> POLISHED_NOXUM_SLAB = registerBlockItem(
            "polished_noxum_slab", NoxernaBlocks.POLISHED_NOXUM_SLAB);
    public static final DeferredItem<Item> POLISHED_NOXUM_WALL = registerBlockItem(
            "polished_noxum_wall", NoxernaBlocks.POLISHED_NOXUM_WALL);
    // Bricks
    public static final DeferredItem<Item> NOXUM_BRICKS = registerBlockItem(
            "noxum_bricks", NoxernaBlocks.NOXUM_BRICKS);
    public static final DeferredItem<Item> NOXUM_BRICK_STAIRS = registerBlockItem(
            "noxum_brick_stairs", NoxernaBlocks.NOXUM_BRICK_STAIRS);
    public static final DeferredItem<Item> NOXUM_BRICK_SLAB = registerBlockItem(
            "noxum_brick_slab", NoxernaBlocks.NOXUM_BRICK_SLAB);
    public static final DeferredItem<Item> NOXUM_BRICK_WALL = registerBlockItem(
            "noxum_brick_wall", NoxernaBlocks.NOXUM_BRICK_WALL);

    // Aestum Block set
    public static final DeferredItem<Item> AESTUM = registerBlockItem(
            "aestum", NoxernaBlocks.AESTUM);
    public static final DeferredItem<Item> POLISHED_AESTUM = registerBlockItem(
            "polished_aestum", NoxernaBlocks.POLISHED_AESTUM);
    public static final DeferredItem<Item> AESTUM_BRICKS = registerBlockItem(
            "aestum_bricks", NoxernaBlocks.AESTUM_BRICKS);
    public static final DeferredItem<Item> AESTUM_PEBBLE = registerBlockItem(
            "aestum_pebble", NoxernaBlocks.AESTUM_PEBBLE);
    // Inetra Block set
    public static final DeferredItem<Item> INETRA = registerBlockItem(
            "inetra", NoxernaBlocks.INETRA);
    public static final DeferredItem<Item> POLISHED_INETRA = registerBlockItem(
            "polished_inetra", NoxernaBlocks.POLISHED_INETRA);
    public static final DeferredItem<Item> INETRA_BRICKS = registerBlockItem(
            "inetra_bricks", NoxernaBlocks.INETRA_BRICKS);
    public static final DeferredItem<Item> INETRA_PEBBLE = registerBlockItem(
            "inetra_pebble", NoxernaBlocks.INETRA_PEBBLE);
    // Material Storage Blocks
    // Ferrebris
    public static final DeferredItem<Item> FERREBRIS_BLOCK = registerBlockItem(
            "ferrebris_block", NoxernaBlocks.FERREBRIS_BLOCK);
    public static final DeferredItem<Item> FERREBRIS_BARS = registerBlockItem(
            "ferrebris_bars", NoxernaBlocks.FERREBRIS_BARS);
    public static final DeferredItem<Item> FERREBRIS_PLATING = registerBlockItem(
            "ferrebris_plating", NoxernaBlocks.FERREBRIS_PLATING);
    public static final DeferredItem<Item> FERREBRIS_PLATING_STAIRS = registerBlockItem(
            "ferrebris_plating_stairs", NoxernaBlocks.FERREBRIS_PLATING_STAIRS);
    public static final DeferredItem<Item> FERREBRIS_PLATING_SLAB = registerBlockItem(
            "ferrebris_plating_slab", NoxernaBlocks.FERREBRIS_PLATING_SLAB);
    public static final DeferredItem<Item> FERREBRIS_PLATING_WALL = registerBlockItem(
            "ferrebris_plating_wall", NoxernaBlocks.FERREBRIS_PLATING_WALL);
    public static final DeferredItem<Item> UMBURAM_BLOCK = registerBlockItem(
            "umburam_block", NoxernaBlocks.UMBURAM_BLOCK);
    public static final DeferredItem<Item> UMBURAM_PLATING = registerBlockItem(
            "umburam_plating", NoxernaBlocks.UMBURAM_PLATING);
    public static final DeferredItem<Item> TENERYL_BLOCK = registerBlockItem(
            "teneryl_block", NoxernaBlocks.TENERYL_BLOCK);
    public static final DeferredItem<Item> ADAMUNA_BLOCK = registerBlockItem(
            "adamuna_block", NoxernaBlocks.ADAMUNA_BLOCK);
    public static final DeferredItem<Item> INPERLUM_BLOCK = registerBlockItem(
            "inperlum_block", NoxernaBlocks.INPERLUM_BLOCK);
    public static final DeferredItem<Item> INPERLUM_PLATING = registerBlockItem(
            "inperlum_plating", NoxernaBlocks.INPERLUM_PLATING);
    public static final DeferredItem<Item> NIHOXITE_BLOCK = registerBlockItem(
            "nihoxite_block", NoxernaBlocks.NIHOXITE_BLOCK);
    public static final DeferredItem<Item> NIHOXITE_PLATING = registerBlockItem(
            "nihoxite_plating", NoxernaBlocks.NIHOXITE_PLATING);
    public static final DeferredItem<Item> VITRAGOR_BLOCK = registerBlockItem(
            "vitragor_block", NoxernaBlocks.VITRAGOR_BLOCK);
    public static final DeferredItem<Item> OBSCUPRUM_BLOCK = registerBlockItem(
            "obscuprum_block", NoxernaBlocks.OBSCUPRUM_BLOCK);
    public static final DeferredItem<Item> EXPOSED_OBSCUPRUM_BLOCK = registerBlockItem(
            "exposed_obscuprum_block", NoxernaBlocks.EXPOSED_OBSCUPRUM_BLOCK);
    public static final DeferredItem<Item> WEATHERED_OBSCUPRUM_BLOCK = registerBlockItem(
            "weathered_obscuprum_block", NoxernaBlocks.WEATHERED_OBSCUPRUM_BLOCK);
    public static final DeferredItem<Item> OXIDIZED_OBSCUPRUM_BLOCK = registerBlockItem(
            "oxidized_obscuprum_block", NoxernaBlocks.OXIDIZED_OBSCUPRUM_BLOCK);
    public static final DeferredItem<Item> CUT_OBSCUPRUM_BLOCK = registerBlockItem(
            "cut_obscuprum_block", NoxernaBlocks.CUT_OBSCUPRUM_BLOCK);
    public static final DeferredItem<Item> EXPOSED_CUT_OBSCUPRUM_BLOCK = registerBlockItem(
            "exposed_cut_obscuprum_block", NoxernaBlocks.EXPOSED_CUT_OBSCUPRUM_BLOCK);
    public static final DeferredItem<Item> WEATHERED_CUT_OBSCUPRUM_BLOCK = registerBlockItem(
            "weathered_cut_obscuprum_block", NoxernaBlocks.WEATHERED_CUT_OBSCUPRUM_BLOCK);
    public static final DeferredItem<Item> OXIDIZED_CUT_OBSCUPRUM_BLOCK = registerBlockItem(
            "oxidized_cut_obscuprum_block", NoxernaBlocks.OXIDIZED_CUT_OBSCUPRUM_BLOCK);
    public static final DeferredItem<Item> OBSCUPRUM_BRICKS = registerBlockItem(
            "obscuprum_bricks", NoxernaBlocks.OBSCUPRUM_BRICKS);
    public static final DeferredItem<Item> EXPOSED_OBSCUPRUM_BRICKS = registerBlockItem(
            "exposed_obscuprum_bricks", NoxernaBlocks.EXPOSED_OBSCUPRUM_BRICKS);
    public static final DeferredItem<Item> WEATHERED_OBSCUPRUM_BRICKS = registerBlockItem(
            "weathered_obscuprum_bricks", NoxernaBlocks.WEATHERED_OBSCUPRUM_BRICKS);
    public static final DeferredItem<Item> OXIDIZED_OBSCUPRUM_BRICKS = registerBlockItem(
            "oxidized_obscuprum_bricks", NoxernaBlocks.OXIDIZED_OBSCUPRUM_BRICKS);
    public static final DeferredItem<Item> OBSCUPRUM_PLATING = registerBlockItem(
            "obscuprum_plating", NoxernaBlocks.OBSCUPRUM_PLATING);
    public static final DeferredItem<Item> EXPOSED_OBSCUPRUM_PLATING = registerBlockItem(
            "exposed_obscuprum_plating", NoxernaBlocks.EXPOSED_OBSCUPRUM_PLATING);
    public static final DeferredItem<Item> WEATHERED_OBSCUPRUM_PLATING = registerBlockItem(
            "weathered_obscuprum_plating", NoxernaBlocks.WEATHERED_OBSCUPRUM_PLATING);
    public static final DeferredItem<Item> OXIDIZED_OBSCUPRUM_PLATING = registerBlockItem(
            "oxidized_obscuprum_plating", NoxernaBlocks.OXIDIZED_OBSCUPRUM_PLATING);
    // Coloured Blocks
    public static final DeferredItem<Item> ARGON_CONCRETE = registerBlockItem(
            "argon_concrete", NoxernaBlocks.ARGON_CONCRETE);
    public static final DeferredItem<Item> ARGON_CONCRETE_POWDER = registerBlockItem(
            "argon_concrete_powder", NoxernaBlocks.ARGON_CONCRETE_POWDER);
    // Special Dimension Block Items
    public static final DeferredItem<Item> VOIDROCK = registerBlockItem(
            "voidrock", NoxernaBlocks.VOIDROCK);
    public static final DeferredItem<Item> NOXERNA_PORTAL_FRAME = registerBlockItem(
            "noxerna_portal_frame", NoxernaBlocks.NOXERNA_PORTAL_FRAME);
}
