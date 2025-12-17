
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
         for(int j=0; j<b.length; j++)
        {
            boolean found = false;
            for(int i=0; i<a.length; i++)
            {
                if(b[j]==a[i])
                {
                    found = true;
                    a[i] = Integer.MIN_VALUE;
                    break;
                }
            }
            if(!found)
            {
                return false;
            }
        }
        return true;
    }
}
