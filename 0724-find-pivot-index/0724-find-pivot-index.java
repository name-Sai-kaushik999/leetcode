class Solution {
    public int pivotIndex(int[] nums) {

        int n = nums.length;

        // Build prefix sum array in-place
        for (int i = 1; i < n; i++) {
            nums[i] += nums[i - 1];
        }

        int total = nums[n - 1];

        for (int i = 0; i < n; i++) {

            int left;
            if (i == 0)
                left = 0;
            else
                left = nums[i - 1];

            int right = total - nums[i];

            if (left == right)
                return i;
        }

        return -1;
    }
}