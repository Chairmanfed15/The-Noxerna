package net.chairmanfed.noxerna.data;

import net.chairmanfed.noxerna.TheNoxerna;
import net.chairmanfed.noxerna.block.PebbleBlock;
import net.chairmanfed.noxerna.registry.NoxernaBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class NoxernaBlockStateProvider extends BlockStateProvider {
    public NoxernaBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TheNoxerna.MODID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // Xenon Wood set
        logBlockWithItem(NoxernaBlocks.XENON_LOG);
        woodBlockWithItem(NoxernaBlocks.XENON_WOOD, NoxernaBlocks.XENON_LOG);
        logBlockWithItem(NoxernaBlocks.STRIPPED_XENON_LOG);
        woodBlockWithItem(NoxernaBlocks.STRIPPED_XENON_WOOD, NoxernaBlocks.STRIPPED_XENON_LOG);
        blockWithItem(NoxernaBlocks.XENON_PLANKS);
        stairBlockWithItem(NoxernaBlocks.XENON_STAIRS, NoxernaBlocks.XENON_PLANKS);
        slabBlockWithItem(NoxernaBlocks.XENON_SLAB, NoxernaBlocks.XENON_PLANKS);
        fenceBlockWithItem(NoxernaBlocks.XENON_FENCE, NoxernaBlocks.XENON_PLANKS);
        fenceGateWithItem(NoxernaBlocks.XENON_FENCE_GATE, NoxernaBlocks.XENON_PLANKS);
        doorBlockWithItem(NoxernaBlocks.XENON_DOOR, "cutout");
        trapDoorWithItem(NoxernaBlocks.XENON_TRAPDOOR, "cutout");
        pressurePlateWithItem(NoxernaBlocks.XENON_PRESSURE_PLATE, NoxernaBlocks.XENON_PLANKS);
        buttonWithItem(NoxernaBlocks.XENON_BUTTON, NoxernaBlocks.XENON_PLANKS);

        // Krypton Wood set
        logBlockWithItem(NoxernaBlocks.KRYPTON_LOG);
        woodBlockWithItem(NoxernaBlocks.KRYPTON_WOOD, NoxernaBlocks.KRYPTON_LOG);
        logBlockWithItem(NoxernaBlocks.STRIPPED_KRYPTON_LOG);
        woodBlockWithItem(NoxernaBlocks.STRIPPED_KRYPTON_WOOD, NoxernaBlocks.STRIPPED_KRYPTON_LOG);
        blockWithItem(NoxernaBlocks.KRYPTON_PLANKS);
        stairBlockWithItem(NoxernaBlocks.KRYPTON_STAIRS, NoxernaBlocks.KRYPTON_PLANKS);
        slabBlockWithItem(NoxernaBlocks.KRYPTON_SLAB, NoxernaBlocks.KRYPTON_PLANKS);
        fenceBlockWithItem(NoxernaBlocks.KRYPTON_FENCE, NoxernaBlocks.KRYPTON_PLANKS);
        fenceGateWithItem(NoxernaBlocks.KRYPTON_FENCE_GATE, NoxernaBlocks.KRYPTON_PLANKS);
        doorBlockWithItem(NoxernaBlocks.KRYPTON_DOOR, "cutout");
        trapDoorWithItem(NoxernaBlocks.KRYPTON_TRAPDOOR, "cutout");
        pressurePlateWithItem(NoxernaBlocks.KRYPTON_PRESSURE_PLATE, NoxernaBlocks.KRYPTON_PLANKS);
        buttonWithItem(NoxernaBlocks.KRYPTON_BUTTON, NoxernaBlocks.KRYPTON_PLANKS);

        // Argon Wood set
        blockWithItem(NoxernaBlocks.ARGON_PLANKS);
        stairBlockWithItem(NoxernaBlocks.ARGON_STAIRS, NoxernaBlocks.ARGON_PLANKS);

        // Neon Wood set
        blockWithItem(NoxernaBlocks.NEON_PLANKS);

        // Soltra Stone set
        blockWithItem(NoxernaBlocks.SOLTRA);
        blockWithItem(NoxernaBlocks.POLISHED_SOLTRA);
        blockWithItem(NoxernaBlocks.SOLTRA_BRICKS);
        pebbleBlock(NoxernaBlocks.SOLTRA_PEBBLE, NoxernaBlocks.SOLTRA);

        // Noxum Stone set
        blockWithItem(NoxernaBlocks.NOXUM);
        stairBlockWithItem(NoxernaBlocks.NOXUM_STAIRS, NoxernaBlocks.NOXUM);
        slabBlockWithItem(NoxernaBlocks.NOXUM_SLAB, NoxernaBlocks.NOXUM);
        wallBlockWithItem(NoxernaBlocks.NOXUM_WALL, NoxernaBlocks.NOXUM);
        pressurePlateWithItem(NoxernaBlocks.NOXUM_PRESSURE_PLATE, NoxernaBlocks.NOXUM);
        buttonWithItem(NoxernaBlocks.NOXUM_BUTTON, NoxernaBlocks.NOXUM);
        pebbleBlock(NoxernaBlocks.NOXUM_PEBBLE, NoxernaBlocks.NOXUM);
        blockWithItem(NoxernaBlocks.POLISHED_NOXUM);
        stairBlockWithItem(NoxernaBlocks.POLISHED_NOXUM_STAIRS, NoxernaBlocks.POLISHED_NOXUM);
        slabBlockWithItem(NoxernaBlocks.POLISHED_NOXUM_SLAB, NoxernaBlocks.POLISHED_NOXUM);
        wallBlockWithItem(NoxernaBlocks.POLISHED_NOXUM_WALL, NoxernaBlocks.POLISHED_NOXUM);
        blockWithItem(NoxernaBlocks.NOXUM_BRICKS);
        stairBlockWithItem(NoxernaBlocks.NOXUM_BRICK_STAIRS, NoxernaBlocks.NOXUM_BRICKS);
        slabBlockWithItem(NoxernaBlocks.NOXUM_BRICK_SLAB, NoxernaBlocks.NOXUM_BRICKS);
        wallBlockWithItem(NoxernaBlocks.NOXUM_BRICK_WALL, NoxernaBlocks.NOXUM_BRICKS);

        // Aestum Stone set
        blockWithItem(NoxernaBlocks.AESTUM);
        blockWithItem(NoxernaBlocks.POLISHED_AESTUM);
        blockWithItem(NoxernaBlocks.AESTUM_BRICKS);
        pebbleBlock(NoxernaBlocks.AESTUM_PEBBLE, NoxernaBlocks.AESTUM);

        // Inetra Stone set
        blockWithItem(NoxernaBlocks.INETRA);
        blockWithItem(NoxernaBlocks.POLISHED_INETRA);
        blockWithItem(NoxernaBlocks.INETRA_BRICKS);
        pebbleBlock(NoxernaBlocks.INETRA_PEBBLE, NoxernaBlocks.INETRA);

        // Ferrebris Metal set
        blockWithItem(NoxernaBlocks.FERREBRIS_BLOCK);
        paneBlockWithItem(NoxernaBlocks.FERREBRIS_BARS, "cutout");
        blockWithItem(NoxernaBlocks.FERREBRIS_PLATING);
        stairBlockWithItem(NoxernaBlocks.FERREBRIS_PLATING_STAIRS, NoxernaBlocks.FERREBRIS_PLATING);
        slabBlockWithItem(NoxernaBlocks.FERREBRIS_PLATING_SLAB, NoxernaBlocks.FERREBRIS_PLATING);
        wallBlockWithItem(NoxernaBlocks.FERREBRIS_PLATING_WALL, NoxernaBlocks.FERREBRIS_PLATING);

        // Umburam Metal set
        blockWithItem(NoxernaBlocks.UMBURAM_BLOCK);
        blockWithItem(NoxernaBlocks.UMBURAM_PLATING);

        // Teneryl Gem set
        blockWithItem(NoxernaBlocks.TENERYL_BLOCK);

        // Adamuna Gem set
        blockWithItem(NoxernaBlocks.ADAMUNA_BLOCK);

        // Inperlum Metal set
        blockWithItem(NoxernaBlocks.INPERLUM_BLOCK);
        blockWithItem(NoxernaBlocks.INPERLUM_PLATING);

        // Nihoxite Metal set
        blockWithItem(NoxernaBlocks.NIHOXITE_BLOCK);
        blockWithItem(NoxernaBlocks.NIHOXITE_PLATING);

        // Vitragor Gem set
        blockWithItem(NoxernaBlocks.VITRAGOR_BLOCK);

        // Obscuprum Metal set
        blockWithItem(NoxernaBlocks.OBSCUPRUM_BLOCK);
        blockWithItem(NoxernaBlocks.EXPOSED_OBSCUPRUM_BLOCK);
        blockWithItem(NoxernaBlocks.WEATHERED_OBSCUPRUM_BLOCK);
        blockWithItem(NoxernaBlocks.OXIDISED_OBSCUPRUM_BLOCK);
            // Cut
        blockWithItem(NoxernaBlocks.CUT_OBSCUPRUM_BLOCK);
        blockWithItem(NoxernaBlocks.EXPOSED_CUT_OBSCUPRUM_BLOCK);
        blockWithItem(NoxernaBlocks.WEATHERED_CUT_OBSCUPRUM_BLOCK);
        blockWithItem(NoxernaBlocks.OXIDISED_CUT_OBSCUPRUM_BLOCK);
            // Bricks
        blockWithItem(NoxernaBlocks.OBSCUPRUM_BRICKS);
        blockWithItem(NoxernaBlocks.EXPOSED_OBSCUPRUM_BRICKS);
        blockWithItem(NoxernaBlocks.WEATHERED_OBSCUPRUM_BRICKS);
        blockWithItem(NoxernaBlocks.OXIDISED_OBSCUPRUM_BRICKS);
            // Plating
        blockWithItem(NoxernaBlocks.OBSCUPRUM_PLATING);
        blockWithItem(NoxernaBlocks.EXPOSED_OBSCUPRUM_PLATING);
        blockWithItem(NoxernaBlocks.WEATHERED_OBSCUPRUM_PLATING);
        blockWithItem(NoxernaBlocks.OXIDISED_OBSCUPRUM_PLATING);

        // Coloured Blocks
        blockWithItem(NoxernaBlocks.ARGON_CONCRETE_POWDER);
        blockWithItem(NoxernaBlocks.ARGON_CONCRETE);

        // Set-less Blocks
        blockWithItem(NoxernaBlocks.VOIDROCK);
        blockWithItem(NoxernaBlocks.NOXERNA_PORTAL_FRAME);
        basicBlock(NoxernaBlocks.NOXERNA_PORTAL);
    }
    private void blockWithItem(DeferredBlock<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
    public void basicBlock(DeferredBlock<Block> block) {
        this.simpleBlock(block.get(), cubeAll(block.get()));
    }
    public void simpleBlockItem(DeferredBlock<Block> block) {
        this.itemModels().withExistingParent(block.getId().toString(),
                this.modLoc("block/" + block.getId().getPath()));
    }
    public void logBlockWithItem(DeferredBlock<Block> block) {
        this.logBlock((RotatedPillarBlock) block.get());
        this.simpleBlockItem(block);
    }
    public void woodBlockWithItem(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {
        this.axisBlock((RotatedPillarBlock) block.get(),
                blockTexture(baseBlock.get()), extend(blockTexture(baseBlock.get()), ""));
        this.simpleBlockItem(block);
    }
    public void stairBlockWithItem(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {
        this.stairsBlock((StairBlock) block.get(), this.blockTexture(baseBlock.get()));
        this.simpleBlockItem(block);
    }
    public void slabBlockWithItem(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {
        this.slabBlock((SlabBlock) block.get(), this.blockTexture(baseBlock.get()), this.blockTexture(baseBlock.get()));
        this.simpleBlockItem(block);
    }
    public void fenceBlockWithItem(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {
        this.fenceBlock((FenceBlock) block.get(), this.blockTexture(baseBlock.get()));
        this.itemModels().fenceInventory(block.getId().toString(), this.blockTexture(baseBlock.get()));
    }
    public void fenceGateWithItem(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {
        this.fenceGateBlock((FenceGateBlock) block.get(), this.blockTexture(baseBlock.get()));
        this.itemModels().fenceGate(block.getId().toString(), this.blockTexture(baseBlock.get()));
    }
    public void wallBlockWithItem(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {
        this.wallBlock((WallBlock) block.get(), this.blockTexture(baseBlock.get()));
        this.itemModels().wallInventory(block.getId().toString(), this.blockTexture(baseBlock.get()));
    }
    public void paneBlockWithItem(DeferredBlock<Block> block, String renderType) {
        this.paneBlockWithRenderType((IronBarsBlock) block.get(),
                this.blockTexture(block.get()),
                this.blockTexture(block.get()), renderType);
        this.itemModels().basicItem(block.get().asItem());
    }
    public void doorBlockWithItem(DeferredBlock<Block> block) {
        this.doorBlock((DoorBlock) block.get(),
                this.blockTexture(block.get()).withSuffix("_bottom"),
                this.blockTexture(block.get()).withSuffix("_top"));
        this.itemModels().basicItem(ResourceLocation.parse(block.getId().toString()));
    }
    public void doorBlockWithItem(DeferredBlock<Block> block, String renderType) {
        this.doorBlockWithRenderType((DoorBlock) block.get(),
                this.blockTexture(block.get()).withSuffix("_bottom"),
                this.blockTexture(block.get()).withSuffix("_top"), renderType);
        this.itemModels().basicItem(ResourceLocation.parse(block.getId().toString()));
    }
    public void trapDoorWithItem(DeferredBlock<Block> block) {
        this.trapdoorBlock((TrapDoorBlock) block.get(), this.blockTexture(block.get()), true);
        this.itemModels().trapdoorOrientableBottom(block.getId().toString(), this.blockTexture(block.get()));
    }
    public void trapDoorWithItem(DeferredBlock<Block> block, String renderType) {
        this.trapdoorBlockWithRenderType((TrapDoorBlock) block.get(), this.blockTexture(block.get()),
                true, renderType);
        this.itemModels().trapdoorOrientableBottom(block.getId().toString(), this.blockTexture(block.get()));
    }
    public void pressurePlateWithItem(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {
        this.pressurePlateBlock((PressurePlateBlock) block.get(), this.blockTexture(baseBlock.get()));
        this.itemModels().pressurePlate(block.getId().toString(), this.blockTexture(baseBlock.get()));
    }
    public void buttonWithItem(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {
        this.buttonBlock((ButtonBlock) block.get(), this.blockTexture(baseBlock.get()));
        this.itemModels().buttonInventory(block.getId().toString(), this.blockTexture(baseBlock.get()));
    }
    public void pebbleBlock(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock){
        this.getVariantBuilder(block.get()).forAllStatesExcept((blockState) -> {
            int pebbles = blockState.getValue(PebbleBlock.PEBBLES);
            switch (pebbles) {
                case 4 -> {
                    return ConfiguredModel.builder().modelFile(this.models()
                            .withExistingParent(
                                    "four_" + baseBlock.getId().getPath() + "_pebbles",
                                    this.modLoc("block/four_pebbles"))
                            .texture("all", this.blockTexture(baseBlock.get()))).build();
                }
                case 3 -> {
                    return ConfiguredModel.builder().modelFile(this.models()
                            .withExistingParent(
                                    "three_" + baseBlock.getId().getPath() + "_pebbles",
                                    this.modLoc("block/three_pebbles"))
                            .texture("all", this.blockTexture(baseBlock.get()))).build();
                }
                case 2 -> {
                    return ConfiguredModel.builder().modelFile(this.models()
                            .withExistingParent(
                                    "two_" + baseBlock.getId().getPath() + "_pebbles",
                                    this.modLoc("block/two_pebbles"))
                            .texture("all", this.blockTexture(baseBlock.get()))).build();
                }
                default -> {
                    return ConfiguredModel.builder().modelFile(this.models()
                            .withExistingParent(
                                    baseBlock.getId().getPath() + "_pebble",
                                    this.modLoc("block/pebble"))
                            .texture("all", this.blockTexture(baseBlock.get()))).build();
                }
            }
        }, PebbleBlock.WATERLOGGED);
        this.itemModels().basicItem(ResourceLocation.parse(block.getId().toString()));
    }

    private ResourceLocation extend(ResourceLocation resourceLocation, String suffix) {
        return ResourceLocation.fromNamespaceAndPath(resourceLocation.getNamespace(),
                resourceLocation.getPath() + suffix);
    }
}
