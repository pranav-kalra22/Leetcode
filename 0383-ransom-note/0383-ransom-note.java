/*
Approach ->
Use Frequency Array
If for any character in magazine, frequency of that char is less than that of frequency of that char in ransomNote, then cannot be constructed
*/

class Solution 
{
    public boolean canConstruct(String ransomNote, String magazine) 
    {
        int f1[] = new int[26];
        int f2[] = new int[26];

        for(char ch : ransomNote.toCharArray())
            f1[ch-'a']++;
        for(char ch : magazine.toCharArray())
            f2[ch-'a']++;
        for(int i=0 ; i<26 ; i++)
        {
            if(f2[i]<f1[i])
                return false;
        }
        return true;
    }
}