public class BinomialCoefficient {

    /**
     * Calculates the binomial coefficient (n choose k) recursively.
     *
     * @param n The number of items.
     * @param k The number of items to choose.
     * @return The binomial coefficient C(n, k).
     */
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }

    public static void main(String[] args) {
        int n = 7;
        int k = 3;
        System.out.printf("C(%d, %d) = %d%n", n, k, binomialCoefficient(n, k));
    }
}
