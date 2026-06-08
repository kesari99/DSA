class Solution {
    public int maxProfit(int[] prices) {

        int l = 0;
        int r = 1;
        int ans = 0;
        int n = prices.length;

        while (r < n){
            if(prices[r] > prices[l]){
                int diff = prices[r] - prices[l];
                ans = Math.max(ans, diff);
            }
            else{
                l = r;
            }
            r++;
        }

        return ans;
        
    }
}