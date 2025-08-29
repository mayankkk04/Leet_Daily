class Solution {
    public long flowerGame(int n, int m) {
        return 1L*(((n+1)/2)*m/2) + (((n/2)*(m+1)/2));
    }
}