package multitask;

import com.sda.multitasking.exercises.Kolo;
import com.sda.multitasking.exercises.KoloRowerowe;

public class KoloProducer extends Producer{

    public KoloProducer(Magazyn magazyn) {
        super(magazyn);
    }

    @Override
    public void run() {

        while(working) {
            try {
                // 10 sekund przespania
                // watek wybudza sie i tworzy kolo
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Kolo noweKolo = KoloRowerowe.stworzKoloBasic();
            magazyn.dodajKoloDoMagazynu(noweKolo);
            System.out.println("Stworzylem kolo i dodalem do magazymu");
        }

    }


}
