import java.util.HashSet;

public class TwoStrings {
    public static void main(String[] args) {

        // TEST CASE 1 - YES
        String s1 = "hello";
        String s2 = "world";

        /* TEST CASE 2 - NO
        String s1 = "hi";
        String s2 = "world";
         */

        System.out.println(twoStrings(s1, s2));
    }

    private static String twoStrings(String s1, String s2) {
        HashSet<Character> lettersInWordOne = new HashSet<>();

        for (Character letter : s1.toCharArray()) {
            lettersInWordOne.add(letter);
        }

        for (Character letter : s2.toCharArray()) {
            if (lettersInWordOne.contains(letter)) {
                return "YES";
            }
        }

        return "NO";
    }
}
