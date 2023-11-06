package SlidingWindow;

/**
 * 1004. Max Consecutive Ones III
 * Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
 * Output: 6
 * Explanation: [1,1,1,0,0,1,1,1,1,1,1]
 * Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 * Example 2:
 *
 * Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
 * Output: 10
 * Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
 * Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 */

public class MaxConsecutiveOnes {
    public static int longestOnes(int[] nums, int k) {
        int left=0,right=0,curr=0,ans=0;
        for(right =0;right<nums.length;right++)
        {
            if(nums[right]==0){
                curr++;
            }
            while(curr>k)
            {
                if(nums[left]==0)
                {
                    curr--;
                }
                left++;

            }
            ans=Math.max(ans,right-left+1);

        }
        return ans;

    }
}
