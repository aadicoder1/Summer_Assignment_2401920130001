public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int minval=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(minval>prices[i]){
                minval=prices[i];
            } else{
                maxprofit = Math.max(maxprofit, prices[i] - minval);
            }
        }
        return maxprofit;
    }
}
