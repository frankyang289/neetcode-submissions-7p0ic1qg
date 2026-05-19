class Solution {
    fun maxProfit(prices: IntArray): Int {
        var left = 0
        var maxProfit = 0

        for (right in 1..prices.lastIndex) {
            if (prices[right] < prices[left]) {
                left = right
            }

            val profit = prices[right] - prices[left]
            maxProfit = maxOf(maxProfit, profit)
        }
        return maxProfit
    }
}
