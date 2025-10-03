package net.chairmanfed.noxerna.registry;

import net.chairmanfed.noxerna.Noxerna;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;

public class NoxernaTags {
    public static class ItemTags {
        // Local Tags
        // Advancement Logic
        public static final TagKey<Item> COMPLETES_MINE_HARD_STONE_ADVANCEMENT = localTag(
                "completes_mine_hard_stone_advancement");
        public static final TagKey<Item> COMPLETES_NOXERNA_TOOLS_ADVANCEMENT = localTag(
                "completes_noxerna_tools_advancement");
        // Tool Groupings
        public static final TagKey<Item> PICKADZES = localTag("pickadzes");
        // Tool Material Groups
        public static final TagKey<Item> NOBLEWOOD_PLANKS = localTag("noblewood_planks");
        public static final TagKey<Item> ANY_IRON_INGOT = localTag("any_iron_ingot");
        public static final TagKey<Item> ANY_DIAMOND_GEM = localTag("any_diamond_gem");
        public static final TagKey<Item> PLATED_PILLAR_LIGHTS = localTag("plated_pillar_lights");
        public static final TagKey<Item> NOXSTONE_TOOL_MATERIALS = localTag("noxstone_tool_materials");
        public static final TagKey<Item> FERREBRIS_TOOL_MATERIALS = localTag("ferrebris_tool_materials");
        public static final TagKey<Item> UMBURAM_TOOL_MATERIALS = localTag("umburam_tool_materials");
        public static final TagKey<Item> ADAMUNA_TOOL_MATERIALS = localTag("adamuna_tool_materials");
        public static final TagKey<Item> NIHOXITE_TOOL_MATERIALS = localTag("nihoxite_tool_materials");
        public static final TagKey<Item> MYSTERIOUS_ALLOY_RECYCLABLE_LOSSY = localTag("recyclable/mysterious_alloy_lossy");
        public static final TagKey<Item> MYSTERIOUS_ALLOY_RECYCLABLE_LOSSLESS = localTag("recyclable/mysterious_alloy_lossless");
        // Block Groups
        public static final TagKey<Item> BLOCKSET_SOLTRA = localTag("blockset/soltra");
        public static final TagKey<Item> BLOCKSET_NOXUM = localTag("blockset/noxum");
        public static final TagKey<Item> BLOCKSET_AESTUM = localTag("blockset/aestum");
        public static final TagKey<Item> BLOCKSET_INETRA = localTag("blockset/inetra");
        public static final TagKey<Item> BLOCKSET_IRON_PLATING = localTag("blockset/iron_plating");
        public static final TagKey<Item> BLOCKSET_GOLD_PLATING = localTag("blockset/gold_plating");
        public static final TagKey<Item> BLOCKSET_NETHERITE_PLATING = localTag("blockset/netherite_plating");
        public static final TagKey<Item> BLOCKSET_UNAFFECTED_COPPER_PLATING =
                localTag("blockset/copper_plating/unaffected");
        public static final TagKey<Item> BLOCKSET_UNAFFECTED_WAXED_COPPER_PLATING =
                localTag("blockset/waxed_copper_plating/unaffected");
        public static final TagKey<Item> BLOCKSET_EXPOSED_COPPER_PLATING =
                localTag("blockset/copper_plating/exposed");
        public static final TagKey<Item> BLOCKSET_EXPOSED_WAXED_COPPER_PLATING =
                localTag("blockset/waxed_copper_plating/exposed");
        public static final TagKey<Item> BLOCKSET_WEATHERED_COPPER_PLATING =
                localTag("blockset/copper_plating/weathered");
        public static final TagKey<Item> BLOCKSET_WEATHERED_WAXED_COPPER_PLATING =
                localTag("blockset/waxed_copper_plating/weathered");
        public static final TagKey<Item> BLOCKSET_OXIDIZED_COPPER_PLATING =
                localTag("blockset/copper_plating/oxidized");
        public static final TagKey<Item> BLOCKSET_OXIDIZED_WAXED_COPPER_PLATING =
                localTag("blockset/waxed_copper_plating/oxidized");
        public static final TagKey<Item> BLOCKSET_FERREBRIS_PLATING = localTag("blockset/ferrebris_plating");
        public static final TagKey<Item> BLOCKSET_UMBURAM_PLATING = localTag("blockset/umburam_plating");
        public static final TagKey<Item> BLOCKSET_INPERLUM_PLATING = localTag("blockset/inperlum_plating");
        public static final TagKey<Item> BLOCKSET_NIHOXITE_PLATING = localTag("blockset/nihoxite_plating");
        public static final TagKey<Item> BLOCKSET_MYSTERIOUS_ALLOY_PLATING = localTag(
                "blockset/mysterious_alloy_plating");
        public static final TagKey<Item> BLOCKSET_UNAFFECTED_CUT_OBSCUPRUM =
                localTag("blockset/cut_obscuprum/unaffected");
        public static final TagKey<Item> BLOCKSET_EXPOSED_CUT_OBSCUPRUM =
                localTag("blockset/cut_obscuprum/exposed");
        public static final TagKey<Item> PEBBLES = localTag("pebbles");
        public static final TagKey<Item> FERREBRIS_ORES = localTag("ferrebris_ores");
        public static final TagKey<Item> OBSCUPRUM_ORES = localTag("obscuprum_ores");
        public static final TagKey<Item> UMBURAM_ORES = localTag("umburam_ores");
        public static final TagKey<Item> XENON_LOGS = localTag("xenon_logs");
        public static final TagKey<Item> KRYPTON_LOGS = localTag("krypton_logs");
        public static final TagKey<Item> ARGON_LOGS = localTag("argon_logs");
        public static final TagKey<Item> NEON_LOGS = localTag("neon_logs");

        // Common Tags
        // Material Groupings
            // Storage Blocks
        public static final TagKey<Item> FERREBRIS_STORAGE_BLOCKS = commonTag("storage_blocks/ferrebris");
        public static final TagKey<Item> UMBURAM_STORAGE_BLOCKS = commonTag("storage_blocks/umburam");
        public static final TagKey<Item> TENERYL_STORAGE_BLOCKS = commonTag("storage_blocks/teneryl");
        public static final TagKey<Item> ADAMUNA_STORAGE_BLOCKS = commonTag("storage_blocks/adamuna");
        public static final TagKey<Item> INPERLUM_STORAGE_BLOCKS = commonTag("storage_blocks/inperlum");
        public static final TagKey<Item> NIHOXITE_STORAGE_BLOCKS = commonTag("storage_blocks/nihoxite");
        public static final TagKey<Item> VITRAGOR_STORAGE_BLOCKS = commonTag("storage_blocks/vitragor");
        public static final TagKey<Item> OBSCUPRUM_STORAGE_BLOCKS = commonTag("storage_blocks/obscuprum");
            // Ores
        public static final TagKey<Item> BURIED_FUEL_CELLS = commonTag("ores/buried_fuel_cells");
        public static final TagKey<Item> ORES_FERREBRIS = commonTag("ores/ferrebris");
        public static final TagKey<Item> ORES_OBSCUPRUM = commonTag("ores/obscuprum");
        public static final TagKey<Item> ORES_UMBURAM = commonTag("ores/umburam");
            // Raw Materials
        public static final TagKey<Item> RAW_FERREBRIS_MATERIALS = commonTag("raw_materials/ferrebris");
        public static final TagKey<Item> RAW_OBSCUPRUM_MATERIALS = commonTag("raw_materials/obscuprum");
        public static final TagKey<Item> RAW_UMBURAM_MATERIALS = commonTag("raw_materials/umburam");
        public static final TagKey<Item> RAW_INPERLUM_MATERIALS = commonTag("raw_materials/inperlum");
            // Gems
        public static final TagKey<Item> LUMAI_CRYSTALS = commonTag("gems/lumai");
        public static final TagKey<Item> DIAMOND_GEMS = commonTag("gems/diamond");
        public static final TagKey<Item> TENERYL_GEMS = commonTag("gems/teneryl");
        public static final TagKey<Item> ADAMUNA_GEMS = commonTag("gems/adamuna");
        public static final TagKey<Item> VITRAGOR_GEMS = commonTag("gems/vitragor");
            // Nuggets
        public static final TagKey<Item> FERREBRIS_NUGGETS = commonTag("nuggets/ferrebris");
        public static final TagKey<Item> OBSCUPRUM_NUGGETS = commonTag("nuggets/obscuprum");
        public static final TagKey<Item> UMBURAM_NUGGETS = commonTag("nuggets/umburam");
        public static final TagKey<Item> INPERLUM_NUGGETS = commonTag("nuggets/inperlum");
        public static final TagKey<Item> NIHOXITE_NUGGETS = commonTag("nuggets/nihoxite");
            // Ingots
        public static final TagKey<Item> FERREBRIS_INGOTS = commonTag("ingots/ferrebris");
        public static final TagKey<Item> OBSCUPRUM_INGOTS = commonTag("ingots/obscuprum");
        public static final TagKey<Item> UMBURAM_INGOTS = commonTag("ingots/umburam");
        public static final TagKey<Item> INPERLUM_INGOTS = commonTag("ingots/inperlum");
        public static final TagKey<Item> NIHOXITE_INGOTS = commonTag("ingots/nihoxite");
            //
        public static final TagKey<Item> VITRAGOR_DUSTS = commonTag("dusts/vitragor");
            // Plates
        public static final TagKey<Item> PLATES = commonTag("plates");
        public static final TagKey<Item> MYSTERIOUS_ALLOY_PLATES = commonTag("plates/mysterious_alloy");
            // Rods
        public static final TagKey<Item> NOBLEWOOD_RODS = commonTag("rods/noblewood");
            // Dyable Blocks
        public static final TagKey<Item> PLATED_METAL_PILLARS = commonTag(
                "plated_metal_pillars");
        public static final TagKey<Item> PLATED_METAL_PILLARS_NO_GLOWING = commonTag(
                "plated_pillars/no_glowing");
        public static final TagKey<Item> PLATED_METAL_PILLARS_GLOWING = commonTag(
                "plated_pillars/glowing");
        public static final TagKey<Item> PLATED_FERREBRIS_PILLARS_GLOWING = commonTag(
                "plated_pillars/glowing_ferrebris");
        public static final TagKey<Item> PLATED_IRON_PILLARS_GLOWING = commonTag(
                "plated_pillars/glowing_iron");
            // Dyes
        public static final TagKey<Item> XENON_DYES = commonTag("dyes/xenon");
        public static final TagKey<Item> KRYPTON_DYES = commonTag("dyes/krypton");
        public static final TagKey<Item> ARGON_DYES = commonTag("dyes/argon");
        public static final TagKey<Item> NEON_DYES = commonTag("dyes/neon");
            // Dyed Blocks
        public static final TagKey<Item> DYED_XENON = commonTag("dyed/xenon");
        public static final TagKey<Item> DYED_KRYPTON = commonTag("dyed/krypton");
        public static final TagKey<Item> DYED_ARGON = commonTag("dyed/argon");
        public static final TagKey<Item> DYED_NEON = commonTag("dyed/neon");

        public static TagKey<Item> localTag(String tagName) {
            return net.minecraft.tags.ItemTags.create(Noxerna.prefix(tagName));
        }
        public static TagKey<Item> commonTag(String tagName) {
            return net.minecraft.tags.ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", tagName));
        }
    }
    public static class BlockTags {
        public static final TagKey<Block> BASE_STONE_NOXERNA = localTag("base_stone_noxerna");

        public static final TagKey<Block> MINEABLE_WITH_PICKADZE = localTag("mineable/pickadze");
        public static final TagKey<Block> NEEDS_ADAMUNA_TOOL = localTag("needs_adamuna_tool");
        public static final TagKey<Block> INCORRECT_FOR_NOBLEWOOD_TOOL = localTag(
                "incorrect_for_noblewood_tool");
        public static final TagKey<Block> INCORRECT_FOR_NOXSTONE_TOOL = localTag(
                "incorrect_for_noxstone_tool");
        public static final TagKey<Block> INCORRECT_FOR_UMBURAM_TOOL = localTag(
                "incorrect_for_umburam_tool");
        public static final TagKey<Block> INCORRECT_FOR_FERREBRIS_TOOL = localTag(
                "incorrect_for_ferrebris_tool");
        public static final TagKey<Block> INCORRECT_FOR_ADAMUNA_TOOL = localTag(
                "incorrect_for_adamuna_tool");
        public static final TagKey<Block> INCORRECT_FOR_NIHOXITE_TOOL = localTag(
                "incorrect_for_nihoxite_tool");
        public static final TagKey<Block> INFINIBURN_NOXERNA = localTag("infiniburn_noxerna");
        public static final TagKey<Block> NOXERNA_CARVER_REPLACEABLE = localTag("base_stone_noxerna");
        public static final TagKey<Block> NOXUM_ORES_REPLACEABLE = localTag("noxum_ores_replaceable");
        public static final TagKey<Block> PEBBLES = localTag("pebbles");
        public static final TagKey<Block> QUAKE_IMMUNE = localTag("quake_immune");
        public static final TagKey<Block> SOLAR_INCINERATION_IMMUNE = localTag("solar_incineration_immune");
        public static final TagKey<Block> BOSS_IMMUNE = localTag("boss_immune");

        public static final TagKey<Block> FERREBRIS_ORES = localTag("ferrebris_ores");
        public static final TagKey<Block> OBSCUPRUM_ORES = localTag("obscuprum_ores");
        public static final TagKey<Block> UMBURAM_ORES = localTag("umburam_ores");

        public static final TagKey<Block> XENON_LOGS = localTag("xenon_logs");
        public static final TagKey<Block> KRYPTON_LOGS = localTag("krypton_logs");
        public static final TagKey<Block> ARGON_LOGS = localTag("argon_logs");
        public static final TagKey<Block> NEON_LOGS = localTag("neon_logs");

        public static final TagKey<Block> FERREBRIS_STORAGE_BLOCKS = commonTag("storage_blocks/ferrebris");
        public static final TagKey<Block> UMBURAM_STORAGE_BLOCKS = commonTag("storage_blocks/umburam");
        public static final TagKey<Block> TENERYL_STORAGE_BLOCKS = commonTag("storage_blocks/teneryl");
        public static final TagKey<Block> ADAMUNA_STORAGE_BLOCKS = commonTag("storage_blocks/adamuna");
        public static final TagKey<Block> INPERLUM_STORAGE_BLOCKS = commonTag("storage_blocks/inperlum");
        public static final TagKey<Block> NIHOXITE_STORAGE_BLOCKS = commonTag("storage_blocks/nihoxite");
        public static final TagKey<Block> VITRAGOR_STORAGE_BLOCKS = commonTag("storage_blocks/vitragor");
        public static final TagKey<Block> OBSCUPRUM_STORAGE_BLOCKS = commonTag("storage_blocks/obscuprum");

        public static final TagKey<Block> PLATED_METAL_PILLARS = commonTag(
                "plated_metal_pillars");
        public static final TagKey<Block> PLATED_METAL_PILLARS_NO_GLOWING = commonTag(
                "plated_pillars/no_glowing");
        public static final TagKey<Block> PLATED_METAL_PILLARS_GLOWING = commonTag(
                "plated_pillars/glowing");
        public static final TagKey<Block> PLATED_FERREBRIS_PILLARS_GLOWING = commonTag(
                "plated_pillars/glowing_ferrebris");
        public static final TagKey<Block> PLATED_IRON_PILLARS_GLOWING = commonTag(
                "plated_pillars/glowing_iron");

        public static final TagKey<Block> DYED_XENON = commonTag("dyed/xenon");
        public static final TagKey<Block> DYED_KRYPTON = commonTag("dyed/krypton");
        public static final TagKey<Block> DYED_ARGON = commonTag("dyed/argon");
        public static final TagKey<Block> DYED_NEON = commonTag("dyed/neon");
        public static final TagKey<Block> BURIED_FUEL_CELLS = commonTag("ores/buried_fuel_cells");
        public static final TagKey<Block> ORES_FERREBRIS = commonTag("ores/ferrebris");
        public static final TagKey<Block> ORES_OBSCUPRUM = commonTag("ores/obscuprum");
        public static final TagKey<Block> ORES_UMBURAM = commonTag("ores/umburam");
        public static final TagKey<Block> NOXUM_ORE_BEARING_GROUND = commonTag("ore_bearing_ground/noxum");
        public static final TagKey<Block> AESTUM_ORE_BEARING_GROUND = commonTag("ore_bearing_ground/aestum");
        public static final TagKey<Block> INETRA_ORE_BEARING_GROUND = commonTag("ore_bearing_ground/inetra");

        public static TagKey<Block> localTag(String tagName) {
            return net.minecraft.tags.BlockTags.create(Noxerna.prefix(tagName));
        }
        public static TagKey<Block> commonTag(String tagName) {
            return net.minecraft.tags.BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", tagName));
        }
        public static TagKey<Block> neoforgeTag(String tagName) {
            return net.minecraft.tags.BlockTags.create(
                    ResourceLocation.fromNamespaceAndPath("neoforge", tagName));
        }
    }

    public static class FluidTags {
        public static TagKey<Fluid> localTag(String tagName) {
            return net.minecraft.tags.FluidTags.create(Noxerna.prefix(tagName));
        }
        public static TagKey<Fluid> commonTag(String tagName) {
            return net.minecraft.tags.FluidTags.create(ResourceLocation.fromNamespaceAndPath("c", tagName));
        }
    }
    public static class EntityTags {
        public static final TagKey<EntityType<?>> AUTOMATONS = localTag("automatons");
        public static final TagKey<EntityType<?>> VOID_ENTITIES = localTag("void_entities");
        public static final TagKey<EntityType<?>> SENSITIVE_TO_DISMANTLE = localTag("sensitive_to_dismantle");
        public static final TagKey<EntityType<?>> SENSITIVE_TO_SHADOWBANE = localTag("sensitive_to_shadowbane");
        public static final TagKey<EntityType<?>> QUAKE_IMMUNE = localTag("quake_immune");
        public static TagKey<EntityType<?>> localTag(String tagName) {
            return TagKey.create(Registries.ENTITY_TYPE, Noxerna.prefix(tagName));
        }
        public static TagKey<EntityType<?>> commonTag(String tagName) {
            return TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath("c", tagName));
        }
    }

    public static class BiomeTags {
        public static final TagKey<Biome> IS_NOXERNA = localTag("is_noxerna");
        public static final TagKey<Biome> IS_UNDERGROUND_NOXERNA = localTag("is_underground_noxerna");
        public static final TagKey<Biome> SURFACE_LAYER_BIOMES = localTag("surface_layer_biomes");
        public static final TagKey<Biome> NOXUM_LAYER_BIOMES = localTag("noxum_layer_biomes");
        public static final TagKey<Biome> AESTUM_LAYER_BIOMES = localTag("aestum_layer_biomes");
        public static final TagKey<Biome> INETRA_LAYER_BIOMES = localTag("inetra_layer_biomes");
        public static final TagKey<Biome> IS_NOBLEPHYTE_BIOME = localTag("is_noblephyte_biome");
        /**
         * This tag will be used for a fog density handler in the future
         */
        public static final TagKey<Biome> HAS_DENSE_FOG = localTag("has_dense_fog");

        /**
         * These tags are just to match with NeoForge's biome tags
         */
        public static final TagKey<Biome> IS_HOT_NOXERNA = commonTag("is_hot/noxerna");
        public static final TagKey<Biome> IS_COLD_NOXERNA = commonTag("is_cold/noxerna");
        public static final TagKey<Biome> IS_SPARSE_VEGETATION_NOXERNA = commonTag("is_sparse_vegetation/noxerna");
        public static final TagKey<Biome> IS_DENSE_VEGETATION_NOXERNA = commonTag("is_dense_vegetation/noxerna");
        public static final TagKey<Biome> IS_WET_NOXERNA = commonTag("is_wet/noxerna");
        public static final TagKey<Biome> IS_DRY_NOXERNA = commonTag("is_dry/noxerna");
        private static TagKey<Biome> localTag(String tagName) {
            return TagKey.create(Registries.BIOME, Noxerna.prefix(tagName));
        }
        private static TagKey<Biome> commonTag(String tagName) {
            return TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("c", tagName));
        }
    }
}
