package net.chairmanfed.noxerna.data;

import net.chairmanfed.noxerna.TheNoxerna;
import net.chairmanfed.noxerna.data.providers.NoxernaAdvancementProvider;
import net.chairmanfed.noxerna.data.providers.NoxernaLootTableProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.EntityTypeTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, modid = TheNoxerna.MODID)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        // Content that only the client should care about, so anything that goes in /assets
        boolean client = event.includeClient();
        // Content that only the server should care about, so anything that goes in /data
        boolean server = event.includeServer();

        // Assets
        generator.addProvider(client, new NoxernaBlockStateProvider(output, existingFileHelper));
        generator.addProvider(client, new NoxernaItemModels(output, existingFileHelper));
        generator.addProvider(client, new NoxernaLanguageProvider(output, existingFileHelper));
        generator.addProvider(client, new NoxernaSoundDefinitions(output, existingFileHelper));

        // Data
        NoxernaRegistries datapack = new NoxernaRegistries(output, lookupProvider);
        generator.addProvider(server, datapack);
        BlockTagsProvider blockTags = new NoxernaBlockTags(output, lookupProvider, existingFileHelper);
        generator.addProvider(server, blockTags);
        ItemTagsProvider itemTags = new NoxernaItemTags(output, lookupProvider, blockTags.contentsGetter(), existingFileHelper);
        generator.addProvider(server, itemTags);
        EntityTypeTagsProvider entityTags = new NoxernaEntityTags(output, lookupProvider, existingFileHelper);
        generator.addProvider(server, entityTags);
        generator.addProvider(server, new NoxernaDataMaps(output, lookupProvider));
        generator.addProvider(server, new NoxernaRecipes(output, lookupProvider));
        generator.addProvider(server, new NoxernaLootTableProvider(output, lookupProvider));
        generator.addProvider(server, new NoxernaAdvancementProvider(output, lookupProvider, existingFileHelper));
    }
}
