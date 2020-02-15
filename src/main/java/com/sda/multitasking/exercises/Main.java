package com.sda.multitasking.exercises;

import multitask.KoloProducer;
import multitask.Magazyn;
import multitask.RamaRowerowaProducer;

public class Main {
    public static void main(String[] args) {
        Magazyn magazyn = new Magazyn();
        new KoloProducer(magazyn).start();
        new RamaRowerowaProducer(magazyn).start();
    }
}
