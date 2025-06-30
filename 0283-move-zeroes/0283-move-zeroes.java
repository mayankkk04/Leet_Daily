class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] != 0){
                swap(nums,i,cnt);
                cnt++;
            }
        }
    }
    void swap(int[] nums,int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}