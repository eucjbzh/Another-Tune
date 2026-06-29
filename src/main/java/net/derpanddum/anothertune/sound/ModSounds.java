package net.derpanddum.anothertune.sound;

import net.derpanddum.anothertune.AnotherTune;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, AnotherTune.MOD_ID);

    //VOLUME 1

    public static final RegistryObject<SoundEvent> BAR_BRAWL = registerSoundEvents("bar_brawl");
    public static final RegistryObject<SoundEvent> BIRDBRAIN = registerSoundEvents("birdbrain");
    public static final RegistryObject<SoundEvent> BITE_ME = registerSoundEvents("biteme");
    public static final RegistryObject<SoundEvent> BREAKTHROUGH = registerSoundEvents("breakthroughitall");
    public static final RegistryObject<SoundEvent> FINDYOURFLAME = registerSoundEvents("findyourflame");
    public static final RegistryObject<SoundEvent> HUMAN = registerSoundEvents("human");
    public static final RegistryObject<SoundEvent> IMHEREREVISITED = registerSoundEvents("imhererevisited");
    public static final RegistryObject<SoundEvent> ITHASTOBE = registerSoundEvents("ithastobethisway");
    public static final RegistryObject<SoundEvent> PIZZATIME = registerSoundEvents("itspizzatime");
    public static final RegistryObject<SoundEvent> FIGHTCRIME = registerSoundEvents("itstimetofightcrime");
    public static final RegistryObject<SoundEvent> LEMONMELONCOOKIE = registerSoundEvents("lemonmeloncookie");
    public static final RegistryObject<SoundEvent> LIVEANDLEARN = registerSoundEvents("liveandlearn");
    public static final RegistryObject<SoundEvent> LIVEANDLEARNTETO = registerSoundEvents("liveandlearntetomix");
    public static final RegistryObject<SoundEvent> LOVESHOT = registerSoundEvents("magicalcureloveshot");
    public static final RegistryObject<SoundEvent> MYWAY = registerSoundEvents("myway");
    public static final RegistryObject<SoundEvent> ORDER = registerSoundEvents("order");
    public static final RegistryObject<SoundEvent> PENUMBRAPHANTASM = registerSoundEvents("penumbraphantasm");
    public static final RegistryObject<SoundEvent> SOSORRY = registerSoundEvents("sosorry");
    public static final RegistryObject<SoundEvent> TENEBREROSSO = registerSoundEvents("tenebrerossosangue");
    public static final RegistryObject<SoundEvent> TRAVELERS = registerSoundEvents("travelers");
    public static final RegistryObject<SoundEvent> TRIPLEBAKA = registerSoundEvents("triplebaka");
    public static final RegistryObject<SoundEvent> UNDEFEATABLE = registerSoundEvents("undefeatable");
    public static final RegistryObject<SoundEvent> WAR = registerSoundEvents("war");
    public static final RegistryObject<SoundEvent> WARWITHOUTREASON = registerSoundEvents("warwithoutreason");
    public static final RegistryObject<SoundEvent> WINDOVERFLOWER = registerSoundEvents("windovertheflower");

    //VOLUME 2

    public static final RegistryObject<SoundEvent> ALLICANSEEISYOU = registerSoundEvents("allicanseeisyou");
    public static final RegistryObject<SoundEvent> AMYSTERIOUSPHONECALL = registerSoundEvents("amysteriousphonecall");
    public static final RegistryObject<SoundEvent> APRICOT = registerSoundEvents("apricot");
    public static final RegistryObject<SoundEvent> ASPOONFULOFSPELL = registerSoundEvents("aspoonfulofspell");
    public static final RegistryObject<SoundEvent> HEATABNORMAL = registerSoundEvents("heatabnormal");
    public static final RegistryObject<SoundEvent> HEAVENSBUG = registerSoundEvents("heavensbug");
    public static final RegistryObject<SoundEvent> KYUKURARIN = registerSoundEvents("kyukurarin");
    public static final RegistryObject<SoundEvent> LAGTRAIN = registerSoundEvents("lagtrain");
    public static final RegistryObject<SoundEvent> LIVINGMILLENNIUM = registerSoundEvents("livingmillennium");
    public static final RegistryObject<SoundEvent> LOSTUMBRELLA = registerSoundEvents("lostumbrella");
    public static final RegistryObject<SoundEvent> MIRARERUMIRROR = registerSoundEvents("mirarerumirror");
    public static final RegistryObject<SoundEvent> OTSUKARESUMMER = registerSoundEvents("otsukaresummer");
    public static final RegistryObject<SoundEvent> PANOPTICON = registerSoundEvents("panopticon");
    public static final RegistryObject<SoundEvent> RABBIT = registerSoundEvents("rabbit");
    public static final RegistryObject<SoundEvent> REDLANDMARKER = registerSoundEvents("redlandmarker");
    public static final RegistryObject<SoundEvent> SHUNRAN = registerSoundEvents("shunran");
    public static final RegistryObject<SoundEvent> THECRUELANGELSTHESIS = registerSoundEvents("thecruelangelsthesis");
    public static final RegistryObject<SoundEvent> WRITEOVERME = registerSoundEvents("writeoverme");

    public static final RegistryObject<SoundEvent> ONLITTLECATFEET = registerSoundEvents("onlittlecatfeet");
    public static final RegistryObject<SoundEvent> TEMSHOP = registerSoundEvents("tem_shop");
    public static final RegistryObject<SoundEvent> EGGMAN = registerSoundEvents("eggman");
    public static final RegistryObject<SoundEvent> MOONOVERTHECASTLE = registerSoundEvents("moonoverthecastle");
    public static final RegistryObject<SoundEvent> PLANETARYGO = registerSoundEvents("planetarygo");
    public static final RegistryObject<SoundEvent> HELLOMARINA = registerSoundEvents("hellomarina");
    public static final RegistryObject<SoundEvent> VERSUS = registerSoundEvents("versus");
    public static final RegistryObject<SoundEvent> DUEL = registerSoundEvents("duel");
    public static final RegistryObject<SoundEvent> DIVINEINTERVENTION = registerSoundEvents("divineintervention");
    public static final RegistryObject<SoundEvent> THEDEATHOFGODSWILL = registerSoundEvents("thedeathofgodswill");
    public static final RegistryObject<SoundEvent> GUSTYGARDENGALAXY = registerSoundEvents("gustygardengalaxy");

    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(AnotherTune.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
