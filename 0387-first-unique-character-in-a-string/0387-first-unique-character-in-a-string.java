/*
Approach ->
Use Frequency Array
Count occurances of each character
Iterate over the charArray, the first character with frequency 1 is our answer
*/

class Solution 
{
    public int firstUniqChar(String s) 
    {
        int flag=0;
        char ch;
        int f[] = new int[26];
        for(char c : s.toCharArray())
            f[c-'a']++;
        for(char c : s.toCharArray())
        {
            if(f[c-'a']==1)
            {
                flag = 1;
                return s.indexOf(c);
            }
        }
        return -1;
    }
}