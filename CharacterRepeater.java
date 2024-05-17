public class CharacterRepeater {
    public static void main(String[] args) {
        String str = "a2b3c4";
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < str.length(); i += 2) {
            char chr = str.charAt(i);
            int count = Character.getNumericValue(str.charAt(i + 1));
            for (int j = 0; j < count; j++) {
                s.append(chr);
            }
        }
        System.out.println("Output: " + s.toString()); // Output: aabbbcccc
    }
}
