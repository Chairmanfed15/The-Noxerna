package net.chairmanfed.noxerna.item.equipment.tools;

import net.chairmanfed.noxerna.item.equipment.NoxernaNeoItemAbilities;
import net.chairmanfed.noxerna.registry.NoxernaTags;
import net.minecraft.world.item.*;
import net.neoforged.neoforge.common.ItemAbility;

public class PickadzeItem extends DiggerItem {
    public PickadzeItem(Tier tier, Item.Properties properties) {
        super(tier, NoxernaTags.BlockTags.MINEABLE_WITH_PICKADZE, properties);
    }
    @Override
    public boolean canPerformAction(ItemStack stack, ItemAbility itemAbility){
        return NoxernaNeoItemAbilities.DEFAULT_PICKADZE_ACTIONS.contains(itemAbility);
    }
}
