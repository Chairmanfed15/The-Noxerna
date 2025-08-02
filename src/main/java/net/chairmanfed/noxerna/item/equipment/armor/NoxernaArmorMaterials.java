package net.chairmanfed.noxerna.item.equipment.armor;

import net.chairmanfed.noxerna.Noxerna;
import net.chairmanfed.noxerna.registry.NoxernaTags;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.EnumMap;
import java.util.List;

public class NoxernaArmorMaterials {
    public static final DeferredRegister<ArmorMaterial> ARMOR_MATERIAL = DeferredRegister.create(
            Registries.ARMOR_MATERIAL, Noxerna.MODID);
    public static final Holder<ArmorMaterial> ROCKHIDE = ARMOR_MATERIAL.register(
            "rockhide", () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 2);
        map.put(ArmorItem.Type.LEGGINGS, 4);
        map.put(ArmorItem.Type.CHESTPLATE, 4);
        map.put(ArmorItem.Type.HELMET, 2);
        map.put(ArmorItem.Type.BODY, 4);
    }), 15, SoundEvents.ARMOR_EQUIP_LEATHER,
                    () -> Ingredient.of(Tags.Items.LEATHERS),
                    List.of(new ArmorMaterial.Layer(Noxerna.prefix("rockhide"))),
                    0, 0));
    public static final Holder<ArmorMaterial> HEART = ARMOR_MATERIAL.register(
            "heart", () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 1);
                map.put(ArmorItem.Type.LEGGINGS, 1);
                map.put(ArmorItem.Type.CHESTPLATE, 1);
                map.put(ArmorItem.Type.HELMET, 1);
                map.put(ArmorItem.Type.BODY, 1);
            }), 9, SoundEvents.ARMOR_EQUIP_IRON,
                    () -> Ingredient.of(Items.BARRIER),
                    List.of(new ArmorMaterial.Layer(Noxerna.prefix("heart"))),
                    0.0F, 0.0F));
    public static final Holder<ArmorMaterial> EXOSKELETON = ARMOR_MATERIAL.register(
            "exoskeleton", () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 1);
                map.put(ArmorItem.Type.LEGGINGS, 2);
                map.put(ArmorItem.Type.CHESTPLATE, 2);
                map.put(ArmorItem.Type.HELMET, 1);
                map.put(ArmorItem.Type.BODY, 2);
            }), 10, SoundEvents.ARMOR_EQUIP_NETHERITE,
                    () -> Ingredient.of(NoxernaTags.ItemTags.INPERLUM_INGOTS),
                    List.of(new ArmorMaterial.Layer(Noxerna.prefix("exoskeleton"))),
                    1.0F, 0.01F));
    public static final Holder<ArmorMaterial> FERREBRIS = ARMOR_MATERIAL.register(
            "ferrebris", () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 6);
            }), 9, SoundEvents.ARMOR_EQUIP_IRON,
                    () -> Ingredient.of(NoxernaTags.ItemTags.FERREBRIS_TOOL_MATERIALS),
                    List.of(
                            new ArmorMaterial.Layer(Noxerna.prefix("ferrebris"), "", false)),
                    2.0F, 0.05F));
    public static final Holder<ArmorMaterial> UMBURAM = ARMOR_MATERIAL.register(
            "umburam", () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 5);
                map.put(ArmorItem.Type.CHESTPLATE, 5);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 5);
            }), 25, SoundEvents.ARMOR_EQUIP_GOLD,
                    () -> Ingredient.of(NoxernaTags.ItemTags.UMBURAM_TOOL_MATERIALS),
                    List.of(
                            new ArmorMaterial.Layer(Noxerna.prefix("umburam"), "", false),
                            new ArmorMaterial.Layer(Noxerna.prefix("umburam"), "_overlay", false)),
                    0.0F, 0.0F));
    public static final Holder<ArmorMaterial> ADAMUNA = ARMOR_MATERIAL.register(
            "adamuna", () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 8);
            }), 10, SoundEvents.ARMOR_EQUIP_DIAMOND,
                    () -> Ingredient.of(NoxernaTags.ItemTags.ADAMUNA_TOOL_MATERIALS),
                    List.of(
                            new ArmorMaterial.Layer(Noxerna.prefix("adamuna"), "", false),
                            new ArmorMaterial.Layer(Noxerna.prefix("adamuna"), "_overlay", false)),
                    3.0F, 0.1F));
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> NIHOXITE = ARMOR_MATERIAL.register(
            "nihoxite", () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 8);
            }), 15, SoundEvents.ARMOR_EQUIP_NETHERITE,
                    () -> Ingredient.of(NoxernaTags.ItemTags.NIHOXITE_TOOL_MATERIALS),
                    List.of(
                            new ArmorMaterial.Layer(Noxerna.prefix("nihoxite"), "", false),
                            new ArmorMaterial.Layer(Noxerna.prefix("nihoxite"), "_overlay", false)),
                    4.0F, 0.15F));
}
