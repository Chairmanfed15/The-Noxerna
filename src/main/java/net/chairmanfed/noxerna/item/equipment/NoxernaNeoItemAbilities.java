package net.chairmanfed.noxerna.item.equipment;

import com.google.common.collect.Sets;
import net.neoforged.neoforge.common.ItemAbility;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static net.neoforged.neoforge.common.ItemAbilities.*;

public class NoxernaNeoItemAbilities {
    public static final Set<ItemAbility> DEFAULT_PICKADZE_ACTIONS = of(PICKAXE_DIG, SHOVEL_DIG, BRUSH_BRUSH);

    private static Set<ItemAbility> of(ItemAbility... actions) {
        return Stream.of(actions).collect(Collectors.toCollection(Sets::newIdentityHashSet));
    }
}
