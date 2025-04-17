package net.chairmanfed.noxerna;

import com.mojang.logging.LogUtils;
import net.chairmanfed.noxerna.item.equipment.armor.NoxernaArmorMaterials;
import net.chairmanfed.noxerna.block.NoxernaBlocks;
import net.chairmanfed.noxerna.item.NoxernaCreativeModeTabs;
import net.chairmanfed.noxerna.item.NoxernaItems;
import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

import java.util.Locale;

@Mod(TheNoxerna.MODID)
public class TheNoxerna
{
    public static final String MODID = "noxerna";
    public static ResourceLocation prefix(String name) {
        return ResourceLocation.fromNamespaceAndPath(MODID, name.toLowerCase(Locale.ROOT));
    }
    private static final Logger LOGGER = LogUtils.getLogger();

    public static final GameRules.Key<GameRules.IntegerValue> RULE_MAX_QUAKE_MAGNITUDE =
            GameRules.register(
                    "maxQuakeMagnitude", GameRules.Category.UPDATES, GameRules.IntegerValue.create(10));

    public TheNoxerna(IEventBus modEventBus, ModContainer modContainer)
    {
        modEventBus.addListener(this::commonSetup);
        NoxernaBlocks.BLOCKS.register(modEventBus);
        NoxernaItems.ITEMS.register(modEventBus);
        NoxernaArmorMaterials.ARMOR_MATERIAL.register(modEventBus);
        NoxernaCreativeModeTabs.CREATIVE_TABS.register(modEventBus);
        // modEventBus.addListener(DataGenerators::gatherData);
        NeoForge.EVENT_BUS.register(this);
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");

        if (Config.logDirtBlock)
            LOGGER.info("DIRT BLOCK >> {}", BuiltInRegistries.BLOCK.getKey(Blocks.DIRT));

        LOGGER.info(Config.magicNumberIntroduction + Config.magicNumber);

        Config.items.forEach((item) -> LOGGER.info("ITEM >> {}", item.toString()));
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
