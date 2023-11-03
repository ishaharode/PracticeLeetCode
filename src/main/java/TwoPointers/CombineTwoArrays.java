package TwoPointers;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Example 3: Given two sorted integer arrays arr1 and arr2, return a new array that combines both of them and is also sorted.
 *
 * The trivial approach would be to first combine both input arrays and then perform a sort. If we have n = arr1.length + arr2.length, then this gives a time complexity of
 * O(n⋅logn) (the cost of sorting).
 * This would be a good approach if the input arrays were not sorted, but because they are sorted, we can take advantage of the two pointers technique to improve to
 * O(n).
 */
public class CombineTwoArrays {
    public List<Integer> combine(int[] arr1, int[] arr2) {
        // ans is the answer
        List<Integer> ans = new ArrayList<Integer>();
        int i =0, j=0;
        while (i<arr1.length && j< arr2.length)
        {
            if(arr1[i]<arr2[j]){
                ans.add(arr1[i]);
                i++;
            }
            else{
                ans.add(arr2[j]);
                j++;
            }

        }
        while(i<arr1.length){
            ans.add(arr1[i]);
            i++;
        }
        while(j<arr2.length){
            ans.add(arr2[j]);
            j++;
        }
        return ans;
    }
}
