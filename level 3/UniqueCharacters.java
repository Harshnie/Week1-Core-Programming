import java.util.Scanner;

public class UniqueCharacters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        int len = findLength(input);
        char[] uniqueChars = findUniqueCharacters(input, len);

        System.out.println("Unique characters in the string:");
        for (char c : uniqueChars) {
            if (c != '\0') {
                System.out.println(c);
            }
        }
    }

    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static char[] findUniqueCharacters(String text, int len) {
        char[] unique = new char[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                unique[index++] = current;
            }
        }

        char[] result = new char[index];
        for (int i = 0; i < index; i++) {
            result[i] = unique[i];
        }

        return result;
    }
}
