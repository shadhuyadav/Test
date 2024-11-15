public class StockBuySell {

    public static void main(String[] args) {
        int[] prices = {2,1};
        findBestBuySellDays(prices);
    }

    public static void findBestBuySellDays(int[] prices) {
        if (prices == null || prices.length < 2) {
            System.out.println("Not enough data to determine buy/sell days.");
            return;
        }

        int minPriceIndex = 0; // Day to purchase
        int maxProfit = 0;      // Maximum profit found
        int buyDay = 0;         // Day to buy
        int sellDay = 0;        // Day to sell

        for (int i = 1; i < prices.length; i++) {
            // If the current price is less than the price at the minPriceIndex, update minPriceIndex
            if (prices[i] < prices[minPriceIndex]) {
                minPriceIndex = i;
            } else {
                // Calculate profit if selling today
                int profit = prices[i] - prices[minPriceIndex];
                // Update maxProfit and days if we found a better profit
                if (profit > maxProfit) {
                    maxProfit = profit;
                    buyDay = minPriceIndex;
                    sellDay = i;
                }
            }
        }

        if (maxProfit > 0) {
            System.out.println("Purchase on day: " + (buyDay + 1) + " (Price: " + prices[buyDay] + ")");
            System.out.println("Sell on day: " + (sellDay + 1) + " (Price: " + prices[sellDay] + ")");
        } else {
            System.out.println("No profitable buy/sell days found.");
        }
    }
}
