/*
Approach ->
Agar opening brackets hai, then push into stack
If not opening brackets, then stack se pop karege
If popped bracket and the coming bracket are of same type, then okay. If not of same type toh invalid parentheses
Keep checking throughout
*/

import java.util.*;
class Solution 
{
    public boolean isValid(String s) 
    {
        Stack <Character> stack = new Stack<>();
        for(char ch : s.toCharArray())
        {
            if(ch=='(' || ch=='{' || ch=='[')
                stack.push(ch);
            else
            {
                if(stack.isEmpty())
                    return false;
                char top = stack.pop();
                if(ch==')' && top!='(')
                    return false;
                if(ch=='}' && top!='{')
                    return false;
                if(ch==']' && top!='[')
                    return false;
            }
        }
        return stack.isEmpty();
    }
}