class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        for(int i = 0 ; i < (1<<n) ; i++ ){  // or i < Math.pow(2,n)
            List<Integer> res = new ArrayList<>();
            for(int j = 0 ; j < n ; j++){    // iterating bits of each number and anding it to check for the active bits only
                if( (i & ( 1<<j )) != 0 ) res.add(nums[j]);
            }
            ans.add(res);
        }
        return ans;
    }
}