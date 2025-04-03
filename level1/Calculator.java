import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double number1 = scan.nextDouble();
        System.out.print("Enter the second number: ");
        double number2 = scan.nextDouble();
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;
        System.out.printf("The addition, subtraction, multiplication, and division value of %.2f and %.2f are %.2f, %.2f, %.2f, and %.2f respectively.%n", 
                          number1, number2, addition, subtraction, multiplication, division);
    }
}
