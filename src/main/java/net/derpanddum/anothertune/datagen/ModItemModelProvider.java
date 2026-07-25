package net.derpanddum.anothertune.datagen;

import net.derpanddum.anothertune.AnotherTune;
import net.derpanddum.anothertune.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, AnotherTune.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.BAR_BRAWL_MUSIC_DISC);
        simpleItem(ModItems.BIRDBRAIN_MUSIC_DISC);
        simpleItem(ModItems.BITE_ME_MUSIC_DISC);
        simpleItem(ModItems.BREAK_THROUGH_IT_ALL_MUSIC_DISC);
        simpleItem(ModItems.FIND_YOUR_FLAME);
        simpleItem(ModItems.HUMAN);
        simpleItem(ModItems.IM_HERE_REVISITED);
        simpleItem(ModItems.IT_HAS_TO_BE_THIS_WAY);
        simpleItem(ModItems.ITS_PIZZA_TIME);
        simpleItem(ModItems.ITS_TIME_TO_FIGHT_CRIME);
        simpleItem(ModItems.LEMON_MELON_COOKIE);
        simpleItem(ModItems.LIVE_AND_LEARN);
        simpleItem(ModItems.LIVE_AND_LEARN_TETO_MIX);
        simpleItem(ModItems.MAGICAL_CURE_LOVESHOT);
        simpleItem(ModItems.MY_WAY);
        simpleItem(ModItems.PENUMBRA_PHANTASM);
        simpleItem(ModItems.SOSORRY);
        simpleItem(ModItems.TENEBRE_ROSSO_SANGUE);
        simpleItem(ModItems.TRAVELERS);
        simpleItem(ModItems.TRIPLE_BAKA);
        simpleItem(ModItems.UNDEFEATABLE);
        simpleItem(ModItems.WAR);
        simpleItem(ModItems.WAR_WITHOUT_REASON);
        simpleItem(ModItems.ORDER);
        simpleItem(ModItems.WINDOVERFLOWER);
        simpleItem(ModItems.MIKU_ESSENCE);
        simpleItem(ModItems.PANOPTICON);
        simpleItem(ModItems.ALLICANSEEISYOU);
        simpleItem(ModItems.AMYSTERIOUSPHONECALL);
        simpleItem(ModItems.SPOONFULLOFSPELL);
        simpleItem(ModItems.APRICOT);
        simpleItem(ModItems.HEATABNORMAL);
        simpleItem(ModItems.HEAVENSBUG);
        simpleItem(ModItems.KYUKURARIN);
        simpleItem(ModItems.LAGTRAIN);
        simpleItem(ModItems.LIVING_MILLENNIUM);
        simpleItem(ModItems.LOSTUMBRELLA);
        simpleItem(ModItems.MIRARERUMIRROR);
        simpleItem(ModItems.OTSUKARE);
        simpleItem(ModItems.RABBIT);
        simpleItem(ModItems.REDLANDMARKER);
        simpleItem(ModItems.SHUNRAN);
        simpleItem(ModItems.THECRUELANGELSTHESIS);
        simpleItem(ModItems.WRITEOVERME);
        simpleItem(ModItems.ONLITTLECATFEET);
        simpleItem(ModItems.TEMSHOP);
        simpleItem(ModItems.EGGMAN);
        simpleItem(ModItems.MOONOVERTHECASTLE);
        simpleItem(ModItems.PLANETARYGO);
        simpleItem(ModItems.HELLOMARINA);
        simpleItem(ModItems.VERSUS);
        simpleItem(ModItems.DUEL);
        simpleItem(ModItems.DIVINEINTERVENTION);
        simpleItem(ModItems.THEDEATHOFGODSWILL);
        simpleItem(ModItems.GUSTYGARDENGALAXY);
        simpleItem(ModItems.THEWORLDLOOKSWHITE);
        simpleItem(ModItems.THEWORLDLOOKSRED);
        simpleItem(ModItems.BULLOFHELL);
        simpleItem(ModItems.DOROBOTSDREAMOFETERNALSLEEP);
        simpleItem(ModItems.HEARTHESIRENSONGCALLOFDEATH);
        simpleItem(ModItems.SUFFERINGLEAVESSUFFERINGLEAVES);
        simpleItem(ModItems.DANSEMACABRE);
        simpleItem(ModItems.WARWITHOUTREASONHESPERUSCOVER);
        simpleItem(ModItems.INABSENTIALOGOS);
        simpleItem(ModItems.SPIRALOUT);
        simpleItem(ModItems.NEVERODDOREVEN);
        simpleItem(ModItems.NODEVILLIVEDON);
        simpleItem(ModItems.MIRRORRIM);
        simpleItem(ModItems.THEBREAK);
        simpleItem(ModItems.THESHATTERINGCIRCLE);
        simpleItem(ModItems.EVENTHORIZON);
        simpleItem(ModItems.THEFALL);
        simpleItem(ModItems.ALTARSOFAPOSTASY);
        simpleItem(ModItems.NI4NI);
        simpleItem(ModItems.MOSIMOSI);
        simpleItem(ModItems.SUNSETOFSEVENSUNS);
        simpleItem(ModItems.DOUBLEDGASTERSTHEME);
        simpleItem(ModItems.BOOMBOOMBOOMBOOM);
        simpleItem(ModItems.RUNNINGSKY);
        simpleItem(ModItems.TVTIME);
        simpleItem(ModItems.FLOWERMAN);
        simpleItem(ModItems.BLACKKNIFE);
        simpleItem(ModItems.FALLENANGEL);
        simpleItem(ModItems.STORYOFAWARRIOR);
        simpleItem(ModItems.PURPLECOINSGREENMIX);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(AnotherTune.MOD_ID,"item/" + item.getId().getPath()));
    }


}
