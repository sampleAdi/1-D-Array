import java.util.*;

public class Buy_Sell_Stock {
    public static void buy_sell(int prices[]) {
        int i, BP = Integer.MAX_VALUE, MaxProfit = 0, profit = 0, SP;
        for (i = 0; i < prices.length; i++) {
            SP = prices[i];
            if (BP < SP) {
                profit = SP - BP;
                MaxProfit = Math.max(profit, MaxProfit);
            } else {
                BP = SP;
            }
        }
        System.out.println("Maximum profit: " + MaxProfit);
    }

    public static void main(String[] args) {
        int prices[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        buy_sell(prices);
    }
}
