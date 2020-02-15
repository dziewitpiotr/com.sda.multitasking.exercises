package com.sda.multitasking.exercises;

public class KoloRowerowe extends Kolo {
    public KoloRowerowe(double średnica, double szerokość, boolean opona) {
        super(średnica, szerokość, opona);
    }

    public static KoloRowerowe stworzKoloBasic() {
        return new KoloRowerowe(24.0 /*cale*/, 1 /*cale*/, true);
    }
}
