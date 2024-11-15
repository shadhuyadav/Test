package IMPORTANT;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        // Edge case: if the prices array is empty or has one element, no profit can be made
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int minPrice = prices[0];  // Initialize the minimum price to the first day's price
        int maxProfit = 0;          // Initialize the maximum profit to 0

        // Traverse through the price array
        for (int i = 1; i < prices.length; i++) {
            // Calculate profit if we were to sell on the current day
            int profit = prices[i] - minPrice;

            // Update the maximum profit if the current profit is higher
            maxProfit = Math.max(maxProfit, profit);

            // Update the minimum price to be the lowest value so far
            minPrice = Math.min(minPrice, prices[i]);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit: " + maxProfit(prices));  // Output: 5
    }

    /*

    Explanation:
Initialize minPrice: Start by setting the minPrice to the first day's price. This is the lowest price you can buy the stock for at the beginning.
Iterate through the prices: For each price, calculate the potential profit (prices[i] - minPrice), where prices[i] is the current day's price, and minPrice is the lowest price seen so far.
Update maxProfit: Track the maximum profit observed by comparing the calculated profit with the current maxProfit.
Update minPrice: After checking the profit for the current day, update the minPrice to the minimum of the current minPrice and the current day's price. This ensures you're always considering the lowest possible price for buying.
Example Walkthrough:
For prices = [7, 1, 5, 3, 6, 4], the process would look like this:

Day 1: Price = 7, minPrice = 7, maxProfit = 0
Day 2: Price = 1, minPrice = 1, maxProfit = 0
Day 3: Price = 5, Profit = 5 - 1 = 4, maxProfit = 4, minPrice = 1
Day 4: Price = 3, Profit = 3 - 1 = 2, maxProfit = 4, minPrice = 1
Day 5: Price = 6, Profit = 6 - 1 = 5, maxProfit = 5, minPrice = 1
Day 6: Price = 4, Profit = 4 - 1 = 3, maxProfit = 5, minPrice = 1
The maximum profit is 5, which occurs when buying at price 1 (on day 2) and selling at price 6 (on day 5).

Time Complexity:
Time Complexity: O(n), where n is the number of days (the length of the prices array). We are traversing the array once.
Space Complexity: O(1), because we are only using a few extra variables to store the minPrice and maxProfit.
     */
}
