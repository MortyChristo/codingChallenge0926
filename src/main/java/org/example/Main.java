package org.example;

import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5};
        int[] nums2 = {14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7};
        int[] nums3 = {13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9};

        System.out.println(largestGap.largestGap(nums1));
        System.out.println(largestGap.largestGap(nums2));
        System.out.println(largestGap.largestGap(nums3));

    }
}