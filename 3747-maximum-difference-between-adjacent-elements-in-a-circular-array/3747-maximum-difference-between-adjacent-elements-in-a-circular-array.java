class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < n-1 ; i++){
            int diff = Math.abs(nums[i] - nums[i+1]);
            max = Math.max(max,diff);
        }
        int last = Math.abs(nums[n-1] - nums[0]);
        return Math.max(max,last);
    }
}