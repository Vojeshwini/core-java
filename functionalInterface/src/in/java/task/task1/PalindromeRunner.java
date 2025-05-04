package in.java.task.task1;

public class PalindromeRunner {
    public static void main(String[] args) {
        IsPalindrome palindrome = () -> {
            String input = "MADAM";

            char[] value = input.toCharArray();
            int length = value.length;

            for (int i = 0; i < length; i++) {
                for (int j = length - 1 - i; j >= 0; j--) {
                    if (value[i] != value[j]) {
                        System.out.println("Not Palindrome");
                         return;
                    }
                    break;
                }
            }
            System.out.println("Palindrome");
        };


        palindrome.checkPalindrome();
    }
}
