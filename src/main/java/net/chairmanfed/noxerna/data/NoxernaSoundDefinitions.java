package net.chairmanfed.noxerna.data;

import net.chairmanfed.noxerna.Noxerna;
import net.chairmanfed.noxerna.data.generators.NoxernaLanguageData;
import net.chairmanfed.noxerna.registry.NoxernaSoundEvents;
import net.minecraft.data.PackOutput;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.common.data.SoundDefinition;
import net.neoforged.neoforge.common.data.SoundDefinitionsProvider;

import javax.annotation.Nullable;

public class NoxernaSoundDefinitions extends SoundDefinitionsProvider {
    public NoxernaSoundDefinitions(PackOutput output, ExistingFileHelper fileHelper) {
        super(output, Noxerna.MODID, fileHelper);
    }

    @Override
    public void registerSounds() {
        this.generateSound(NoxernaSoundEvents.HEAVY_METAL_BREAK, 4);
        this.generateSound(NoxernaSoundEvents.HEAVY_METAL_PLACE, 4);
        this.generateSound(NoxernaSoundEvents.LIGHT_METAL_BREAK, 2);
        this.generateSound(NoxernaSoundEvents.LIGHT_METAL_PLACE, 2);
        this.generateSound(NoxernaSoundEvents.NOBLEWOOD_BREAK, 1);
        this.generateSound(NoxernaSoundEvents.NOBLEWOOD_STEP, 1);
        this.generateSound(NoxernaSoundEvents.NOBLEWOOD_PLACE, 1);
        this.generateSound(NoxernaSoundEvents.NOBLEWOOD_HIT, 1);
        this.generateSound(NoxernaSoundEvents.NOBLEWOOD_FALL, 1);
        this.generateSound(NoxernaSoundEvents.NOXUM_STEP, 3);
        this.generateSound(NoxernaSoundEvents.NOXUM_PLACE, 3);
    }

    // TODO: Finish sound registration
    protected static SoundDefinition.Sound sound(final String name){
        return sound(Noxerna.prefix(name));
    }
    public void generateSubbedSound(
            SoundEvent event, int soundVariations, String subtitle) {
        this.generateSound(event, event.getLocation().getPath().replace('.', '/'), soundVariations, subtitle);
    }
    public void generateSound(SoundEvent event, int soundVariations) {
        this.generateSound(event, event.getLocation().getPath().replace('.', '/'),
                soundVariations, null);
    }
    public void generateSound(
            SoundEvent event,
            String baseDirectory, int soundVariations, @Nullable String subtitle) {
        SoundDefinition definition = SoundDefinition.definition();
        if (subtitle != null) {
            this.createSubtitleAndLang(event, definition, subtitle);
        }
        for (int i = 1; i <= soundVariations; i++) {
            definition.with(SoundDefinition.Sound.sound(
                    Noxerna.prefix(baseDirectory + (soundVariations > 1 ? i : "")),
                    SoundDefinition.SoundType.SOUND));
        }
        this.add(event, definition);
    }

    public void createSubtitleAndLang(
            SoundEvent event, SoundDefinition definition, String subtitle) {
        String[] splitName = event.getLocation().getPath().split("\\.");
        String subtitleKey = "subtitles.noxerna." + splitName[0] + "." + splitName[1];
        if (splitName.length > 2) subtitleKey += "." +splitName[2];
        definition.subtitle(subtitleKey);
        NoxernaLanguageData.SUBTITLE_GENERATOR.put(subtitleKey, subtitle);
    }
}
