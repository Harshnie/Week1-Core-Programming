import java.util.Scanner;

public class UpperCase{

    public static String toUpperCaseManual(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }
            result += ch;
        }
        return result;
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

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = scan.nextLine();

        String builtInUpper = input.toUpperCase();
        String manualUpper = toUpperCaseManual(input);

        boolean isSame = compareStrings(builtInUpper, manualUpper);

        System.out.println("Built-in toUpperCase(): " + builtInUpper);
        System.out.println("Manual conversion:     " + manualUpper);
        System.out.println("Are both equal? " + isSame);

        scan.close();
    }
}
