public class ReverseArray {

    /**
     * Prints the elements of the given array in reverse order using recursion.
     *
     * @param array The input array containing integers.
     * @param index The current index in the recursion.
     */
    public static void printReverse(int[] array, int index) {
        if (array == null || index < 0) {
            return;
        }
        if (index == 0) {
            System.out.print(array[index]);
        } else {
            printReverse(array, index - 1);
            System.out.print(" " + array[index]);
        }
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 4, 6, 2};
        printReverse(inputArray, inputArray.length - 1);
    }
}
