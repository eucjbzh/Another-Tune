package net.derpanddum.anothertune.datagen;

import net.derpanddum.anothertune.AnotherTune;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.GlobalLootModifierProvider;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, AnotherTune.MOD_ID);
    }

    @Override
    protected void start() {



    }
}
