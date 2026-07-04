class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int total=0;
        for(int price:prices){
            if (price<min){
                min=price;
            }else{
                total=Math.max(total,price-min);

            }
            }
            

        
        return total;
        

    }
}