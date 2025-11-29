class Solution {
    boolean isPalindrome(String s) {
        // code here
         String original = s;
        char[] Arr = s.toCharArray();
        int left = 0;
        int right = Arr.length-1;
        while(left<=right){
            char temp = Arr[left];
            Arr[left] = Arr[right];
            Arr[right] = temp;
            left++;
            right--;
      }
      s = new String(Arr);
      if(s.equals(original)){
          return true;
      }
      return false;
    }
}