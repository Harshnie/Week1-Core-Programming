import java.util.Scanner;

public class TrimString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int[] trimmedIndexes = trimSpaces(input);
        String trimmedStringUsingCharAt = substringUsingCharAt(input, trimmedIndexes[0], trimmedIndexes[1]);
        String trimmedStringUsingTrim = input.trim();

        boolean areEqual = compareStrings(trimmedStringUsingCharAt, trimmedStringUsingTrim);
        System.out.println("Trimmed using charAt: " + trimmedStringUsingCharAt);
        System.out.println("Trimmed using trim(): " + trimmedStringUsingTrim);
        System.out.println("Are both trimmed strings equal? " + areEqual);
    }

    public static int[] trimSpaces(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start <= end && input.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && input.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    public static String substringUsingCharAt(String input, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(input.charAt(i));
        }
        return result.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
