package SlidingWindow;

/**
 * Fixed Window Size
 * xample 4: Given an integer array nums and an integer k, find the sum of the subarray with the largest sum whose length is k.
 *
 * As we mentioned before, we can build a window of length k and then slide it along the array. Add and remove one element at a time to make sure the window stays size k.
 * If we are adding the value at i, then we need to remove the value at i - k.
 */

public class SubarraywithLargestSum {
    public static int findBestSubarray(int[] nums, int k) {
        int left=0,sum=0,curr=0;
        if(nums.length<=k)
        {
            return 0;
        }
        for(int i =0;i<k;i++)
        {
            curr +=nums[i];
        }

        sum = curr;
        for(int i =k;i<nums.length;i++){

            curr= curr+nums[i]-nums[i-k];
            sum = Math.max(sum,curr);

        }

        return sum;
    }
}
