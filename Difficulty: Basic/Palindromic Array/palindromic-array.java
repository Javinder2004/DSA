/*Complete the Function below*/
class Solution {
    public static boolean isPalinArray(int[] arr) {
        // add code here.
        for(int n: arr){
            if(!isPalindrome(n)) return false;
        }
        return true;
    }
    private static boolean isPalindrome(int x){
        int originalx = x;
        int reverse = 0;
        while(x > 0){
            reverse = (reverse * 10) + (x % 10);
            x /= 10;
        }
        return reverse == originalx;
    }
}