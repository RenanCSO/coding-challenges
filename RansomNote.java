import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RansomNote {
    public static void main(String[] args) {
        List<String> magazine = new ArrayList<>();
        List<String> note = new ArrayList<>();

        // TEST CASE 1 - TRUE
        magazine.add("give");
        magazine.add("me");
        magazine.add("one");
        magazine.add("grand");
        magazine.add("today");
        magazine.add("night");

        note.add("give");
        note.add("one");
        note.add("grand");
        note.add("today");

        /* TEST CASE 2 - FALSE
        magazine.add("two");
        magazine.add("times");
        magazine.add("three");
        magazine.add("is");
        magazine.add("not");
        magazine.add("four");

        note.add("two");
        note.add("times");
        note.add("two");
        note.add("is");
        note.add("four");
        */

        /* TEST CASE 3 - FALSE
        magazine.add("ive");
        magazine.add("got");
        magazine.add("a");
        magazine.add("lovely");
        magazine.add("bunch");
        magazine.add("of");
        magazine.add("coconuts");

        note.add("ive");
        note.add("got");
        note.add("some");
        note.add("coconuts");
         */

        System.out.println(checkMagazine(magazine, note));
    }

    private static boolean checkMagazine(List<String> magazine, List<String> note) {
        HashMap<String, Integer> magazineWords = new HashMap<>();

        for (String word : magazine) {
            if (magazineWords.containsKey(word)) {
                magazineWords.put(word, magazineWords.get(word) + 1);
            } else {
                magazineWords.put(word, 1);
            }
        }

        for (String word : note) {
            if (!magazineWords.containsKey(word)) {
                return false;
            } else {
                if (magazineWords.get(word) == 0) {
                    return false;
                } else {
                    magazineWords.put(word, magazineWords.get(word) - 1);
                }
            }
        }

        return true;
    }
}
