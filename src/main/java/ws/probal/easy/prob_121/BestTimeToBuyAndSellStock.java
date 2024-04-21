package ws.probal.easy.prob_121;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = prices[0];

        for (int i = 1; i < prices.length; i++) {
            int currentProfit = prices[i] - min;
            maxProfit = Math.max(maxProfit, currentProfit);
            min = Math.min(min, prices[i]);
        }

        return maxProfit;
    }
}
