class Solution {

    public boolean isPalindrome(String s) {
        return check(s, 0, s.length() - 1);
    }

    private boolean check(String s, int left, int right) {

        // Base condition
        if (left >= right) {
            return true;
        }

        // Skip invalid characters from left
        if (!isValid(s.charAt(left))) {
            return check(s, left + 1, right);
        }

        // Skip invalid characters from right
        if (!isValid(s.charAt(right))) {
            return check(s, left, right - 1);
        }

        // Compare characters
        if (lowerCase(s.charAt(left)) != lowerCase(s.charAt(right))) {
            return false;
        }

        // Move both pointers
        return check(s, left + 1, right - 1);
    }

    private boolean isValid(char ch) {
        if ((ch >= 'a' && ch <= 'z') ||
                (ch >= 'A' && ch <= 'Z') ||
                (ch >= '0' && ch <= '9')) {
            return true;
        }

        return false;
    }

    private char lowerCase(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return (char) (ch + 32);
        }

        return ch;
    }
}
