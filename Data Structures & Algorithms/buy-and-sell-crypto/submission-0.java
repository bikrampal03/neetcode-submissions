class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int maxpro = 0;
    
        while(r<prices.length){
            if(prices[l]<prices[r]){
                maxpro = Math.max(maxpro,prices[r] - prices[l]);
            }else{
                l=r;
            }
            r++;
        }
        return maxpro;
    }
}
