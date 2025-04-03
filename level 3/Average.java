import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your physics marks: ");
        int physics = scan.nextInt();

        System.out.print("Enter your maths marks: ");
        int maths = scan.nextInt();

        System.out.print("Enter your chemistry marks: ");
        int chemistry = scan.nextInt();
        int average = (physics + maths + chemistry) / 3;

        
        if (average > 80) {
            System.out.println(" Your Percentage is: " + average + " You have got A Grade, You are in level 4 - at above agency-normalized standards");
        } else if (average >= 70 && average <= 79) {
            System.out.println(" Your Percentage is: " + average + " You have got B Grade, You are in level 3 - at agency-normalized standards");
        } else if (average >= 60 && average <= 69) {
            System.out.println(" Your Percentage is: " + average + " You have got C Grade, You are in level 2 - You are below but approaching agency-normalized standards");
        } else if (average >= 50 && average <= 59) {
            System.out.println(" Your Percentage is: " + average + " You have got D Grade, You are in level 1 - Well below agency-normalized standards");
        } else if (average >= 40 && average <= 49) {
            System.out.println(" Your Percentage is: " + average + " You have got E Grade, You are in level 1 - Too far below agency-normalized standards");
        } else {
            System.out.println(" Your Percentage is: " + average + " You have got R Grade, You are in Remedial standards");
        }
        scan.close();
    }
}
