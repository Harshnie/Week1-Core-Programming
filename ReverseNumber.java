import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        int temp = num;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        int[] digits = new int[count];
        temp = num;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        System.out.print("Reversed Number is : ");
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
        
        scan.close();
    }
}
