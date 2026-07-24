package net.derpanddum.anothertune.datagen;

import net.derpanddum.anothertune.AnotherTune;
import net.derpanddum.anothertune.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, AnotherTune.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        List<Item> ItemTagList = new ArrayList<>();

        // Add your items to the list only once
        ItemTagList.add(ModItems.BAR_BRAWL_MUSIC_DISC.get());
        ItemTagList.add(ModItems.BIRDBRAIN_MUSIC_DISC.get());
        ItemTagList.add(ModItems.BITE_ME_MUSIC_DISC.get());
        ItemTagList.add(ModItems.BREAK_THROUGH_IT_ALL_MUSIC_DISC.get());
        ItemTagList.add(ModItems.FIND_YOUR_FLAME.get());
        ItemTagList.add(ModItems.HUMAN.get());
        ItemTagList.add(ModItems.IM_HERE_REVISITED.get());
        ItemTagList.add(ModItems.IT_HAS_TO_BE_THIS_WAY.get());
        ItemTagList.add(ModItems.ITS_PIZZA_TIME.get());
        ItemTagList.add(ModItems.ITS_TIME_TO_FIGHT_CRIME.get());
        ItemTagList.add(ModItems.LEMON_MELON_COOKIE.get());
        ItemTagList.add(ModItems.LIVE_AND_LEARN.get());
        ItemTagList.add(ModItems.LIVE_AND_LEARN_TETO_MIX.get());
        ItemTagList.add(ModItems.MAGICAL_CURE_LOVESHOT.get());
        ItemTagList.add(ModItems.MY_WAY.get());
        ItemTagList.add(ModItems.PENUMBRA_PHANTASM.get());
        ItemTagList.add(ModItems.SOSORRY.get());
        ItemTagList.add(ModItems.TENEBRE_ROSSO_SANGUE.get());
        ItemTagList.add(ModItems.TRAVELERS.get());
        ItemTagList.add(ModItems.TRIPLE_BAKA.get());
        ItemTagList.add(ModItems.UNDEFEATABLE.get());
        ItemTagList.add(ModItems.WAR.get());
        ItemTagList.add(ModItems.WAR_WITHOUT_REASON.get());
        ItemTagList.add(ModItems.ORDER.get());
        ItemTagList.add(ModItems.WINDOVERFLOWER.get());
        ItemTagList.add(ModItems.PANOPTICON.get());
        ItemTagList.add(ModItems.ALLICANSEEISYOU.get());
        ItemTagList.add(ModItems.AMYSTERIOUSPHONECALL.get());
        ItemTagList.add(ModItems.SPOONFULLOFSPELL.get());
        ItemTagList.add(ModItems.APRICOT.get());
        ItemTagList.add(ModItems.HEATABNORMAL.get());
        ItemTagList.add(ModItems.HEAVENSBUG.get());
        ItemTagList.add(ModItems.KYUKURARIN.get());
        ItemTagList.add(ModItems.LAGTRAIN.get());
        ItemTagList.add(ModItems.LIVING_MILLENNIUM.get());
        ItemTagList.add(ModItems.LOSTUMBRELLA.get());
        ItemTagList.add(ModItems.RABBIT.get());
        ItemTagList.add(ModItems.OTSUKARE.get());
        ItemTagList.add(ModItems.REDLANDMARKER.get());
        ItemTagList.add(ModItems.SHUNRAN.get());
        ItemTagList.add(ModItems.THECRUELANGELSTHESIS.get());
        ItemTagList.add(ModItems.WRITEOVERME.get());
        ItemTagList.add(ModItems.ONLITTLECATFEET.get());
        ItemTagList.add(ModItems.TEMSHOP.get());
        ItemTagList.add(ModItems.EGGMAN.get());
        ItemTagList.add(ModItems.MOONOVERTHECASTLE.get());
        ItemTagList.add(ModItems.PLANETARYGO.get());
        ItemTagList.add(ModItems.HELLOMARINA.get());
        ItemTagList.add(ModItems.VERSUS.get());
        ItemTagList.add(ModItems.DUEL.get());
        ItemTagList.add(ModItems.DIVINEINTERVENTION.get());
        ItemTagList.add(ModItems.THEDEATHOFGODSWILL.get());
        ItemTagList.add(ModItems.GUSTYGARDENGALAXY.get());
        ItemTagList.add(ModItems.THEWORLDLOOKSWHITE.get());
        ItemTagList.add(ModItems.THEWORLDLOOKSRED.get());
        ItemTagList.add(ModItems.BULLOFHELL.get());
        ItemTagList.add(ModItems.DOROBOTSDREAMOFETERNALSLEEP.get());
        ItemTagList.add(ModItems.HEARTHESIRENSONGCALLOFDEATH.get());
        ItemTagList.add(ModItems.SUFFERINGLEAVESSUFFERINGLEAVES.get());
        ItemTagList.add(ModItems.DANSEMACABRE.get());
        ItemTagList.add(ModItems.INABSENTIALOGOS.get());
        ItemTagList.add(ModItems.SPIRALOUT.get());
        ItemTagList.add(ModItems.NEVERODDOREVEN.get());
        ItemTagList.add(ModItems.NODEVILLIVEDON.get());
        ItemTagList.add(ModItems.MIRRORRIM.get());
        ItemTagList.add(ModItems.THEBREAK.get());
        ItemTagList.add(ModItems.THESHATTERINGCIRCLE.get());
        ItemTagList.add(ModItems.EVENTHORIZON.get());
        ItemTagList.add(ModItems.THEFALL.get());
        ItemTagList.add(ModItems.ALTARSOFAPOSTASY.get());
        ItemTagList.add(ModItems.NI4NI.get());
        ItemTagList.add(ModItems.MOSIMOSI.get());        // Apply the list to both tags cleanly
        ItemTagList.add(ModItems.SUNSETOFSEVENSUNS.get());
        ItemTagList.add(ModItems.DOUBLEDGASTERSTHEME.get());
        ItemTagList.add(ModItems.BOOMBOOMBOOMBOOM.get());
        ItemTagList.add(ModItems.RUNNINGSKY.get());
        ItemTagList.add(ModItems.TVTIME.get());
        ItemTagList.add(ModItems.FLOWERMAN.get());
        ItemTagList.add(ModItems.BLACKKNIFE.get());
        this.tag(ItemTags.MUSIC_DISCS)
                .add(ItemTagList.toArray(new Item[0]));

        this.tag(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .add(ItemTagList.toArray(new Item[0]));
    }
}