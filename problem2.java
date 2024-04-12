public class ArrayUtils {

    /**
     * Calculates the average of an array of integers using recursion.
     * This method is the public interface for users to call with just the array.
     *
     * @param array The array of integers.
     * @return The average value as a double.
     */
    public static double calculateAverage(int[] array) {
        int totalSum = sumRecursive(array, array.length - 1);
        return (double) totalSum / array.length;
    }

    /**
     * Recursive helper method to calculate the sum of elements in the array.
     * It adds the current element to the sum of the rest of the array.
     *
     * @param array The array of integers.
     * @param index The current index to include in the sum.
     * @return The sum of the array elements up to the current index.
     */
    private static int sumRecursive(int[] array, int index) {
        if (index == 0) {
            return array[0];
        }
        return array[index] + sumRecursive(array, index - 1);
    }
}
