package net.chairmanfed.noxerna.data;

import net.chairmanfed.noxerna.block.PebbleBlock;
import net.chairmanfed.noxerna.registry.NoxernaBlocks;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class NoxernaBlockLoot extends BlockLootSubProvider {
    public NoxernaBlockLoot(HolderLookup.Provider lookupProvider) {
        super(Set.of(), FeatureFlags.DEFAULT_FLAGS, lookupProvider);
    }
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return NoxernaBlocks.BLOCKS.getEntries().stream().map(DeferredHolder::value).collect(Collectors.toList());
    }
    protected void dropSlab(Block slabBlock) {
        this.add(slabBlock, this::createSlabItemTable);
    }
    protected LootTable.Builder createPebbleDrops(Block pebbleBlock) {
        return LootTable.lootTable()
                .withPool(
                        LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1.0f))
                                .add(this.applyExplosionDecay(pebbleBlock,
                                        LootItem.lootTableItem(pebbleBlock)
                                                .apply(List.of(2, 3, 4),
                                                        pebbleCount -> SetItemCountFunction.setCount(ConstantValue.exactly((float) pebbleCount.intValue()))
                                                                .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(pebbleBlock)
                                                                        .setProperties(StatePropertiesPredicate.Builder.properties()
                                                                                .hasProperty(PebbleBlock.PEBBLES, pebbleCount.intValue()))))))
                );
    }

    protected void dropDoor(Block doorBlock) {
        this.add(doorBlock, this::createDoorTable);
    }

    protected void dropPebbles(Block pebbleBlock) {
        this.add(pebbleBlock, this::createPebbleDrops);
    }

    protected void noDrop(Block block) {
        this.add(block, noDrop());
    }

    @Override
    protected void generate() {
        dropSelf(NoxernaBlocks.XENON_LOG.get());
        dropSelf(NoxernaBlocks.XENON_WOOD.get());
        dropSelf(NoxernaBlocks.STRIPPED_XENON_LOG.get());
        dropSelf(NoxernaBlocks.STRIPPED_XENON_WOOD.get());
        dropSelf(NoxernaBlocks.XENON_PLANKS.get());
        dropSelf(NoxernaBlocks.XENON_STAIRS.get());
        dropSlab(NoxernaBlocks.XENON_SLAB.get());
        dropSelf(NoxernaBlocks.XENON_FENCE.get());
        dropSelf(NoxernaBlocks.XENON_FENCE_GATE.get());
        dropDoor(NoxernaBlocks.XENON_DOOR.get());
        dropSelf(NoxernaBlocks.XENON_TRAPDOOR.get());
        dropSelf(NoxernaBlocks.XENON_PRESSURE_PLATE.get());
        dropSelf(NoxernaBlocks.XENON_BUTTON.get());

        dropSelf(NoxernaBlocks.KRYPTON_LOG.get());
        dropSelf(NoxernaBlocks.KRYPTON_WOOD.get());
        dropSelf(NoxernaBlocks.STRIPPED_KRYPTON_LOG.get());
        dropSelf(NoxernaBlocks.STRIPPED_KRYPTON_WOOD.get());
        dropSelf(NoxernaBlocks.KRYPTON_PLANKS.get());
        dropSelf(NoxernaBlocks.KRYPTON_STAIRS.get());
        dropSlab(NoxernaBlocks.KRYPTON_SLAB.get());
        dropSelf(NoxernaBlocks.KRYPTON_FENCE.get());
        dropSelf(NoxernaBlocks.KRYPTON_FENCE_GATE.get());
        dropDoor(NoxernaBlocks.KRYPTON_DOOR.get());
        dropSelf(NoxernaBlocks.KRYPTON_TRAPDOOR.get());
        dropSelf(NoxernaBlocks.KRYPTON_PRESSURE_PLATE.get());
        dropSelf(NoxernaBlocks.KRYPTON_BUTTON.get());

        dropSelf(NoxernaBlocks.ARGON_LOG.get());
        dropSelf(NoxernaBlocks.ARGON_WOOD.get());
        dropSelf(NoxernaBlocks.STRIPPED_ARGON_LOG.get());
        dropSelf(NoxernaBlocks.STRIPPED_ARGON_WOOD.get());
        dropSelf(NoxernaBlocks.ARGON_PLANKS.get());
        dropSelf(NoxernaBlocks.ARGON_STAIRS.get());
        dropSlab(NoxernaBlocks.ARGON_SLAB.get());
        dropSelf(NoxernaBlocks.ARGON_FENCE.get());
        dropSelf(NoxernaBlocks.ARGON_FENCE_GATE.get());
        dropDoor(NoxernaBlocks.ARGON_DOOR.get());
        dropSelf(NoxernaBlocks.ARGON_TRAPDOOR.get());
        dropSelf(NoxernaBlocks.ARGON_PRESSURE_PLATE.get());
        dropSelf(NoxernaBlocks.ARGON_BUTTON.get());

        dropSelf(NoxernaBlocks.NEON_LOG.get());
        dropSelf(NoxernaBlocks.NEON_WOOD.get());
        dropSelf(NoxernaBlocks.STRIPPED_NEON_LOG.get());
        dropSelf(NoxernaBlocks.STRIPPED_NEON_WOOD.get());
        dropSelf(NoxernaBlocks.NEON_PLANKS.get());
        dropSelf(NoxernaBlocks.NEON_STAIRS.get());
        dropSlab(NoxernaBlocks.NEON_SLAB.get());
        dropSelf(NoxernaBlocks.NEON_FENCE.get());
        dropSelf(NoxernaBlocks.NEON_FENCE_GATE.get());
        dropDoor(NoxernaBlocks.NEON_DOOR.get());
        dropSelf(NoxernaBlocks.NEON_TRAPDOOR.get());
        dropSelf(NoxernaBlocks.NEON_PRESSURE_PLATE.get());
        dropSelf(NoxernaBlocks.NEON_BUTTON.get());

        dropSelf(NoxernaBlocks.SOLTRA.get());
        dropSelf(NoxernaBlocks.SOLTRA_STAIRS.get());
        dropSlab(NoxernaBlocks.SOLTRA_SLAB.get());
        dropSelf(NoxernaBlocks.SOLTRA_WALL.get());
        dropSelf(NoxernaBlocks.SOLTRA_PRESSURE_PLATE.get());
        dropSelf(NoxernaBlocks.SOLTRA_BUTTON.get());
        dropSelf(NoxernaBlocks.POLISHED_SOLTRA.get());
        dropSelf(NoxernaBlocks.POLISHED_SOLTRA_STAIRS.get());
        dropSlab(NoxernaBlocks.POLISHED_SOLTRA_SLAB.get());
        dropSelf(NoxernaBlocks.POLISHED_SOLTRA_WALL.get());
        dropSelf(NoxernaBlocks.SOLTRA_BRICKS.get());
        dropSelf(NoxernaBlocks.SOLTRA_BRICK_STAIRS.get());
        dropSlab(NoxernaBlocks.SOLTRA_BRICK_SLAB.get());
        dropSelf(NoxernaBlocks.SOLTRA_BRICK_WALL.get());
        dropPebbles(NoxernaBlocks.SOLTRA_PEBBLE.get());

        dropSelf(NoxernaBlocks.NOXUM.get());
        dropSelf(NoxernaBlocks.NOXUM_STAIRS.get());
        dropSlab(NoxernaBlocks.NOXUM_SLAB.get());
        dropSelf(NoxernaBlocks.NOXUM_WALL.get());
        dropSelf(NoxernaBlocks.NOXUM_PRESSURE_PLATE.get());
        dropSelf(NoxernaBlocks.NOXUM_BUTTON.get());
        dropSelf(NoxernaBlocks.POLISHED_NOXUM.get());
        dropSelf(NoxernaBlocks.POLISHED_NOXUM_STAIRS.get());
        dropSlab(NoxernaBlocks.POLISHED_NOXUM_SLAB.get());
        dropSelf(NoxernaBlocks.POLISHED_NOXUM_WALL.get());
        dropSelf(NoxernaBlocks.NOXUM_BRICKS.get());
        dropSelf(NoxernaBlocks.NOXUM_BRICK_STAIRS.get());
        dropSlab(NoxernaBlocks.NOXUM_BRICK_SLAB.get());
        dropSelf(NoxernaBlocks.NOXUM_BRICK_WALL.get());
        dropPebbles(NoxernaBlocks.NOXUM_PEBBLE.get());

        dropSelf(NoxernaBlocks.AESTUM.get());
        dropSelf(NoxernaBlocks.AESTUM_STAIRS.get());
        dropSlab(NoxernaBlocks.AESTUM_SLAB.get());
        dropSelf(NoxernaBlocks.AESTUM_WALL.get());
        dropSelf(NoxernaBlocks.AESTUM_PRESSURE_PLATE.get());
        dropSelf(NoxernaBlocks.AESTUM_BUTTON.get());
        dropSelf(NoxernaBlocks.POLISHED_AESTUM.get());
        dropSelf(NoxernaBlocks.POLISHED_AESTUM_STAIRS.get());
        dropSlab(NoxernaBlocks.POLISHED_AESTUM_SLAB.get());
        dropSelf(NoxernaBlocks.POLISHED_AESTUM_WALL.get());
        dropSelf(NoxernaBlocks.AESTUM_BRICKS.get());
        dropSelf(NoxernaBlocks.AESTUM_BRICK_STAIRS.get());
        dropSlab(NoxernaBlocks.AESTUM_BRICK_SLAB.get());
        dropSelf(NoxernaBlocks.AESTUM_BRICK_WALL.get());
        dropPebbles(NoxernaBlocks.AESTUM_PEBBLE.get());

        dropSelf(NoxernaBlocks.INETRA.get());
        dropSelf(NoxernaBlocks.INETRA_STAIRS.get());
        dropSlab(NoxernaBlocks.INETRA_SLAB.get());
        dropSelf(NoxernaBlocks.INETRA_WALL.get());
        dropSelf(NoxernaBlocks.INETRA_PRESSURE_PLATE.get());
        dropSelf(NoxernaBlocks.INETRA_BUTTON.get());
        dropSelf(NoxernaBlocks.POLISHED_INETRA.get());
        dropSelf(NoxernaBlocks.POLISHED_INETRA_STAIRS.get());
        dropSlab(NoxernaBlocks.POLISHED_INETRA_SLAB.get());
        dropSelf(NoxernaBlocks.POLISHED_INETRA_WALL.get());
        dropSelf(NoxernaBlocks.INETRA_BRICKS.get());
        dropSelf(NoxernaBlocks.INETRA_BRICK_STAIRS.get());
        dropSlab(NoxernaBlocks.INETRA_BRICK_SLAB.get());
        dropSelf(NoxernaBlocks.INETRA_BRICK_WALL.get());
        dropPebbles(NoxernaBlocks.INETRA_PEBBLE.get());

        dropSelf(NoxernaBlocks.FERREBRIS_BLOCK.get());
        dropSelf(NoxernaBlocks.FERREBRIS_BARS.get());
        dropSelf(NoxernaBlocks.FERREBRIS_PLATING.get());
        dropSelf(NoxernaBlocks.FERREBRIS_PLATING_STAIRS.get());
        dropSlab(NoxernaBlocks.FERREBRIS_PLATING_SLAB.get());
        dropSelf(NoxernaBlocks.FERREBRIS_PLATING_WALL.get());
        dropSelf(NoxernaBlocks.UMBURAM_BLOCK.get());
        dropSelf(NoxernaBlocks.UMBURAM_PLATING.get());
        dropSelf(NoxernaBlocks.TENERYL_BLOCK.get());
        dropSelf(NoxernaBlocks.ADAMUNA_BLOCK.get());
        dropSelf(NoxernaBlocks.INPERLUM_BLOCK.get());
        dropSelf(NoxernaBlocks.INPERLUM_PLATING.get());
        dropSelf(NoxernaBlocks.NIHOXITE_BLOCK.get());
        dropSelf(NoxernaBlocks.NIHOXITE_PLATING.get());
        dropSelf(NoxernaBlocks.VITRAGOR_BLOCK.get());
        dropSelf(NoxernaBlocks.OBSCUPRUM_BLOCK.get());
        dropSelf(NoxernaBlocks.EXPOSED_OBSCUPRUM_BLOCK.get());
        dropSelf(NoxernaBlocks.WEATHERED_OBSCUPRUM_BLOCK.get());
        dropSelf(NoxernaBlocks.OXIDISED_OBSCUPRUM_BLOCK.get());
        dropSelf(NoxernaBlocks.CUT_OBSCUPRUM_BLOCK.get());
        dropSelf(NoxernaBlocks.EXPOSED_CUT_OBSCUPRUM_BLOCK.get());
        dropSelf(NoxernaBlocks.WEATHERED_CUT_OBSCUPRUM_BLOCK.get());
        dropSelf(NoxernaBlocks.OXIDISED_CUT_OBSCUPRUM_BLOCK.get());
        dropSelf(NoxernaBlocks.OBSCUPRUM_BRICKS.get());
        dropSelf(NoxernaBlocks.EXPOSED_OBSCUPRUM_BRICKS.get());
        dropSelf(NoxernaBlocks.WEATHERED_OBSCUPRUM_BRICKS.get());
        dropSelf(NoxernaBlocks.OXIDISED_OBSCUPRUM_BRICKS.get());
        dropSelf(NoxernaBlocks.OBSCUPRUM_PLATING.get());
        dropSelf(NoxernaBlocks.EXPOSED_OBSCUPRUM_PLATING.get());
        dropSelf(NoxernaBlocks.WEATHERED_OBSCUPRUM_PLATING.get());
        dropSelf(NoxernaBlocks.OXIDISED_OBSCUPRUM_PLATING.get());

        dropSelf(NoxernaBlocks.XENON_CONCRETE.get());
        dropSelf(NoxernaBlocks.KRYPTON_CONCRETE.get());
        dropSelf(NoxernaBlocks.ARGON_CONCRETE.get());
        dropSelf(NoxernaBlocks.NEON_CONCRETE.get());
        dropSelf(NoxernaBlocks.XENON_CONCRETE_POWDER.get());
        dropSelf(NoxernaBlocks.KRYPTON_CONCRETE_POWDER.get());
        dropSelf(NoxernaBlocks.ARGON_CONCRETE_POWDER.get());
        dropSelf(NoxernaBlocks.NEON_CONCRETE_POWDER.get());

        dropSelf(NoxernaBlocks.NOBLEWOOD_CRAFTING_TABLE.get());
    }
}
