import java.util.Scanner;

public class VowelConsonantCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        countVowelsAndConsonants(input);
        
        scanner.close();
    }
    
    public static void countVowelsAndConsonants(String str) {
        int vowelsCount = 0;
        int consonantsCount = 0;
        
        str = str.toLowerCase();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelsCount++;
            }
            else if (ch >= 'a' && ch <= 'z') {
                consonantsCount++;
            }
        }
        
        System.out.println("Vowels: " + vowelsCount);
        System.out.println("Consonants: " + consonantsCount);
    }
}
