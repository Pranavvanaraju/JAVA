public class ReverseWord {
    public static void main(String[] args) {
        String word = "Pranav";
        String reversedWord = "";
        
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }
        
        System.out.println("Reversed word: " + reversedWord);
    }
}
