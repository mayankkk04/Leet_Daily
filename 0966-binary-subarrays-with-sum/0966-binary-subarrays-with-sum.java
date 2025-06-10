class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        int res = 0;
        int cntzero = 0;
        int winsum = 0;
        int i = 0;
        int j = 0;
        while(j < n){
            winsum += nums[j];
            while(i < j && (nums[i] == 0 || winsum > goal) ){
                if(nums[i] == 1){
                    cntzero = 0;
                }
                else{
                    cntzero++;
                }
                winsum -= nums[i];
                i++;
            }
            if(winsum == goal){
                res += 1+cntzero;
            }
            j++;
        }
        return res;
    }
}