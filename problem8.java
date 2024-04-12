public class DigitChecker {

    /**
     * Checks recursively if a string consists only of digits.
     *
     * @param s     The string to check.
     * @param index The current index in the string being checked.
     * @return true if the string contains only digits; false otherwise.
     */
    public static boolean isDigitsOnly(String s, int index) {
        if (index < 0) {
            return true;
        }
        return Character.isDigit(s.charAt(index)) && isDigitsOnly(s, index - 1);
    }

    public static void main(String[] args) {
        String input = "123456"; // Example input
        System.out.println("The string \"" + input + "\" contains only digits: " + isDigitsOnly(input, input.length() - 1));
    }
}
