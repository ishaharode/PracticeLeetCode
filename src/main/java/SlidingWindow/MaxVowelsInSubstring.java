package SlidingWindow;

/**
 * Maximum Number of Vowels in a Substring of Given Length
 * Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
 *
 * Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abciiidef", k = 3
 * Output: 3
 * Explanation: The substring "iii" contains 3 vowel letters.
 * Example 2:
 *
 * Input: s = "aeiou", k = 2
 * Output: 2
 * Explanation: Any substring of length 2 contains 2 vowels.
 * Example 3:
 *
 * Input: s = "leetcode", k = 3
 * Output: 2
 * Explanation: "lee", "eet" and "ode" contain 2 vowels.
 *
 */
public class MaxVowelsInSubstring {
    public static int maxVowels(String s, int k) {
        int left=0,right=0,curr=0,ans=0;

        for(right=0;right<k;right++)
        {  char c =s.charAt(right);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            {
                curr++;

            }
        }
        ans =curr;
        System.out.println("ans="+ans);

        for(right=k;right<s.length();right++)
        {
            left=right-k;
            int temp=0;
            char ch = s.charAt(left);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                curr--;


            }
            char c =s.charAt(right);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            {
                curr++;
                System.out.println("curr="+curr);


            }


            ans =Math.max(ans,curr);

        }
        return ans;

    }
}
