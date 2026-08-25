class Solution {
    public double minPrice(int[] prices, int[] discounts) {

        double amt = 0.0;

        Arrays.sort(prices);
        Arrays.sort(discounts);

        int p = prices.length - 1;
        int d = discounts.length - 1;

        while(p >= 0 && d >= 0) {
            amt += (prices[p] * (100 - discounts[d]))/100.0;
            p--;
            d--;
        }
        while (p >= 0) {
            amt += prices[p];
            p--;
        }
        return amt;
        
    }
}