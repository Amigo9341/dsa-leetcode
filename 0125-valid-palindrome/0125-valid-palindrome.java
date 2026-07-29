class Solution {
    public boolean isPalindrome(String s) {

        return checkPalindrome(s, 0, s.length() - 1);
    }

    public boolean checkPalindrome(String str, int start, int end) {

        if(start >= end) return true;

        if(!Character.isLetterOrDigit(str.charAt(start))) return checkPalindrome(str, start + 1, end);

        if(!Character.isLetterOrDigit(str.charAt(end))) return checkPalindrome(str, start, end - 1);

        if(Character.toLowerCase(str.charAt(start)) != Character.toLowerCase(str.charAt(end))) return false;

        return checkPalindrome(str, start + 1, end - 1);
    
    }
}