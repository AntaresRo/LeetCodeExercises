package org.example;

public class SingleNumber {

    public int singleNumber(int[] nums) {

        int ans=0;
        for (int num : nums) {
            ans = num ^ ans;
        }
        return ans;


    }
}
