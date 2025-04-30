public class RemoveCharacter {
    public static void main(String[] args) {
        String input = "Hello World";
        char charToRemove = 'l';
        String result = removeCharacter(input, charToRemove);
        System.out.println("Modified String: " + result);
    }

    public static String removeCharacter(String str, char ch) {
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c != ch) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
