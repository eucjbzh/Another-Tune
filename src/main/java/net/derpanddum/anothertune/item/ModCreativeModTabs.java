package net.derpanddum.anothertune.item;

import net.derpanddum.anothertune.AnotherTune;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AnotherTune.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.HUMAN.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.BAR_BRAWL_MUSIC_DISC.get());

                        pOutput.accept(ModItems.UNDEFEATABLE.get());
                        pOutput.accept(ModItems.BREAK_THROUGH_IT_ALL_MUSIC_DISC.get());
                        pOutput.accept(ModItems.FIND_YOUR_FLAME.get());
                        pOutput.accept(ModItems.IM_HERE_REVISITED.get());

                        pOutput.accept(ModItems.BIRDBRAIN_MUSIC_DISC.get());
                        pOutput.accept(ModItems.HUMAN.get());
                        pOutput.accept(ModItems.LEMON_MELON_COOKIE.get());
                        pOutput.accept(ModItems.MAGICAL_CURE_LOVESHOT.get());
                        pOutput.accept(ModItems.SOSORRY.get());
                        pOutput.accept(ModItems.TRIPLE_BAKA.get());

                        pOutput.accept(ModItems.BITE_ME_MUSIC_DISC.get());
                        pOutput.accept(ModItems.IT_HAS_TO_BE_THIS_WAY.get());
                        pOutput.accept(ModItems.ITS_PIZZA_TIME.get());
                        pOutput.accept(ModItems.ITS_TIME_TO_FIGHT_CRIME.get());
                        pOutput.accept(ModItems.LIVE_AND_LEARN.get());
                        pOutput.accept(ModItems.LIVE_AND_LEARN_TETO_MIX.get());
                        pOutput.accept(ModItems.MY_WAY.get());
                        pOutput.accept(ModItems.PENUMBRA_PHANTASM.get());
                        pOutput.accept(ModItems.TENEBRE_ROSSO_SANGUE.get());
                        pOutput.accept(ModItems.TRAVELERS.get());
                        pOutput.accept(ModItems.WAR.get());
                        pOutput.accept(ModItems.WAR_WITHOUT_REASON.get());
                        pOutput.accept(ModItems.ORDER.get());
                        pOutput.accept(ModItems.WINDOVERFLOWER.get());

                        // VOLUME 2

                        pOutput.accept(ModItems.PANOPTICON.get());
                        pOutput.accept(ModItems.ALLICANSEEISYOU.get());
                        pOutput.accept(ModItems.AMYSTERIOUSPHONECALL.get());
                        pOutput.accept(ModItems.SPOONFULLOFSPELL.get());

                        pOutput.accept(ModItems.RABBIT.get());
                        pOutput.accept(ModItems.SHUNRAN.get());

                        pOutput.accept(ModItems.HEAVENSBUG.get());
                        pOutput.accept(ModItems.LIVING_MILLENNIUM.get());
                        pOutput.accept(ModItems.APRICOT.get());
                        pOutput.accept(ModItems.KYUKURARIN.get());
                        pOutput.accept(ModItems.HEATABNORMAL.get());
                        pOutput.accept(ModItems.WRITEOVERME.get());

                        pOutput.accept(ModItems.LAGTRAIN.get());
                        pOutput.accept(ModItems.LOSTUMBRELLA.get());

                        pOutput.accept(ModItems.MIRARERUMIRROR.get());
                        pOutput.accept(ModItems.REDLANDMARKER.get());
                        pOutput.accept(ModItems.OTSUKARE.get());
                        pOutput.accept(ModItems.THECRUELANGELSTHESIS.get());

                        pOutput.accept(ModItems.MIKU_ESSENCE.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
