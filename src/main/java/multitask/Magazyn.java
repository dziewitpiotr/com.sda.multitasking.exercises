package multitask;

import com.sda.multitasking.exercises.Kolo;
import com.sda.multitasking.exercises.RamaRowerowa;
import com.sda.multitasking.exercises.Rower;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Magazyn {
    private List<Kolo>  kolo = new ArrayList<>();
    private List<RamaRowerowa>  ramy = new ArrayList<>();
    private List<Rower>  rowery = new ArrayList<>();

    public void dodajKoloDoMagazynu(Kolo noweKolo) {
        kolo.add(noweKolo);
        System.out.println("Stan magazynu, ilosc kol: " + kolo.size());
        System.out.println("Stan magazynu, ilosc ram: " + ramy.size());
    }

    public void dodajRameDoMagazynu(RamaRowerowa nowaRamaRowerowa) {
        ramy.add(nowaRamaRowerowa);

    }

    public boolean wystarczyKomponentowNaJedenRower() {
        return !ramy.isEmpty() && kolo.size() >=2;
    }

    public Kolo[] pobierzKola() {
        return new Kolo[] {kolo.remove(0), kolo.remove(0)};
    }

    public RamaRowerowa pobierzRame() {
        return ramy.remove(0); //usuwa i zwraca obiekt
    }

    public void dodajRowerDomagazymu(Rower nowy) {
        rowery.add(nowy);
    }
}
