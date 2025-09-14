class Solution {
    public double myPow(double x, int n) {
       double ans = 1;
       long nn = n;
       if(nn < 0) nn = -1*nn;
        while(nn > 0){
            if(nn % 2 == 1){
                ans *= x;
                nn--;
            }
            else{
                nn = nn/2;
                x = x*x;
            }
        }
        return (n < 0) ? (double)1.0/(double)ans : ans;
    }
}