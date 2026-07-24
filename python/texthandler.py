import os
import pathlib
import shutil
import sys
from tkinter import filedialog
import audioread
from pathlib import Path

import Mp3OggtoMono
import tkinter

rootjava = pathlib.Path(__file__).parent.parent.resolve()

ModItemModelProvider = open(f"{rootjava}/src/main/java/net/derpanddum/anothertune/datagen/ModItemModelProvider.java")
ModItemTagGenerator = open(f"{rootjava}/src/main/java/net/derpanddum/anothertune/datagen/ModItemTagGenerator.java")

def insertbykey(pathtoopen, key, addition):
    javafile = open(pathtoopen, "r+")
    lines = javafile.readlines()
    savedline = ""
    for line in reversed(lines):
        if line.startswith(key):
            savedline = line
            break

    fullfile = ""
    for line in lines:
        if line != savedline:
            fullfile += line
        else:
            fullfile += line
            if fullfile.find(addition) == -1:
                fullfile += addition
    javafile.close()

    javafile = open(pathtoopen, "w")

    javafile.write(fullfile)
    javafile.close()


def deletebykey(pathtoopen, key, linesafterdiscover):
    javafile = open(pathtoopen, "r+")
    lines = javafile.readlines()

    fullfile = ""
    deleted = ""
    aftertrigger = 0
    found = 0
    for line in lines:
        if line != key and aftertrigger < 1:
            fullfile += line
        else:
            if found == 0:
                found = 1
                aftertrigger = linesafterdiscover
                deleted += line
            else:
                if aftertrigger >= 1:
                    aftertrigger -= 1
                    deleted += line
                else:
                    fullfile += line

    javafile.close()

    javafile = open(pathtoopen, "w")

    javafile.write(fullfile)
    javafile.close()

def updateJsons(title, author):
    LangAdd = (f'\n,  "item.anothertune.{title.lower().replace(" ","_")}_music_disc": "Â§bMusic Disc",\n'
               f'  "item.anothertune.{title.lower().replace(" ","_")}_music_disc.desc": "{title} - {author}"'
               '\n}')

    LangFile = open(f"{rootjava}/src/main/resources/assets/anothertune/lang/en_us.json", "r+")
    lines = LangFile.readlines()
    LangFile.close()

    trigger = 0
    for line in lines:
        if line.startswith(f'  "item.anothertune.{title.lower().replace(" ","_")}_music_disc'):
            trigger += 1

    if trigger == 0:
        LangFileWrite = open(f"{rootjava}/src/main/resources/assets/anothertune/lang/en_us.json", 'w')
        for line in lines[:-1]:
            LangFileWrite.writelines(line)
        LangFileWrite.write(LangAdd)
        LangFileWrite.close()




    SoundsAdd = ('\n  ,"' + title.lower().replace(" ","") + '": {\n     "sounds": [\n      {\n        "name": "anothertune:' + title.lower().replace(" ", "") + '",\n        "stream": true\n      }\n    ]\n  }\n}')

    SoundsFile = open(f"{rootjava}/src/main/resources/assets/anothertune/sounds.json")

    lines = SoundsFile.readlines()
    LangFile.close()

    trigger = 0
    for line in lines:
        if line.startswith('        "name": "anothertune:' + title.lower().replace(" ", "") + '"'):
            trigger += 1

    if trigger == 0:
        SoundsFileWrite = open(f"{rootjava}/src/main/resources/assets/anothertune/sounds.json", 'w')
        for line in lines[:-1]:
            SoundsFileWrite.writelines(line)
        SoundsFileWrite.write(SoundsAdd)
        SoundsFileWrite.close()

def updateall(title, author, ticks):
    updateJsons(title, author)
    insertbykey(f"{rootjava}/src/main/java/net/derpanddum/anothertune/item/ModItems.java", "            () -> new RecordItem", '    public static final RegistryObject<Item> '+title.upper().replace(" ","")+' = ITEMS.register("'+title.lower().replace(" ","_")+'_music_disc",' + '\n            () -> new RecordItem(6, ModSounds.'+title.upper().replace(" ","")+', new Item.Properties().stacksTo(1),'+ticks+'));\n')
    insertbykey(f"{rootjava}/src/main/java/net/derpanddum/anothertune/item/ModCreativeModTabs.java", "                        pOutput.accept(", f'                        pOutput.accept(ModItems.{title.upper().replace(" ","")}.get());\n')
    insertbykey(f"{rootjava}/src/main/java/net/derpanddum/anothertune/sound/ModSounds.java", "    public static final RegistryObject<SoundEvent>", f'    public static final RegistryObject<SoundEvent> {title.upper().replace(" ","")} = registerSoundEvents("{title.lower().replace(" ","")}");\n')
    insertbykey(f"{rootjava}/src/main/java/net/derpanddum/anothertune/datagen/ModItemModelProvider.java", "        simpleItem(", f'        simpleItem(ModItems.{title.upper().replace(" ","")});\n')
    insertbykey(f"{rootjava}/src/main/java/net/derpanddum/anothertune/datagen/ModItemTagGenerator.java", "        ItemTagList.add(", f"        ItemTagList.add(ModItems.{title.upper().replace(" ","")}.get());\n")

def deleteall(title):
    deletebykey(f"{rootjava}/src/main/java/net/derpanddum/anothertune/item/ModItems.java",
                '    public static final RegistryObject<Item> ' + title.upper().replace(" ",
                                                                                        "") + ' = ITEMS.register("' + title.lower().replace(
                    " ",
                    "_") + '_music_disc",\n',
                1
                )
    deletebykey(f"{rootjava}/src/main/java/net/derpanddum/anothertune/item/ModCreativeModTabs.java",
                f'                        pOutput.accept(ModItems.{title.upper().replace(" ", "")}.get());\n',
                0)
    deletebykey(f"{rootjava}/src/main/java/net/derpanddum/anothertune/sound/ModSounds.java",
                f'    public static final RegistryObject<SoundEvent> {title.upper().replace(" ", "")} = registerSoundEvents("{title.lower().replace(" ", "")}");\n',
                0)
    deletebykey(f"{rootjava}/src/main/java/net/derpanddum/anothertune/datagen/ModItemModelProvider.java",
                f'        simpleItem(ModItems.{title.upper().replace(" ", "")});\n',
                0)
    deletebykey(f"{rootjava}/src/main/java/net/derpanddum/anothertune/datagen/ModItemTagGenerator.java",
                f"        ItemTagList.add(ModItems.{title.upper().replace(" ", "")}.get());\n",
                0)
    deletebykey(f"{rootjava}/src/main/resources/assets/anothertune/sounds.json",
                '  "'+title.lower().replace(" ", "")+'": {\n',
                7)
    deletebykey(f"{rootjava}/src/main/resources/assets/anothertune/lang/en_us.json",
                ', "item.anothertune.'+title.lower().replace(" ", "_")+'_music_disc": "Â§bMusic Disc",\n',
                1)

def add():
    dest_dir = Path(rootjava) / "src/main/resources/assets/anothertune/textures/item"
    root = tkinter.Tk()
    root.withdraw()

    title = input("Enter the title of your song ")
    author = input("Enter the author of your song ")

    soundfile = filedialog.askopenfilename()
    print(soundfile)
    with audioread.audio_open(soundfile) as f:
        totalsec = f.duration
        ticks = int(totalsec * 20)
    imagefile = filedialog.askopenfilename()
    print(imagefile)

    Mp3OggtoMono.convert(soundfile, f"{rootjava}/src/main/resources/assets/anothertune/sounds", title)
    dest_dir.mkdir(parents=True, exist_ok=True)
    shutil.copy(imagefile, dest_dir / f"{title.lower().replace(" ", "_") + "_music_disc"}.png")
    updateall(title, author, str(ticks))

def main():
    if input("Would you like to ADD or REMOVE ") == "ADD":
        add()
    else:
        deleteall(input("Enter the Title "))

main()