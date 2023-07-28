package org.example;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {



    public boolean containsDuplicate(int[] nums){
        Set<Integer> uniqueElements = new HashSet<>();

        for (int num : nums) {
            if (uniqueElements.contains(num)) {
                return true;
            } else {
                uniqueElements.add(num);
            }
        }
        return false;
    }
}
