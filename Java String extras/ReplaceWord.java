public class ReplaceWord {
    public static void main(String[] args) {
        String sentence = "Java is a powerful programming language.";
        String wordToReplace = "powerful";
        String replacementWord = "versatile";

        String result = replaceWord(sentence, wordToReplace, replacementWord);
        System.out.println("Modified Sentence: " + result);
    }

    public static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replaceAll("\\b" + oldWord + "\\b", newWord);
    }
}
