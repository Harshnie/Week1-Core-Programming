import java.util.Scanner;

public class CustomString{

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

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        String[] builtInSplit = input.split(" ");
        String[] customSplit = customSplit(input);

        System.out.println("Built-in split result:");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        System.out.println("Custom split result:");
        for (String word : customSplit) {
            System.out.println(word);
        }

        boolean isEqual = compareArrays(builtInSplit, customSplit);
        System.out.println("Are both split results equal? " + isEqual);
    }
}
