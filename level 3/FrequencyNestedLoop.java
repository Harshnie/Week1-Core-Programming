import java.util.Scanner;

public class FrequencyNestedLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        String[] result = findCharFrequencies(input);

        System.out.println("Character\tFrequency");
        for (String entry : result) {
            if (entry != null) {
                System.out.println(entry);
            }
        }
    }

    public static String[] findCharFrequencies(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];
        String[] output = new String[chars.length];

        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;
            if (chars[i] == '0') {
                continue;
            }
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                output[i] = chars[i] + "\t\t" + freq[i];
            }
        }

        return output;
    }
}
