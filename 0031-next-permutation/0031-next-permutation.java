class Solution {
    private void reverse(int[] nums, int j , int i){
        while(i > j){
            swap(nums,i,j);
            j++;
            i--;
        }
    }
    private void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx = -1;
        for(int i = n-2 ; i >= 0 ; i--){
            if(nums[i] < nums[i+1]){
                idx = i;
                break;
            }
        }
        if(idx != -1){
            for(int i = n-1 ; i > idx ; i--){
                if(nums[i] > nums[idx]) {
                    swap(nums, i, idx);
                    break;
                }
            }
        }
        reverse(nums, idx+1, n-1);
    }
}