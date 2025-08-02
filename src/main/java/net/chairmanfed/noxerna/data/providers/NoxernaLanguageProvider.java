package net.chairmanfed.noxerna.data.providers;

import net.chairmanfed.noxerna.Noxerna;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.alchemy.Potion;
import net.neoforged.neoforge.common.data.LanguageProvider;

import java.util.function.Supplier;

public abstract class NoxernaLanguageProvider extends LanguageProvider {
    public NoxernaLanguageProvider(PackOutput output, String id) {
        super(output, id, "en_us");
    }

    public void addCreativeTab(String creativeTab, String name) {
        this.add("itemGroup." + Noxerna.MODID + "." + creativeTab, name);
    }
    public void addAdvancement(String id, String title, String description) {
        this.add("advancement." + Noxerna.MODID + "." + id + ".title", title);
        this.add("advancement." + Noxerna.MODID + "." + id + ".description", description);
    }
    public void addUpgradeTemplate(String upgradeType, String name, String ingredients, String appliedTo) {
        this.add("upgrade." + Noxerna.MODID + "." + upgradeType, name);
        this.add("item." + Noxerna.MODID + ".smithing_template."
                + upgradeType + ".ingredients", ingredients);
        this.add("item." + Noxerna.MODID + ".smithing_template."
                + upgradeType + ".applies_to", appliedTo);
        this.add("item." + Noxerna.MODID + ".smithing_template."
                + upgradeType + ".additions_slot_description", "Add " + ingredients);
        this.add("item." + Noxerna.MODID + ".smithing_template."
                + upgradeType + ".base_slot_description", "Add " + appliedTo);
    }
    public void addTrimMaterial(String material, String name) {
        this.add("trim_material." + Noxerna.MODID + "." + material,
                name + " Material");
    }
    public void addPotion(Potion potion, String name) {
        add("item.minecraft.potion.effect." + BuiltInRegistries.POTION.getKey(potion).getPath(), "Potion of " + name);
        add("item.minecraft.splash_potion.effect." + BuiltInRegistries.POTION.getKey(potion).getPath(), "Splash Potion of " + name);
        add("item.minecraft.lingering_potion.effect." + BuiltInRegistries.POTION.getKey(potion).getPath(), "Lingering Potion of " + name);
        add("item.minecraft.tipped_arrow.effect." + BuiltInRegistries.POTION.getKey(potion).getPath(), "Arrow of " + name);
    }
}
