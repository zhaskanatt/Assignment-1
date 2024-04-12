public class GCDCalculator {

    /**
     * Calculates the GCD (Greatest Common Divisor) of two integers using the Euclidean algorithm.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The GCD of a and b.
     */
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int a = 32;
        int b = 48;
        System.out.printf("The GCD of %d and %d is: %d%n", a, b, gcd(a, b));
    }
}
