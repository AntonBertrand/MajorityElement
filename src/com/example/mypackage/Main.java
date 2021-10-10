package com.example.mypackage;

import java.util.Arrays;

public class Main {

    //Given an array nums of size n, return the majority element.
    //The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.



    public static void main(String[] args) {
        int[] nums = {8,6,5,5,2,1};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
