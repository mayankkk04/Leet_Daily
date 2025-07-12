class Solution {
    public int maxProduct(int[] nums) {
        int presum = 1;
        int sufsum = 1;
        int n = nums.length;
        int maxPdt = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            if(presum == 0) presum = 1;
            if(sufsum == 0) sufsum = 1;
            presum *= nums[i];
            sufsum *= nums[n-i-1];
            maxPdt = Math.max(maxPdt, Math.max(presum,sufsum));
        }
        return maxPdt;
    }
}