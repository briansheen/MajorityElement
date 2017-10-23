package com.example;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        int[] nums = {1,1,1,1,1,2,3,4,5,5,6,7,7,7,7,7,7,7,7,7,7,7,7};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums){
        Map<Integer, Integer> solution = new HashMap<>();
        for(int i = 0; i < nums.length; ++i){
            if(!solution.containsKey(nums[i])){
                solution.put(nums[i],1);
            } else {
                solution.put(nums[i],solution.get(nums[i])+1);
            }
            if(solution.get(nums[i])>(nums.length/2)){
                return nums[i];
            }
        }
        return nums[0];
    }
}
