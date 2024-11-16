package IMPORTANT;
public class BestTimeToBuyAndSellStock {

    public static int[] maxProfit(int[] prices) {
        // Edge case: if the prices array is empty or has one element, no profit can be made
        if (prices == null || prices.length < 2) {
            return new int[]{0, -1, -1};  // No profit, no valid days
        }

        int minPrice = prices[0];  // Initialize the minimum price to the first day's price
        int maxProfit = 0;          // Initialize the maximum profit to 0
        int buyDay = 0;             // The day to buy (index)
        int sellDay = 0;            // The day to sell (index)

        // Traverse through the price array
        for (int i = 1; i < prices.length; i++) {
            // Calculate profit if we were to sell on the current day
            int profit = prices[i] - minPrice;

            // Update the maximum profit and the buy/sell days if the current profit is higher
            if (profit > maxProfit) {
                maxProfit = profit;
                buyDay = findBuyDay(prices, minPrice); // Find the day when minPrice occurred
                sellDay = i; // Sell on the current day
            }

            // Update the minimum price and the corresponding day if a lower price is found
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }

        // Return the maximum profit along with the buy and sell days
        return new int[]{maxProfit, buyDay, sellDay};
    }

    // Helper function to find the day when the minimum price occurred
    private static int findBuyDay(int[] prices, int minPrice) {
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == minPrice) {
                return i;  // Return the index of the first occurrence of minPrice
            }
        }
        return -1;  // This should never happen if minPrice is correctly updated
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] result = maxProfit(prices);

        // Output: Maximum profit and the corresponding days to buy and sell
        System.out.println("Maximum Profit: " + result[0]);
        System.out.println("Buy on day: " + result[1]);
        System.out.println("Sell on day: " + result[2]);
    }
}
