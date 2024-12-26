package net.chairmanfed.noxerna.data;

import net.chairmanfed.noxerna.TheNoxerna;
import net.chairmanfed.noxerna.registry.NoxernaBlocks;
import net.chairmanfed.noxerna.registry.NoxernaItems;
import net.chairmanfed.noxerna.registry.NoxernaTags;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.common.data.LanguageProvider;

import java.util.HashMap;
import java.util.Map;

public class NoxernaLanguageProvider extends LanguageProvider {
    public NoxernaLanguageProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TheNoxerna.MODID, "en_us");
    }

    public static final Map<String, String> SUBTITLE_GENERATOR = new HashMap<>();

    protected void addAdvancement(String id, String title, String description) {
        this.add("advancement." + TheNoxerna.MODID + "." + id + ".title", title);
        this.add("advancement." + TheNoxerna.MODID + "." + id + ".description", description);
    }

    protected void addUpgradeTemplate(String upgradeType, String name, String ingredients, String appliedTo) {
        this.add("upgrade." + TheNoxerna.MODID + "." + upgradeType, name);
        this.add("item." + TheNoxerna.MODID + ".smithing_template."
                + upgradeType + ".ingredients", ingredients);
        this.add("item." + TheNoxerna.MODID + ".smithing_template."
                + upgradeType + ".applies_to", appliedTo);
        this.add("item." + TheNoxerna.MODID + ".smithing_template."
                + upgradeType + ".additions_slot_description", "Add " + ingredients);
        this.add("item." + TheNoxerna.MODID + ".smithing_template."
                + upgradeType + ".base_slot_description", "Add " + appliedTo);
    }

    @Override
    protected void addTranslations() {
        // Creative Tabs
        add("itemGroup." + TheNoxerna.MODID + ".building_blocks", "Noxerna Building Blocks");
        add("itemGroup." + TheNoxerna.MODID + ".natural_blocks", "Noxerna Natural Blocks");
        add("itemGroup." + TheNoxerna.MODID + ".tools_and_utilities", "Noxerna Tools & Utilities");
        add("itemGroup." + TheNoxerna.MODID + ".combat", "Noxerna Combat");
        add("itemGroup." + TheNoxerna.MODID + ".ingredients", "Noxerna Ingredients");
        // Game Rules
        add("gamerule.maxQuakeMagnitude", "Maximum Quake Magnitude");

        // Building Blocks
        // Xenon Wood set
        addBlock(NoxernaBlocks.XENON_LOG, "Xenon Log");
        addBlock(NoxernaBlocks.XENON_WOOD, "Xenon Wood");
        addBlock(NoxernaBlocks.STRIPPED_XENON_LOG, "Stripped Xenon Log");
        addBlock(NoxernaBlocks.STRIPPED_XENON_WOOD, "Stripped Xenon Wood");
        addBlock(NoxernaBlocks.XENON_PLANKS, "Xenon Planks");
        addBlock(NoxernaBlocks.XENON_STAIRS, "Xenon Stairs");
        addBlock(NoxernaBlocks.XENON_SLAB, "Xenon Slab");
        addBlock(NoxernaBlocks.XENON_FENCE, "Xenon Fence");
        addBlock(NoxernaBlocks.XENON_FENCE_GATE, "Xenon Fence Gate");
        addBlock(NoxernaBlocks.XENON_DOOR, "Xenon Door");
        addBlock(NoxernaBlocks.XENON_TRAPDOOR, "Xenon Trapdoor");
        addBlock(NoxernaBlocks.XENON_PRESSURE_PLATE, "Xenon Pressure Plate");
        addBlock(NoxernaBlocks.XENON_BUTTON, "Xenon Button");
        // Krypton Wood set
        addBlock(NoxernaBlocks.KRYPTON_LOG, "Krypton Log");
        addBlock(NoxernaBlocks.KRYPTON_WOOD, "Krypton Wood");
        addBlock(NoxernaBlocks.STRIPPED_KRYPTON_LOG, "Stripped Krypton Log");
        addBlock(NoxernaBlocks.STRIPPED_KRYPTON_WOOD, "Stripped Krypton Wood");
        addBlock(NoxernaBlocks.KRYPTON_PLANKS, "Krypton Planks");
        addBlock(NoxernaBlocks.KRYPTON_STAIRS, "Krypton Stairs");
        addBlock(NoxernaBlocks.KRYPTON_SLAB, "Krypton Slab");
        addBlock(NoxernaBlocks.KRYPTON_FENCE, "Krypton Fence");
        addBlock(NoxernaBlocks.KRYPTON_FENCE_GATE, "Krypton Fence Gate");
        addBlock(NoxernaBlocks.KRYPTON_DOOR, "Krypton Door");
        addBlock(NoxernaBlocks.KRYPTON_TRAPDOOR, "Krypton Trapdoor");
        addBlock(NoxernaBlocks.KRYPTON_PRESSURE_PLATE, "Krypton Pressure Plate");
        addBlock(NoxernaBlocks.KRYPTON_BUTTON, "Krypton Button");
        // Argon Wood set
        addBlock(NoxernaBlocks.ARGON_PLANKS, "Argon Planks");
        // Neon Wood set
        addBlock(NoxernaBlocks.NEON_PLANKS, "Neon Planks");
        // Noxum Stone set
        addBlock(NoxernaBlocks.NOXUM, "Noxum");
        addBlock(NoxernaBlocks.NOXUM_STAIRS, "Noxum Stairs");
        addBlock(NoxernaBlocks.NOXUM_SLAB, "Noxum Slab");
        addBlock(NoxernaBlocks.NOXUM_WALL, "Noxum Wall");
        addBlock(NoxernaBlocks.NOXUM_PRESSURE_PLATE, "Noxum Pressure Plate");
        addBlock(NoxernaBlocks.NOXUM_BUTTON, "Noxum Button");
            // Polished
        addBlock(NoxernaBlocks.POLISHED_NOXUM, "Polished Noxum");
        addBlock(NoxernaBlocks.POLISHED_NOXUM_STAIRS, "Polished Noxum Stairs");
        addBlock(NoxernaBlocks.POLISHED_NOXUM_SLAB, "Polished Noxum Slab");
        addBlock(NoxernaBlocks.POLISHED_NOXUM_WALL, "Polished Noxum Wall");
            // Bricks
        addBlock(NoxernaBlocks.NOXUM_BRICKS, "Noxum Bricks");
        addBlock(NoxernaBlocks.NOXUM_BRICK_STAIRS, "Noxum Brick Stairs");
        addBlock(NoxernaBlocks.NOXUM_BRICK_SLAB, "Noxum Brick Slab");
        addBlock(NoxernaBlocks.NOXUM_BRICK_WALL, "Noxum Brick Wall");
        // Ferrebris Metal set
        addBlock(NoxernaBlocks.FERREBRIS_BLOCK, "Block of Ferrebris");
            // Plating
        addBlock(NoxernaBlocks.FERREBRIS_PLATING, "Ferrebris Plating");
        addBlock(NoxernaBlocks.FERREBRIS_PLATING_STAIRS, "Ferrebris Plating Stairs");
        addBlock(NoxernaBlocks.FERREBRIS_PLATING_SLAB, "Ferrebris Plating Slab");
        addBlock(NoxernaBlocks.FERREBRIS_PLATING_WALL, "Ferrebris Plating Wall");
        // Umburam Metal set
        addBlock(NoxernaBlocks.UMBURAM_BLOCK, "Block of Umburam");
            // Plating
        addBlock(NoxernaBlocks.UMBURAM_PLATING, "Umburam Plating");
        // Teneryl Gem set
        addBlock(NoxernaBlocks.TENERYL_BLOCK, "Block of Teneryl");
        // Adamuna Gem set
        addBlock(NoxernaBlocks.ADAMUNA_BLOCK, "Block of Adamuna");
        // Inperlum Metal set
        addBlock(NoxernaBlocks.INPERLUM_BLOCK, "Block of Inperlum");
            // Plating
        addBlock(NoxernaBlocks.INPERLUM_PLATING, "Inperlum Plating");
        // Nihoxite Metal set
        addBlock(NoxernaBlocks.NIHOXITE_BLOCK, "Block of Nihoxite");
            // Plating
        addBlock(NoxernaBlocks.NIHOXITE_PLATING, "Nihoxite Plating");
        // Vitragor Gem set
        addBlock(NoxernaBlocks.VITRAGOR_BLOCK, "Block of Vitragor");
        // Obscuprum Metal set
        addBlock(NoxernaBlocks.OBSCUPRUM_BLOCK, "Block of Obscuprum");
        addBlock(NoxernaBlocks.EXPOSED_OBSCUPRUM_BLOCK, "Exposed Obscuprum");
        addBlock(NoxernaBlocks.WEATHERED_OBSCUPRUM_BLOCK, "Weathered Obscuprum");
        addBlock(NoxernaBlocks.OXIDIZED_OBSCUPRUM_BLOCK, "Oxidized Obscuprum");
            // Cut
        addBlock(NoxernaBlocks.CUT_OBSCUPRUM_BLOCK, "Cut Obscuprum");
        addBlock(NoxernaBlocks.EXPOSED_CUT_OBSCUPRUM_BLOCK, "Exposed Cut Obscuprum");
        addBlock(NoxernaBlocks.WEATHERED_CUT_OBSCUPRUM_BLOCK, "Weathered Cut Obscuprum");
        addBlock(NoxernaBlocks.OXIDIZED_CUT_OBSCUPRUM_BLOCK, "Oxidized Cut Obscuprum");
            // Bricks
        addBlock(NoxernaBlocks.OBSCUPRUM_BRICKS, "Obscuprum Bricks");
        addBlock(NoxernaBlocks.EXPOSED_OBSCUPRUM_BRICKS, "Exposed Obscuprum Bricks");
        addBlock(NoxernaBlocks.WEATHERED_OBSCUPRUM_BRICKS, "Weathered Obscuprum Bricks");
        addBlock(NoxernaBlocks.OXIDIZED_OBSCUPRUM_BRICKS, "Oxidized Obscuprum Bricks");
            // Plating
        addBlock(NoxernaBlocks.OBSCUPRUM_PLATING, "Obscuprum Plating");
        addBlock(NoxernaBlocks.EXPOSED_OBSCUPRUM_PLATING, "Exposed Obscuprum Plating");
        addBlock(NoxernaBlocks.WEATHERED_OBSCUPRUM_PLATING, "Weathered Obscuprum Plating");
        addBlock(NoxernaBlocks.OXIDIZED_OBSCUPRUM_PLATING, "Oxidized Obscuprum Plating");

        // Natural Blocks
        // Stones
        addBlock(NoxernaBlocks.NOXUM_PEBBLE, "Noxum Pebble");
        addBlock(NoxernaBlocks.VOIDROCK, "Voidrock");

        // Ingredients
        // Raw Materials
        addItem(NoxernaItems.RAW_FERREBRIS, "Raw Ferrebris");
        addItem(NoxernaItems.RAW_OBSCUPRUM, "Raw Obscuprum");
        addItem(NoxernaItems.RAW_UMBURAM, "Raw Umburam");
        addItem(NoxernaItems.RAW_INPERLUM, "Raw Inperlum");
        // Gems
        addItem(NoxernaItems.TENERYL, "Teneryl");
        addItem(NoxernaItems.ADAMUNA, "Adamuna");
        addItem(NoxernaItems.VITRAGOR, "Vitragor");
        // Metals
        addItem(NoxernaItems.FERREBRIS_NUGGET, "Ferrebris Nugget");
        addItem(NoxernaItems.OBSCUPRUM_NUGGET, "Obscuprum Nugget");
        addItem(NoxernaItems.UMBURAM_NUGGET, "Umburam Nugget");
        addItem(NoxernaItems.INPERLUM_NUGGET, "Inperlum Nugget");
        addItem(NoxernaItems.NIHOXITE_NUGGET, "Nihoxite Nugget");
        addItem(NoxernaItems.FERREBRIS_INGOT, "Ferrebris Ingot");
        addItem(NoxernaItems.OBSCUPRUM_INGOT, "Obscuprum Ingot");
        addItem(NoxernaItems.UMBURAM_INGOT, "Umburam Ingot");
        addItem(NoxernaItems.INPERLUM_INGOT, "Inperlum Ingot");
        addItem(NoxernaItems.NIHOXITE_INGOT, "Nihoxite Ingot");
        // Misc
        addItem(NoxernaItems.NOBLEWOOD_STICK, "Noblewood Stick");
        // Banner Patterns

        // Pottery Sherds

        // Smithing Templates
        addItem(NoxernaItems.NIHOXITE_UPGRADE_SMITHING_TEMPLATE, "Smithing Template");
        addUpgradeTemplate("nihoxite_upgrade", "Nihoxite Upgrade",
                "Nihoxite Ingot", "Adamuna Equipment");

        addItem(NoxernaItems.NOBLEWOOD_AXE, "Noblewood Axe");
        addItem(NoxernaItems.NOBLEWOOD_HOE, "Noblewood Hoe");
        addItem(NoxernaItems.NOBLEWOOD_PICKAXE, "Noblewood Pickaxe");
        addItem(NoxernaItems.NOBLEWOOD_SHOVEL, "Noblewood Shovel");
        addItem(NoxernaItems.NOBLEWOOD_SWORD, "Noblewood Sword");

        addItem(NoxernaItems.NOXSTONE_AXE, "Noxstone Axe");
        addItem(NoxernaItems.NOXSTONE_HOE, "Noxstone Hoe");
        addItem(NoxernaItems.NOXSTONE_PICKAXE, "Noxstone Pickaxe");
        addItem(NoxernaItems.NOXSTONE_SHOVEL, "Noxstone Shovel");
        addItem(NoxernaItems.NOXSTONE_SWORD, "Noxstone Sword");

        addItem(NoxernaItems.FERREBRIS_AXE, "Ferrebris Axe");
        addItem(NoxernaItems.FERREBRIS_HOE, "Ferrebris Hoe");
        addItem(NoxernaItems.FERREBRIS_PICKAXE, "Ferrebris Pickaxe");
        addItem(NoxernaItems.FERREBRIS_SHOVEL, "Ferrebris Shovel");
        addItem(NoxernaItems.FERREBRIS_SWORD, "Ferrebris Sword");

        addItem(NoxernaItems.UMBURAM_AXE, "Umburam Axe");
        addItem(NoxernaItems.UMBURAM_HOE, "Umburam Hoe");
        addItem(NoxernaItems.UMBURAM_PICKAXE, "Umburam Pickaxe");
        addItem(NoxernaItems.UMBURAM_SHOVEL, "Umburam Shovel");
        addItem(NoxernaItems.UMBURAM_SWORD, "Umburam Sword");

        addItem(NoxernaItems.ADAMUNA_AXE, "Adamuna Axe");
        addItem(NoxernaItems.ADAMUNA_HOE, "Adamuna Hoe");
        addItem(NoxernaItems.ADAMUNA_PICKAXE, "Adamuna Pickaxe");
        addItem(NoxernaItems.ADAMUNA_SHOVEL, "Adamuna Shovel");
        addItem(NoxernaItems.ADAMUNA_SWORD, "Adamuna Sword");

        addItem(NoxernaItems.NIHOXITE_AXE, "Nihoxite Axe");
        addItem(NoxernaItems.NIHOXITE_HOE, "Nihoxite Hoe");
        addItem(NoxernaItems.NIHOXITE_PICKAXE, "Nihoxite Pickaxe");
        addItem(NoxernaItems.NIHOXITE_SHOVEL, "Nihoxite Shovel");
        addItem(NoxernaItems.NIHOXITE_SWORD, "Nihoxite Sword");

        // Block Tags
        // Common Tags
            // Material Storage Blocks
        add(NoxernaTags.BlockTags.FERREBRIS_STORAGE_BLOCKS, "Ferrebris Storage Blocks");
        // Noxerna Tags
        add(NoxernaTags.BlockTags.BOSS_IMMUNE, "Bosses Cannot Destroy");
        add(NoxernaTags.BlockTags.INFINIBURN_NOXERNA, "Burns Forever in Noxerna");
        add(NoxernaTags.BlockTags.PEBBLES, "Pebbles");
        add(NoxernaTags.BlockTags.QUAKE_IMMUNE, "Immune to Quakes");
        add(NoxernaTags.BlockTags.XENON_LOGS, "Xenon Logs");
        add(NoxernaTags.BlockTags.KRYPTON_LOGS, "Xenon Logs");

        add(NoxernaTags.ItemTags.COMPLETES_MINE_HARD_STONE_ADVANCEMENT, "Completes Hard Shadowy Rock");
        add(NoxernaTags.ItemTags.NOBLEWOOD_PLANKS, "Noblewood Planks");
        add(NoxernaTags.ItemTags.NOXUM_STONE_TYPE, "Any Noxum Stone");
        add(NoxernaTags.ItemTags.NOXSTONE_TOOL_MATERIALS, "Noxstone Tool Materials");
        add(NoxernaTags.ItemTags.PEBBLES, "Pebbles");
        add(NoxernaTags.ItemTags.XENON_LOGS, "Xenon Logs");
        add(NoxernaTags.ItemTags.KRYPTON_LOGS, "Krypton Logs");

        // Root + Enter Noxerna Storyline
        addAdvancement("root", "Noxerna", "Bring a Torch or 64");
        addAdvancement("find_abandoned_portal", "All Below!", "Find an Abandoned Railway Portal");
        addAdvancement("enter_noxerna", "Entry Number 17", "Light and enter a Noxerna Portal");
        // Explore Noxerna Storyline
        addAdvancement("explore_noblephyte_biomes", "A Sight to Dwell Upon and Never Forget!",
                "Find any of the 4 Noblephyte biomes");
        addAdvancement("breach_surface", "The Sun is a Deadly Lazer", "Breach Noxerna's Surface");
        addAdvancement("explore_noxerna", "Cavernous Grand Tour", "Explore all Noxerna biomes");
        // Automaton Storyline
        addAdvancement("caught_mining", "Busted!", "Get caught mining without a license");
        addAdvancement("get_license", "License to Mine",
                "Get a Drillaton ID Chip to safely mine in the Noxerna");
        addAdvancement("suspicion_five", "Marked for Death",
                "Resist the automated authority and escape with your life!");
        addAdvancement("survive_suspicion_reset", "Exception to the Rule",
                "Get yourself off the 'Kill on Sight' list by defying death");
        // Foods & Potions Storyline
        addAdvancement("all_noxerna_foods", "Dining in the Dark",
                "Eat all the food the Noxerna offers, even if its unsafe for you");
        addAdvancement("all_noxerna_potions", "Alchemical Connoisseur",
                "Have every potion effect sourced from the Noxerna applied all at once");
        addAdvancement("all_noxerna_effects", "Affliction of the Shadows",
                "Have every status effect sourced from the Noxerna applied all at once");
        // Rocks & Quakes Storyline
        addAdvancement("noxerna_tools", "A Better Tool for the Job",
                "Tools made from Noxerna's materials are better suited for mining!");
        addAdvancement("mine_hard_stone", "Hard Shadowy Rock",
                "Mine the hardened stones of the Noxerna");
        addAdvancement("all_stone_variants", "Deep Rock's Finest",
                "Rock and Stone, until it is done");
        addAdvancement("noxquake", "Get Ready to RUMBLE!!!", "Experience a Noxquake");
        addAdvancement("portable_seismometer", "GeoShakr",
                "Craft a Portable Seismometer to know the strength of upcoming Noxquakes");
        addAdvancement("magnitude_ten_noxquake", "Quake Pro",
                "Experience the strongest Noxquake possible");
        // Fishing Storyline
        addAdvancement("noxerna_fish", "New World, New Fish", "Catch a fish native to the Noxerna");
        addAdvancement("ride_flatfish", "Who Needs Boats?",
                "Ride a Volcanic Flatfish for the first time");
        addAdvancement("ride_flatfish_in_other_dimensions", "Not the Way Home",
                "Ride a Volcanic Flatfish a fair way in the Overworld, Nether and End");
        addAdvancement("superheated_lava_fish", "Hot Fishes on Your Line",
                "Catch a fish... From SUPERHEATED lava???");
        addAdvancement("liquefied_shadow_fish", "Fishing in the Deep",
                "There's even fish in the liquid void! It can't get any crazier, it can't right?");
        addAdvancement("catch_all_fish", "Angler Supreme",
                "Catch all of the fish native to the Noxerna");
        // Ferrebris Tool Storyline
        addAdvancement("smelt_ferrebris", "Acquire Darkware", "Smelt a Ferrebris Ingot");
        addAdvancement("mine_native_minerals", "Shadow Mineralogy",
                "Collect a sample of every shadow touched mineral");
        addAdvancement("attunement_alchemy", "Law of Equivalent Exchange",
                "Exchange a material for one of equal value through attunement alchemy");
        addAdvancement("superheated_lava_bucket", "Hotter Stuff",
                "Fill a Bucket with Superheated Lava");
        addAdvancement("season_radar", "Seasonal Knowledge",
                "Craft a Season Radar to know the current Season in the Noxerna");
        addAdvancement("full_noxerna_year", "A Year in the Noxerna",
                "Experience all of Noxerna's seasons");
        addAdvancement("ferrebris_armor", "Ferrum-Clad Defence",
                "Keep yourself safe with Ferrebris Armor");
        addAdvancement("full_ferrebris_armor", "Fullmetal Metallurgist",
                "Suit up in full Ferrebris Armor");
        addAdvancement("ferrebris_shield", "Pocket Bastion", "Craft a Ferrebris Shield");
        addAdvancement("ferrebris_tools", "A Ferre Pick Upgrade", "Forge a Ferrebris Pickaxe");
        // Adamuna Storyline
        addAdvancement("superthermal_meter", "How Hot is it Getting in Here?",
                "Craft a Superthermal Meter, and answer the question no one seems to ask");
        addAdvancement("super_heatwave", "Global Warming", "Experience a Super-Heatwave");
        addAdvancement("mine_adamuna", "Adamuna?", "Mine some Adamuna");
        addAdvancement("give_adamuna", "A Little Moon for You!",
                "Toss (or clumsily drop) an Adamuna for yourself, someone or something to pick up");
        addAdvancement("adamuna_armor", "Cover Me in Moons", "Adamuna armor can save lives...");
        addAdvancement("full_adamuna_armor", "Full Moon Defence",
                "...Especially if a full suit is worn!");
        // Nihoxite Storyline
        addAdvancement("mine_inperlum", "Hidden in the Void",
                "Mine Inperlum in the deepest and darkest of caves");
        addAdvancement("refine_nihoxite", "Blacker than Black",
                "Alloy Inperlum with Ferrebris and infuse it with liquid void");
        addAdvancement("nihoxite_hoe", "Abyssal Dedication",
                "Make a Nihoxite Hoe and instantly regret your decision");
        addAdvancement("nihoxite_armor", "Immovable Object", "Suit up in full Nihoxite armor");
        // Noxerna Boss Storyline (Megatomaton)
        addAdvancement("noxerna_railway", "An Old Gauge",
                "Stumble upon the ancient railways in the Noxerna");
        addAdvancement("ore_refinery", "From Rocks to Riches", "Discover an old ore refinery");
        addAdvancement("find_megatomaton_arena", "Where Machines Are Made",
                "Locate the Automaton Manufacturing Plant");
        addAdvancement("awaken_megatomaton", "Kaiju Buster",
                "Awaken Megatomaton, the Titanic Machine");
        addAdvancement("defeat_megatomaton", "Decommissioned",
                "Shut down Project Kingslayer for good");
        addAdvancement("energy_weapons", "The Future is Now!",
                "Have an Energy Weapon be refined from Megatomaton's remains");
        addAdvancement("shutdown_charge_node", "Blackout",
                "Drain a charge node of its reserves. Now wait for it to recharge");
        // Noxerna Boss Storyline (Sulfernus)
        addAdvancement("geothermal_outpost", "Resting Flame",
                "Stumble upon an old outpost overtaken by a geothermal hotspot");
        addAdvancement("ashen_village", "Civilization..?", "Discover the ashen remains of a village");
        addAdvancement("find_sulfernus_arena",
                "City of Cinders", "Find the city lost to lava and ash");
        addAdvancement("awaken_sulfernus", "Agni Kai",
                "Challenge Sulfernus, the Everburning Inferno");
        addAdvancement("defeat_sulfernus", "Extinguished",
                "Extinguish Sulfernus in the heart of the lost city");
        // Noxerna Boss Storyline (Void Tyrant)
        addAdvancement("ancient_fortress", "Stagnation",
                "Break into a fortress from a time long forgotten");
        addAdvancement("find_pale_castle", "Fallen Kingdom",
                "Enter the shining beacon of an ancient kingdom");
        addAdvancement("void_key", "No Cost Too Great", "Endure a harsh trial and earn the Void Key");
        addAdvancement("open_void_well", "Slide into the Void", "Open a Void Well and jump in...");
        addAdvancement("challenge_void_tyrant", "The End and The Beginning",
                "Disturb the old tyrant's slumber");
        addAdvancement("defeat_void_tyrant", "Embrace the Void",
                "Defeat the Void Tyrant at their throne");
        // Completionist Extras
        addAdvancement("kill_all_noxerna_mobs", "Story of Undertale",
                "Killed every mob in the Noxerna, who's the real monster now? You... You are.");
        addAdvancement("complete_all_challenges", "Master Cave Dweller",
                "Master the caves of the Noxerna... " +
                        "Now consider returning to the Overworld to mine some grass");
    }
}
