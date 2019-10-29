public class SimpleCalculator {
    public float add(float x1, float x2) {
        return x1 + x2;
    }

    public float multiply(float x1, float x2) {
        return x1 * x2;
    }

    public float divide(float x1, float x2) {
        if (x2 == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return x1 / x2;
    }
}
