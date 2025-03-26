package com.cybercitycode.clinicaltrialssubject;

public class Test {

    public int search(int[] nums, int target) {
        int lower_bound = 0;
        int upper_bound = nums.length - 1;
        int startNum = nums[lower_bound];
        int endNum = nums[upper_bound];

        while (lower_bound < upper_bound) {
            int midpoint = (lower_bound + upper_bound) / 2;
            int valueToCompare = nums[midpoint];

            if (target == valueToCompare) return midpoint;
            if (target == nums[lower_bound] ) return lower_bound;

            if (startNum <= valueToCompare) {
                if (target <= valueToCompare && target <= startNum) {
                    upper_bound = midpoint;
                } else {
                    lower_bound = midpoint + 1;
                }
            } else {
                if (target > valueToCompare && target <= endNum) {
                    lower_bound = midpoint + 1;
                } else {
                    upper_bound = midpoint;
                }
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;

        Test test = new Test();
        test.search(nums, target);
    }

}
