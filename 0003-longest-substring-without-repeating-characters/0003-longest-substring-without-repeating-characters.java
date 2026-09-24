/*
Approach ->
No duplicate characters -> HashSet
Sliding Window / Two Pointers

Jab tak set contains character at right index, tab tak left index wale character ko remove karna hai and left++ karna hai
Loop se bahar aakar, add the right index character to HashSet
Then, compare for maximum

*/

class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        HashSet<Character> set = new HashSet<>();
        int left = 0, right = 0, max = 0;
        char ch;
        for(right = 0; right < s.length(); right++)
        {
            ch = s.charAt(right);
            while(set.contains(ch))
            {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}