import java.util.Scanner;

public class LowerCase{

    public static String toLowerCaseManual(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
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

        String builtInLower = input.toLowerCase();
        String manualLower = toLowerCaseManual(input);

        boolean isSame = compareStrings(builtInLower, manualLower);

        System.out.println("Built-in toLowerCase(): " + builtInLower);
        System.out.println("Manual conversion:     " + manualLower);
        System.out.println("Are both equal? " + isSame);

        scan.close();
    }
}
