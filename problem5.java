public class FibonacciCalculator {

    /**
     * Calculates the nth Fibonacci number using recursion.
     *
     * @param n The index in the Fibonacci sequence to retrieve.
     * @return The nth Fibonacci number.
     */
    public static long fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Index in Fibonacci sequence cannot be negative.");
        }
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int index = 5;
        System.out.printf("The %dth Fibonacci number is: %d%n", index, fibonacci(index));
    }
}
