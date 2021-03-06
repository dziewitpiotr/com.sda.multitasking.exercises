package multitask;

import com.sda.multitasking.exercises.PrzeznaczenieWiekowe;
import com.sda.multitasking.exercises.RamaRowerowa;

public class RamaRowerowaProducer extends Producer{

    public RamaRowerowaProducer(Magazyn magazyn) {
        super(magazyn);
    }

    @Override
    public void run() {

        while (working) {
            try {
                Thread.sleep(16000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            RamaRowerowa nowaRamaRowerowa = RamaRowerowa.stworzRameBMX(PrzeznaczenieWiekowe.DOROSŁY);
            magazyn.dodajRameDoMagazynu(nowaRamaRowerowa);
            System.out.println("Stworzyłem i dodalem rame");
        }
    }
}
