package streams;

public class Palindrome {
    public static void main(String[] args) {
        StringBuilder string = new StringBuilder("madam");
        PalindromeInterface palindromeInterface = Palindrome::isPalindrome;

        System.out.println(palindromeInterface.isPalindrome(string));
    }

    private static boolean isPalindrome(StringBuilder a) {
        StringBuilder rev = new StringBuilder(a);
        return a.toString().equals(rev.reverse().toString());
    }
}
interface PalindromeInterface {
    boolean isPalindrome(StringBuilder a);
}