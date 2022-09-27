package org.example;

import java.util.Arrays;

public class largestGap {
public static int largestGap(int[] nums){
    int gap = 0;
    Arrays.sort(nums);
    for(int i = 1; i < nums.length; i++){
        if (gap < (nums[i] - nums[i-1])){
            gap = (nums[i] - nums[i-1]);
        }
    }
    return gap;
}

}
