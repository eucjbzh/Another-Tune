import audioread
from pydub import AudioSegment
import tkinter
import os
import audioread
from tkinter import filedialog


def convert(inputpath, outputpath, title):
    song = AudioSegment.from_file(inputpath)
    ticks = 0
    with audioread.audio_open(inputpath) as f:
        totalsec = f.duration
        ticks = int(totalsec * 20)

    mono_audio = song.set_channels(1)

    base_name = os.path.basename(inputpath)
    output_filename = f"{title}.ogg".lower().replace(" ", "")

    # 3. Join the directory path with the new file name
    newoutput_path = os.path.join(outputpath, output_filename)

    mono_audio.export(newoutput_path, format="ogg")
    print(f"Converted {inputpath} to a mono OGG at {outputpath}")
    print(ticks)