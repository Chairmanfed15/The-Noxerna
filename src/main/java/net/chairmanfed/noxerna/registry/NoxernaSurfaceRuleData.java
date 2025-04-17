package net.chairmanfed.noxerna.registry;

import com.google.common.collect.ImmutableList;
import net.chairmanfed.noxerna.block.NoxernaBlocks;
import net.chairmanfed.noxerna.data.resources.registries.NoxernaBiomes;
import net.minecraft.data.worldgen.SurfaceRuleData;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.CaveSurface;
import net.neoforged.neoforge.registries.DeferredBlock;

public class NoxernaSurfaceRuleData extends SurfaceRuleData {
    public static final SurfaceRules.RuleSource NOXUM = blockState(NoxernaBlocks.NOXUM);
    public static final SurfaceRules.RuleSource VOIDROCK = blockState(NoxernaBlocks.VOIDROCK);

    public static SurfaceRules.RuleSource blockState(DeferredBlock<Block> block) {
        return SurfaceRules.state(block.get().defaultBlockState());
    }
    public static SurfaceRules.RuleSource noxerna() {
        ImmutableList.Builder<SurfaceRules.RuleSource> builder = ImmutableList.builder();
        // Bedrock
        builder.add(SurfaceRules.ifTrue(SurfaceRules.verticalGradient(
                "bedrock_floor", VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(5)), VOIDROCK));
        // Noxum Depths
        builder.add(SurfaceRules.ifTrue(SurfaceRules.isBiome(NoxernaBiomes.NOXUM_DEPTHS), SurfaceRules.sequence(
                // Top Layer
                SurfaceRules.ifTrue(SurfaceRules.waterBlockCheck(0, 0),
                        SurfaceRules.sequence(
                                SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(
                                        0, false, CaveSurface.FLOOR), NOXUM),
                                SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(
                                        2, false, CaveSurface.FLOOR), NOXUM)
                        )
                ),
                // Underwater Blocks
                SurfaceRules.ifTrue(SurfaceRules.waterBlockCheck(0, 0),
                        SurfaceRules.sequence(
                                SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(
                                        0, false, CaveSurface.FLOOR), NOXUM),
                                SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(
                                        2, false, CaveSurface.FLOOR), NOXUM)
                        )
                )
        )));
        return SurfaceRules.sequence(builder.build().toArray(SurfaceRules.RuleSource[]::new));
    }
}
