public class SubstringOccurrences {
    public static void main(String[] args) {
        String str = "This is a test. This test is simple.";
        String substring = "test";
        int count = countOccurrences(str, substring);
        System.out.println("The substring '" + substring + "' occurs " + count + " times.");
    }

    public static int countOccurrences(String str, String substring) {
        int count = 0;
        int index = 0;

        while ((index = str.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }

        return count;
    }
}
