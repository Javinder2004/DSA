// User function Template for Java

class Solution {
    public String removeConsecutiveCharacter(String s) {
        // code here
        char c[]=new char[s.length()];
        int j=0;
        c[0]=s.charAt(0);
        j=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=c[j-1]){
            c[j]=s.charAt(i);
            j++;
        }
            
        }
     
          String f=String.valueOf(c,0,j);

return f;
    }
}