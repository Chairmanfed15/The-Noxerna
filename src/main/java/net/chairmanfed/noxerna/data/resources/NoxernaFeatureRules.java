package net.chairmanfed.noxerna.data.resources;

import net.chairmanfed.noxerna.registry.NoxernaTags;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

public class NoxernaFeatureRules {
    public static final RuleTest NOXUM_REPLACEMENT = new TagMatchTest(NoxernaTags.BlockTags.NOXUM_ORES_REPLACEABLE);
}
