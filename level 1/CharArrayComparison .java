import java.util.Scanner;

public class CharArrayComparison {

    public static char[] getCharacters(String input) {
        char[] result = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            result[i] = input.charAt(i);
        }
        return result;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scan.next();

        char[] userDefinedChars = getCharacters(input);
        char[] builtInChars = input.toCharArray();
        boolean areEqual = compareCharArrays(userDefinedChars, builtInChars);

        System.out.println("User defined method characters:");
        for (char c : userDefinedChars) {
            System.out.print(c + " ");
        }

        System.out.println("\nBuilt-in toCharArray() characters:");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }

        System.out.println("\nAre both character arrays equal? " + areEqual);

        scan.close();
    }
}
