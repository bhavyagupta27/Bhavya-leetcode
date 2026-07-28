class Solution {
    public boolean isPalindrome(int x) {
        int org = x;
        int digit = 0;
        int num = 0;
        while (x > 0) {
            digit = x % 10;
            x = x / 10;
            num = num * 10 + digit;
        }
        return num == org;
    }
}