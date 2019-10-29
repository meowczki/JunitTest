import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarTest {
private Car car;
    @BeforeAll
    static void init() {
        System.out.println("Zaczynamy testy");

    }

    @BeforeEach
    void setup() {
        System.out.println("Zaraz uruchomimy koleny test...");
    }

    @Test
    @DisplayName("Test czy ważny przegląd")
    void czywaznyPrzegladTrue() {
       car=new Car(2016, LocalDate.of(2019,01,21),130, Car.Marka.Audi);
        assertTrue(car.czyWaznyPrzeglad());
    }
    @Test
    @DisplayName("Test czy ważny przegląd")
    void czywaznyPrzegladFalse() {
        car=new Car(2016, LocalDate.of(2017,01,21),130, Car.Marka.Audi);
        assertFalse(car.czyWaznyPrzeglad());
    }

    @Test
    @DisplayName("Test konwersi km na waty")
    void konwersjaOK() {
        car=new Car(2016, LocalDate.of(2019,01,21),130, Car.Marka.Audi);
        assertEquals(745.7*130, car.konwersjaKmDoW());
    }
    @Test
    @DisplayName("Test konwersi km na waty")
    void konwersjaNieOK() {
        car=new Car(2016, LocalDate.of(2019,01,21),130, Car.Marka.Audi);
        assertNotEquals(745*130, car.konwersjaKmDoW());
    }

    @Test
    @DisplayName("Test obiekty rózne")
    void notsame(){
        car=new Car(2016, LocalDate.of(2019,01,21),130, Car.Marka.Audi);
        Car car2=new Car(2016, LocalDate.of(2019,01,21),130, Car.Marka.Audi);
        SimpleCalculator sc2=new SimpleCalculator();
        assertNotSame(car,car2,"obiekty nie są takie same");
    }
    @Test
    @DisplayName("Test wiek pojazdu ok")
    void wiekPojazduOk() {
        car=new Car(2016, LocalDate.of(2019,01,21),130, Car.Marka.Audi);
        assertEquals(3, car.getWiekPojazdu());
    }
    @Test
    @DisplayName("Test wiek pojazdu nie ok")
    void wiekPojazduNieOk() {
        car=new Car(2016, LocalDate.of(2019,01,21),130, Car.Marka.Audi);
        assertNotEquals(5, car.getWiekPojazdu());
    }
    @AfterEach
    void teardown(){

    }
}
