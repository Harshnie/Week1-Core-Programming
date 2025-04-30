import java.util.Scanner;

public class Substring {

    public static String substringUsingCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean compareUsingCharAt(String str1, String str2) {
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

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scan.next();

        System.out.print("Enter start index: ");
        int start = scan.nextInt();

        System.out.print("Enter end index: ");
        int end = scan.nextInt();

        String manualSubstring = substringUsingCharAt(text, start, end);
        String builtinSubstring = text.substring(start, end);

        System.out.println("\nSubstring using charAt(): " + manualSubstring);
        System.out.println("Substring using substring(): " + builtinSubstring);

        boolean areEqual = compareUsingCharAt(manualSubstring, builtinSubstring);

        if (areEqual) {
            System.out.println("Both substrings are equal.");
        } else {
            System.out.println("Substrings are different.");
        }
    }
}
