public class ArrayUtils {

    /**
     * Finds the minimum value in an array of integers using recursion.
     * This method is a public interface for users to call with just the array.
     *
     * @param array The array of integers.
     * @return The minimum integer value in the array.
     */
    public static int findMinimum(int[] array) {
        return findMinimumRecursive(array, array.length - 1);
    }

    /**
     * Recursive helper method to find the minimum in the array.
     * It compares the last element with the minimum of the rest of the array.
     *
     * @param array The array of integers.
     * @param index The current index for comparison.
     * @return The minimum integer value found so far.
     */
    private static int findMinimumRecursive(int[] array, int index) {
        if (index == 0) {
            return array[0];
        }
        int minOfRest = findMinimumRecursive(array, index - 1);
        return Math.min(array[index], minOfRest);
    }
}
