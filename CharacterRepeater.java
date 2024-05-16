public class CharacterRepeater {
    public static void main(String[] args) {
        String input = "a2b3c4";
        String output = repeatCharacters(input);
        System.out.println("Output: " + output); // Output: aabbbcccc
    }

    public static String repeatCharacters(String input) {
        StringBuilder output = new StringBuilder();
        int length = input.length();
        for (int i = 0; i < length; i += 2) {
            char character = input.charAt(i);
            int count = Character.getNumericValue(input.charAt(i + 1));
            for (int j = 0; j < count; j++) {
                output.append(character);
            }
        }
        return output.toString();
    }
}
