package net.derpanddum.anothertune.item;

import com.blakebr0.mysticalagriculture.api.crop.CropTier;
import com.blakebr0.mysticalagriculture.item.EssenceItem;
import net.derpanddum.anothertune.AnotherTune;
import net.derpanddum.anothertune.sound.ModSounds;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AnotherTune.MOD_ID);

    public static final RegistryObject<Item> BAR_BRAWL_MUSIC_DISC = ITEMS.register("bar_brawl_music_disc",
            () -> new RecordItem(6, ModSounds.BAR_BRAWL, new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> BIRDBRAIN_MUSIC_DISC = ITEMS.register("birdbrain_music_disc",
            () -> new RecordItem(6, ModSounds.BIRDBRAIN, new Item.Properties().stacksTo(1), 5140));

    public static final RegistryObject<Item> BITE_ME_MUSIC_DISC = ITEMS.register("bite_me_music_disc",
            () -> new RecordItem(6, ModSounds.BITE_ME, new Item.Properties().stacksTo(1), 3640));

    public static final RegistryObject<Item> BREAK_THROUGH_IT_ALL_MUSIC_DISC = ITEMS.register("break_through_it_all_music_disc",
            () -> new RecordItem(6, ModSounds.BREAKTHROUGH, new Item.Properties().stacksTo(1), 4840));

    public static final RegistryObject<Item> FIND_YOUR_FLAME = ITEMS.register("find_your_flame_music_disc",
            () -> new RecordItem(6, ModSounds.FINDYOURFLAME, new Item.Properties().stacksTo(1), 4980));

    public static final RegistryObject<Item> HUMAN = ITEMS.register("human_music_disc",
            () -> new RecordItem(6, ModSounds.HUMAN, new Item.Properties().stacksTo(1), 5360));

    public static final RegistryObject<Item> IM_HERE_REVISITED = ITEMS.register("im_here_revisited_music_disc",
            () -> new RecordItem(6, ModSounds.IMHEREREVISITED, new Item.Properties().stacksTo(1), 4940));

    public static final RegistryObject<Item> IT_HAS_TO_BE_THIS_WAY = ITEMS.register("it_has_to_be_this_way_music_disc",
            () -> new RecordItem(6, ModSounds.ITHASTOBE, new Item.Properties().stacksTo(1), 3500));

    public static final RegistryObject<Item> ITS_PIZZA_TIME = ITEMS.register("its_pizza_time_music_disc",
            () -> new RecordItem(6, ModSounds.PIZZATIME, new Item.Properties().stacksTo(1), 3540));

    public static final RegistryObject<Item> ITS_TIME_TO_FIGHT_CRIME = ITEMS.register("its_time_to_fight_crime_music_disc",
            () -> new RecordItem(6, ModSounds.FIGHTCRIME, new Item.Properties().stacksTo(1), 1800));

    public static final RegistryObject<Item> LEMON_MELON_COOKIE = ITEMS.register("lemon_melon_cookie_music_disc",
            () -> new RecordItem(6, ModSounds.LEMONMELONCOOKIE, new Item.Properties().stacksTo(1), 3060));

    public static final RegistryObject<Item> LIVE_AND_LEARN = ITEMS.register("live_and_learn_music_disc",
            () -> new RecordItem(6, ModSounds.LIVEANDLEARN, new Item.Properties().stacksTo(1), 5400));

    public static final RegistryObject<Item> LIVE_AND_LEARN_TETO_MIX = ITEMS.register("live_and_learn_teto_mix_music_disc",
            () -> new RecordItem(6, ModSounds.LIVEANDLEARNTETO, new Item.Properties().stacksTo(1), 6360));

    public static final RegistryObject<Item> MAGICAL_CURE_LOVESHOT = ITEMS.register("magical_cure_loveshot_music_disc",
            () -> new RecordItem(6, ModSounds.LOVESHOT, new Item.Properties().stacksTo(1), 4340));

    public static final RegistryObject<Item> MY_WAY = ITEMS.register("my_way_music_disc",
            () -> new RecordItem(6, ModSounds.MYWAY, new Item.Properties().stacksTo(1), 5500));

    public static final RegistryObject<Item> PENUMBRA_PHANTASM = ITEMS.register("penumbra_phantasm_music_disc",
            () -> new RecordItem(6, ModSounds.PENUMBRAPHANTASM, new Item.Properties().stacksTo(1), 18000));

    public static final RegistryObject<Item> SOSORRY = ITEMS.register("sosorry_music_disc",
            () -> new RecordItem(6, ModSounds.SOSORRY, new Item.Properties().stacksTo(1), 3920));

    public static final RegistryObject<Item> TENEBRE_ROSSO_SANGUE = ITEMS.register("tenebre_rosso_sangue_music_disc",
            () -> new RecordItem(6, ModSounds.TENEBREROSSO, new Item.Properties().stacksTo(1), 4660));

    public static final RegistryObject<Item> TRAVELERS = ITEMS.register("travelers_music_disc",
            () -> new RecordItem(6, ModSounds.TRAVELERS, new Item.Properties().stacksTo(1), 4700));

    public static final RegistryObject<Item> TRIPLE_BAKA = ITEMS.register("triple_baka_music_disc",
            () -> new RecordItem(6, ModSounds.TRIPLEBAKA, new Item.Properties().stacksTo(1), 4640));

    public static final RegistryObject<Item> UNDEFEATABLE = ITEMS.register("undefeatable_music_disc",
            () -> new RecordItem(6, ModSounds.UNDEFEATABLE, new Item.Properties().stacksTo(1), 5280));

    public static final RegistryObject<Item> WAR = ITEMS.register("war_music_disc",
            () -> new RecordItem(6, ModSounds.WAR, new Item.Properties().stacksTo(1), 7700));

    public static final RegistryObject<Item> WAR_WITHOUT_REASON = ITEMS.register("war_without_reason_music_disc",
            () -> new RecordItem(6, ModSounds.WARWITHOUTREASON, new Item.Properties().stacksTo(1), 8160));

    public static final RegistryObject<Item> ORDER = ITEMS.register("order_music_disc",
            () -> new RecordItem(6, ModSounds.ORDER, new Item.Properties().stacksTo(1),8400));

    public static final RegistryObject<Item> WINDOVERFLOWER = ITEMS.register("wind_over_the_flower_music_disc",
            () -> new RecordItem(6, ModSounds.WINDOVERFLOWER, new Item.Properties().stacksTo(1), 4580));

    //VOLUME 2

    public static final RegistryObject<Item> ALLICANSEEISYOU = ITEMS.register("all_i_can_see_is_you_music_disc",
            () -> new RecordItem(6, ModSounds.ALLICANSEEISYOU, new Item.Properties().stacksTo(1), 4440));

    public static final RegistryObject<Item> PANOPTICON = ITEMS.register("panopticon_music_disc",
            () -> new RecordItem(6, ModSounds.PANOPTICON, new Item.Properties().stacksTo(1), 5100));

    public static final RegistryObject<Item> AMYSTERIOUSPHONECALL = ITEMS.register("a_mysterious_phone_call_music_disc",
            () -> new RecordItem(6, ModSounds.AMYSTERIOUSPHONECALL, new Item.Properties().stacksTo(1), 6840));

    public static final RegistryObject<Item> SPOONFULLOFSPELL = ITEMS.register("spoonful_of_spell_music_disc",
            () -> new RecordItem(6, ModSounds.ASPOONFULOFSPELL, new Item.Properties().stacksTo(1), 5380));

    public static final RegistryObject<Item> APRICOT = ITEMS.register("apricot_music_disc",
            () -> new RecordItem(6, ModSounds.APRICOT, new Item.Properties().stacksTo(1), 4120));

    public static final RegistryObject<Item> HEATABNORMAL = ITEMS.register("heat_abnormal_music_disc",
            () -> new RecordItem(6, ModSounds.HEATABNORMAL, new Item.Properties().stacksTo(1), 4800));

    public static final RegistryObject<Item> HEAVENSBUG = ITEMS.register("heavens_bug_music_disc",
            () -> new RecordItem(6, ModSounds.HEAVENSBUG, new Item.Properties().stacksTo(1), 4000));

    public static final RegistryObject<Item> KYUKURARIN = ITEMS.register("kyukurarin_music_disc",
            () -> new RecordItem(6, ModSounds.KYUKURARIN, new Item.Properties().stacksTo(1), 4340));

    public static final RegistryObject<Item> LAGTRAIN = ITEMS.register("lagtrain_music_disc",
            () -> new RecordItem(6, ModSounds.LAGTRAIN, new Item.Properties().stacksTo(1), 5020));

    public static final RegistryObject<Item> LIVING_MILLENNIUM = ITEMS.register("living_millennium_music_disc",
            () -> new RecordItem(6, ModSounds.LIVINGMILLENNIUM, new Item.Properties().stacksTo(1), 4080));

    public static final RegistryObject<Item> LOSTUMBRELLA = ITEMS.register("lost_umbrella_music_disc",
            () -> new RecordItem(6, ModSounds.LOSTUMBRELLA, new Item.Properties().stacksTo(1), 4080));

    public static final RegistryObject<Item> MIRARERUMIRROR = ITEMS.register("mirareru_mirror_music_disc",
            () -> new RecordItem(6, ModSounds.MIRARERUMIRROR, new Item.Properties().stacksTo(1), 3580));

    public static final RegistryObject<Item> OTSUKARE = ITEMS.register("otsukare_summer_music_disc",
            () -> new RecordItem(6, ModSounds.OTSUKARESUMMER, new Item.Properties().stacksTo(1), 4800));

    public static final RegistryObject<Item> RABBIT = ITEMS.register("rabbit_music_disc",
            () -> new RecordItem(6, ModSounds.RABBIT, new Item.Properties().stacksTo(1), 2940));

    public static final RegistryObject<Item> REDLANDMARKER = ITEMS.register("redlandmarker_music_disc",
            () -> new RecordItem(6, ModSounds.REDLANDMARKER, new Item.Properties().stacksTo(1), 4060));

    public static final RegistryObject<Item> SHUNRAN = ITEMS.register("shunran_music_disc",
            () -> new RecordItem(6, ModSounds.SHUNRAN, new Item.Properties().stacksTo(1), 3220));

    public static final RegistryObject<Item> THECRUELANGELSTHESIS = ITEMS.register("the_cruel_angels_thesis_music_disc",
            () -> new RecordItem(6, ModSounds.THECRUELANGELSTHESIS, new Item.Properties().stacksTo(1), 4900));

    public static final RegistryObject<Item> WRITEOVERME = ITEMS.register("write_over_me_music_disc",
            () -> new RecordItem(6, ModSounds.WRITEOVERME, new Item.Properties().stacksTo(1), 3840));

    public static final RegistryObject<Item> ONLITTLECATFEET = ITEMS.register("on_little_cat_feet_music_disc",
            () -> new RecordItem(6, ModSounds.ONLITTLECATFEET, new Item.Properties().stacksTo(1), 3860));

    public static final RegistryObject<Item> TEMSHOP = ITEMS.register("tem_shop_music_disc",
            () -> new RecordItem(6, ModSounds.TEMSHOP, new Item.Properties().stacksTo(1), 900));

    public static final RegistryObject<Item> EGGMAN = ITEMS.register("eggman_music_disc",
            () -> new RecordItem(6, ModSounds.EGGMAN, new Item.Properties().stacksTo(1), 4140));

    public static final RegistryObject<Item> MOONOVERTHECASTLE = ITEMS.register("moon_over_the_castle_music_disc",
            () -> new RecordItem(6, ModSounds.MOONOVERTHECASTLE, new Item.Properties().stacksTo(1),8720));

    public static final RegistryObject<Item> PLANETARYGO = ITEMS.register("planetary_go_music_disc",
            () -> new RecordItem(6, ModSounds.PLANETARYGO, new Item.Properties().stacksTo(1),4920));

    public static final RegistryObject<Item> HELLOMARINA = ITEMS.register("hello_marina_music_disc",
            () -> new RecordItem(6, ModSounds.HELLOMARINA, new Item.Properties().stacksTo(1),4020));

    public static final RegistryObject<Item> VERSUS = ITEMS.register("versus_music_disc",
            () -> new RecordItem(6, ModSounds.VERSUS, new Item.Properties().stacksTo(1),5020));

    public static final RegistryObject<Item> DUEL = ITEMS.register("duel_music_disc",
            () -> new RecordItem(6, ModSounds.DUEL, new Item.Properties().stacksTo(1),7300));

    public static final RegistryObject<Item> DIVINEINTERVENTION = ITEMS.register("divine_intervention_music_disc",
            () -> new RecordItem(6, ModSounds.DIVINEINTERVENTION, new Item.Properties().stacksTo(1),3120));

    public static final RegistryObject<Item> THEDEATHOFGODSWILL = ITEMS.register("the_death_of_gods_will_music_disc",
            () -> new RecordItem(6, ModSounds.THEDEATHOFGODSWILL, new Item.Properties().stacksTo(1),6220));

    public static final RegistryObject<Item> GUSTYGARDENGALAXY = ITEMS.register("gusty_garden_galaxy_music_disc",
            () -> new RecordItem(6, ModSounds.GUSTYGARDENGALAXY, new Item.Properties().stacksTo(1),4500));

    public static final RegistryObject<Item> THEWORLDLOOKSWHITE = ITEMS.register("the_world_looks_white_music_disc",
            () -> new RecordItem(6, ModSounds.THEWORLDLOOKSWHITE, new Item.Properties().stacksTo(1),3160));

    public static final RegistryObject<Item> THEWORLDLOOKSRED = ITEMS.register("the_world_looks_red_music_disc",
            () -> new RecordItem(6, ModSounds.THEWORLDLOOKSRED, new Item.Properties().stacksTo(1),7980));

    public static final RegistryObject<Item> BULLOFHELL = ITEMS.register("bull_of_hell_music_disc",
            () -> new RecordItem(6, ModSounds.BULLOFHELL, new Item.Properties().stacksTo(1),4440));

    public static final RegistryObject<Item> DOROBOTSDREAMOFETERNALSLEEP = ITEMS.register("do_robots_dream_of_eternal_sleep_music_disc",
            () -> new RecordItem(6, ModSounds.DOROBOTSDREAMOFETERNALSLEEP, new Item.Properties().stacksTo(1),2700));

    public static final RegistryObject<Item> HEARTHESIRENSONGCALLOFDEATH = ITEMS.register("hear_the_siren_song_call_of_death_music_disc",
            () -> new RecordItem(6, ModSounds.HEARTHESIRENSONGCALLOFDEATH, new Item.Properties().stacksTo(1),6380));

    public static final RegistryObject<Item> SUFFERINGLEAVESSUFFERINGLEAVES = ITEMS.register("suffering_leaves_suffering_leaves_music_disc",
            () -> new RecordItem(6, ModSounds.SUFFERINGLEAVESSUFFERINGLEAVES, new Item.Properties().stacksTo(1),2760));

    public static final RegistryObject<Item> DANSEMACABRE = ITEMS.register("danse_macabre_music_disc",
            () -> new RecordItem(6, ModSounds.DANSEMACABRE, new Item.Properties().stacksTo(1), 4300));

    public static final RegistryObject<Item> WARWITHOUTREASONHESPERUSCOVER = ITEMS.register("war_without_reason_hesperus_cover_music_disc",
            () -> new RecordItem(6, ModSounds.WARWITHOUTREASONHESPERUSCOVER, new Item.Properties().stacksTo(1), 8800));

    public static final RegistryObject<Item> INABSENTIALOGOS = ITEMS.register("in_absentia_logos_music_disc",
            () -> new RecordItem(6, ModSounds.INABSENTIALOGOS, new Item.Properties().stacksTo(1),5460));

    public static final RegistryObject<Item> SPIRALOUT = ITEMS.register("spiral_out_music_disc",
            () -> new RecordItem(6, ModSounds.SPIRALOUT, new Item.Properties().stacksTo(1),5560));

    public static final RegistryObject<Item> NEVERODDOREVEN = ITEMS.register("never_odd_or_even_music_disc",
            () -> new RecordItem(6, ModSounds.NEVERODDOREVEN, new Item.Properties().stacksTo(1),2640));

    public static final RegistryObject<Item> NODEVILLIVEDON = ITEMS.register("no_devil_lived_on_music_disc",
            () -> new RecordItem(6, ModSounds.NODEVILLIVEDON, new Item.Properties().stacksTo(1),8740));

    public static final RegistryObject<Item> MIRRORRIM = ITEMS.register("mirror_rim_music_disc",
            () -> new RecordItem(6, ModSounds.MIRRORRIM, new Item.Properties().stacksTo(1),3660));

    public static final RegistryObject<Item> THEBREAK = ITEMS.register("the_break_music_disc",
            () -> new RecordItem(6, ModSounds.THEBREAK, new Item.Properties().stacksTo(1),5240));

    public static final RegistryObject<Item> THESHATTERINGCIRCLE = ITEMS.register("the_shattering_circle_music_disc",
            () -> new RecordItem(6, ModSounds.THESHATTERINGCIRCLE, new Item.Properties().stacksTo(1), 7620));

    public static final RegistryObject<Item> EVENTHORIZON = ITEMS.register("event_horizon_music_disc",
            () -> new RecordItem(6, ModSounds.EVENTHORIZON, new Item.Properties().stacksTo(1),6220));

    public static final RegistryObject<Item> THEFALL = ITEMS.register("final_flight_music_disc",
            () -> new RecordItem(6, ModSounds.THEFALL, new Item.Properties().stacksTo(1),3720));

    public static final RegistryObject<Item> ALTARSOFAPOSTASY = ITEMS.register("altars_of_apostasy_music_disc",
            () -> new RecordItem(6, ModSounds.ALTARSOFAPOSTASY, new Item.Properties().stacksTo(1),6820));

    public static final RegistryObject<Item> NI4NI = ITEMS.register("ni4ni_music_disc",
            () -> new RecordItem(6, ModSounds.NI4NI, new Item.Properties().stacksTo(1),5040));
    public static final RegistryObject<Item> MOSIMOSI = ITEMS.register("mosi_mosi_music_disc",
            () -> new RecordItem(6, ModSounds.MOSIMOSI, new Item.Properties().stacksTo(1),3276));    public static final RegistryObject<Item> MIKU_ESSENCE = ITEMS.register("miku_essence", () -> new EssenceItem(CropTier.ELEMENTAL));
    public static final RegistryObject<Item> SUNSETOFSEVENSUNS = ITEMS.register("sunset_of_seven_suns_music_disc",
            () -> new RecordItem(6, ModSounds.SUNSETOFSEVENSUNS, new Item.Properties().stacksTo(1),1920));    // public static final RegistryObject<Item> TEST_CROP = ITEMS.register("huh", new Crop(CropTier.ELEMENTAL, CropType.RESOURCE, LazyIngredient.item("minecraft:gravel")));
    public static final RegistryObject<Item> DOUBLEDGASTERSTHEME = ITEMS.register("double_d_gasters_theme_music_disc",
            () -> new RecordItem(6, ModSounds.DOUBLEDGASTERSTHEME, new Item.Properties().stacksTo(1),1064));
    public static final RegistryObject<Item> BOOMBOOMBOOMBOOM = ITEMS.register("boom_boom_boom_boom_music_disc",
            () -> new RecordItem(6, ModSounds.BOOMBOOMBOOMBOOM, new Item.Properties().stacksTo(1),4068));
    public static final RegistryObject<Item> RUNNINGSKY = ITEMS.register("running_sky_music_disc",
            () -> new RecordItem(6, ModSounds.RUNNINGSKY, new Item.Properties().stacksTo(1),2844));
    public static final RegistryObject<Item> TVTIME = ITEMS.register("tv_time_music_disc",
            () -> new RecordItem(6, ModSounds.TVTIME, new Item.Properties().stacksTo(1),3308));
    public static final RegistryObject<Item> FLOWERMAN = ITEMS.register("flower_man_music_disc",
            () -> new RecordItem(6, ModSounds.FLOWERMAN, new Item.Properties().stacksTo(1),3840));
    public static final RegistryObject<Item> BLACKKNIFE = ITEMS.register("black_knife_music_disc",
            () -> new RecordItem(6, ModSounds.BLACKKNIFE, new Item.Properties().stacksTo(1),2342));
<<<<<<< Updated upstream
    public static final RegistryObject<Item> FALLENANGEL = ITEMS.register("fallen_angel_music_disc",
            () -> new RecordItem(6, ModSounds.FALLENANGEL, new Item.Properties().stacksTo(1),2620));
=======
    public static final RegistryObject<Item> STORYOFAWARRIOR = ITEMS.register("story_of_a_warrior_music_disc",
            () -> new RecordItem(6, ModSounds.STORYOFAWARRIOR, new Item.Properties().stacksTo(1),2598));
    public static final RegistryObject<Item> PURPLECOINSGREENMIX = ITEMS.register("purple_coins_green_mix_music_disc",
            () -> new RecordItem(6, ModSounds.PURPLECOINSGREENMIX, new Item.Properties().stacksTo(1),1996));
>>>>>>> Stashed changes

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
