//hidden sliding window problem

class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int n = startTime.length;
        ArrayList<Integer> free = new ArrayList<>();
        free.add(startTime[0]); //incase there is free space before start of 1st event
        for(int i = 1 ; i < n ; i++){
            free.add(startTime[i] - endTime[i-1]);
        }
        free.add(eventTime - endTime[n-1]); //incase there is free space after last event
        int i = 0;
        int j = 0;
        int maxSum = 0;
        int currsum = 0;
        int m = free.size();
        //apply sliding window
        while(j < m){
            currsum += free.get(j);
            if(i < n && j-i+1 > k+1){
                currsum -= free.get(i);
                i++;
            }
            maxSum = Math.max(maxSum, currsum);
            j++;
        }
        return maxSum;
    }
}