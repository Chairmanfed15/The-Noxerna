package net.chairmanfed.noxerna.item;

import net.chairmanfed.noxerna.TheNoxerna;
import net.chairmanfed.noxerna.item.equipment.armor.NoxernaArmorMaterials;
import net.chairmanfed.noxerna.data.resources.registries.NoxernaTrimPatterns;
import net.chairmanfed.noxerna.item.equipment.tools.TieredShieldItem;
import net.chairmanfed.noxerna.item.miscellaneous.NoxernaSmithingTemplateItem;
import net.chairmanfed.noxerna.item.equipment.tools.NoxernaToolMaterials;
import net.chairmanfed.noxerna.item.equipment.tools.PickadzeItem;
import net.chairmanfed.noxerna.block.NoxernaBlocks;
import net.minecraft.core.component.DataComponents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.enchantment.ItemEnchantments;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class NoxernaItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TheNoxerna.MODID);
    public static DeferredItem<Item> registerSimpleItem(String name) {
        return ITEMS.register(name, () -> new Item(new Item.Properties()));
    }
    public static DeferredItem<Item> registerSimpleItemWithRarity(String name, Rarity rarity) {
        return ITEMS.register(name, () -> new Item(new Item.Properties().rarity(rarity)));
    }
    public static DeferredItem<Item> registerSimpleItemWithStackSize(String name, Integer stackSize) {
        return ITEMS.register(name, () -> new Item(new Item.Properties().stacksTo(stackSize)));
    }
    public static DeferredItem<Item> registerBlockItem(String name, Supplier<Block> block) {
        return ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    @SuppressWarnings("Unused")
    // Intermediates
    public static final DeferredItem<Item> LUMAI_CRYSTAL = registerSimpleItem(
            "lumai_crystal");
    public static final DeferredItem<Item> LUMAI_FUEL_CELL = registerBlockItem(
            "lumai_fuel_cell", NoxernaBlocks.LUMAI_FUEL_CELL);
    public static final DeferredItem<Item> RAW_FERREBRIS = registerSimpleItem(
            "raw_ferrebris");
    public static final DeferredItem<Item> RAW_OBSCUPRUM = registerSimpleItem(
            "raw_obscuprum");
    public static final DeferredItem<Item> RAW_UMBURAM = registerSimpleItem(
            "raw_umburam");
    public static final DeferredItem<Item> RAW_INPERLUM = registerSimpleItem(
            "raw_inperlum");
    public static final DeferredItem<Item> TENERYL = registerSimpleItem(
            "teneryl");
    public static final DeferredItem<Item> ADAMUNA = registerSimpleItem(
            "adamuna");
    public static final DeferredItem<Item> VITRAGOR = registerSimpleItem(
            "vitragor");
    public static final DeferredItem<Item> FERREBRIS_NUGGET = registerSimpleItem(
            "ferrebris_nugget");
    public static final DeferredItem<Item> OBSCUPRUM_NUGGET = registerSimpleItem(
            "obscuprum_nugget");
    public static final DeferredItem<Item> UMBURAM_NUGGET = registerSimpleItem(
            "umburam_nugget");
    public static final DeferredItem<Item> INPERLUM_NUGGET = registerSimpleItem(
            "inperlum_nugget");
    public static final DeferredItem<Item> NIHOXITE_NUGGET = registerSimpleItem(
            "nihoxite_nugget");
    public static final DeferredItem<Item> FERREBRIS_INGOT = registerSimpleItem(
            "ferrebris_ingot");
    public static final DeferredItem<Item> OBSCUPRUM_INGOT = registerSimpleItem(
            "obscuprum_ingot");
    public static final DeferredItem<Item> UMBURAM_INGOT = registerSimpleItem(
            "umburam_ingot");
    public static final DeferredItem<Item> INPERLUM_INGOT = registerSimpleItem(
            "inperlum_ingot");
    public static final DeferredItem<Item> NIHOXITE_INGOT = registerSimpleItem(
            "nihoxite_ingot");
    public static final DeferredItem<Item> MYSTERIOUS_SCRAP = registerSimpleItemWithRarity(
            "mysterious_scrap", Rarity.UNCOMMON);
    public static final DeferredItem<Item> MYSTERIOUS_ALLOY_PLATE = registerSimpleItemWithRarity(
            "mysterious_alloy_plate", Rarity.UNCOMMON);
    public static final DeferredItem<Item> NOBLEWOOD_STICK = registerSimpleItem(
            "noblewood_stick");
    public static final DeferredItem<Item> GLOWGRAIN = registerSimpleItem(
            "glowgrain");
    public static final DeferredItem<Item> ROCKHIDE = registerSimpleItem(
            "rockhide");
    public static final DeferredItem<Item> SULAZE_CORE = registerSimpleItem(
            "sulaze_core");
    public static final DeferredItem<Item> XENON_DYE = registerSimpleItem(
            "xenon_dye");
    public static final DeferredItem<Item> KRYPTON_DYE = registerSimpleItem(
            "krypton_dye");
    public static final DeferredItem<Item> ARGON_DYE = registerSimpleItem(
            "argon_dye");
    public static final DeferredItem<Item> NEON_DYE = registerSimpleItem(
            "neon_dye");
    public static final DeferredItem<Item> NOBLEWOOD_BOWL = registerSimpleItem(
            "noblewood_bowl");
    public static final DeferredItem<Item> CUT_TENERYL = registerSimpleItem(
            "cut_teneryl");
    public static final DeferredItem<Item> ENERGIZED_TENERYL_DRIVE = ITEMS.register(
            "energized_teneryl_drive", () -> new Item(
                    new Item.Properties()
                    .stacksTo(1)
                    .rarity(Rarity.UNCOMMON)
                    .component(DataComponents.STORED_ENCHANTMENTS, ItemEnchantments.EMPTY)
                    .component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));
    public static final DeferredItem<Item> VITRAGOR_DUST = registerSimpleItem(
            "vitragor_dust");
    public static final DeferredItem<Item> SULAZE_POWDER = registerSimpleItem(
            "sulaze_powder");
    public static final DeferredItem<Item> NIHOXITE_UPGRADE_SMITHING_TEMPLATE = ITEMS.register(
            "nihoxite_upgrade_smithing_template",
            () -> NoxernaSmithingTemplateItem.createNihoxiteUpgradeTemplate());
    public static final DeferredItem<Item> EXOTIC_ARMOR_TRIM_SMITHING_TEMPLATE = ITEMS.register(
            "exotic_armor_trim_smithing_template",
            ()-> NoxernaSmithingTemplateItem.createArmorTrimTemplate(NoxernaTrimPatterns.EXOTIC));

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
    public static final DeferredItem<Item> PYROCHARGE = registerSimpleItem(
            "pyrocharge");
    public static final DeferredItem<Item> PICKADZE = ITEMS.register(
            "pickadze", ()-> new PickadzeItem(NoxernaToolMaterials.OBSCUPRUM,
                    new Item.Properties().attributes(PickadzeItem.createAttributes(
                            NoxernaToolMaterials.OBSCUPRUM, 1, -3.2f))));
    public static final DeferredItem<Item> VITRALISK = registerSimpleItemWithStackSize(
            "vitralisk", 16);
    public static final DeferredItem<Item> FERREBRIS_SHIELD = ITEMS.register(
            "ferrebris_shield", ()-> new TieredShieldItem(NoxernaToolMaterials.FERREBRIS,
                    new Item.Properties()));

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
    private static final ResourceLocation EXOSKELETON_KNOCKBACK =
            ResourceLocation.fromNamespaceAndPath(TheNoxerna.MODID, "exoskeleton.attack_knockback");
    private static final ResourceLocation EXOSKELETON_MINING_EFFICIENCY =
            ResourceLocation.fromNamespaceAndPath(TheNoxerna.MODID, "exoskeleton.mining_efficiency");
    public static final DeferredItem<Item> EXOSKELETON_HELMET = ITEMS.register(
            "exoskeleton_helmet", () -> new ArmorItem(
                    NoxernaArmorMaterials.EXOSKELETON,
                    ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(23))
                            .rarity(Rarity.UNCOMMON)
                            .attributes(ItemAttributeModifiers.builder()
                                    .add(Attributes.ATTACK_KNOCKBACK,
                                            new AttributeModifier(EXOSKELETON_KNOCKBACK, 1.0f,
                                                    AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                                    .add(Attributes.BLOCK_BREAK_SPEED,
                                            new AttributeModifier(EXOSKELETON_MINING_EFFICIENCY, 1.0,
                                                    AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                                    .build())));
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
    public static final DeferredItem<Item> ROOT = registerSimpleItemWithRarity(
            "root", Rarity.EPIC);
    public static final DeferredItem<Item> AWAKEN_MEGATOMATON = registerSimpleItemWithRarity(
            "awaken_megatomaton", Rarity.EPIC);
    public static final DeferredItem<Item> MINE_NATIVE_MINERALS = registerSimpleItemWithRarity(
            "mine_native_minerals", Rarity.EPIC);
    public static final DeferredItem<Item> DEFEAT_MEGATOMATON = registerSimpleItemWithRarity(
            "defeat_megatomaton", Rarity.EPIC);
    public static final DeferredItem<Item> COMPLETE_ALL_CHALLENGES = registerSimpleItemWithRarity(
            "complete_all_challenges", Rarity.EPIC);
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
    public static final DeferredItem<Item> ARGON_LOG = registerBlockItem(
            "argon_log", NoxernaBlocks.ARGON_LOG);
    public static final DeferredItem<Item> ARGON_WOOD = registerBlockItem(
            "argon_wood", NoxernaBlocks.ARGON_WOOD);
    public static final DeferredItem<Item> STRIPPED_ARGON_LOG = registerBlockItem(
            "stripped_argon_log", NoxernaBlocks.STRIPPED_ARGON_LOG);
    public static final DeferredItem<Item> STRIPPED_ARGON_WOOD = registerBlockItem(
            "stripped_argon_wood", NoxernaBlocks.STRIPPED_ARGON_WOOD);
    public static final DeferredItem<Item> ARGON_PLANKS = registerBlockItem(
            "argon_planks", NoxernaBlocks.ARGON_PLANKS);
    public static final DeferredItem<Item> ARGON_STAIRS = registerBlockItem(
            "argon_stairs", NoxernaBlocks.ARGON_STAIRS);
    public static final DeferredItem<Item> ARGON_SLAB = registerBlockItem(
            "argon_slab", NoxernaBlocks.ARGON_SLAB);
    public static final DeferredItem<Item> ARGON_FENCE = registerBlockItem(
            "argon_fence", NoxernaBlocks.ARGON_FENCE);
    public static final DeferredItem<Item> ARGON_FENCE_GATE = registerBlockItem(
            "argon_fence_gate", NoxernaBlocks.ARGON_FENCE_GATE);
    public static final DeferredItem<Item> ARGON_DOOR = registerBlockItem(
            "argon_door", NoxernaBlocks.ARGON_DOOR);
    public static final DeferredItem<Item> ARGON_TRAPDOOR = registerBlockItem(
            "argon_trapdoor", NoxernaBlocks.ARGON_TRAPDOOR);
    public static final DeferredItem<Item> ARGON_PRESSURE_PLATE = registerBlockItem(
            "argon_pressure_plate", NoxernaBlocks.ARGON_PRESSURE_PLATE);
    public static final DeferredItem<Item> ARGON_BUTTON = registerBlockItem(
            "argon_button", NoxernaBlocks.ARGON_BUTTON);
    // Neon Wood set
    public static final DeferredItem<Item> NEON_LOG = registerBlockItem(
            "neon_log", NoxernaBlocks.NEON_LOG);
    public static final DeferredItem<Item> NEON_WOOD = registerBlockItem(
            "neon_wood", NoxernaBlocks.NEON_WOOD);
    public static final DeferredItem<Item> STRIPPED_NEON_LOG = registerBlockItem(
            "stripped_neon_log", NoxernaBlocks.STRIPPED_NEON_LOG);
    public static final DeferredItem<Item> STRIPPED_NEON_WOOD = registerBlockItem(
            "stripped_neon_wood", NoxernaBlocks.STRIPPED_NEON_WOOD);
    public static final DeferredItem<Item> NEON_PLANKS = registerBlockItem(
            "neon_planks", NoxernaBlocks.NEON_PLANKS);
    public static final DeferredItem<Item> NEON_STAIRS = registerBlockItem(
            "neon_stairs", NoxernaBlocks.NEON_STAIRS);
    public static final DeferredItem<Item> NEON_SLAB = registerBlockItem(
            "neon_slab", NoxernaBlocks.NEON_SLAB);
    public static final DeferredItem<Item> NEON_FENCE = registerBlockItem(
            "neon_fence", NoxernaBlocks.NEON_FENCE);
    public static final DeferredItem<Item> NEON_FENCE_GATE = registerBlockItem(
            "neon_fence_gate", NoxernaBlocks.NEON_FENCE_GATE);
    public static final DeferredItem<Item> NEON_DOOR = registerBlockItem(
            "neon_door", NoxernaBlocks.NEON_DOOR);
    public static final DeferredItem<Item> NEON_TRAPDOOR = registerBlockItem(
            "neon_trapdoor", NoxernaBlocks.NEON_TRAPDOOR);
    public static final DeferredItem<Item> NEON_PRESSURE_PLATE = registerBlockItem(
            "neon_pressure_plate", NoxernaBlocks.NEON_PRESSURE_PLATE);
    public static final DeferredItem<Item> NEON_BUTTON = registerBlockItem(
            "neon_button", NoxernaBlocks.NEON_BUTTON);
    // Soltra Block set
    public static final DeferredItem<Item> SOLTRA = registerBlockItem(
            "soltra", NoxernaBlocks.SOLTRA);
    public static final DeferredItem<Item> SOLTRA_STAIRS = registerBlockItem(
            "soltra_stairs", NoxernaBlocks.SOLTRA_STAIRS);
    public static final DeferredItem<Item> SOLTRA_SLAB = registerBlockItem(
            "soltra_slab", NoxernaBlocks.SOLTRA_SLAB);
    public static final DeferredItem<Item> SOLTRA_WALL = registerBlockItem(
            "soltra_wall", NoxernaBlocks.SOLTRA_WALL);
    public static final DeferredItem<Item> SOLTRA_PRESSURE_PLATE = registerBlockItem(
            "soltra_pressure_plate", NoxernaBlocks.SOLTRA_PRESSURE_PLATE);
    public static final DeferredItem<Item> SOLTRA_BUTTON = registerBlockItem(
            "soltra_button", NoxernaBlocks.SOLTRA_BUTTON);
    public static final DeferredItem<Item> POLISHED_SOLTRA = registerBlockItem(
            "polished_soltra", NoxernaBlocks.POLISHED_SOLTRA);
    public static final DeferredItem<Item> POLISHED_SOLTRA_STAIRS = registerBlockItem(
            "polished_soltra_stairs", NoxernaBlocks.POLISHED_SOLTRA_STAIRS);
    public static final DeferredItem<Item> POLISHED_SOLTRA_SLAB = registerBlockItem(
            "polished_soltra_slab", NoxernaBlocks.POLISHED_SOLTRA_SLAB);
    public static final DeferredItem<Item> POLISHED_SOLTRA_WALL = registerBlockItem(
            "polished_soltra_wall", NoxernaBlocks.POLISHED_SOLTRA_WALL);
    public static final DeferredItem<Item> SOLTRA_BRICKS = registerBlockItem(
            "soltra_bricks", NoxernaBlocks.SOLTRA_BRICKS);
    public static final DeferredItem<Item> SOLTRA_BRICK_STAIRS = registerBlockItem(
            "soltra_brick_stairs", NoxernaBlocks.SOLTRA_BRICK_STAIRS);
    public static final DeferredItem<Item> SOLTRA_BRICK_SLAB = registerBlockItem(
            "soltra_brick_slab", NoxernaBlocks.SOLTRA_BRICK_SLAB);
    public static final DeferredItem<Item> SOLTRA_BRICK_WALL = registerBlockItem(
            "soltra_brick_wall", NoxernaBlocks.SOLTRA_BRICK_WALL);
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
    public static final DeferredItem<Item> AESTUM_STAIRS = registerBlockItem(
            "aestum_stairs", NoxernaBlocks.AESTUM_STAIRS);
    public static final DeferredItem<Item> AESTUM_SLAB = registerBlockItem(
            "aestum_slab", NoxernaBlocks.AESTUM_SLAB);
    public static final DeferredItem<Item> AESTUM_WALL = registerBlockItem(
            "aestum_wall", NoxernaBlocks.AESTUM_WALL);
    public static final DeferredItem<Item> AESTUM_PRESSURE_PLATE = registerBlockItem(
            "aestum_pressure_plate", NoxernaBlocks.AESTUM_PRESSURE_PLATE);
    public static final DeferredItem<Item> AESTUM_BUTTON = registerBlockItem(
            "aestum_button", NoxernaBlocks.AESTUM_BUTTON);
    public static final DeferredItem<Item> AESTUM_PEBBLE = registerBlockItem(
            "aestum_pebble", NoxernaBlocks.AESTUM_PEBBLE);
    // Polished
    public static final DeferredItem<Item> POLISHED_AESTUM = registerBlockItem(
            "polished_aestum", NoxernaBlocks.POLISHED_AESTUM);
    public static final DeferredItem<Item> POLISHED_AESTUM_STAIRS = registerBlockItem(
            "polished_aestum_stairs", NoxernaBlocks.POLISHED_AESTUM_STAIRS);
    public static final DeferredItem<Item> POLISHED_AESTUM_SLAB = registerBlockItem(
            "polished_aestum_slab", NoxernaBlocks.POLISHED_AESTUM_SLAB);
    public static final DeferredItem<Item> POLISHED_AESTUM_WALL = registerBlockItem(
            "polished_aestum_wall", NoxernaBlocks.POLISHED_AESTUM_WALL);
    // Bricks
    public static final DeferredItem<Item> AESTUM_BRICKS = registerBlockItem(
            "aestum_bricks", NoxernaBlocks.AESTUM_BRICKS);
    public static final DeferredItem<Item> AESTUM_BRICK_STAIRS = registerBlockItem(
            "aestum_brick_stairs", NoxernaBlocks.AESTUM_BRICK_STAIRS);
    public static final DeferredItem<Item> AESTUM_BRICK_SLAB = registerBlockItem(
            "aestum_brick_slab", NoxernaBlocks.AESTUM_BRICK_SLAB);
    public static final DeferredItem<Item> AESTUM_BRICK_WALL = registerBlockItem(
            "aestum_brick_wall", NoxernaBlocks.AESTUM_BRICK_WALL);
    // Inetra Block set
    public static final DeferredItem<Item> INETRA = registerBlockItem(
            "inetra", NoxernaBlocks.INETRA);
    public static final DeferredItem<Item> INETRA_STAIRS = registerBlockItem(
            "inetra_stairs", NoxernaBlocks.INETRA_STAIRS);
    public static final DeferredItem<Item> INETRA_SLAB = registerBlockItem(
            "inetra_slab", NoxernaBlocks.INETRA_SLAB);
    public static final DeferredItem<Item> INETRA_WALL = registerBlockItem(
            "inetra_wall", NoxernaBlocks.INETRA_WALL);
    public static final DeferredItem<Item> INETRA_PRESSURE_PLATE = registerBlockItem(
            "inetra_pressure_plate", NoxernaBlocks.INETRA_PRESSURE_PLATE);
    public static final DeferredItem<Item> INETRA_BUTTON = registerBlockItem(
            "inetra_button", NoxernaBlocks.INETRA_BUTTON);
    public static final DeferredItem<Item> POLISHED_INETRA = registerBlockItem(
            "polished_inetra", NoxernaBlocks.POLISHED_INETRA);
    public static final DeferredItem<Item> POLISHED_INETRA_STAIRS = registerBlockItem(
            "polished_inetra_stairs", NoxernaBlocks.POLISHED_INETRA_STAIRS);
    public static final DeferredItem<Item> POLISHED_INETRA_SLAB = registerBlockItem(
            "polished_inetra_slab", NoxernaBlocks.POLISHED_INETRA_SLAB);
    public static final DeferredItem<Item> POLISHED_INETRA_WALL = registerBlockItem(
            "polished_inetra_wall", NoxernaBlocks.POLISHED_INETRA_WALL);
    public static final DeferredItem<Item> INETRA_BRICKS = registerBlockItem(
            "inetra_bricks", NoxernaBlocks.INETRA_BRICKS);
    public static final DeferredItem<Item> INETRA_BRICK_STAIRS = registerBlockItem(
            "inetra_brick_stairs", NoxernaBlocks.INETRA_BRICK_STAIRS);
    public static final DeferredItem<Item> INETRA_BRICK_SLAB = registerBlockItem(
            "inetra_brick_slab", NoxernaBlocks.INETRA_BRICK_SLAB);
    public static final DeferredItem<Item> INETRA_BRICK_WALL = registerBlockItem(
            "inetra_brick_wall", NoxernaBlocks.INETRA_BRICK_WALL);
    public static final DeferredItem<Item> INETRA_PEBBLE = registerBlockItem(
            "inetra_pebble", NoxernaBlocks.INETRA_PEBBLE);
    // Material Storage & Decorative Blocks
    // Iron
    public static final DeferredItem<Item> IRON_PLATING = registerBlockItem(
            "iron_plating", NoxernaBlocks.IRON_PLATING);
    public static final DeferredItem<Item> IRON_PLATING_STAIRS = registerBlockItem(
            "iron_plating_stairs", NoxernaBlocks.IRON_PLATING_STAIRS);
    public static final DeferredItem<Item> IRON_PLATING_SLAB = registerBlockItem(
            "iron_plating_slab", NoxernaBlocks.IRON_PLATING_SLAB);
    public static final DeferredItem<Item> IRON_PLATING_WALL = registerBlockItem(
            "iron_plating_wall", NoxernaBlocks.IRON_PLATING_WALL);
    // Gold
    public static final DeferredItem<Item> GOLD_PLATING = registerBlockItem(
            "gold_plating", NoxernaBlocks.GOLD_PLATING);
    public static final DeferredItem<Item> GOLD_PLATING_STAIRS = registerBlockItem(
            "gold_plating_stairs", NoxernaBlocks.GOLD_PLATING_STAIRS);
    public static final DeferredItem<Item> GOLD_PLATING_SLAB = registerBlockItem(
            "gold_plating_slab", NoxernaBlocks.GOLD_PLATING_SLAB);
    public static final DeferredItem<Item> GOLD_PLATING_WALL = registerBlockItem(
            "gold_plating_wall", NoxernaBlocks.GOLD_PLATING_WALL);
    // Netherite
    public static final DeferredItem<Item> NETHERITE_PLATING = registerBlockItem(
            "netherite_plating", NoxernaBlocks.NETHERITE_PLATING);
    public static final DeferredItem<Item> NETHERITE_PLATING_STAIRS = registerBlockItem(
            "netherite_plating_stairs", NoxernaBlocks.NETHERITE_PLATING_STAIRS);
    public static final DeferredItem<Item> NETHERITE_PLATING_SLAB = registerBlockItem(
            "netherite_plating_slab", NoxernaBlocks.NETHERITE_PLATING_SLAB);
    public static final DeferredItem<Item> NETHERITE_PLATING_WALL = registerBlockItem(
            "netherite_plating_wall", NoxernaBlocks.NETHERITE_PLATING_WALL);
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
    // Umburam
    public static final DeferredItem<Item> UMBURAM_BLOCK = registerBlockItem(
            "umburam_block", NoxernaBlocks.UMBURAM_BLOCK);
    public static final DeferredItem<Item> UMBURAM_PLATING = registerBlockItem(
            "umburam_plating", NoxernaBlocks.UMBURAM_PLATING);
    public static final DeferredItem<Item> UMBURAM_PLATING_STAIRS = registerBlockItem(
            "umburam_plating_stairs", NoxernaBlocks.UMBURAM_PLATING_STAIRS);
    public static final DeferredItem<Item> UMBURAM_PLATING_SLAB = registerBlockItem(
            "umburam_plating_slab", NoxernaBlocks.UMBURAM_PLATING_SLAB);
    public static final DeferredItem<Item> UMBURAM_PLATING_WALL = registerBlockItem(
            "umburam_plating_wall", NoxernaBlocks.UMBURAM_PLATING_WALL);
    // Teneryl
    public static final DeferredItem<Item> TENERYL_BLOCK = registerBlockItem(
            "teneryl_block", NoxernaBlocks.TENERYL_BLOCK);
    // Adamuna
    public static final DeferredItem<Item> ADAMUNA_BLOCK = registerBlockItem(
            "adamuna_block", NoxernaBlocks.ADAMUNA_BLOCK);
    // Inperlum
    public static final DeferredItem<Item> INPERLUM_BLOCK = registerBlockItem(
            "inperlum_block", NoxernaBlocks.INPERLUM_BLOCK);
    public static final DeferredItem<Item> INPERLUM_PLATING = registerBlockItem(
            "inperlum_plating", NoxernaBlocks.INPERLUM_PLATING);
    public static final DeferredItem<Item> INPERLUM_PLATING_STAIRS = registerBlockItem(
            "inperlum_plating_stairs", NoxernaBlocks.INPERLUM_PLATING_STAIRS);
    public static final DeferredItem<Item> INPERLUM_PLATING_SLAB = registerBlockItem(
            "inperlum_plating_slab", NoxernaBlocks.INPERLUM_PLATING_SLAB);
    public static final DeferredItem<Item> INPERLUM_PLATING_WALL = registerBlockItem(
            "inperlum_plating_wall", NoxernaBlocks.INPERLUM_PLATING_WALL);
    // Nihoxite
    public static final DeferredItem<Item> NIHOXITE_BLOCK = registerBlockItem(
            "nihoxite_block", NoxernaBlocks.NIHOXITE_BLOCK);
    public static final DeferredItem<Item> NIHOXITE_PLATING = registerBlockItem(
            "nihoxite_plating", NoxernaBlocks.NIHOXITE_PLATING);
    public static final DeferredItem<Item> NIHOXITE_PLATING_STAIRS = registerBlockItem(
            "nihoxite_plating_stairs", NoxernaBlocks.NIHOXITE_PLATING_STAIRS);
    public static final DeferredItem<Item> NIHOXITE_PLATING_SLAB = registerBlockItem(
            "nihoxite_plating_slab", NoxernaBlocks.NIHOXITE_PLATING_SLAB);
    public static final DeferredItem<Item> NIHOXITE_PLATING_WALL = registerBlockItem(
            "nihoxite_plating_wall", NoxernaBlocks.NIHOXITE_PLATING_WALL);
    // Mysterious Alloy
    public static final DeferredItem<Item> MYSTERIOUS_ALLOY_PLATING = ITEMS.register(
            "mysterious_alloy_plating", ()->new BlockItem(
                    NoxernaBlocks.MYSTERIOUS_ALLOY_PLATING.get(),
                    new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> MYSTERIOUS_ALLOY_PLATING_STAIRS = ITEMS.register(
            "mysterious_alloy_plating_stairs", ()-> new BlockItem(
                    NoxernaBlocks.MYSTERIOUS_ALLOY_PLATING_STAIRS.get(),
                    new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> MYSTERIOUS_ALLOY_PLATING_SLAB = ITEMS.register(
            "mysterious_alloy_plating_slab", ()-> new BlockItem(
                    NoxernaBlocks.MYSTERIOUS_ALLOY_PLATING_SLAB.get(),
                    new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> MYSTERIOUS_ALLOY_PLATING_WALL = ITEMS.register(
            "mysterious_alloy_plating_wall", ()-> new BlockItem(
                    NoxernaBlocks.MYSTERIOUS_ALLOY_PLATING_WALL.get(),
                    new Item.Properties().rarity(Rarity.UNCOMMON)));

    // Vitragor
    public static final DeferredItem<Item> VITRAGOR_BLOCK = registerBlockItem(
            "vitragor_block", NoxernaBlocks.VITRAGOR_BLOCK);
    // Obscuprum
    public static final DeferredItem<Item> OBSCUPRUM_BLOCK = registerBlockItem(
            "obscuprum_block", NoxernaBlocks.OBSCUPRUM_BLOCK);
    public static final DeferredItem<Item> EXPOSED_OBSCUPRUM_BLOCK = registerBlockItem(
            "exposed_obscuprum_block", NoxernaBlocks.EXPOSED_OBSCUPRUM_BLOCK);
    public static final DeferredItem<Item> WEATHERED_OBSCUPRUM_BLOCK = registerBlockItem(
            "weathered_obscuprum_block", NoxernaBlocks.WEATHERED_OBSCUPRUM_BLOCK);
    public static final DeferredItem<Item> OXIDISED_OBSCUPRUM_BLOCK = registerBlockItem(
            "oxidised_obscuprum_block", NoxernaBlocks.OXIDISED_OBSCUPRUM_BLOCK);
    public static final DeferredItem<Item> CUT_OBSCUPRUM_BLOCK = registerBlockItem(
            "cut_obscuprum_block", NoxernaBlocks.CUT_OBSCUPRUM_BLOCK);
    public static final DeferredItem<Item> EXPOSED_CUT_OBSCUPRUM_BLOCK = registerBlockItem(
            "exposed_cut_obscuprum_block", NoxernaBlocks.EXPOSED_CUT_OBSCUPRUM_BLOCK);
    public static final DeferredItem<Item> WEATHERED_CUT_OBSCUPRUM_BLOCK = registerBlockItem(
            "weathered_cut_obscuprum_block", NoxernaBlocks.WEATHERED_CUT_OBSCUPRUM_BLOCK);
    public static final DeferredItem<Item> OXIDISED_CUT_OBSCUPRUM_BLOCK = registerBlockItem(
            "oxidised_cut_obscuprum_block", NoxernaBlocks.OXIDISED_CUT_OBSCUPRUM_BLOCK);
    public static final DeferredItem<Item> OBSCUPRUM_BRICKS = registerBlockItem(
            "obscuprum_bricks", NoxernaBlocks.OBSCUPRUM_BRICKS);
    public static final DeferredItem<Item> EXPOSED_OBSCUPRUM_BRICKS = registerBlockItem(
            "exposed_obscuprum_bricks", NoxernaBlocks.EXPOSED_OBSCUPRUM_BRICKS);
    public static final DeferredItem<Item> WEATHERED_OBSCUPRUM_BRICKS = registerBlockItem(
            "weathered_obscuprum_bricks", NoxernaBlocks.WEATHERED_OBSCUPRUM_BRICKS);
    public static final DeferredItem<Item> OXIDISED_OBSCUPRUM_BRICKS = registerBlockItem(
            "oxidised_obscuprum_bricks", NoxernaBlocks.OXIDISED_OBSCUPRUM_BRICKS);
    public static final DeferredItem<Item> OBSCUPRUM_PLATING = registerBlockItem(
            "obscuprum_plating", NoxernaBlocks.OBSCUPRUM_PLATING);
    public static final DeferredItem<Item> EXPOSED_OBSCUPRUM_PLATING = registerBlockItem(
            "exposed_obscuprum_plating", NoxernaBlocks.EXPOSED_OBSCUPRUM_PLATING);
    public static final DeferredItem<Item> WEATHERED_OBSCUPRUM_PLATING = registerBlockItem(
            "weathered_obscuprum_plating", NoxernaBlocks.WEATHERED_OBSCUPRUM_PLATING);
    public static final DeferredItem<Item> OXIDISED_OBSCUPRUM_PLATING = registerBlockItem(
            "oxidised_obscuprum_plating", NoxernaBlocks.OXIDISED_OBSCUPRUM_PLATING);
    // Coloured Blocks
    public static final DeferredItem<Item> XENON_CONCRETE = registerBlockItem(
            "xenon_concrete", NoxernaBlocks.XENON_CONCRETE);
    public static final DeferredItem<Item> KRYPTON_CONCRETE = registerBlockItem(
            "krypton_concrete", NoxernaBlocks.KRYPTON_CONCRETE);
    public static final DeferredItem<Item> ARGON_CONCRETE = registerBlockItem(
            "argon_concrete", NoxernaBlocks.ARGON_CONCRETE);
    public static final DeferredItem<Item> NEON_CONCRETE = registerBlockItem(
            "neon_concrete", NoxernaBlocks.NEON_CONCRETE);

    public static final DeferredItem<Item> XENON_CONCRETE_POWDER = registerBlockItem(
            "xenon_concrete_powder", NoxernaBlocks.XENON_CONCRETE_POWDER);
    public static final DeferredItem<Item> KRYPTON_CONCRETE_POWDER = registerBlockItem(
            "krypton_concrete_powder", NoxernaBlocks.KRYPTON_CONCRETE_POWDER);
    public static final DeferredItem<Item> ARGON_CONCRETE_POWDER = registerBlockItem(
            "argon_concrete_powder", NoxernaBlocks.ARGON_CONCRETE_POWDER);
    public static final DeferredItem<Item> NEON_CONCRETE_POWDER = registerBlockItem(
            "neon_concrete_powder", NoxernaBlocks.NEON_CONCRETE_POWDER);
    // Functional Blocks
    public static final DeferredItem<Item> NOBLEWOOD_CRAFTING_TABLE = registerBlockItem(
            "noblewood_crafting_table", NoxernaBlocks.NOBLEWOOD_CRAFTING_TABLE);
    // Special Dimension Block Items
    public static final DeferredItem<Item> VOIDROCK = registerBlockItem(
            "voidrock", NoxernaBlocks.VOIDROCK);
    public static final DeferredItem<Item> NOXERNA_PORTAL_FRAME = ITEMS.register(
            "noxerna_portal_frame", ()-> new BlockItem(
                    NoxernaBlocks.NOXERNA_PORTAL_FRAME.get(),
                    new Item.Properties().rarity(Rarity.UNCOMMON)));
}
