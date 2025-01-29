package net.chairmanfed.noxerna.data;

import net.chairmanfed.noxerna.item.NoxernaItems;
import net.chairmanfed.noxerna.registry.NoxernaBlocks;
import net.chairmanfed.noxerna.registry.NoxernaTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.FurnaceFuel;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;
import net.neoforged.neoforge.registries.datamaps.builtin.Oxidizable;

import java.util.concurrent.CompletableFuture;

public class NoxernaDataMaps extends DataMapProvider {
    public NoxernaDataMaps(PackOutput output, CompletableFuture<HolderLookup.Provider> holderLookup) {
        super(output, holderLookup);
    }

    @Override
    protected void gather() {
        builder(NeoForgeDataMaps.OXIDIZABLES)
                .add(NoxernaBlocks.OBSCUPRUM_BLOCK,
                        new Oxidizable(NoxernaBlocks.EXPOSED_OBSCUPRUM_BLOCK.get()), false)
                .add(NoxernaBlocks.EXPOSED_OBSCUPRUM_BLOCK,
                        new Oxidizable(NoxernaBlocks.WEATHERED_OBSCUPRUM_BLOCK.get()), false)
                .add(NoxernaBlocks.WEATHERED_OBSCUPRUM_BLOCK,
                        new Oxidizable(NoxernaBlocks.OXIDISED_OBSCUPRUM_BLOCK.get()), false)
                .add(NoxernaBlocks.CUT_OBSCUPRUM_BLOCK,
                        new Oxidizable(NoxernaBlocks.EXPOSED_CUT_OBSCUPRUM_BLOCK.get()), false)
                .add(NoxernaBlocks.EXPOSED_CUT_OBSCUPRUM_BLOCK,
                        new Oxidizable(NoxernaBlocks.WEATHERED_CUT_OBSCUPRUM_BLOCK.get()), false)
                .add(NoxernaBlocks.WEATHERED_CUT_OBSCUPRUM_BLOCK,
                        new Oxidizable(NoxernaBlocks.OXIDISED_CUT_OBSCUPRUM_BLOCK.get()), false);
        builder(NeoForgeDataMaps.FURNACE_FUELS)
                .add(NoxernaTags.ItemTags.NOBLEWOOD_PLANKS, new FurnaceFuel(300), false)
                .add(NoxernaItems.LUMAI_FUEL_CELL, new FurnaceFuel(3200), false);
    }
}
