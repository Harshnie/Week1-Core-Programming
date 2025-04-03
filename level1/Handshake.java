import java.util.Scanner;

public class Handshake{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number os students : ");
		int n = scan.nextInt();
		int handshakes = (n * (n - 1)) / 2 ;
		 System.out.println("The maximum number of handshakes possible among " + n + " students is: " + handshakes);
		 }
		 }
		