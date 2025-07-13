class Solution {
    public int maxScore(int[] cardPoints, int k) {
       int n = cardPoints.length;
       int maxPts = 0;
       int lsum = 0;
       int rsum = 0;
       int l = k-1;
       int r = n-1;
       for(int i = 0 ; i < k ; i++){
            lsum += cardPoints[i];
       } 
       maxPts = lsum;
       for(int i = k-1; i >= 0 ; i--){
            lsum = lsum - cardPoints[i];
            rsum += cardPoints[r];
            r--;
            maxPts = Math.max(maxPts, lsum+rsum);
       }
       return maxPts;
    }
}