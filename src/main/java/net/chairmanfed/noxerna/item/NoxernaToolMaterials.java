package net.chairmanfed.noxerna.item;

import net.chairmanfed.noxerna.registry.NoxernaTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class NoxernaToolMaterials {
    public static final Tier NOBLEWOOD = new SimpleTier(
            NoxernaTags.BlockTags.INCORRECT_FOR_NOBLEWOOD_TOOL, 199, 9.0f, -1.0f,
            15, () -> Ingredient.of(NoxernaTags.ItemTags.NOBLEWOOD_PLANKS));
    public static final Tier NOXSTONE = new SimpleTier(
            NoxernaTags.BlockTags.INCORRECT_FOR_NOXSTONE_TOOL, 311, 11.0f, -1.0f,
            5, () -> Ingredient.of(NoxernaTags.ItemTags.NOXSTONE_TOOL_MATERIALS));
    public static final Tier FERREBRIS = new SimpleTier(
            NoxernaTags.BlockTags.INCORRECT_FOR_FERREBRIS_TOOL, 723, 13.0f, 0.0f,
            14, () -> Ingredient.of(NoxernaTags.ItemTags.FERREBRIS_TOOL_MATERIALS));
    public static final Tier UMBURAM = new SimpleTier(
            NoxernaTags.BlockTags.INCORRECT_FOR_UMBURAM_TOOL, 161, 19.0f, -1.0f,
            22, () -> Ingredient.of(NoxernaTags.ItemTags.UMBURAM_TOOL_MATERIALS));
    public static final Tier ADAMUNA = new SimpleTier(
            NoxernaTags.BlockTags.INCORRECT_FOR_ADAMUNA_TOOL, 2360, 15.0f, 1.0f,
            10, () -> Ingredient.of(NoxernaTags.ItemTags.ADAMUNA_TOOL_MATERIALS));
    public static final Tier NIHOXITE = new SimpleTier(
            NoxernaTags.BlockTags.INCORRECT_FOR_NIHOXITE_TOOL, 3071, 16.0f, 2.0f,
            15, () -> Ingredient.of(NoxernaTags.ItemTags.NIHOXITE_TOOL_MATERIALS));
}
