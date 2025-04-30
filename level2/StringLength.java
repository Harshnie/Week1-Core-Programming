import java.util.Scanner;

public class StringLength {
    public static int findLengthWithoutBuiltIn(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();

        int manualLength = findLengthWithoutBuiltIn(input);
        int builtInLength = input.length();

        System.out.println("Length without using length() method: " + manualLength);
        System.out.println("Length using length() method: " + builtInLength);
    }
}
