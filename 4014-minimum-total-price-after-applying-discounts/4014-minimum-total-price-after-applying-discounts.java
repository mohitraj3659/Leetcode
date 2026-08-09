class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int j=prices.length-1,k=discounts.length-1;
        double sum=0;
        while(j>=0){
            if(k>=0){
                sum+=(prices[j]*(double)(100-discounts[k])/100);
            }
            else sum+=prices[j];
            j--;
            k--;
        }
        return sum;
    }
}