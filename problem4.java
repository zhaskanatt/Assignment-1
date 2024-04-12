public class FactorialCalculator {

    /**
     * Computes the factorial of a given number using recursion.
     *
     * @param n The number to compute the factorial of.
     * @return The factorial of n.
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        return (n <= 1) ? 1 : n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.printf("The factorial of %d is: %d%n", number, factorial(number));
    }
}
