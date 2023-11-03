package SlidingWindow;

/**
 * Example 3: 713. Subarray Product Less Than K.
 *
 * Given an array of positive integers nums and an integer k, return the number of subarrays where the product of all the elements in the subarray is strictly less than k.
 *
 * For example, given the input nums = [10, 5, 2, 6], k = 100, the answer is 8. The subarrays with products less than k are:
 *
 * [10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
 */
public class SubarrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int right=0,left=0,ans=0,curr=1;
        if(k<=1){
            return 0;
        }

        for(right =0;right<nums.length;right++){
            curr =curr * nums[right];
             while(curr>=k)
             {
                 curr = curr /nums[left];
                 left++;
             }
             ans = ans+right-left+1;

        }
        return ans;
    }

}
