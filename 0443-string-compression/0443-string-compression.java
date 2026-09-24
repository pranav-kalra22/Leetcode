/*
Approach ->
To modify array in place, we use Two Pointer Approach
read and write
Loop kab tak chalega?
Till read<length of array
current character nikalege, count=0
Now, till same character keeps on occuring, run another loop and count
Bahar aakar write
*/

import java.util.*;
class Solution 
{
    public int compress(char[] chars) 
    {
        int read=0, write=0;
        while(read<chars.length)
        {
            char ch = chars[read];
            int count=0;
            while(read<chars.length && chars[read]==ch)
            {
                read++;
                count++;
            }
            chars[write] = ch;
            write++;

            if(count>1)
            {
                String num = String.valueOf(count);
                for(char c : num.toCharArray())
                {
                    chars[write] = c;
                    write++;
                }
            }
        }  
        return write;  
    }
}