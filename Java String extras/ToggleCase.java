public class ToggleCase {
    public static void main(String[] args) {
        String str = "Hello World!";
        String toggledStr = toggleCase(str);
        System.out.println("Original String: " + str);
        System.out.println("Toggled Case String: " + toggledStr);
    }

    public static String toggleCase(String str) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c);
            }
        }
        
        return result.toString();
    }
}
