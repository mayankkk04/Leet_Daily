class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            set.add(nums[i]);
        }
        int maxcnt = 0;
        for(int num : set){
            int prevele = num-1;
            if(!set.contains(prevele)){
                int cnt = 1;
                int next = num+1;
                while(set.contains(next)){
                    next++;
                    cnt++;
                }
                maxcnt = Math.max(maxcnt, cnt);
            }
        }
        return maxcnt;
    }
}