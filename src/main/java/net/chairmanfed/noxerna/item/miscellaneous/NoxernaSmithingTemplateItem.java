package net.chairmanfed.noxerna.item.miscellaneous;

import net.chairmanfed.noxerna.TheNoxerna;
import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlag;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SmithingTemplateItem;
import net.minecraft.world.item.armortrim.TrimPattern;

import java.util.List;

public class NoxernaSmithingTemplateItem extends SmithingTemplateItem {

    private static final ChatFormatting TITLE_FORMAT = ChatFormatting.GRAY;
    private static final ChatFormatting DESCRIPTION_FORMAT = ChatFormatting.BLUE;
    private static final Component INGREDIENTS_TITLE = Component.translatable(
            Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(
                    TheNoxerna.MODID, "smithing_template.ingredients"))).withStyle(TITLE_FORMAT);
    private static final Component APPLIES_TO_TITLE = Component.translatable(
            Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(
                    TheNoxerna.MODID, "smithing_template.applies_to"))).withStyle(TITLE_FORMAT);
    private static final Component NIHOXITE_UPGRADE = Component.translatable(
            Util.makeDescriptionId("upgrade", ResourceLocation.fromNamespaceAndPath(
                    TheNoxerna.MODID, "nihoxite_upgrade"))).withStyle(TITLE_FORMAT);
    private static final Component NIHOXITE_UPGRADE_INGREDIENTS = Component.translatable(
            Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(
                    TheNoxerna.MODID,
                    "smithing_template.nihoxite_upgrade.ingredients"))).withStyle(DESCRIPTION_FORMAT);
    private static final Component NIHOXITE_UPGRADE_APPLIES_TO = Component.translatable(
            Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(
                    TheNoxerna.MODID,
                    "smithing_template.nihoxite_upgrade.applies_to"))).withStyle(DESCRIPTION_FORMAT);
    private static final Component NIHOXITE_UPGRADE_BASE_SLOT_DESCRIPTION = Component.translatable(
            Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(
                    TheNoxerna.MODID, "smithing_template.nihoxite_upgrade.base_slot_description")));
    private static final Component NIHOXITE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Component.translatable(
            Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(
                    TheNoxerna.MODID, "smithing_template.nihoxite_upgrade.additions_slot_description")));
    private static final ResourceLocation EMPTY_SLOT_HELMET = ResourceLocation.withDefaultNamespace(
            "item/empty_armor_slot_helmet");
    private static final ResourceLocation EMPTY_SLOT_CHESTPLATE = ResourceLocation.withDefaultNamespace(
            "item/empty_armor_slot_chestplate");
    private static final ResourceLocation EMPTY_SLOT_LEGGINGS = ResourceLocation.withDefaultNamespace(
            "item/empty_armor_slot_leggings");
    private static final ResourceLocation EMPTY_SLOT_BOOTS = ResourceLocation.withDefaultNamespace(
            "item/empty_armor_slot_boots");
    private static final ResourceLocation EMPTY_SLOT_HOE = ResourceLocation.withDefaultNamespace(
            "item/empty_slot_hoe");
    private static final ResourceLocation EMPTY_SLOT_AXE = ResourceLocation.withDefaultNamespace(
            "item/empty_slot_axe");
    private static final ResourceLocation EMPTY_SLOT_SWORD = ResourceLocation.withDefaultNamespace(
            "item/empty_slot_sword");
    private static final ResourceLocation EMPTY_SLOT_SHOVEL = ResourceLocation.withDefaultNamespace(
            "item/empty_slot_shovel");
    private static final ResourceLocation EMPTY_SLOT_PICKAXE = ResourceLocation.withDefaultNamespace(
            "item/empty_slot_pickaxe");
    private static final ResourceLocation EMPTY_SLOT_INGOT = ResourceLocation.withDefaultNamespace(
            "item/empty_slot_ingot");

    public NoxernaSmithingTemplateItem(
            Component appliesTo,
            Component ingredients,
            Component upgradeDescription,
            Component baseSlotDescription,
            Component additionsSlotDescription,
            List<ResourceLocation> baseSlotEmptyIcons,
            List<ResourceLocation> additionalSlotEmptyIcons,
            FeatureFlag... requiredFeatures
    ) {
        super(
                appliesTo,
                ingredients,
                upgradeDescription,
                baseSlotDescription,
                additionsSlotDescription,
                baseSlotEmptyIcons,
                additionalSlotEmptyIcons);
    }

    public static SmithingTemplateItem createArmorTrimTemplate(
            ResourceKey<TrimPattern> pKey, FeatureFlag... pRequiredFeatures) {
        return createArmorTrimTemplate(pKey.location(), pRequiredFeatures);
    }
    public static SmithingTemplateItem createNihoxiteUpgradeTemplate() {
        return new SmithingTemplateItem(
                NIHOXITE_UPGRADE_APPLIES_TO,
                NIHOXITE_UPGRADE_INGREDIENTS,
                NIHOXITE_UPGRADE,
                NIHOXITE_UPGRADE_BASE_SLOT_DESCRIPTION,
                NIHOXITE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION,
                createNihoxiteUpgradeIconList(),
                createNihoxiteUpgradeMaterialList()
        );
    }
    private static List<ResourceLocation> createNihoxiteUpgradeIconList() {
        return List.of(
                EMPTY_SLOT_HELMET,
                EMPTY_SLOT_SWORD,
                EMPTY_SLOT_CHESTPLATE,
                EMPTY_SLOT_PICKAXE,
                EMPTY_SLOT_LEGGINGS,
                EMPTY_SLOT_AXE,
                EMPTY_SLOT_BOOTS,
                EMPTY_SLOT_HOE,
                EMPTY_SLOT_SHOVEL
        );
    }

    private static List<ResourceLocation> createNihoxiteUpgradeMaterialList() {
        return List.of(EMPTY_SLOT_INGOT);
    }
}
