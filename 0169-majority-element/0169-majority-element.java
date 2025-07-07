class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int cnt = 1;
        int res = 0;
        for(int i = 1 ; i < n ; i++){
            if(nums[i] == nums[res]){
                cnt++;
            }
            else cnt--;
            if(cnt == 0){
                res = i;
                cnt = 1;
            }
        }
        //till here we got our probable majority element .
        //as rest of them will get cancelled out
        for(int i = 0 ; i < n ; i++){
            if(nums[res] == nums[i]) cnt++;
        }
        if(cnt < n/2) return -1;
        return nums[res];
    }

}