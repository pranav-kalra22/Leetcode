/*
Approach ->
We use Frequency Array to count the frequency of characters in both the Strings.
If both arrays are identical, then the two Strings are Anagrams.

Alternative ->
Sort the two Strings
Then, s1.equals(s1)
If true, they are anagrams.
*/

import java.util.*;
class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        int f1[] = new int[26];
        int f2[] = new int[26];
        for(char ch : s.toCharArray())
        {
            f1[ch-'a']++;
        }
        for(char ch : t.toCharArray())
        {
            f2[ch-'a']++;
        }
        for(int i=0 ; i<26 ; i++)
        {
            if(f1[i]!=f2[i])
                return false;
        }
        return true;
    }
}