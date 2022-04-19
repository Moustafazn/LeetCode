package com.leetcode;

public class BestTimeBuySellStock {

    public static int maxProfit(int[] prices) {
        int count =0;
        int min = Integer.MAX_VALUE;
            for (int j = 0; j < prices.length; j++) {
                min = Math.min(min, prices[j]);
               count = Math.max(count, prices[j] - min);
            }

        return count;
    }

    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices ));
    }
}
