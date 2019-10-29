import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleCalculatorTest {
    private SimpleCalculator sc;

    @BeforeAll
    static void init() {
        System.out.println("Zaczynamy testy");

    }

    @BeforeEach
    void setup() {
        System.out.println("Zaraz uruchomimy koleny test...");
    }

    @Test
    @DisplayName("Test dodawania")
    void add() {
        sc = new SimpleCalculator();
        assertEquals(2, sc.add(1, 1));
    }

    @Test
    @DisplayName("Test mnożenia")
    void multiply() {
        sc = new SimpleCalculator();
        assertEquals(10, sc.multiply(5, 2));
    }

    @Test
    @DisplayName("Test dzielenia")
    void divide2() {
        sc = new SimpleCalculator();
        assertThrows(ArithmeticException.class, () -> {
            sc.divide(4, 0);
        });
    }
    @Test
    @DisplayName("Test dzielenia")
    void divide1() {
        sc = new SimpleCalculator();
        assertEquals(4,sc.divide(8,2));
    }
    @Test
    @DisplayName("Test obiekty")
    void same(){
        sc=new SimpleCalculator();
        SimpleCalculator sc2=new SimpleCalculator();
        assertNotSame(sc,sc2,"obiekty nie są takie same");
    }
    @Test
    @DisplayName("Test na prawde")
    void isTrue() {
        sc = new SimpleCalculator();
        assertTrue(sc instanceof SimpleCalculator);
    }
    @AfterEach
    void teardown(){

    }

}
