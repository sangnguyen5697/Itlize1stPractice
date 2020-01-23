
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue + valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        String reversedString = "";
        int n = valueToBeReversed.length();
        for (int i = n - 1; i >= 0; i--) {
            reversedString += valueToBeReversed.charAt(i);
        }
        return reversedString;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int n = word.length();
        return word.charAt(n / 2);
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        StringBuilder sb = new StringBuilder("");
        for (char c : value.toCharArray()) {
            if (c != charToRemove) sb.append(c);
        }
        return sb.toString();
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String[] words = sentence.split(" ");
        return words[words.length - 1];
    }
}
