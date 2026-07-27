import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>();

        for (int x : nums1) {
            h1.add(x);
        }

        for (int x : nums2) {
            if (h1.contains(x)) {
                h2.add(x);
            }
        }

        int[] arr = new int[h2.size()];
        int i = 0;

        for (int x : h2) {
            arr[i++] = x;
        }

        return arr;
    }
}