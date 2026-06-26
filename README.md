# How to add your own music!
 
Welcome to a tutorial on how to add new songs to the mod! To do this you will need
- Github Desktop
- Some kind of way to edit the mod (IntelliJ idea or some other java-based IDE)
- A 16x16 image of the disc texture you would like to use in your song (you can find a template on the server)
- An ogg, mono file of your music. It must be in mono mode in order for minecraft to play the song properly on the music disc.

## Step 1. Setup.
<img width="109" height="164" alt="image" src="https://github.com/user-attachments/assets/8ba200b3-3f7d-4031-91a3-a2c1dc34584a" />

for our example we will be using "On Little Cat Feet" by Nightmargin

Convert your music to mono (Whatever online software is availible
Convert your music to ogg (whatever online software is availible)

name your song like the following

```
onlittlecatfeet.ogg
```
Add your song to ["Another Tune\src\main\resources\assets\anothertune\sounds"]([https://pages.github.com/](https://github.com/eucjbzh/Another-Tune/tree/main/src/main/resources/assets/anothertune/sounds))

Make your custom disc and name it like the example

```
on_little_cat_feet_music_disc.png
```

Add your custom 16x16 disc image to ["Another Tune\src\main\resources\assets\anothertune\textures"]([https://pages.github.com/](https://github.com/eucjbzh/Another-Tune/tree/main/src/main/resources/assets/anothertune/textures))

## Step 2. Initializing the sound

So we have the needed files to get it working but how do we add these files in? Well thats a good question Mr. Strawman!

in ["Another Tune\src\main\resources\assets\anothertune"]([https://pages.github.com/](https://github.com/eucjbzh/Another-Tune/tree/main/src/main/resources/assets/anothertune)) there is a file called [sounds.json]([https://github.com/eucjbzh/Another-Tune/blob/main/src/main/resources/assets/anothertune/sounds.json)). In this file add the following at the bottom
```
  "onlittlecatfeet": {
    "sounds": [
      {
        "name": "anothertune:onlittlecatfeet",
        "stream": true
      }
    ]
  }
```
replace onlittlecatfeet with the name of your ogg

jump on over to ["src/main/java/net/derpanddum/anothertune/sound/ModSounds.java"]([https://github.com/eucjbzh/Another-Tune/blob/main/src/main/java/net/derpanddum/anothertune/sound/ModSounds.java))

```
    public static final RegistryObject<SoundEvent> ONLITTLECATFEET = registerSoundEvents("onlittlecatfeet");
```
replace ONLITTLECATFEET with a similar version of your name. the no caps one should be the name of your song put in sounds.json

now if you enter minecraft (its in the gradle tab on IntelliJ, good luck finding it yourself if you aren't using that. don't use the github web page btw ill kill you ^^ ) you should be able to /playsound on your new song!

## Step 3. Adding the disc.

head to ["src/main/java/net/derpanddum/anothertune/item/ModItems.java"]([https://github.com/eucjbzh/Another-Tune/blob/main/src/main/java/net/derpanddum/anothertune/item/ModItems.java))

```
public static final RegistryObject<Item> ONLITTLECATFEET = ITEMS.register("on_little_cat_feet_music_disc",
       () -> new RecordItem(6, ModSounds.ONLITTLECATFEET, new Item.Properties().stacksTo(1), 3860));
```

don't be dumb you've put these in before. the item name in the register is the name of the png, others are all caps thingies, and that last thing, the 3860, thats the amount of TICKS in your song. change those 4 obvious things, nothing else, again dont be dumb.

now head to the creative tab file, in the same folder.
```
pOutput.accept(ModItems.ONLITTLECATFEET.get());
```
add this where you need to, use the new register you made last step, not that hard. can you tell im tired bc im tired

head to the datagen folder
in moditemmodelprovider put in

```
simpleItem(ModItems.ONLITTLECATFEET);
```

in the moditemtagprovider put in ModItems.ONLITTLECATFEET.get() in both the music disc tag and the creeper drop tag. Put a comma in the entry before yours if it doesn't have one already

runData then runClient. if it works then yay you did it good job thanks for not wasting my time and wasting your time instead :). What? the name isn't proper? Okay fine go to en_us in the resources lang folder and add a new line, with

```
  "item.anothertune.on_little_cat_feet_music_disc": "§bMusic Disc",
  "item.anothertune.on_little_cat_feet_music_disc.desc": "Nightmargin - On Little Cat Feet",
```

replace nightmargin with your artist and on little cat feet with the name of your song. also make sure to change the ID to your song name (the thing on the left)

THEN it should be done! enjoy and if you have questions ask me :)

again thanks for not wasting my time :D
