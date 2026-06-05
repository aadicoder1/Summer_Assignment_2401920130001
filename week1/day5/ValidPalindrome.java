package week1.day5;

public class ValidPalindrome {
    public boolean isPalindrome(String str) {
        String cleaned = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch >= 'a' && ch <= 'z' || ch>= '0' && ch <= '9') {
                cleaned += ch;
            }
        }

        boolean palindrome = true;
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                palindrome = false;
                break;
            }
            left++;
            right--;
        }

        return palindrome;
    }
}
