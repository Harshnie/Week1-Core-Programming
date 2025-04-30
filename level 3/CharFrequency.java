import java.util.Scanner;

public class CharFrequency {

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

        String[][] result = new String[256][2];
        boolean[] added = new boolean[256];
        int index = 0;

        for (int i = 0; ; i++) {
            try {
                char ch = text.charAt(i);
                if (!added[ch]) {
                    result[index][0] = String.valueOf(ch);
                    result[index][1] = String.valueOf(freq[ch]);
                    added[ch] = true;
                    index++;
                }
            } catch (Exception e) {
                break;
            }
        }

        return result;
    }
}
