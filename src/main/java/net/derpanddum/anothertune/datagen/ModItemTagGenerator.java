package net.derpanddum.anothertune.datagen;

import net.derpanddum.anothertune.AnotherTune;
import net.derpanddum.anothertune.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, AnotherTune.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(ItemTags.MUSIC_DISCS)
                .add(
                        ModItems.BAR_BRAWL_MUSIC_DISC.get(),
                        ModItems.BIRDBRAIN_MUSIC_DISC.get(),
                        ModItems.BITE_ME_MUSIC_DISC.get(),
                        ModItems.BREAK_THROUGH_IT_ALL_MUSIC_DISC.get(),
                        ModItems.FIND_YOUR_FLAME.get(),
                        ModItems.HUMAN.get(),
                        ModItems.IM_HERE_REVISITED.get(),
                        ModItems.IT_HAS_TO_BE_THIS_WAY.get(),
                        ModItems.ITS_PIZZA_TIME.get(),
                        ModItems.ITS_TIME_TO_FIGHT_CRIME.get(),
                        ModItems.LEMON_MELON_COOKIE.get(),
                        ModItems.LIVE_AND_LEARN.get(),
                        ModItems.LIVE_AND_LEARN_TETO_MIX.get(),
                        ModItems.MAGICAL_CURE_LOVESHOT.get(),
                        ModItems.MY_WAY.get(),
                        ModItems.PENUMBRA_PHANTASM.get(),
                        ModItems.SOSORRY.get(),
                        ModItems.TENEBRE_ROSSO_SANGUE.get(),
                        ModItems.TRAVELERS.get(),
                        ModItems.TRIPLE_BAKA.get(),
                        ModItems.UNDEFEATABLE.get(),
                        ModItems.WAR.get(),
                        ModItems.WAR_WITHOUT_REASON.get(),
                        ModItems.ORDER.get(),
                        ModItems.WINDOVERFLOWER.get(),
                        ModItems.PANOPTICON.get(),
                        ModItems.ALLICANSEEISYOU.get(),
                        ModItems.AMYSTERIOUSPHONECALL.get(),
                        ModItems.SPOONFULLOFSPELL.get(),
                        ModItems.APRICOT.get(),
                        ModItems.HEATABNORMAL.get(),
                        ModItems.HEAVENSBUG.get(),
                        ModItems.KYUKURARIN.get(),
                        ModItems.LAGTRAIN.get(),
                        ModItems.LIVING_MILLENNIUM.get(),
                        ModItems.LOSTUMBRELLA.get(),
                        ModItems.RABBIT.get(),
                        ModItems.OTSUKARE.get(),
                        ModItems.REDLANDMARKER.get(),
                        ModItems.SHUNRAN.get(),
                        ModItems.THECRUELANGELSTHESIS.get(),
                        ModItems.WRITEOVERME.get(),
                        ModItems.ONLITTLECATFEET.get(),
                        ModItems.TEMSHOP.get(),
                        ModItems.EGGMAN.get(),
                        ModItems.MOONOVERTHECASTLE.get(),
                        ModItems.PLANETARYGO.get(),
                        ModItems.HELLOMARINA.get(),
                        ModItems.VERSUS.get(),
                        ModItems.DUEL.get(),
                        ModItems.DIVINEINTERVENTION.get(),
                        ModItems.THEDEATHOFGODSWILL.get(),
                        ModItems.GUSTYGARDENGALAXY.get(),
                        ModItems.THEWORLDLOOKSWHITE.get()
                );

        this.tag(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .add(
                        ModItems.BAR_BRAWL_MUSIC_DISC.get(),
                        ModItems.BIRDBRAIN_MUSIC_DISC.get(),
                        ModItems.BITE_ME_MUSIC_DISC.get(),
                        ModItems.BREAK_THROUGH_IT_ALL_MUSIC_DISC.get(),
                        ModItems.FIND_YOUR_FLAME.get(),
                        ModItems.HUMAN.get(),
                        ModItems.IM_HERE_REVISITED.get(),
                        ModItems.IT_HAS_TO_BE_THIS_WAY.get(),
                        ModItems.ITS_PIZZA_TIME.get(),
                        ModItems.ITS_TIME_TO_FIGHT_CRIME.get(),
                        ModItems.LEMON_MELON_COOKIE.get(),
                        ModItems.LIVE_AND_LEARN.get(),
                        ModItems.LIVE_AND_LEARN_TETO_MIX.get(),
                        ModItems.MAGICAL_CURE_LOVESHOT.get(),
                        ModItems.MY_WAY.get(),
                        ModItems.PENUMBRA_PHANTASM.get(),
                        ModItems.SOSORRY.get(),
                        ModItems.TENEBRE_ROSSO_SANGUE.get(),
                        ModItems.TRAVELERS.get(),
                        ModItems.TRIPLE_BAKA.get(),
                        ModItems.UNDEFEATABLE.get(),
                        ModItems.WAR.get(),
                        ModItems.WAR_WITHOUT_REASON.get(),
                        ModItems.ORDER.get(),
                        ModItems.WINDOVERFLOWER.get(),
                        ModItems.PANOPTICON.get(),
                        ModItems.ALLICANSEEISYOU.get(),
                        ModItems.AMYSTERIOUSPHONECALL.get(),
                        ModItems.SPOONFULLOFSPELL.get(),
                        ModItems.APRICOT.get(),
                        ModItems.HEATABNORMAL.get(),
                        ModItems.HEAVENSBUG.get(),
                        ModItems.KYUKURARIN.get(),
                        ModItems.LAGTRAIN.get(),
                        ModItems.LIVING_MILLENNIUM.get(),
                        ModItems.LOSTUMBRELLA.get(),
                        ModItems.RABBIT.get(),
                        ModItems.OTSUKARE.get(),
                        ModItems.REDLANDMARKER.get(),
                        ModItems.SHUNRAN.get(),
                        ModItems.THECRUELANGELSTHESIS.get(),
                        ModItems.WRITEOVERME.get(),
                        ModItems.ONLITTLECATFEET.get(),
                        ModItems.TEMSHOP.get(),
                        ModItems.EGGMAN.get(),
                        ModItems.MOONOVERTHECASTLE.get(),
                        ModItems.PLANETARYGO.get(),
                        ModItems.HELLOMARINA.get(),
                        ModItems.VERSUS.get(),
                        ModItems.DUEL.get(),
                        ModItems.DIVINEINTERVENTION.get(),
                        ModItems.THEDEATHOFGODSWILL.get(),
                        ModItems.GUSTYGARDENGALAXY.get(),
                        ModItems.THEWORLDLOOKSWHITE.get()
                );
    }
}
