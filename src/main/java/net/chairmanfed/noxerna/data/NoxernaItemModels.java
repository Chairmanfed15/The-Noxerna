package net.chairmanfed.noxerna.data;

import net.chairmanfed.noxerna.TheNoxerna;
import net.chairmanfed.noxerna.registry.NoxernaBlocks;
import net.chairmanfed.noxerna.registry.NoxernaItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.function.Supplier;

public class NoxernaItemModels extends ItemModelProvider {
    public NoxernaItemModels(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TheNoxerna.MODID, existingFileHelper);
    }
    @Override
    protected void registerModels() {
        basicItem(NoxernaItems.RAW_FERREBRIS.get());
        basicItem(NoxernaItems.RAW_OBSCUPRUM.get());
        basicItem(NoxernaItems.RAW_UMBURAM.get());
        basicItem(NoxernaItems.RAW_INPERLUM.get());
        basicItem(NoxernaItems.TENERYL.get());
        basicItem(NoxernaItems.ADAMUNA.get());
        basicItem(NoxernaItems.VITRAGOR.get());
        toolItem((Supplier<Item>) NoxernaItems.VITRALISK.get());
        basicItem(NoxernaItems.FERREBRIS_NUGGET.get());
        basicItem(NoxernaItems.OBSCUPRUM_NUGGET.get());
        basicItem(NoxernaItems.UMBURAM_NUGGET.get());
        basicItem(NoxernaItems.INPERLUM_NUGGET.get());
        basicItem(NoxernaItems.NIHOXITE_NUGGET.get());
        basicItem(NoxernaItems.FERREBRIS_INGOT.get());
        basicItem(NoxernaItems.OBSCUPRUM_INGOT.get());
        basicItem(NoxernaItems.UMBURAM_INGOT.get());
        basicItem(NoxernaItems.INPERLUM_INGOT.get());
        basicItem(NoxernaItems.NIHOXITE_INGOT.get());
        toolItem((Supplier<Item>) NoxernaItems.NOBLEWOOD_STICK.get());
        basicItem(NoxernaItems.NIHOXITE_UPGRADE_SMITHING_TEMPLATE.get());

        toolItem(NoxernaItems.NOBLEWOOD_AXE);
        toolItem(NoxernaItems.NOBLEWOOD_HOE);
        toolItem(NoxernaItems.NOBLEWOOD_PICKAXE);
        toolItem(NoxernaItems.NOBLEWOOD_SHOVEL);
        toolItem(NoxernaItems.NOBLEWOOD_SWORD);

        toolItem(NoxernaItems.NOXSTONE_AXE);
        toolItem(NoxernaItems.NOXSTONE_HOE);
        toolItem(NoxernaItems.NOXSTONE_PICKAXE);
        toolItem(NoxernaItems.NOXSTONE_SHOVEL);
        toolItem(NoxernaItems.NOXSTONE_SWORD);

        toolItem(NoxernaItems.FERREBRIS_AXE);
        toolItem(NoxernaItems.FERREBRIS_HOE);
        toolItem(NoxernaItems.FERREBRIS_PICKAXE);
        toolItem(NoxernaItems.FERREBRIS_SHOVEL);
        toolItem(NoxernaItems.FERREBRIS_SWORD);
        basicItem(NoxernaItems.FERREBRIS_HELMET.getId());
        basicItem(NoxernaItems.FERREBRIS_CHESTPLATE.getId());
        basicItem(NoxernaItems.FERREBRIS_LEGGINGS.getId());
        basicItem(NoxernaItems.FERREBRIS_BOOTS.getId());

        toolItem(NoxernaItems.UMBURAM_AXE);
        toolItem(NoxernaItems.UMBURAM_HOE);
        toolItem(NoxernaItems.UMBURAM_PICKAXE);
        toolItem(NoxernaItems.UMBURAM_SHOVEL);
        toolItem(NoxernaItems.UMBURAM_SWORD);
        basicItem(NoxernaItems.UMBURAM_HELMET.getId());
        basicItem(NoxernaItems.UMBURAM_CHESTPLATE.getId());
        basicItem(NoxernaItems.UMBURAM_LEGGINGS.getId());
        basicItem(NoxernaItems.UMBURAM_BOOTS.getId());

        toolItem(NoxernaItems.ADAMUNA_AXE);
        toolItem(NoxernaItems.ADAMUNA_HOE);
        toolItem(NoxernaItems.ADAMUNA_PICKAXE);
        toolItem(NoxernaItems.ADAMUNA_SHOVEL);
        toolItem(NoxernaItems.ADAMUNA_SWORD);
        basicItem(NoxernaItems.ADAMUNA_HELMET.getId());
        basicItem(NoxernaItems.ADAMUNA_CHESTPLATE.getId());
        basicItem(NoxernaItems.ADAMUNA_LEGGINGS.getId());
        basicItem(NoxernaItems.ADAMUNA_BOOTS.getId());

        toolItem(NoxernaItems.NIHOXITE_AXE);
        toolItem(NoxernaItems.NIHOXITE_HOE);
        toolItem(NoxernaItems.NIHOXITE_PICKAXE);
        toolItem(NoxernaItems.NIHOXITE_SHOVEL);
        toolItem(NoxernaItems.NIHOXITE_SWORD);
        basicItem(NoxernaItems.NIHOXITE_HELMET.getId());
        basicItem(NoxernaItems.NIHOXITE_CHESTPLATE.getId());
        basicItem(NoxernaItems.NIHOXITE_LEGGINGS.getId());
        basicItem(NoxernaItems.NIHOXITE_BOOTS.getId());

        basicItem(NoxernaItems.HEART_HELMET.getId());
        basicItem(NoxernaItems.HEART_CHESTPLATE.getId());
        basicItem(NoxernaItems.HEART_LEGGINGS.getId());
        basicItem(NoxernaItems.HEART_BOOTS.getId());
    }

    public void toolItem(Supplier<Item> item) {
        this.withExistingParent(BuiltInRegistries.ITEM.getKey(item.get()).getPath(), mcLoc("item/handheld"))
                .texture("layer0", modLoc("item/" + BuiltInRegistries.ITEM.getKey(item.get()).getPath()));
    }
}
