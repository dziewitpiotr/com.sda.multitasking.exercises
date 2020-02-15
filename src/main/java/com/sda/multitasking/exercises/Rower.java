package com.sda.multitasking.exercises;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


public class Rower {
    private LocalDateTime dataProdukcji;
    private Kolo[] kola = new Kolo[2];
    private RamaRowerowa rama;
    String producent;

    public Rower(RamaRowerowa rama, Kolo[] kola, String producent) {
        this.dataProdukcji = LocalDateTime.now(); // data produkcji to data utworzenia obiektu
        this.kola = kola;
        this.rama = rama;
        this.producent = producent;
    }
}
