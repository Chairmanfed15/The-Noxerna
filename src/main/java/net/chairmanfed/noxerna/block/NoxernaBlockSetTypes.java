package net.chairmanfed.noxerna.block;

import net.chairmanfed.noxerna.Noxerna;
import net.chairmanfed.noxerna.registry.NoxernaSoundTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class NoxernaBlockSetTypes {
    public static final BlockSetType NOBLEWOOD_SET = BlockSetType.register(
            new BlockSetType(Noxerna.prefix("noblewood").toString(),
                    true, true, true,
                    BlockSetType.PressurePlateSensitivity.EVERYTHING, NoxernaSoundTypes.NOBLEWOOD,
                    SoundEvents.CHERRY_WOOD_DOOR_CLOSE, SoundEvents.CHERRY_WOOD_DOOR_OPEN,
                    SoundEvents.CHERRY_WOOD_TRAPDOOR_CLOSE, SoundEvents.CHERRY_WOOD_TRAPDOOR_OPEN,
                    SoundEvents.CHERRY_WOOD_PRESSURE_PLATE_CLICK_OFF, SoundEvents.CHERRY_WOOD_PRESSURE_PLATE_CLICK_ON,
                    SoundEvents.CHERRY_WOOD_BUTTON_CLICK_OFF, SoundEvents.CHERRY_WOOD_BUTTON_CLICK_ON));
    public static final WoodType NOBLEWOOD_WOOD = WoodType.register(
            new WoodType(Noxerna.prefix("noblewood").toString(), NOBLEWOOD_SET));

    public static final BlockSetType NOXUM_SET = BlockSetType.register(
            new BlockSetType(Noxerna.prefix("noxum").toString(),
                    true, true, false,
                    BlockSetType.PressurePlateSensitivity.MOBS, NoxernaSoundTypes.NOXUM,
                    SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN,
                    SoundEvents.IRON_TRAPDOOR_CLOSE, SoundEvents.IRON_TRAPDOOR_OPEN,
                    SoundEvents.STONE_PRESSURE_PLATE_CLICK_OFF, SoundEvents.STONE_PRESSURE_PLATE_CLICK_ON,
                    SoundEvents.STONE_BUTTON_CLICK_OFF, SoundEvents.STONE_BUTTON_CLICK_ON));
}
