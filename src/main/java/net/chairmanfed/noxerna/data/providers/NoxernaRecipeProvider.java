package net.chairmanfed.noxerna.data.providers;

import net.chairmanfed.noxerna.TheNoxerna;
import net.chairmanfed.noxerna.registry.NoxernaItems;
import net.chairmanfed.noxerna.registry.NoxernaTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.concurrent.CompletableFuture;


public class NoxernaRecipeProvider extends RecipeProvider {
    public NoxernaRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }
    private ResourceLocation name(String name) {
        return ResourceLocation.fromNamespaceAndPath(TheNoxerna.MODID, name);
    }
    // Shaped Recipes
    public ShapedRecipeBuilder makeBricks(Item input, ItemLike result) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 4)
                .pattern("##")
                .pattern("##")
                .define('#', input)
                .unlockedBy("has_" + input, has(input));
    }
    public  ShapedRecipeBuilder makeStairs(Item input, ItemLike result) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', input)
                .unlockedBy("has_" + input, has(input));
    }
    public ShapedRecipeBuilder makeSlab(Item input, ItemLike result) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 6)
                .pattern("###")
                .define('#', input)
                .unlockedBy("has_" + input, has(input));
    }
    public ShapedRecipeBuilder makeSlabIntoBlock(Item input, ItemLike result) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result)
                .pattern("#")
                .pattern("#")
                .define('#', input)
                .unlockedBy("has_" + input, has(input));
    }
    public ShapedRecipeBuilder makeWoodenFence(Item input, ItemLike result) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result, 3)
                .pattern("#$#")
                .pattern("#$#")
                .define('#', input)
                .define('$', NoxernaTags.ItemTags.NOBLEWOOD_RODS)
                .unlockedBy("has_" + input, has(input));
    }
    public ShapedRecipeBuilder makeWall(Item input, ItemLike result) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 6)
                .pattern("###")
                .pattern("###")
                .define('#', input)
                .unlockedBy("has_" + input, has(input));
    }
    public ShapedRecipeBuilder makeWoodenFenceGate(Item input, ItemLike result) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, result)
                .pattern("$#$")
                .pattern("$#$")
                .define('#', input)
                .define('$', NoxernaTags.ItemTags.NOBLEWOOD_RODS)
                .unlockedBy("has_" + input, has(input));
    }
    public ShapedRecipeBuilder makeDoor(Item input, ItemLike result) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, result, 3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .define('#', input)
                .unlockedBy("has_" + input, has(input));
    }
    public ShapedRecipeBuilder makeTrapdoor(Item input, ItemLike result) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, result, 2)
                .pattern("###")
                .pattern("###")
                .define('#', input)
                .unlockedBy("has_" + input, has(input));
    }
    public ShapedRecipeBuilder makePressurePlate(Item input, ItemLike result) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, result)
                .pattern("##")
                .define('#', input)
                .unlockedBy("has_" + input, has(input));
    }
    public ShapedRecipeBuilder villagerWorkStation(Item input, Item result) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result)
                .pattern("$$")
                .pattern("##")
                .pattern("##")
                .define('$', input)
                .define('#', NoxernaTags.ItemTags.NOBLEWOOD_PLANKS)
                .unlockedBy("has" + input, has(input));
    }
    public ShapedRecipeBuilder villagerWorkStation(TagKey<Item> input, Item result) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result)
                .pattern("$$")
                .pattern("##")
                .pattern("##")
                .define('$', input)
                .define('#', NoxernaTags.ItemTags.NOBLEWOOD_PLANKS)
                .unlockedBy("has" + input, has(input));
    }
    public ShapedRecipeBuilder packing2x2(TagKey<Item> input, ItemLike result) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result)
                .pattern("##")
                .pattern("##")
                .define('#', input)
                .unlockedBy("has" + input, has(input));
    }
    public ShapedRecipeBuilder packing3x3(Item input, ItemLike result) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', input)
                .unlockedBy("has" + input, has(input));
    }
    public ShapedRecipeBuilder packing3x3(Item input, ItemLike result, TagKey tagInput) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result)
                .pattern("$$$")
                .pattern("$#$")
                .pattern("$$$")
                .define('#', input)
                .define('$', tagInput)
                .unlockedBy("has_" + input, has(input));
    }
    public ShapedRecipeBuilder makeSticks(TagKey<Item> input, Item result) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result, 4)
                .pattern("#")
                .pattern("#")
                .define('#', input)
                .unlockedBy("has_" + input, has(input));
    }
    public ShapedRecipeBuilder cloneSmithingTemplate(Item cloneMaterial, Item smithingTemplate) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.MISC, smithingTemplate, 2)
                .pattern("$@$")
                .pattern("$#$")
                .pattern("$$$")
                .define('@', smithingTemplate)
                .define('#', cloneMaterial)
                .define('$', NoxernaTags.ItemTags.ANY_DIAMOND_GEM)
                .unlockedBy("has_" + smithingTemplate, has(smithingTemplate));
    }

    // Tool Recipes
    public ShapedRecipeBuilder makeAxe(TagKey<Item> input, Item result) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, result)
                .pattern("## ")
                .pattern("#$ ")
                .pattern(" $ ")
                .define('#', input)
                .define('$', NoxernaTags.ItemTags.NOBLEWOOD_RODS)
                .unlockedBy("has_" + input, has(input));
    }
    public ShapedRecipeBuilder makeHoe(TagKey<Item> input, Item result) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, result)
                .pattern("## ")
                .pattern(" $ ")
                .pattern(" $ ")
                .define('#', input)
                .define('$', NoxernaTags.ItemTags.NOBLEWOOD_RODS)
                .unlockedBy("has_" + input, has(input));
    }
    public ShapedRecipeBuilder makePickaxe(TagKey<Item> input, Item result) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, result)
                .pattern("###")
                .pattern(" $ ")
                .pattern(" $ ")
                .define('#', input)
                .define('$', NoxernaTags.ItemTags.NOBLEWOOD_RODS)
                .unlockedBy("has_" + input, has(input));
    }
    public ShapedRecipeBuilder makeShovel(TagKey<Item> input, Item result) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, result)
                .pattern(" # ")
                .pattern(" $ ")
                .pattern(" $ ")
                .define('#', input)
                .define('$', NoxernaTags.ItemTags.NOBLEWOOD_RODS)
                .unlockedBy("has_" + input, has(input));
    }
    public ShapedRecipeBuilder makeSword(TagKey<Item> input, Item result) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, result)
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" $ ")
                .define('#', input)
                .define('$', NoxernaTags.ItemTags.NOBLEWOOD_RODS)
                .unlockedBy("has_" + input, has(input));
    }

    // Shapeless Recipes
    public ShapelessRecipeBuilder makePlanks(TagKey<Item> input, ItemLike result) {
        return ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, result, 4)
                .requires(input)
                .unlockedBy("has_" + input, has(input));
    }
    public ShapelessRecipeBuilder unpacking3x3(Item input, ItemLike result) {
        return ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, result, 9)
                .requires(input)
                .unlockedBy("has_" + input, has(input));
    }
    public ShapelessRecipeBuilder makeButton(Item input, ItemLike result) {
        return ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, result)
                .requires(input)
                .unlockedBy("has_" + input, has(input));
    }

    // Smithing Recipes
    public SmithingTransformRecipeBuilder nihoxiteUpgrade(Item base, Item result) {
        return SmithingTransformRecipeBuilder.smithing(
                Ingredient.of(NoxernaItems.NIHOXITE_UPGRADE_SMITHING_TEMPLATE.get()),
                Ingredient.of(base),
                Ingredient.of(NoxernaTags.ItemTags.NIHOXITE_TOOL_MATERIALS),
                RecipeCategory.TOOLS, result)
                .unlocks("has_nihoxite", has(NoxernaItems.NIHOXITE_INGOT.get()));
    }
    public SmithingTransformRecipeBuilder netheriteUpgrade(Item base, Item result) {
        return SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.of(base),
                        Ingredient.of(Items.NETHERITE_INGOT),
                        RecipeCategory.TOOLS, result)
                .unlocks("has_netherite", has(Items.NETHERITE_INGOT));
    }

    public SimpleCookingRecipeBuilder smelting(
            Item input, Item result, Float experience, Integer time) {
        return SimpleCookingRecipeBuilder.smelting(
                        Ingredient.of(input), RecipeCategory.MISC, result, experience.floatValue(), time)
                .unlockedBy("has_" + input, has(input));
    }
    public SimpleCookingRecipeBuilder smelting(
            TagKey<Item> input, Item result, Float experience, Integer time) {
        return SimpleCookingRecipeBuilder.smelting(
                Ingredient.of(input), RecipeCategory.MISC, result, experience.floatValue(), time)
                .unlockedBy("has_" + input, has(input));
    }
    public SimpleCookingRecipeBuilder blasting(
            TagKey<Item> input, Item result, Float experience, Integer time) {
        return SimpleCookingRecipeBuilder.blasting(
                        Ingredient.of(input), RecipeCategory.MISC, result, experience.floatValue(), time)
                .unlockedBy("has_" + input, has(input));
    }

    // Stonecutter Recipes
    public SingleItemRecipeBuilder stonecutting(TagKey<Item> input, ItemLike result) {
        return SingleItemRecipeBuilder.stonecutting(Ingredient.of(input), RecipeCategory.BUILDING_BLOCKS, result)
                .unlockedBy("has_"+ input, has(input));
    }
    public SingleItemRecipeBuilder stonecutting(TagKey<Item> input, ItemLike result, int resultAmount) {
        return SingleItemRecipeBuilder.stonecutting(
                Ingredient.of(input), RecipeCategory.BUILDING_BLOCKS, result, resultAmount)
                .unlockedBy("has_"+ input, has(input));
    }
}
