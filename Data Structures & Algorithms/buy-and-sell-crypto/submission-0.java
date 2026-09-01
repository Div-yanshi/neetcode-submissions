class Solution {
    public int maxProfit(int[] prices) {
        int l=0,r=0;
        int max=0;
        while(r < prices.length){
            if(prices[l]<prices[r])
            {
                int cur=prices[r]-prices[l];
            max=Math.max(cur, max);}

            else{
            l=r;}
            r++;
            }
        
        return max;
    }
}
