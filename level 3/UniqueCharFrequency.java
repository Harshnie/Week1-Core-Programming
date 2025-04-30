import java.util.Scanner;

public class UniqueCharFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        String[][] freqResult = getCharFrequency(input);

        System.out.println("Character\tFrequency");
        for (int i = 0; i < freqResult.length; i++) {
            if (freqResult[i][0] != null) {
                System.out.println(freqResult[i][0] + "\t\t" + freqResult[i][1]);
            }
        }
    }

    public static char[] uniqueCharacters(String text) {
        char[] unique = new char[text.length()];
        int index = 0;
        for (int i = 0; ; i++) {
            try {
                char ch = text.charAt(i);
                boolean isUnique = true;
                for (int j = 0; j < i; j++) {
                    if (text.charAt(j) == ch) {
                        isUnique = false;
                        break;
                    }
                }
                if (isUnique) {
                    unique[index] = ch;
                    index++;
                }
            } catch (Exception e) {
                break;
            }
        }
        return unique;
    }

    public static String[][] getCharFrequency(String text) {
        int[] freq = new int[256];

        for (int i = 0; ; i++) {
            try {
                char ch = text.charAt(i);
                freq[ch]++;
            } catch (Exception e) {
                break;
            }
        }

        char[] unique = uniqueCharacters(text);
        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            if (unique[i] != '\u0000') {
                result[i][0] = String.valueOf(unique[i]);
                result[i][1] = String.valueOf(freq[unique[i]]);
            }
        }

        return result;
    }
}
