class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, right = 0, maxLen = 0;
        int zeros = 0;

        while (right < nums.length) {
            if (nums[right] == 0) {
                zeros++;
            }

            // Shrink window from the left if zeros exceed k
            while (zeros > k) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }

        return maxLen;
    }
}
