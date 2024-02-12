package BestTimetoBuyandSellStocks;

import java.util.Scanner;

public class BuyAndSellstocks {
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        if (prices.length == 0 && prices.length == 1) {
            return 0;
        }
        int max = prices[n - 1];
        int profit = 0;
        for (int i = n - 2; i >= 0; i--) {
            if (prices[i] > max) {
                max = prices[i];
            }
            profit = Math.max(profit, max - prices[i]);
        }
        return profit;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter n");
        int n = scn.nextInt();
        int[] prices = new int[n];
        System.out.println("Enter values");
        for (int i = 0; i < n; i++) {
            prices[i] = scn.nextInt();
        }
        int profit = maxProfit(prices);
        System.out.println("output is " + profit);
    }
}
