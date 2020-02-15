package com.sda.multitasking.exercises;

public class KoloMotocyklowe extends Kolo {
    public KoloMotocyklowe(double średnica, double szerokość, boolean opona) {
        super(średnica, szerokość, opona);
    }

    public static KoloMotocyklowe stworzKoloBasic(){
        return new KoloMotocyklowe(23.0 /*cale*/, 4 /*cale*/, true);
    }
}
