import java.util.Scanner;

public class TextAnalyzer {

    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String[] customSplit(String str) {
        int length = getStringLength(str);
        int spaceCount = 0;

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int[] spaceIndexes = new int[spaceCount + 2];
        spaceIndexes[0] = -1;
        int index = 1;

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        spaceIndexes[index] = length;

        String[] words = new String[spaceCount + 1];

        for (int i = 0; i < words.length; i++) {
            String word = "";
            for (int j = spaceIndexes[i] + 1; j < spaceIndexes[i + 1]; j++) {
                word += str.charAt(j);
            }
            words[i] = word;
        }

        return words;
    }

    public static String[][] wordWithLengths(String[] words) {
        int len = words.length;
        String[][] result = new String[len][2];

        for (int i = 0; i < len; i++) {
            result[i][0] = words[i];
            int wordLength = getStringLength(words[i]);
            result[i][1] = String.valueOf(wordLength);
        }

        return result;
    }

    public static String[] findShortestAndLongest(String[][] wordArray) {
        String shortest = wordArray[0][0];
        String longest = wordArray[0][0];
        int minLength = Integer.parseInt(wordArray[0][1]);
        int maxLength = Integer.parseInt(wordArray[0][1]);

        for (int i = 1; i < wordArray.length; i++) {
            int length = Integer.parseInt(wordArray[i][1]);
            if (length < minLength) {
                minLength = length;
                shortest = wordArray[i][0];
            }
            if (length > maxLength) {
                maxLength = length;
                longest = wordArray[i][0];
            }
        }

        return new String[]{shortest, longest};
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your text: ");
        String input = scan.nextLine();

        String[] words = customSplit(input);
        String[][] wordLengthArray = wordWithLengths(words);
        String[] shortestAndLongest = findShortestAndLongest(wordLengthArray);

        System.out.println("\nWord\tLength");
        for (int i = 0; i < wordLengthArray.length; i++) {
            System.out.println(wordLengthArray[i][0] + "\t" + wordLengthArray[i][1]);
        }

        System.out.println("\nShortest Word: " + shortestAndLongest[0]);
        System.out.println("Longest Word: " + shortestAndLongest[1]);

        scan.close();
    }
}
