package net.chairmanfed.noxerna.data.resources.registries;

import net.chairmanfed.noxerna.Noxerna;
import net.chairmanfed.noxerna.item.NoxernaItems;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;

import java.util.Map;

public class NoxernaTrimMaterials {
    public static final ResourceKey<TrimMaterial> ADAMUNA = createKey("adamuna");
    public static final ResourceKey<TrimMaterial> ARGON = createKey("argon");
    public static final ResourceKey<TrimMaterial> FERREBRIS = createKey("ferrebris");
    public static final ResourceKey<TrimMaterial> INPERLUM = createKey("inperlum");
    public static final ResourceKey<TrimMaterial> KRYPTON = createKey("krypton");
    public static final ResourceKey<TrimMaterial> NEON = createKey("neon");
    public static final ResourceKey<TrimMaterial> NIHOXITE = createKey("nihoxite");
    public static final ResourceKey<TrimMaterial> OBSCUPRUM = createKey("obscuprum");
    public static final ResourceKey<TrimMaterial> OXIDISED_OBSCUPRUM = createKey("oxidised_obscuprum");
    public static final ResourceKey<TrimMaterial> TENERYL = createKey("teneryl");
    public static final ResourceKey<TrimMaterial> UMBURAM = createKey("umburam");
    public static final ResourceKey<TrimMaterial> VITRAGOR = createKey("vitragor");
    public static final ResourceKey<TrimMaterial> XENON = createKey("xenon");
    private static ResourceKey<TrimMaterial> createKey(String name) {
        return ResourceKey.create(Registries.TRIM_MATERIAL,
                ResourceLocation.fromNamespaceAndPath(Noxerna.MODID, name));
    }
    public static void bootstrap(BootstrapContext<TrimMaterial> context) {
        register(context, ARGON, NoxernaItems.ARGON_DYE.get(), Style.EMPTY.withColor(11864684), 0.4f);
        register(context, KRYPTON, NoxernaItems.KRYPTON_DYE.get(), Style.EMPTY.withColor(10419969), 0.7f);
        register(context, NEON, NoxernaItems.NEON_DYE.get(), Style.EMPTY.withColor(16736510), 1.0f);
        register(context, OBSCUPRUM, NoxernaItems.OBSCUPRUM_INGOT.get(), Style.EMPTY.withColor(4416615), 0.9f);
        register(context, OXIDISED_OBSCUPRUM, NoxernaItems.RAW_OBSCUPRUM.get(), Style.EMPTY.withColor(6767460), 0.4f);
        register(context, XENON, NoxernaItems.XENON_DYE.get(), Style.EMPTY.withColor(58095), 0.8f);
    }

    private static void register(BootstrapContext<TrimMaterial> context, ResourceKey<TrimMaterial> materialKey, Item ingredient, Style style, float itemModelIndex) {
        register(context, materialKey, ingredient, style, itemModelIndex, Map.of());
    }

    private static void register(BootstrapContext<TrimMaterial> context, ResourceKey<TrimMaterial> materialKey, Item ingredient, Style style, float itemModelIndex, Map<Holder<ArmorMaterial>, String> overrideArmorMaterials) {
        TrimMaterial trimMaterial = TrimMaterial.create(materialKey.location().getPath(), ingredient, itemModelIndex, Component.translatable(Util.makeDescriptionId("trim_material", materialKey.location())).withStyle(style), overrideArmorMaterials);
        context.register(materialKey, trimMaterial);
    }
}
