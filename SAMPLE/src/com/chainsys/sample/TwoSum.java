package com.chainsys.sample;

import java.util.Arrays;
import java.util.PriorityQueue;

class TwoSum {
	
	
    public int[] twoSum(int[] nums, int target) {
       
    	 int[] intArr = new int[2];
       

        for(int i=0; i<nums.length; i+=1)
        {
            for(int j=i+1; j<=nums.length; j+=1)
            {
                if(nums[i] + nums[j] == target)
                {
                   intArr[i] = i;
                   intArr[i] = j;
                }
            }
        }
       
        
        intArr.toString();
       return intArr;
    }
}
