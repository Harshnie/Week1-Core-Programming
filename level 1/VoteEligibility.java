import java.util.Scanner;

public class VoteEligibility{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();
		if (age >= 18){
		System.out.println("The person's age is " + age + " and can vote.");
		}
		else  {
		System.out.println("The person's age is " + age + " and cannot vote.");
		}
	}
}	
	
