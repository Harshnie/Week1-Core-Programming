import java.util.Scanner;

public class Compare {

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

        System.out.print("Enter first string: ");
        String string1 = scan.next();

        System.out.print("Enter second string: ");
        String string2 = scan.next();

        boolean charAtComparison = compareUsingCharAt(string1, string2);
        boolean equalsComparison = string1.equals(string2);

        System.out.println("\nComparison using charAt(): " + charAtComparison);
        System.out.println("Comparison using equals(): " + equalsComparison);

        if (charAtComparison == equalsComparison) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Methods give different results.");
        }
    }
}
