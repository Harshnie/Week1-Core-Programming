import java.util.Scanner;
class modifyMaxDigit{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		long num = scan.nextLong();
		int maxDigit = 10;
		int[] arr = new int[maxDigit];
		int index = 0;
		while(num > 0){
			if(index == maxDigit){
				maxDigit += 10;
				int[] temp = new int[maxDigit];
				for(int i =0; i<index;i++){
					temp[i] = arr[i];
				}
				arr = temp;
			}
			arr[index] =(int) num%10;
			num /= 10;
			index ++;
			
		}
		int largest = 0;
		int secondLargest = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > largest){
				secondLargest = largest;
				largest = arr[i];	
			}
			else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
		}
		System.out.println("Largest number: "+largest);
		System.out.println("Second Largest number: "+secondLargest);
		
		scan.close();
	}
}
