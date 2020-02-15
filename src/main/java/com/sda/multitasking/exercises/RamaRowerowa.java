package com.sda.multitasking.exercises;

import lombok.AllArgsConstructor;

import static com.sda.multitasking.exercises.Material.ALUMINIUM;
import static com.sda.multitasking.exercises.RodzajRamy.BMX;
import static com.sda.multitasking.exercises.RodzajRamy.TREKKINGOWY;

@AllArgsConstructor
public class RamaRowerowa {
    private double wysokosc;
    private double dlugosc;
    private RodzajRamy rodzajRamy;
    private Material material;

    public static RamaRowerowa stworzRameBMX(PrzeznaczenieWiekowe wiek) {
            switch (wiek) {
                case DZIECKO:
                    return new RamaRowerowa(32.4, 83.0, BMX, ALUMINIUM);

                case NASTOLATEK:
                    return new RamaRowerowa(53.1, 102.0, BMX, ALUMINIUM);

                default:
                case DOROSŁY:
                    return new RamaRowerowa(60.0, 113.0, BMX, ALUMINIUM);

            }
    }

    public static RamaRowerowa stworzRameTrekkingowa(PrzeznaczenieWiekowe wiek) {
        switch (wiek) {
            case DZIECKO:
                return new RamaRowerowa(38, 83.0, TREKKINGOWY, ALUMINIUM);

            case NASTOLATEK:
                return new RamaRowerowa(46, 102.0, TREKKINGOWY, ALUMINIUM);

            default:
            case DOROSŁY:
                return new RamaRowerowa(70, 113.0, TREKKINGOWY, ALUMINIUM);

        }
    }
}
