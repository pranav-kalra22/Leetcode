/*
Approach ->
We have to check for one-to-one mapping
For this, we use two HashMaps (two coz one HashMap cannot catch every multiple mapping)
st map checks for if there are multiple mappings of t to s
ts map checks for if there are multiple mappings of s to t
*/

import java.util.*;
class Solution 
{
    public boolean isIsomorphic(String s, String t) 
    {
        HashMap <Character, Character> st = new HashMap<>();
        HashMap <Character, Character> ts = new HashMap<>();
        
        if(s.length()!=t.length())
            return false;

        for(int i=0 ; i<s.length() ; i++)
        {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);   

            // Check s->t mapping
            if(st.containsKey(c1))
            {
                if(st.get(c1) != c2)
                    return false;
            }

            //Check t->s mapping
            if(ts.containsKey(c2))
            {
                if(ts.get(c2) != c1)
                    return false;
            }

            // Create mappings
            st.put(c1, c2);
            ts.put(c2, c1);
        }
        return true;
    }
}