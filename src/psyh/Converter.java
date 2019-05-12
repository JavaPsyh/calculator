package psyh;

public class Converter {
    public static final int[] NUMBER_VALUES = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 }; // array containing all of the values
    public static final String[] NUMBER_LETTERS = { "Mv", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" }; // array containing all of the numerals

    /**
     * Method converts a string to an integer
     * @param roman roman numeral to be converted
     * @return integer
     */
    public static int toNumerical(String roman) {
        for (int i = 0; i < NUMBER_LETTERS.length; i++) {// Loop through all the letters
            if(roman.startsWith(NUMBER_LETTERS[i])) // Check if the string starts with that letter
                return NUMBER_VALUES[i] + toNumerical(roman.replaceFirst(NUMBER_LETTERS[i], "")); // Rinse and repeats until the string is empty and return it
        }
        return 0; // If something went wrong, simply return 0
    }

    /**
     * Method converts an integer to a roman numeral
     * @param num number to be converted
     * @return roman numeral
     */
    public static String toRoman(int num) {
        String roman = ""; // Declare a string to hold the numerals
        for (int i = 0; i < NUMBER_VALUES.length; i++) { // loop through all the values
            while (num >= NUMBER_VALUES[i]) { // Check if the number is greater than the current value
                roman += NUMBER_LETTERS[i]; // Add the letter to the String
                num -= NUMBER_VALUES[i]; // Subtract the amount from the value
            }
        }
        if (roman.equals("")) roman = "ZERO";
        return roman; // Return the String
    }

    /**
     * Method checks if a string is an integer
     * @param s string to be parsed
     * @return boolean
     */
    public static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
        }catch(NumberFormatException e) {
            return false;
        }
        return true;
    }
}
