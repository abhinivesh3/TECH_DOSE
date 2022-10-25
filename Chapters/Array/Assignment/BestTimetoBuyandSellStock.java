class Solution {
    public int maxProfit(int[] prices) {
        int b = prices[0], p = 0, n = prices.length, i;
        for (i = 1; i < n; i++) {
            b = Math.min(b, prices[i]);
            int c = prices[i] - b;
            p = Math.max(c, p);
        }
        return p;
    }
}