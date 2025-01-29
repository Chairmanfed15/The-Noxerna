package net.chairmanfed.noxerna.data;

import net.chairmanfed.noxerna.TheNoxerna;
import net.chairmanfed.noxerna.item.NoxernaItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;

public class NoxernaItemModels extends ItemModelProvider {
    public NoxernaItemModels(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TheNoxerna.MODID, existingFileHelper);
    }
    @Override
    protected void registerModels() {
        // Intermediates
        flatItem(NoxernaItems.LUMAI_CRYSTAL);
        flatItem(NoxernaItems.LUMAI_FUEL_CELL);
        flatItem(NoxernaItems.RAW_FERREBRIS);
        flatItem(NoxernaItems.RAW_OBSCUPRUM);
        flatItem(NoxernaItems.RAW_UMBURAM);
        flatItem(NoxernaItems.RAW_INPERLUM);
        flatItem(NoxernaItems.TENERYL);
        flatItem(NoxernaItems.ADAMUNA);
        flatItem(NoxernaItems.VITRAGOR);
        flatItem(NoxernaItems.FERREBRIS_NUGGET);
        flatItem(NoxernaItems.OBSCUPRUM_NUGGET);
        flatItem(NoxernaItems.UMBURAM_NUGGET);
        flatItem(NoxernaItems.INPERLUM_NUGGET);
        flatItem(NoxernaItems.NIHOXITE_NUGGET);
        flatItem(NoxernaItems.FERREBRIS_INGOT);
        flatItem(NoxernaItems.OBSCUPRUM_INGOT);
        flatItem(NoxernaItems.UMBURAM_INGOT);
        flatItem(NoxernaItems.INPERLUM_INGOT);
        flatItem(NoxernaItems.NIHOXITE_INGOT);
        flatItem(NoxernaItems.MYSTERIOUS_SCRAP);
        flatItem(NoxernaItems.MYSTERIOUS_ALLOY_PLATE);
        handheldFlatItem(NoxernaItems.NOBLEWOOD_STICK);
        wipItem(NoxernaItems.GLOWGRAIN);
        wipItem(NoxernaItems.ROCKHIDE);
        flatItem(NoxernaItems.SULAZE_CORE);
        flatItem(NoxernaItems.XENON_DYE);
        flatItem(NoxernaItems.KRYPTON_DYE);
        flatItem(NoxernaItems.ARGON_DYE);
        flatItem(NoxernaItems.NEON_DYE);
        wipItem(NoxernaItems.VITRAGOR_DUST);
        wipItem(NoxernaItems.SULAZE_POWDER);
        flatItem(NoxernaItems.NOBLEWOOD_BOWL);
        flatItem(NoxernaItems.NIHOXITE_UPGRADE_SMITHING_TEMPLATE);
        flatItem(NoxernaItems.EXOTIC_ARMOR_TRIM_SMITHING_TEMPLATE);
        // Food

        // Tiered Tools
        handheldFlatItem(NoxernaItems.NOBLEWOOD_AXE);
        handheldFlatItem(NoxernaItems.NOBLEWOOD_HOE);
        handheldFlatItem(NoxernaItems.NOBLEWOOD_PICKAXE);
        handheldFlatItem(NoxernaItems.NOBLEWOOD_SHOVEL);
        handheldFlatItem(NoxernaItems.NOBLEWOOD_SWORD);
        handheldFlatItem(NoxernaItems.NOXSTONE_AXE);
        handheldFlatItem(NoxernaItems.NOXSTONE_HOE);
        handheldFlatItem(NoxernaItems.NOXSTONE_PICKAXE);
        handheldFlatItem(NoxernaItems.NOXSTONE_SHOVEL);
        handheldFlatItem(NoxernaItems.NOXSTONE_SWORD);
        handheldFlatItem(NoxernaItems.FERREBRIS_AXE);
        handheldFlatItem(NoxernaItems.FERREBRIS_HOE);
        handheldFlatItem(NoxernaItems.FERREBRIS_PICKAXE);
        handheldFlatItem(NoxernaItems.FERREBRIS_SHOVEL);
        handheldFlatItem(NoxernaItems.FERREBRIS_SWORD);
        handheldFlatItem(NoxernaItems.UMBURAM_AXE);
        handheldFlatItem(NoxernaItems.UMBURAM_HOE);
        handheldFlatItem(NoxernaItems.UMBURAM_PICKAXE);
        handheldFlatItem(NoxernaItems.UMBURAM_SHOVEL);
        handheldFlatItem(NoxernaItems.UMBURAM_SWORD);
        handheldFlatItem(NoxernaItems.ADAMUNA_AXE);
        handheldFlatItem(NoxernaItems.ADAMUNA_HOE);
        handheldFlatItem(NoxernaItems.ADAMUNA_PICKAXE);
        handheldFlatItem(NoxernaItems.ADAMUNA_SHOVEL);
        handheldFlatItem(NoxernaItems.ADAMUNA_SWORD);
        handheldFlatItem(NoxernaItems.NIHOXITE_AXE);
        handheldFlatItem(NoxernaItems.NIHOXITE_HOE);
        handheldFlatItem(NoxernaItems.NIHOXITE_PICKAXE);
        handheldFlatItem(NoxernaItems.NIHOXITE_SHOVEL);
        handheldFlatItem(NoxernaItems.NIHOXITE_SWORD);
        // Misc Tools
        flatItem(NoxernaItems.PYROCHARGE);
        handheldFlatItem(NoxernaItems.PICKADZE);
        handheldFlatItem(NoxernaItems.VITRALISK);
        wipItem(NoxernaItems.FERREBRIS_SHIELD);
        // Armor
        wipItem(NoxernaItems.ROCKHIDE_HELMET);
        wipItem(NoxernaItems.ROCKHIDE_CHESTPLATE);
        wipItem(NoxernaItems.ROCKHIDE_LEGGINGS);
        wipItem(NoxernaItems.ROCKHIDE_BOOTS);
        wipItem(NoxernaItems.EXOSKELETON_HELMET);
        wipItem(NoxernaItems.EXOSKELETON_CHESTPLATE);
        wipItem(NoxernaItems.EXOSKELETON_LEGGINGS);
        wipItem(NoxernaItems.EXOSKELETON_BOOTS);
        flatItem(NoxernaItems.FERREBRIS_HELMET);
        flatItem(NoxernaItems.FERREBRIS_CHESTPLATE);
        flatItem(NoxernaItems.FERREBRIS_LEGGINGS);
        flatItem(NoxernaItems.FERREBRIS_BOOTS);
        flatItem(NoxernaItems.UMBURAM_HELMET);
        flatItem(NoxernaItems.UMBURAM_CHESTPLATE);
        flatItem(NoxernaItems.UMBURAM_LEGGINGS);
        flatItem(NoxernaItems.UMBURAM_BOOTS);
        flatItem(NoxernaItems.ADAMUNA_HELMET);
        flatItem(NoxernaItems.ADAMUNA_CHESTPLATE);
        flatItem(NoxernaItems.ADAMUNA_LEGGINGS);
        flatItem(NoxernaItems.ADAMUNA_BOOTS);
        flatItem(NoxernaItems.NIHOXITE_HELMET);
        flatItem(NoxernaItems.NIHOXITE_CHESTPLATE);
        flatItem(NoxernaItems.NIHOXITE_LEGGINGS);
        flatItem(NoxernaItems.NIHOXITE_BOOTS);
        flatItem(NoxernaItems.HEART_HELMET);
        flatItem(NoxernaItems.HEART_CHESTPLATE);
        flatItem(NoxernaItems.HEART_LEGGINGS);
        flatItem(NoxernaItems.HEART_BOOTS);
        // Advancement Dummy Items
        advancementItem(NoxernaItems.ROOT);
        advancementItem(NoxernaItems.AWAKEN_MEGATOMATON);
        advancementItem(NoxernaItems.MINE_NATIVE_MINERALS);
        advancementItem(NoxernaItems.DEFEAT_MEGATOMATON);
        advancementItem(NoxernaItems.COMPLETE_ALL_CHALLENGES);
    }
    public void flatItem(DeferredItem<Item> item) {
        this.getBuilder(item.getId().toString())
                .parent(new ModelFile.UncheckedModelFile("item/generated"))
                .texture("layer0",
                        ResourceLocation.fromNamespaceAndPath(item.getId().getNamespace(),
                                "item/" + item.getId().getPath()));
    }
    public void handheldFlatItem(DeferredItem<Item> item) {
        this.getBuilder(item.getId().toString())
                .parent(new ModelFile.UncheckedModelFile("item/handheld"))
                .texture("layer0",
                        ResourceLocation.fromNamespaceAndPath(item.getId().getNamespace(),
                                "item/" + item.getId().getPath()));
    }
    public void wipItem(DeferredItem<Item> item) {
        this.getBuilder(item.getId().toString())
                .parent(new ModelFile.UncheckedModelFile("item/generated"))
                .texture("layer0",
                        ResourceLocation.fromNamespaceAndPath(item.getId().getNamespace(),
                                "item/wip_placeholder"));
    }
    public void advancementItem(DeferredItem<Item> item) {
        this.getBuilder(item.getId().toString())
                .parent(new ModelFile.UncheckedModelFile("item/generated"))
                .texture("layer0",
                        ResourceLocation.fromNamespaceAndPath(item.getId().getNamespace(),
                                "item/advancements/" + item.getId().getPath()));
    }
}
