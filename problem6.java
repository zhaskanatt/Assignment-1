public class PowerCalculator {

    /**
     * Calculates a raised to the power of n using recursion.
     *
     * @param a The base number.
     * @param n The exponent.
     * @return The result of a raised to the power of n.
     */
    public static long power(int a, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Exponent must be non-negative.");
        }
        if (n == 0) return 1;
        if (n == 1) return a;

        return a * power(a, n - 1);
    }

    public static void main(String[] args) {
        int base = 2;
        int exponent = 10;
        System.out.printf("%d raised to the power of %d is: %d%n", base, exponent, power(base, exponent));
    }
}
