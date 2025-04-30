import java.util.*;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        String input = "success";
        char mostFrequent = findMostFrequentChar(input);
        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }

    public static char findMostFrequentChar(String str) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        char mostFrequent = ' ';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequent = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return mostFrequent;
    }
}
