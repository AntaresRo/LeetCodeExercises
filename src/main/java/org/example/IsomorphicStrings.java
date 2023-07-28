package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> mapStringA = new HashMap<>();
        Map<Character, Integer> mapStringB = new HashMap<>();

        mapStringA.put((s.charAt(0)),1);
        mapStringB.put((t.charAt(0)),1);

        for (int i = 1; i < s.length(); i++) {
            char s2 = (s.charAt(i));
            char t2 = (t.charAt(i));

            if(!mapStringA.containsKey(s2)){
                mapStringA.put(s2,i+1);
            }
            if(!mapStringB.containsKey(t2)){
                mapStringB.put(t2,i+1);
            }

            if (!Objects.equals(mapStringA.get(s2), mapStringB.get(t2))) {
                return false;
            }
        }

        return true;
    }

    public int search(int[] nums, int target) {
         for (int i = 0; i < nums.length; i++) {
             if (nums[i] == target) {
                 return i;
             }
         }
         return -1;
    }


}
