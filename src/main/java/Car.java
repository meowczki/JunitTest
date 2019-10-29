import jdk.vm.ci.meta.Local;

import java.time.LocalDate;
import java.time.Period;

//        • zwracającą wartość logiczną, czy auto posiada ważny przegląd (przegląd jest ważny
//        przez rok)
public class Car {
    public enum Marka {
        Audi, Seat, Mercedes;
    }
    private int rokProdukcji;
    private LocalDate dataPrzegladu;
    private int kmSilnika;
    private Marka marka;

    public Car(int rokProdukcji, LocalDate dataPrzegladu, int kmSilnika, Marka marka) {
        this.rokProdukcji = rokProdukcji;
        this.dataPrzegladu = dataPrzegladu;
        this.kmSilnika = kmSilnika;
        this.marka = marka;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public Marka getMarka() {
        return marka;
    }

    public void setMarka(Marka marka) {
        this.marka = marka;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public LocalDate getDataPrzegladu() {
        return dataPrzegladu;
    }

    public void setDataPrzegladu(LocalDate dataPrzegladu) {
        this.dataPrzegladu = dataPrzegladu;
    }

    public int getKmSilnika() {
        return kmSilnika;
    }

    public void setKmSilnika(int kmSilnika) {
        this.kmSilnika = kmSilnika;
    }

    public boolean czyWaznyPrzeglad() {
        return Period.between(dataPrzegladu,LocalDate.now()).getYears()<1;
    }

    public int getWiekPojazdu() {
        return LocalDate.now().getYear() - rokProdukcji;
    }

    public double konwersjaKmDoW() {
        return 745.7 * kmSilnika;
    }


}
