/*
Approach ->
First, Using StringBuilder include only characters and digits
Next, using two pointer approach check for pallindrome
Character.toLowerCase(ch) so that case mismatch se false return na ho
*/

import java.util.*;
class Solution 
{
    public boolean isPalindrome(String s) 
    {
        StringBuilder sb = new StringBuilder();
        int i=0, j=0;
        char ch;
        for(i=0 ; i<s.length() ; i++)
        {
            ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch))
                sb.append(Character.toLowerCase(ch));
        }
        String str = sb.toString();
        i=0;
        j=str.length()-1;
        while(i<j)
        {
            if(str.charAt(i) != str.charAt(j))
                return false;
            
            i++;
            j--;
        }
        return true;
    }
}

/*
Better Approach ->
    for(char ch : s.toCharArray())
    {
        if(Character.isLetterOrDigit(ch))
            sb.append(Character.toLowerCase(ch));
    }
    if(sb.toString().equals(sb.reverse().toString()))
    {
        return true;
    }
    return false;
}
*/
