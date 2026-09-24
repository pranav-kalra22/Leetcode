/*
Pattern: Expand Around Center

Instead of checking every possible substring, we can consider every character as a possible center of a palindrome.

Start from the center:
r a c e c a r
      ↑
    center

Expand outward:
      e
     / \
    c   c
   /     \
  a       a
 /         \
r           r

-> Odd length Pallindrome
a b a
  ↑
center

-> Even length Pallindrome
a b | b a
    ↑
  center
*/

class Solution 
{
    public String longestPalindrome(String s) 
    {
        int start=0, max=0;
        for(int i=0 ; i<s.length() ; i++)
        {
            int len1 = expand(s, i, i);
            int len2 = expand(s, i, i+1);

            int len = Math.max(len1, len2);
            if(len>max)
            {
                max = len;
                start = i - (len-1)/2;
            }
        }
        return s.substring(start, start+max);
    }
    public int expand(String s, int left, int right)
    {
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
        {
            left--;
            right++;
        }
        return right-left-1;
    }
}