package org.example;

import java.util.*;

public class KFrequency {

    List<Integer> test = new ArrayList<>();

    public int[] topKFrequent(int[] nums, int k) {

        int [] sortedList = calculateOccurrences(nums);
        int [] results = new int[k];

        for (int i = 0; i < k; i++) {
            results[i] = sortedList[i];
        }
        return results;
    }


    public int[] calculateOccurrences (int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();

        for (int element : nums) {
            if (counter.containsKey(element)) {
                int count = counter.get(element);
                counter.put(element, count + 1);
            } else {
                counter.put(element, 1);
            }
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(counter.entrySet());
        entryList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
        int[] sortedKeys = new int[entryList.size()];
        for (int i = 0; i < entryList.size(); i++) {
            sortedKeys[i] = entryList.get(i).getKey();
        }

        return sortedKeys;
    }



    public int[] plusOne(int[] digits) {
        long representation = digits[0];

        for (int i = 1; i < digits.length; i++) {
            representation = representation * 10 + digits[i];

        }
        representation = representation + 1;
        int[] result = new int[String.valueOf(representation).length()];

        for (int k = result.length - 1; k >= 0; k--) {
            result[k] = (int) (representation % 10);
            representation = representation / 10;
        }


        return result;



    }

    int [] testulescu = {3, 3, 4};


}
