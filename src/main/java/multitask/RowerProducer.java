package multitask;

import com.sda.multitasking.exercises.Kolo;
import com.sda.multitasking.exercises.RamaRowerowa;
import com.sda.multitasking.exercises.Rower;

public class RowerProducer extends Producer {
    public RowerProducer(Magazyn magazyn) {
        super(magazyn);
    }

    @Override
    public void run() {
        while(working){
            System.out.println("Producent sprawdza ilosc ram i kol");

            try {
                if (magazyn.wystarczyKomponentowNaJedenRower()) {
                    Kolo[] kola = magazyn.pobierzKola();
                    RamaRowerowa rama = magazyn.pobierzRame();
                    Rower nowyRower = new Rower(rama, kola, "Trek");
                    magazyn.dodajRowerDomagazymu(nowyRower);
                }
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
