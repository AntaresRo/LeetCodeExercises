package org.example;

public class SumTwo {

    public int maxProfit(int[] prices) {
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if (prices[j] - prices[i] > profit) {
                    profit = prices[j] - prices[i];
                }
            }
        }
        return profit;
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public int removeDuplicates(int[] nums) {
        int uniqueCount = 1;
        int previous = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != previous) {
                nums[uniqueCount] = nums[i];
                uniqueCount++;
                previous = nums[i];
            }
        }

        return uniqueCount;
    }

    public int removeElement(int[] nums, int val) {
        int numberOfElements = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                //nums[numberOfElements] = nums[i];
                numberOfElements++;
            }
        }
        return numberOfElements;
    }







}