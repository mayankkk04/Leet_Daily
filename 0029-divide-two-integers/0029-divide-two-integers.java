class Solution {
    public int divide(int dividend, int divisor) {
        // Edge case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        
        if (dividend == divisor) return 1;

        boolean sign = !((dividend >= 0) == (divisor >= 0)); // true if result is negative
        
        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);
        int ans = 0;

        while (n >= d) {
            int cnt = 0;
            while (n >= (d << (cnt + 1))) {
                cnt++;
            }
            ans += 1 << cnt;
            n -= d * (1L << cnt);
        }

        return sign ? -ans : ans;
    }
}
