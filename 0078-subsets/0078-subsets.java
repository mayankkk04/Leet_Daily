class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        int totalset = 1 << n;
        for(int num = 0 ; num < totalset ; num++){
            List<Integer> newlist = new ArrayList<>();
            for(int i = 0 ; i < n ; i++){
                if((num & (1 << i)) != 0 ) newlist.add(nums[i]);
            }
            list.add(newlist);
        }
        return list;
    }
}