import java.util.Scanner;

public class OddEven{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
		int number = scan.nextInt();
		if (number <= 0){
		System.out.println("Enter a natural number:" );
		}
		else
		{
		for ( int i = 1; i <= number ; i++){
		if ( i % 2 == 0){
		
		System.out.println("It is an Even number" );
		}
		else{
		System.out.println("It is an Odd number" );
		}
	  }
	}
  }
}		