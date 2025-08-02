package net.chairmanfed.noxerna.data;

import com.google.common.collect.ImmutableList;
import net.chairmanfed.noxerna.Noxerna;
import net.chairmanfed.noxerna.block.NoxernaBlocks;
import net.chairmanfed.noxerna.data.resources.registries.NoxernaBiomes;
import net.chairmanfed.noxerna.effect.NoxernaEffects;
import net.chairmanfed.noxerna.item.NoxernaItems;
import net.chairmanfed.noxerna.registry.*;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementHolder;
import net.minecraft.advancements.AdvancementRequirements;
import net.minecraft.advancements.AdvancementType;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.advancements.critereon.*;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.biome.Biome;
import net.neoforged.neoforge.common.data.AdvancementProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.List;
import java.util.function.Consumer;

public class NoxernaAdvancements implements AdvancementProvider.AdvancementGenerator {
    private static final List<ResourceKey<Biome>> NOXERNA_BIOMES = ImmutableList.of(
            NoxernaBiomes.SURFACE, NoxernaBiomes.NOXUM_DEPTHS, NoxernaBiomes.XENON_GROTTO,
            NoxernaBiomes.KRYPTON_GROTTO, NoxernaBiomes.AESTUM_WASTES, NoxernaBiomes.ARGON_GROVE,
            NoxernaBiomes.NEON_GROVE, NoxernaBiomes.INETRA_CRAGS);

    /**
     * Yoinked this biome advancement builder from {@link net.minecraft.data.advancements.packs.VanillaAdventureAdvancements}.
     * Entirely because it was protected access and I needed it for Cavernous Grand Tour
     */
    protected static Advancement.Builder addBiomes(
            Advancement.Builder pBuilder, HolderLookup.Provider pLevelRegistry, List<ResourceKey<Biome>> pBiomes) {
        HolderGetter<Biome> holdergetter = pLevelRegistry.lookupOrThrow(Registries.BIOME);
        for (ResourceKey<Biome> resourcekey : pBiomes) {
            pBuilder.addCriterion(
                    resourcekey.location().toString(),
                    PlayerTrigger.TriggerInstance.located(
                            LocationPredicate.Builder.inBiome(holdergetter.getOrThrow(resourcekey)))
            );
        }
        return pBuilder;
    }

    @SuppressWarnings("unused")
    @Override
    public void generate(HolderLookup.Provider registries,
                         Consumer<AdvancementHolder> saver, ExistingFileHelper existingFileHelper) {
        // Advancement Root
        AdvancementHolder ROOT = Advancement.Builder.advancement()
                .display(
                        new ItemStack(NoxernaItems.ROOT.get()),
                        Component.translatable("advancement." + Noxerna.MODID + ".root.title"),
                        Component.translatable("advancement." + Noxerna.MODID + ".root.description"),
                        ResourceLocation.fromNamespaceAndPath(Noxerna.MODID, "textures/block/noxum_bricks.png"),
                        AdvancementType.TASK,
                        false,
                        false,
                        false
                )
                .addCriterion("tick", PlayerTrigger.TriggerInstance.tick())
                .save(saver, Noxerna.MODID + ":story/root");

        // Entering Noxerna storyline
        // Find Abandoned Portal
        AdvancementHolder FIND_ABANDONED_PORTAL = Advancement.Builder.advancement()
                .parent(ROOT)
                .display(
                        new ItemStack(NoxernaItems.NOXERNA_PORTAL_FRAME.get()),
                        Component.translatable("advancement." + Noxerna.MODID + ".find_abandoned_portal.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".find_abandoned_portal.description"),
                        null,
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                )
                .addCriterion("found_portal",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .save(saver, Noxerna.MODID + ":story/find_abandoned_portal");
        // Enter Noxerna
        AdvancementHolder ENTER_NOXERNA = Advancement.Builder.advancement()
                .parent(FIND_ABANDONED_PORTAL)
                .display(
                        new ItemStack(NoxernaItems.PYROCHARGE.get()),
                        Component.translatable("advancement." + Noxerna.MODID + ".enter_noxerna.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".enter_noxerna.description"),
                        null,
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                )
                .addCriterion("entered_noxerna",
                        ChangeDimensionTrigger.TriggerInstance.changedDimensionTo(NoxernaDimension.DIMENSION_KEY))
                .save(saver, Noxerna.MODID + ":story/enter_noxerna");
        // Exploring the Noxerna storyline
        // Find any of the Noblephyte Biomes
        AdvancementHolder EXPLORE_NOBLEPHYTE_BIOMES = Advancement.Builder.advancement()
                .parent(ENTER_NOXERNA)
                .display(
                        new ItemStack(Items.RED_MUSHROOM),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".explore_noblephyte_biomes.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".explore_noblephyte_biomes.description"),
                        null,
                        AdvancementType.GOAL,
                        true,
                        true,
                        false
                )
                .requirements(AdvancementRequirements.Strategy.OR)
                .addCriterion("xenon_grotto",
                        PlayerTrigger.TriggerInstance.located(
                                LocationPredicate.Builder.inBiome(registries.lookupOrThrow(Registries.BIOME)
                                        .getOrThrow(NoxernaBiomes.XENON_GROTTO))))
                .addCriterion("krypton_grotto",
                        PlayerTrigger.TriggerInstance.located(
                                LocationPredicate.Builder.inBiome(registries.lookupOrThrow(Registries.BIOME)
                                        .getOrThrow(NoxernaBiomes.KRYPTON_GROTTO))))
                .addCriterion("argon_grove",
                        PlayerTrigger.TriggerInstance.located(
                                LocationPredicate.Builder.inBiome(registries.lookupOrThrow(Registries.BIOME)
                                        .getOrThrow(NoxernaBiomes.ARGON_GROVE))))
                .addCriterion("neon_grove",
                        PlayerTrigger.TriggerInstance.located(
                                LocationPredicate.Builder.inBiome(registries.lookupOrThrow(Registries.BIOME)
                                        .getOrThrow(NoxernaBiomes.NEON_GROVE))))
                .save(saver, Noxerna.MODID + ":story/explore_noblephyte_biomes");
        // Reach the Surface
        AdvancementHolder BREACH_SURFACE = Advancement.Builder.advancement()
                .parent(EXPLORE_NOBLEPHYTE_BIOMES)
                .display(
                        new ItemStack(Items.CAMPFIRE),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".breach_surface.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".breach_surface.description"),
                        null,
                        AdvancementType.CHALLENGE,
                        true,
                        true,
                        true
                )
                .addCriterion("breach_surface",
                        PlayerTrigger.TriggerInstance.located(
                                LocationPredicate.Builder.inBiome(registries.lookupOrThrow(Registries.BIOME)
                                        .getOrThrow(NoxernaBiomes.SURFACE))))
                .save(saver, Noxerna.MODID + ":story/breach_surface");
        // Find all Noxerna Biomes
        NoxernaAdvancements.addBiomes(Advancement.Builder.advancement(), registries, NOXERNA_BIOMES)
                .parent(BREACH_SURFACE)
                .display(
                        new ItemStack(NoxernaItems.NIHOXITE_BOOTS.get()),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".explore_noxerna.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".explore_noxerna.description"),
                        null,
                        AdvancementType.CHALLENGE,
                        true,
                        true,
                        false
                )
                .save(saver, Noxerna.MODID + ":story/explore_noxerna");
        // Automaton storyline
        // Mine Ores while un-registered
        AdvancementHolder CAUGHT_MINING = Advancement.Builder.advancement()
                .parent(ENTER_NOXERNA)
                .display(
                        new ItemStack(Items.IRON_PICKAXE),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".caught_mining.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".caught_mining.description"),
                        null,
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                )
                .addCriterion("caught_mining",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .save(saver, Noxerna.MODID + ":story/caught_mining");
        // Get a Drillaton Identification Chip
        AdvancementHolder GET_LICENSE = Advancement.Builder.advancement()
                .parent(CAUGHT_MINING)
                .display(
                        new ItemStack(Items.IRON_PICKAXE),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".get_license.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".get_license.description"),
                        null,
                        AdvancementType.GOAL,
                        true,
                        true,
                        false
                )
                .addCriterion("get_license",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .save(saver, Noxerna.MODID + ":story/get_license");
        // Resist termination and reach suspicion 5
        AdvancementHolder SUSPICION_FIVE = Advancement.Builder.advancement()
                .parent(CAUGHT_MINING)
                .display(
                        new ItemStack(Items.BARRIER),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".suspicion_five.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".suspicion_five.description"),
                        null,
                        AdvancementType.GOAL,
                        true,
                        true,
                        true
                )
                .addCriterion("suspicion_five",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .save(saver, Noxerna.MODID + ":story/suspicion_five");
        // Use a totem of undying to reset suspicion without dying
        AdvancementHolder SURVIVE_SUSPICION_RESET = Advancement.Builder.advancement()
                .parent(SUSPICION_FIVE)
                .display(
                        new ItemStack(Items.TOTEM_OF_UNDYING),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".survive_suspicion_reset.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".survive_suspicion_reset.description"),
                        null,
                        AdvancementType.CHALLENGE,
                        true,
                        true,
                        true
                )
                .addCriterion("survive_suspicion_reset",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .save(saver, Noxerna.MODID + ":story/survive_suspicion_reset");
        // Foods & Potions storyline
        // Eat all Noxerna Foods
        AdvancementHolder ALL_NOXERNA_FOODS = Advancement.Builder.advancement()
                .parent(ENTER_NOXERNA)
                .display(
                        new ItemStack(Items.COOKED_BEEF),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".all_noxerna_foods.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".all_noxerna_foods.description"),
                        null,
                        AdvancementType.CHALLENGE,
                        true,
                        true,
                        false
                )
                .addCriterion("all_noxerna_foods",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .save(saver, Noxerna.MODID + ":story/all_noxerna_foods");
        // Be affected by all Noxerna potion effects
        AdvancementHolder ALL_NOXERNA_POTIONS = Advancement.Builder.advancement()
                .parent(ALL_NOXERNA_FOODS)
                .display(
                        new ItemStack(Items.POTION),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".all_noxerna_potions.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".all_noxerna_potions.description"),
                        null,
                        AdvancementType.CHALLENGE,
                        true,
                        true,
                        false
                )
                .requirements(AdvancementRequirements.allOf(List.of("impossible", "all_noxerna_potions")))
                .addCriterion("impossible",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .addCriterion("all_noxerna_potions", EffectsChangedTrigger.TriggerInstance.hasEffects(
                        MobEffectsPredicate.Builder.effects()
                                .and(NoxernaEffects.ARMOR_REDUCTION)
                        )
                )
                .save(saver, Noxerna.MODID + ":story/all_noxerna_potions");
        // Be affected by all Noxerna status effects
        AdvancementHolder ALL_NOXERNA_EFFECTS = Advancement.Builder.advancement()
                .parent(ALL_NOXERNA_POTIONS)
                .display(
                        new ItemStack(Items.POTION),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".all_noxerna_effects.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".all_noxerna_effects.description"),
                        null,
                        AdvancementType.CHALLENGE,
                        true,
                        true,
                        true
                )
                .requirements(AdvancementRequirements.allOf(List.of("impossible", "all_noxerna_effects")))
                .addCriterion("impossible",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .addCriterion("all_noxerna_effects", EffectsChangedTrigger.TriggerInstance.hasEffects(
                                MobEffectsPredicate.Builder.effects()
                                        .and(NoxernaEffects.ARMOR_REDUCTION)
                                        .and(NoxernaEffects.FLIGHT_CANCEL)
                        )
                )
                .save(saver, Noxerna.MODID + ":story/all_noxerna_effects");
        // Rocks & Quakes storyline
        // Make any noxerna pickaxe
        AdvancementHolder NOXERNA_TOOLS = Advancement.Builder.advancement()
                .parent(ENTER_NOXERNA)
                .display(
                        new ItemStack(NoxernaItems.NOBLEWOOD_PICKAXE.get()),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".noxerna_tools.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".noxerna_tools.description"),
                        null,
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                )
                .addCriterion("any_noxerna_pickaxe",
                        InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(
                                        NoxernaTags.ItemTags.COMPLETES_NOXERNA_TOOLS_ADVANCEMENT)))
                .save(saver, Noxerna.MODID + ":story/noxerna_tools");
        // have any item in the #noxerna:completes_mine_hard_stone_advancement item tag
        AdvancementHolder MINE_HARD_STONE = Advancement.Builder.advancement()
                .parent(NOXERNA_TOOLS)
                .display(
                        NoxernaBlocks.NOXUM.get(),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".mine_hard_stone.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".mine_hard_stone.description"),
                        null,
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                )
                .addCriterion("hard_stone",
                        InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(
                                        NoxernaTags.ItemTags.COMPLETES_MINE_HARD_STONE_ADVANCEMENT)))
                .save(saver, Noxerna.MODID + ":story/mine_hard_stone");
        // Collect every variant of all stone types
        AdvancementHolder ALL_STONE_VARIANTS = Advancement.Builder.advancement()
                .parent(MINE_HARD_STONE)
                .display(
                        NoxernaBlocks.NOXUM_BRICKS.get(),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".all_stone_variants.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".all_stone_variants.description"),
                        null,
                        AdvancementType.CHALLENGE,
                        true,
                        true,
                        false
                )
                .requirements(AdvancementRequirements.allOf(List.of(
                        "impossible", "noxum", "noxum_stairs", "noxum_slab", "noxum_wall",
                        "noxum_pressure_plate", "noxum_button", "noxum_pebble", "polished_noxum",
                        "polished_noxum_stairs", "polished_noxum_slab", "polished_noxum_wall", "noxum_bricks",
                        "noxum_brick_stairs", "noxum_brick_slab", "noxum_brick_wall")))
                .addCriterion("impossible",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .addCriterion("noxum", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(NoxernaBlocks.NOXUM.get().asItem())))
                .addCriterion("noxum_stairs", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(NoxernaBlocks.NOXUM_STAIRS.get().asItem())))
                .addCriterion("noxum_slab",
                        InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(NoxernaBlocks.NOXUM_SLAB.get().asItem())))
                .addCriterion("noxum_wall",
                        InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(NoxernaBlocks.NOXUM_WALL.get().asItem())))
                .addCriterion("noxum_pressure_plate",
                        InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(NoxernaBlocks.NOXUM_PRESSURE_PLATE.get().asItem())))
                .addCriterion("noxum_button",
                        InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(NoxernaBlocks.NOXUM_BUTTON.get().asItem())))
                .addCriterion("noxum_pebble",
                        InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(NoxernaBlocks.NOXUM_PEBBLE.get().asItem())))
                .addCriterion("polished_noxum", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(NoxernaBlocks.POLISHED_NOXUM.get().asItem())))
                .addCriterion("polished_noxum_stairs", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(NoxernaBlocks.POLISHED_NOXUM_STAIRS.get().asItem())))
                .addCriterion("polished_noxum_slab",
                        InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(NoxernaBlocks.POLISHED_NOXUM_SLAB.get().asItem())))
                .addCriterion("polished_noxum_wall",
                        InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(NoxernaBlocks.POLISHED_NOXUM_WALL.get().asItem())))
                .addCriterion("noxum_bricks", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(NoxernaBlocks.NOXUM_BRICKS.get().asItem())))
                .addCriterion("noxum_brick_stairs", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(NoxernaBlocks.NOXUM_BRICK_STAIRS.get().asItem())))
                .addCriterion("noxum_brick_slab",
                        InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(NoxernaBlocks.NOXUM_BRICK_SLAB.get().asItem())))
                .addCriterion("noxum_brick_wall",
                        InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(NoxernaBlocks.NOXUM_BRICK_WALL.get().asItem())))
                .save(saver, Noxerna.MODID + ":story/all_stone_variants");
        // Experience a quake while in the Noxerna
        AdvancementHolder NOXQUAKE = Advancement.Builder.advancement()
                .parent(MINE_HARD_STONE)
                .display(
                        NoxernaBlocks.NOXUM.get(),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".noxquake.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".noxquake.description"),
                        null,
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                )
                .addCriterion("noxquake",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .save(saver, Noxerna.MODID + ":story/noxquake");
        // Get a Portable Seismometer
        AdvancementHolder PORTABLE_SEISMOMETER = Advancement.Builder.advancement()
                .parent(NOXQUAKE)
                .display(
                        new ItemStack(Items.CLOCK),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".portable_seismometer.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".portable_seismometer.description"),
                        null,
                        AdvancementType.GOAL,
                        true,
                        true,
                        false
                )
                .addCriterion("portable_seismometer",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .save(saver, Noxerna.MODID + ":story/portable_seismometer");
        // Experience a natural Magnitude 10 Quake while in the Noxerna
        AdvancementHolder MAGNITUDE_TEN_NOXQUAKE = Advancement.Builder.advancement()
                .parent(PORTABLE_SEISMOMETER)
                .display(
                        new ItemStack(Items.CLOCK),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".magnitude_ten_noxquake.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".magnitude_ten_noxquake.description"),
                        null,
                        AdvancementType.CHALLENGE,
                        true,
                        true,
                        true
                )
                .addCriterion("magnitude_ten_noxquake",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .save(saver, Noxerna.MODID + ":story/magnitude_ten_noxquake");
        // Fishing storyline
        // Catch any Noxerna fish
        AdvancementHolder NOXERNA_FISH = Advancement.Builder.advancement()
                .parent(ENTER_NOXERNA)
                .display(
                        new ItemStack(Items.FISHING_ROD),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".noxerna_fish.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".noxerna_fish.description"),
                        null,
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                )
                .addCriterion("noxerna_fish",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .save(saver, Noxerna.MODID + ":story/noxerna_fish");
        // Ride a Volcanic Flatfish
        AdvancementHolder RIDE_FLATFISH = Advancement.Builder.advancement()
                .parent(NOXERNA_FISH)
                .display(
                        new ItemStack(Items.SADDLE),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".ride_flatfish.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".ride_flatfish.description"),
                        null,
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                )
                .addCriterion("ride_flatfish",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .save(saver, Noxerna.MODID + ":story/ride_flatfish");
        // Ride a Volcanic Flatfish for 50 blocks in the: Overworld, Nether and End
        AdvancementHolder RIDE_FLATFISH_IN_OTHER_DIMENSIONS = Advancement.Builder.advancement()
                .parent(RIDE_FLATFISH)
                .display(
                        new ItemStack(Items.SADDLE),
                        Component.translatable(
                                "advancement." + Noxerna.MODID +
                                        ".ride_flatfish_in_other_dimensions.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID +
                                        ".ride_flatfish_in_other_dimensions.description"),
                        null,
                        AdvancementType.CHALLENGE,
                        true,
                        true,
                        false
                )
                .addCriterion("ride_flatfish_in_other_dimensions",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .save(saver, Noxerna.MODID + ":story/ride_flatfish_in_other_dimensions");
        // Catch a fish from Superheated Lava
        AdvancementHolder SUPERHEATED_LAVA_FISH = Advancement.Builder.advancement()
                .parent(NOXERNA_FISH)
                .display(
                        new ItemStack(Items.FISHING_ROD),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".superheated_lava_fish.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".superheated_lava_fish.description"),
                        null,
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                )
                .addCriterion("superheated_lava_fish",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .save(saver, Noxerna.MODID + ":story/superheated_lava_fish");
        // Catch a fish from Liquefied Shadow
        AdvancementHolder LIQUEFIED_SHADOW_FISH = Advancement.Builder.advancement()
                .parent(SUPERHEATED_LAVA_FISH)
                .display(
                        new ItemStack(Items.FISHING_ROD),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".liquefied_shadow_fish.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".liquefied_shadow_fish.description"),
                        null,
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                )
                .addCriterion("liquefied_shadow_fish",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .save(saver, Noxerna.MODID + ":story/liquefied_shadow_fish");
        // Catch every Noxerna fish
        AdvancementHolder CATCH_ALL_FISH = Advancement.Builder.advancement()
                .parent(LIQUEFIED_SHADOW_FISH)
                .display(
                        new ItemStack(Items.FISHING_ROD),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".catch_all_fish.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".catch_all_fish.description"),
                        null,
                        AdvancementType.CHALLENGE,
                        true,
                        true,
                        false
                )
                .addCriterion("catch_all_fish",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .save(saver, Noxerna.MODID + ":story/catch_all_fish");
        // Ferrebris Tool storyline, continuing from "MINE_HARD_STONE"
        // Get a Ferrebris ingot
        AdvancementHolder SMELT_FERREBRIS = Advancement.Builder.advancement()
                .parent(MINE_HARD_STONE)
                .display(
                        new ItemStack(NoxernaItems.FERREBRIS_INGOT.get()),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".smelt_ferrebris.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".smelt_ferrebris.description"),
                        null,
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                )
                .addCriterion("ferrebris_ingot",
                        InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(
                                        NoxernaTags.ItemTags.FERREBRIS_INGOTS)))
                .save(saver, Noxerna.MODID + ":story/smelt_ferrebris");
        // Obtain every mineral from the Noxerna
        AdvancementHolder MINE_NATIVE_MINERALS = Advancement.Builder.advancement()
                .parent(SMELT_FERREBRIS)
                .display(
                        new ItemStack(NoxernaItems.MINE_NATIVE_MINERALS.get()),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".mine_native_minerals.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".mine_native_minerals.description"),
                        null,
                        AdvancementType.CHALLENGE,
                        true,
                        true,
                        false
                )
                .requirements(AdvancementRequirements.allOf(List.of(
                        "lumai_crystal", "raw_ferrebris", "raw_obscuprum", "raw_umburam", "raw_inperlum",
                        "teneryl", "adamuna", "vitragor", "ferrebris", "obscuprum", "umburam",
                        "inperlum", "nihoxite")))
                .addCriterion("lumai_crystal",
                        InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(NoxernaItems.LUMAI_CRYSTAL)))
                .addCriterion("raw_ferrebris",
                        InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(NoxernaItems.RAW_FERREBRIS)))
                .addCriterion("raw_obscuprum",
                        InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(NoxernaItems.RAW_OBSCUPRUM)))
                .addCriterion("raw_umburam",
                        InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(NoxernaItems.RAW_UMBURAM)))
                .addCriterion("raw_inperlum",
                        InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(NoxernaItems.RAW_INPERLUM)))
                .addCriterion("teneryl",
                        InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(NoxernaItems.TENERYL)))
                .addCriterion("adamuna",
                        InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(NoxernaItems.ADAMUNA)))
                .addCriterion("vitragor",
                        InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(NoxernaItems.VITRAGOR)))
                .addCriterion("ferrebris",
                        InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(NoxernaItems.FERREBRIS_INGOT)))
                .addCriterion("obscuprum",
                        InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(NoxernaItems.OBSCUPRUM_INGOT)))
                .addCriterion("umburam",
                        InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(NoxernaItems.UMBURAM_INGOT)))
                .addCriterion("inperlum",
                        InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(NoxernaItems.INPERLUM_INGOT)))
                .addCriterion("nihoxite",
                        InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(NoxernaItems.NIHOXITE_INGOT)))
                .save(saver, Noxerna.MODID + ":story/mine_native_minerals");
        // Switch a Noxerna material to its equivalent vanilla material or vice versa.
        AdvancementHolder ATTUNEMENT_ALCHEMY = Advancement.Builder.advancement()
                .parent(SMELT_FERREBRIS)
                .display(
                        new ItemStack(Items.BEACON),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".attunement_alchemy.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".attunement_alchemy.description"),
                        null,
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                )
                .addCriterion("attunement_alchemy",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .save(saver, Noxerna.MODID + ":story/attunement_alchemy");
        // Have a bucket (or ferrebris bucket) of Superheated Lava
        AdvancementHolder SUPERHEATED_LAVA_BUCKET = Advancement.Builder.advancement()
                .parent(SMELT_FERREBRIS)
                .display(
                        new ItemStack(Items.LAVA_BUCKET),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".superheated_lava_bucket.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".superheated_lava_bucket.description"),
                        null,
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                )
                .addCriterion("superheated_lava_bucket",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .save(saver, Noxerna.MODID + ":story/superheated_lava_bucket");
        // Get a Season Radar
        AdvancementHolder SEASON_RADAR = Advancement.Builder.advancement()
                .parent(SMELT_FERREBRIS)
                .display(
                        new ItemStack(Items.CLOCK),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".season_radar.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".season_radar.description"),
                        null,
                        AdvancementType.GOAL,
                        true,
                        true,
                        false
                )
                .addCriterion("season_radar",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .save(saver, Noxerna.MODID + ":story/season_radar");
        // Experience all 4 Noxerna Seasons
        AdvancementHolder FULL_NOXERNA_YEAR = Advancement.Builder.advancement()
                .parent(SEASON_RADAR)
                .display(
                        new ItemStack(Items.CLOCK),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".full_noxerna_year.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".full_noxerna_year.description"),
                        null,
                        AdvancementType.CHALLENGE,
                        true,
                        true,
                        true
                )
                .addCriterion("full_noxerna_year",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .save(saver, Noxerna.MODID + ":story/full_noxerna_year");
        // Have any piece of Ferrebris armour
        AdvancementHolder FERREBRIS_ARMOR = Advancement.Builder.advancement()
                .parent(SMELT_FERREBRIS)
                .display(
                        new ItemStack(NoxernaItems.FERREBRIS_CHESTPLATE.get()),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".ferrebris_armor.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".ferrebris_armor.description"),
                        null,
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                )
                .addCriterion("ferrebris_armor",
                        InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(
                                        NoxernaItems.FERREBRIS_HELMET.get(),
                                        NoxernaItems.FERREBRIS_CHESTPLATE.get(),
                                        NoxernaItems.FERREBRIS_LEGGINGS.get(),
                                        NoxernaItems.FERREBRIS_BOOTS.get())))
                .save(saver, Noxerna.MODID + ":story/ferrebris_armor");
        // Have a full set of Ferrebris armour
        AdvancementHolder FULL_FERREBRIS_ARMOR = Advancement.Builder.advancement()
                .parent(FERREBRIS_ARMOR)
                .display(
                        new ItemStack(NoxernaItems.FERREBRIS_CHESTPLATE.get()),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".full_ferrebris_armor.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".full_ferrebris_armor.description"),
                        null,
                        AdvancementType.GOAL,
                        true,
                        true,
                        false
                )
                .addCriterion("full_ferrebris_armor",
                        InventoryChangeTrigger.TriggerInstance.hasItems(
                                        NoxernaItems.FERREBRIS_HELMET.get(),
                                        NoxernaItems.FERREBRIS_CHESTPLATE.get(),
                                        NoxernaItems.FERREBRIS_LEGGINGS.get(),
                                        NoxernaItems.FERREBRIS_BOOTS.get()))
                .save(saver, Noxerna.MODID + ":story/full_ferrebris_armor");
        // Make a ferrebris shield
        AdvancementHolder FERREBRIS_SHIELD = Advancement.Builder.advancement()
                .parent(SMELT_FERREBRIS)
                .display(
                        new ItemStack(NoxernaItems.FERREBRIS_SHIELD.get()),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".ferrebris_shield.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".ferrebris_shield.description"),
                        null,
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                )
                .addCriterion("ferrebris_shield",
                        InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(
                                        NoxernaItems.FERREBRIS_SHIELD)))
                .save(saver, Noxerna.MODID + ":story/ferrebris_shield");
        // Make a Ferrebris pickaxe
        AdvancementHolder FERREBRIS_TOOLS = Advancement.Builder.advancement()
                .parent(SMELT_FERREBRIS)
                .display(
                        new ItemStack(NoxernaItems.FERREBRIS_PICKAXE.get()),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".ferrebris_tools.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".ferrebris_tools.description"),
                        null,
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                )
                .addCriterion("ferrebris_pickaxe",
                        InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(
                                        NoxernaItems.FERREBRIS_PICKAXE.get())))
                .save(saver, Noxerna.MODID + ":story/ferrebris_tools");
        // Adamuna storyline, continuing from "FERREBRIS_TOOLS"
        // Get a Superthermal Meter
        AdvancementHolder SUPERTHERMAL_METER = Advancement.Builder.advancement()
                .parent(FERREBRIS_TOOLS)
                .display(
                        new ItemStack(Items.CLOCK),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".superthermal_meter.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".superthermal_meter.description"),
                        null,
                        AdvancementType.GOAL,
                        true,
                        true,
                        false
                )
                .addCriterion("superthermal_meter",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .save(saver, Noxerna.MODID + ":story/superthermal_meter");
        // Experience a Super-Heatwave
        AdvancementHolder SUPER_HEATWAVE = Advancement.Builder.advancement()
                .parent(SUPERTHERMAL_METER)
                .display(
                        new ItemStack(Items.CLOCK),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".super_heatwave.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".super_heatwave.description"),
                        null,
                        AdvancementType.GOAL,
                        true,
                        true,
                        false
                )
                .addCriterion("super_heatwave",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .save(saver, Noxerna.MODID + ":story/super_heatwave");
        // Obtain Adamuna
        AdvancementHolder MINE_ADAMUNA = Advancement.Builder.advancement()
                .parent(FERREBRIS_TOOLS)
                .display(
                        new ItemStack(NoxernaItems.ADAMUNA.get()),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".mine_adamuna.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".mine_adamuna.description"),
                        null,
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                )
                .addCriterion("adamuna",
                        InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(
                                        NoxernaTags.ItemTags.ADAMUNA_TOOL_MATERIALS)))
                .save(saver, Noxerna.MODID + ":story/mine_adamuna");
        // Give an Adamuna to someone else
        AdvancementHolder GIVE_ADAMUNA = Advancement.Builder.advancement()
                .parent(MINE_ADAMUNA)
                .display(
                        new ItemStack(NoxernaItems.ADAMUNA.get()),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".give_adamuna.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".give_adamuna.description"),
                        null,
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                )
                .addCriterion("give_adamuna",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .save(saver, Noxerna.MODID + ":story/give_adamuna");
        // Have a piece of Adamuna armour
        AdvancementHolder ADAMUNA_ARMOR = Advancement.Builder.advancement()
                .parent(MINE_ADAMUNA)
                .display(
                        new ItemStack(NoxernaItems.ADAMUNA_CHESTPLATE.get()),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".adamuna_armor.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".adamuna_armor.description"),
                        null,
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                )
                .addCriterion("adamuna_armor",
                        InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(
                                        NoxernaItems.ADAMUNA_HELMET.get(),
                                        NoxernaItems.ADAMUNA_CHESTPLATE.get(),
                                        NoxernaItems.ADAMUNA_LEGGINGS.get(),
                                        NoxernaItems.ADAMUNA_BOOTS.get())))
                .save(saver, Noxerna.MODID + ":story/adamuna_armor");
        // Have a full set of Adamuna armour
        AdvancementHolder FULL_ADAMUNA_ARMOR = Advancement.Builder.advancement()
                .parent(ADAMUNA_ARMOR)
                .display(
                        new ItemStack(NoxernaItems.ADAMUNA_CHESTPLATE.get()),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".full_adamuna_armor.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".full_adamuna_armor.description"),
                        null,
                        AdvancementType.GOAL,
                        true,
                        true,
                        false
                )
                .addCriterion("full_adamuna_armor",
                        InventoryChangeTrigger.TriggerInstance.hasItems(
                                        NoxernaItems.ADAMUNA_HELMET.get(),
                                        NoxernaItems.ADAMUNA_CHESTPLATE.get(),
                                        NoxernaItems.ADAMUNA_LEGGINGS.get(),
                                        NoxernaItems.ADAMUNA_BOOTS.get()))
                .save(saver, Noxerna.MODID + ":story/full_adamuna_armor");
        // Nihoxite storyline, continuing from "MINE_ADAMUNA"
        // Obtain Raw Inperlum
        AdvancementHolder MINE_INPERLUM = Advancement.Builder.advancement()
                .parent(MINE_ADAMUNA)
                .display(
                        new ItemStack(NoxernaItems.RAW_INPERLUM.get()),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".mine_inperlum.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".mine_inperlum.description"),
                        null,
                        AdvancementType.GOAL,
                        true,
                        true,
                        false
                )
                .addCriterion("raw_inperlum",
                        InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(
                                        NoxernaTags.ItemTags.RAW_INPERLUM_MATERIALS)))
                .save(saver, Noxerna.MODID + ":story/mine_inperlum");
        // Combine Inperlum & Ferrebris with liquid void
        AdvancementHolder REFINE_NIHOXITE = Advancement.Builder.advancement()
                .parent(MINE_INPERLUM)
                .display(
                        new ItemStack(NoxernaItems.NIHOXITE_INGOT.get()),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".refine_nihoxite.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".refine_nihoxite.description"),
                        null,
                        AdvancementType.GOAL,
                        true,
                        true,
                        false
                )
                .addCriterion("nihoxite_ingot",
                        InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(
                                        NoxernaTags.ItemTags.NIHOXITE_INGOTS)))
                .save(saver, Noxerna.MODID + ":story/refine_nihoxite");
        // Make a Nihoxite Hoe, like an idiot...
        AdvancementHolder NIHOXITE_HOE = Advancement.Builder.advancement()
                .parent(REFINE_NIHOXITE)
                .display(
                        new ItemStack(NoxernaItems.NIHOXITE_HOE.get()),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".nihoxite_hoe.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".nihoxite_hoe.description"),
                        null,
                        AdvancementType.CHALLENGE,
                        true,
                        true,
                        false
                )
                .addCriterion("nihoxite_hoe",
                        InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(NoxernaItems.NIHOXITE_HOE.get())))
                .save(saver, Noxerna.MODID + ":story/nihoxite_hoe");
        // Have a full set of Nihoxite armour
        AdvancementHolder NIHOXITE_ARMOR = Advancement.Builder.advancement()
                .parent(REFINE_NIHOXITE)
                .display(
                        new ItemStack(NoxernaItems.NIHOXITE_CHESTPLATE.get()),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".nihoxite_armor.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".nihoxite_armor.description"),
                        null,
                        AdvancementType.CHALLENGE,
                        true,
                        true,
                        false
                )
                .addCriterion("nihoxite_armor",
                        InventoryChangeTrigger.TriggerInstance.hasItems(
                                        NoxernaItems.NIHOXITE_HELMET.get(),
                                        NoxernaItems.NIHOXITE_CHESTPLATE.get(),
                                        NoxernaItems.NIHOXITE_LEGGINGS.get(),
                                        NoxernaItems.NIHOXITE_BOOTS.get()))
                .save(saver, Noxerna.MODID + ":story/nihoxite_armor");
        // Noxerna Boss storyline (Megatomaton)
        // Find a section of ruined railway
        AdvancementHolder NOXERNA_RAILWAY = Advancement.Builder.advancement()
                .parent(ENTER_NOXERNA)
                .display(
                        new ItemStack(Items.RAIL),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".noxerna_railway.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".noxerna_railway.description"),
                        null,
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                )
                .addCriterion("noxerna_railway",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .save(saver, Noxerna.MODID + ":story/noxerna_railway");
        // Find an ore refinery
        AdvancementHolder ORE_REFINERY = Advancement.Builder.advancement()
                .parent(NOXERNA_RAILWAY)
                .display(
                        new ItemStack(Items.FURNACE),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".ore_refinery.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".ore_refinery.description"),
                        null,
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                )
                .addCriterion("ore_refinery",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .save(saver, Noxerna.MODID + ":story/ore_refinery");
        // Find the automaton manufacturing plant
        AdvancementHolder FIND_MEGATOMATON_ARENA = Advancement.Builder.advancement()
                .parent(ORE_REFINERY)
                .display(
                        new ItemStack(Items.CRAFTER),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".find_megatomaton_arena.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".find_megatomaton_arena.description"),
                        null,
                        AdvancementType.GOAL,
                        true,
                        true,
                        false
                )
                .addCriterion("megatomaton_arena",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .save(saver, Noxerna.MODID + ":story/find_megatomaton_arena");
        // Summon Megatomaton
        AdvancementHolder AWAKEN_MEGATOMATON = Advancement.Builder.advancement()
                .parent(FIND_MEGATOMATON_ARENA)
                .display(
                        new ItemStack(NoxernaItems.AWAKEN_MEGATOMATON.get()),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".awaken_megatomaton.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".awaken_megatomaton.description"),
                        null,
                        AdvancementType.GOAL,
                        true,
                        true,
                        false
                )
                .addCriterion("awakened_megatomaton",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .save(saver, Noxerna.MODID + ":story/awaken_megatomaton");
        // Defeat Megatomaton
        AdvancementHolder DEFEAT_MEGATOMATON = Advancement.Builder.advancement()
                .parent(AWAKEN_MEGATOMATON)
                .display(
                        new ItemStack(NoxernaItems.DEFEAT_MEGATOMATON.get()),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".defeat_megatomaton.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".defeat_megatomaton.description"),
                        null,
                        AdvancementType.CHALLENGE,
                        true,
                        true,
                        true
                )
                .addCriterion("defeated_megatomaton",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .save(saver, Noxerna.MODID + ":story/defeat_megatomaton");
        // Lumai Crystal Energy Weapons
        AdvancementHolder ENERGY_WEAPONS = Advancement.Builder.advancement()
                .parent(DEFEAT_MEGATOMATON)
                .display(
                        new ItemStack(Items.LIGHTNING_ROD),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".energy_weapons.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".energy_weapons.description"),
                        null,
                        AdvancementType.GOAL,
                        true,
                        true,
                        true
                )
                .addCriterion("energy_weapons",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .save(saver, Noxerna.MODID + ":story/energy_weapons");
        // Brick a Charge Node
        AdvancementHolder SHUTDOWN_CHARGE_NODE = Advancement.Builder.advancement()
                .parent(ENERGY_WEAPONS)
                .display(
                        new ItemStack(Items.LIGHTNING_ROD),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".shutdown_charge_node.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".shutdown_charge_node.description"),
                        null,
                        AdvancementType.GOAL,
                        true,
                        true,
                        true
                )
                .addCriterion("shutdown_charge_node",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .save(saver, Noxerna.MODID + ":story/shutdown_charge_node");
        // Noxerna Boss storyline (Sulfernus)
        // Find a geothermal outpost
        AdvancementHolder GEOTHERMAL_OUTPOST = Advancement.Builder.advancement()
                .parent(ORE_REFINERY)
                .display(
                        new ItemStack(Items.MAGMA_BLOCK),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".geothermal_outpost.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".geothermal_outpost.description"),
                        null,
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                )
                .addCriterion("geothermal_outpost",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .save(saver, Noxerna.MODID + ":story/geothermal_outpost");
        // Find an ashen village
        AdvancementHolder ASHEN_VILLAGE = Advancement.Builder.advancement()
                .parent(GEOTHERMAL_OUTPOST)
                .display(
                        new ItemStack(Items.NETHER_BRICK_STAIRS),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".ashen_village.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".ashen_village.description"),
                        null,
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                )
                .addCriterion("ashen_village",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .save(saver, Noxerna.MODID + ":story/ashen_village");
        // Find the lost city
        AdvancementHolder FIND_SULFERNUS_ARENA = Advancement.Builder.advancement()
                .parent(ASHEN_VILLAGE)
                .display(
                        new ItemStack(Items.REINFORCED_DEEPSLATE),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".find_sulfernus_arena.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".find_sulfernus_arena.description"),
                        null,
                        AdvancementType.GOAL,
                        true,
                        true,
                        false
                )
                .addCriterion("sulfernus_arena",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .save(saver, Noxerna.MODID + ":story/find_sulfernus_arena");
        // Summon Sulfernus
        AdvancementHolder AWAKEN_SULFERNUS = Advancement.Builder.advancement()
                .parent(FIND_SULFERNUS_ARENA)
                .display(
                        new ItemStack(Items.TRIAL_SPAWNER),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".awaken_sulfernus.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".awaken_sulfernus.description"),
                        null,
                        AdvancementType.GOAL,
                        true,
                        true,
                        false
                )
                .addCriterion("awakened_sulfernus",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .save(saver, Noxerna.MODID + ":story/awaken_sulfernus");
        // Defeat Sulfernus
        AdvancementHolder DEFEAT_SULFERNUS = Advancement.Builder.advancement()
                .parent(AWAKEN_SULFERNUS)
                .display(
                        new ItemStack(Items.VAULT),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".defeat_sulfernus.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".defeat_sulfernus.description"),
                        null,
                        AdvancementType.CHALLENGE,
                        true,
                        true,
                        true
                )
                .addCriterion("defeated_sulfernus",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .save(saver, Noxerna.MODID + ":story/defeat_sulfernus");
        // Noxerna Boss storyline (Void Tyrant)
        // Find an ancient fortress
        AdvancementHolder ANCIENT_FORTRESS = Advancement.Builder.advancement()
                .parent(ASHEN_VILLAGE)
                .display(
                        NoxernaBlocks.NOXUM_BRICKS.get(),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".ancient_fortress.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".ancient_fortress.description"),
                        null,
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                )
                .addCriterion("ancient_fortress",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .save(saver, Noxerna.MODID + ":story/ancient_fortress");
        // Find a pale castle
        AdvancementHolder FIND_PALE_CASTLE = Advancement.Builder.advancement()
                .parent(ANCIENT_FORTRESS)
                .display(
                        new ItemStack(Items.QUARTZ_BRICKS),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".find_pale_castle.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".find_pale_castle.description"),
                        null,
                        AdvancementType.GOAL,
                        true,
                        true,
                        false
                )
                .addCriterion("find_pale_castle",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .save(saver, Noxerna.MODID + ":story/find_pale_castle");
        // Obtain a Void Key
        AdvancementHolder VOID_KEY = Advancement.Builder.advancement()
                .parent(FIND_PALE_CASTLE)
                .display(
                        new ItemStack(Items.OMINOUS_TRIAL_KEY),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".void_key.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".void_key.description"),
                        null,
                        AdvancementType.GOAL,
                        true,
                        true,
                        false
                )
                .addCriterion("void_key",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .save(saver, Noxerna.MODID + ":story/void_key");
        // Enter the Void Throne
        AdvancementHolder OPEN_VOID_WELL = Advancement.Builder.advancement()
                .parent(VOID_KEY)
                .display(
                        new ItemStack(Items.END_PORTAL_FRAME),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".open_void_well.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".open_void_well.description"),
                        null,
                        AdvancementType.GOAL,
                        true,
                        true,
                        false
                )
                .addCriterion("open_void_well",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .save(saver, Noxerna.MODID + ":story/open_void_well");
        // Challenge Void Tyrant
        AdvancementHolder CHALLENGE_VOID_TYRANT = Advancement.Builder.advancement()
                .parent(OPEN_VOID_WELL)
                .display(
                        new ItemStack(Items.TRIAL_SPAWNER),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".challenge_void_tyrant.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".challenge_void_tyrant.description"),
                        null,
                        AdvancementType.GOAL,
                        true,
                        false,
                        true
                )
                .addCriterion("challenged_void_tyrant",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .save(saver, Noxerna.MODID + ":story/challenge_void_tyrant");
        // Defeat Void Tyrant
        AdvancementHolder DEFEAT_VOID_TYRANT = Advancement.Builder.advancement()
                .parent(CHALLENGE_VOID_TYRANT)
                .display(
                        new ItemStack(Items.VAULT),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".defeat_void_tyrant.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".defeat_void_tyrant.description"),
                        null,
                        AdvancementType.CHALLENGE,
                        true,
                        true,
                        true
                )
                .addCriterion("defeated_void_tyrant",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .save(saver, Noxerna.MODID + ":story/defeat_void_tyrant");
        // Completionist Extras
        // Kill all Noxerna mobs
        AdvancementHolder KILL_ALL_NOXERNA_MOBS = Advancement.Builder.advancement()
                .parent(DEFEAT_VOID_TYRANT)
                .display(
                        new ItemStack(NoxernaItems.NIHOXITE_SWORD.get()),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".kill_all_noxerna_mobs.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".kill_all_noxerna_mobs.description"),
                        null,
                        AdvancementType.CHALLENGE,
                        true,
                        true,
                        false
                )
                .addCriterion("kill_all_noxerna_mobs",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .save(saver, Noxerna.MODID + ":story/kill_all_noxerna_mobs");
        // Complete all other Advancements
        AdvancementHolder COMPLETE_ALL_CHALLENGES = Advancement.Builder.advancement()
                .parent(KILL_ALL_NOXERNA_MOBS)
                .display(
                        new ItemStack(NoxernaItems.COMPLETE_ALL_CHALLENGES.get()),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".complete_all_challenges.title"),
                        Component.translatable(
                                "advancement." + Noxerna.MODID + ".complete_all_challenges.description"),
                        null,
                        AdvancementType.CHALLENGE,
                        true,
                        true,
                        true
                )
                .addCriterion("complete_all_challenges",
                        CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                .save(saver, Noxerna.MODID + ":story/complete_all_challenges");
    }
}
