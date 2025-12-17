import java.util.*;

class Solution {
    public static ArrayList<Integer> mergeThree(int[] a, int[] b, int[] c) {
        ArrayList<Integer> res = new ArrayList<>();

        int i = 0, j = 0, k = 0;

        // Merge while all three arrays have elements
        while (i < a.length && j < b.length && k < c.length) {
            if (a[i] <= b[j] && a[i] <= c[k]) {
                res.add(a[i++]);
            } else if (b[j] <= a[i] && b[j] <= c[k]) {
                res.add(b[j++]);
            } else {
                res.add(c[k++]);
            }
        }

        // Merge remaining two arrays
        while (i < a.length && j < b.length) {
            res.add(a[i] <= b[j] ? a[i++] : b[j++]);
        }

        while (j < b.length && k < c.length) {
            res.add(b[j] <= c[k] ? b[j++] : c[k++]);
        }

        while (i < a.length && k < c.length) {
            res.add(a[i] <= c[k] ? a[i++] : c[k++]);
        }

        // Add remaining elements
        while (i < a.length) res.add(a[i++]);
        while (j < b.length) res.add(b[j++]);
        while (k < c.length) res.add(c[k++]);

        return res;
    }
}
