import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        LocalDate dataPrzegladu=LocalDate.of(2010,12,01);
        Period p= Period.between(dataPrzegladu,LocalDate.now());
        int year=p.getYears();
        System.out.println(p);
        System.out.println(year);
        System.out.println(p.getYears()<1);

    }
}
