class Solution {
    public int maxSubArray(int[] nums){
        int sum=0,max=nums[0];
        for(int i : nums){
            sum+=i;
            max=(sum>max)?sum : max;
            if(sum<0) sum=0;
        }
        return max;
    }
}