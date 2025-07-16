class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return function(nums,goal) - function(nums,goal-1);
    }
    private int function(int[] nums, int goal){
        if (goal < 0) return 0;  
        int l = 0;
        int n = nums.length;
        int sum = 0;
        int cnt = 0;
        int r = 0;
        while(r < n){
            sum += nums[r];
            while(sum > goal){
                sum = sum - nums[l];
                l++;
            }
            cnt = cnt + (r-l+1);
            r = r+1;
        }
        return cnt;
    }
}