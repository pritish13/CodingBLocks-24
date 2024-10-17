package lecture7;

public class stringPalin {
    static boolean Palindrome(String word) {
        int N = word.length();
        
        for (int i = 0; i < N / 2; i++) {
            if (word.charAt(i) != word.charAt(N - i - 1)) {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        String word = "hello";
        boolean result = Palindrome(word);
        System.out.println("Is '" + word + "' a palindrome? " + result);
    }
}
