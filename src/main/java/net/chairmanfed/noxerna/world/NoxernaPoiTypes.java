package net.chairmanfed.noxerna.world;

import com.google.common.collect.ImmutableSet;
import net.chairmanfed.noxerna.Noxerna;
import net.chairmanfed.noxerna.block.NoxernaBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Set;

public class NoxernaPoiTypes {
    public static final DeferredRegister<PoiType> POI = DeferredRegister.create(
            BuiltInRegistries.POINT_OF_INTEREST_TYPE, Noxerna.MODID);
    public static final DeferredHolder<PoiType, PoiType> NOXERNA_PORTAL = POI.register(
            "noxerna_portal", () -> new PoiType(getBlockStates(
                    NoxernaBlocks.NOXERNA_PORTAL.get()), 0, 1));

    private static Set<BlockState> getBlockStates(Block block) {
        return ImmutableSet.copyOf(block.getStateDefinition().getPossibleStates());
    }
}
