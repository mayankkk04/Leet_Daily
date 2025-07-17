class Solution {
    private int atMostK(int[] nums, int k) {
        int l = 0, cnt = 0, sum = 0;
        for (int r = 0; r < nums.length; r++) {
            sum += (nums[r] % 2);
            while (sum > k) {
                sum -= (nums[l] % 2);
                l++;
            }
            cnt += (r - l + 1);
        }
        return cnt;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k - 1);
    }
}