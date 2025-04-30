import java.util.Scanner;

public class VowelConsonantCharacterType {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[][] result = findCharacterTypes(input);
        displayResult(result);
    }

    public static String[][] findCharacterTypes(String input) {
        String[][] result = new String[input.length()][2];
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            String type = checkCharacterType(currentChar);
            result[i][0] = String.valueOf(currentChar);
            result[i][1] = type;
        }
        return result;
    }

    public static String checkCharacterType(char c) {
        c = Character.toLowerCase(c);
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    public static void displayResult(String[][] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%s\t\t%s\n", result[i][0], result[i][1]);
        }
    }
}
