package com.Utils;

import SlidingWindow.SubarraywithLargestSum;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] nums={3,-1,4,12,-8,5,6};

        int sum = SubarraywithLargestSum.findBestSubarray(nums,4);
        System.out.println(sum);


    }
}