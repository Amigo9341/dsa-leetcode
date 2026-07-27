class Solution {
    public boolean isPalindrome(int x) {

        int rev = 0;
        int Aman = x;

        if(x < 0) return false;

        while(Aman != 0) {
            int lastDigit = Aman % 10;
            rev = rev * 10 + lastDigit;
            Aman = Aman / 10;
        }
        return rev == x;
        
    }
}