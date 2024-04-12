public class PrimeChecker {

    /**
     * Checks if a number is prime using a recursive approach.
     * This method is a public interface for users.
     * It starts the recursive checking with the first potential divisor.
     *
     * @param number The number to check for primality.
     * @return true if the number is prime; false otherwise.
     */
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        } else if (number <= 3) {
            return true;
        }
        return isPrimeRecursive(number, 2);
    }

    /**
     * The recursive helper method that checks for primality.
     *
     * @param number The number to check for primality.
     * @param divisor The current divisor to check.
     * @return true if no divisor is found; false otherwise.
     */
    private static boolean isPrimeRecursive(int number, int divisor) {
        if (divisor > Math.sqrt(number)) {
            return true;
        }
        if (number % divisor == 0) {
            return false;
        }
        return isPrimeRecursive(number, divisor + 1);
    }
}
