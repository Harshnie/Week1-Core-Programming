import java.util.Scanner;

public class WordLength {

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

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scan.nextLine();

        String[] words = customSplit(input);
        String[][] wordLengthArray = wordWithLengths(words);

        System.out.println("\nWord\tLength");
        for (int i = 0; i < wordLengthArray.length; i++) {
            String word = wordLengthArray[i][0];
            int length = Integer.parseInt(wordLengthArray[i][1]);
            System.out.println(word + "\t" + length);
        }

        scan.close();
    }
}
