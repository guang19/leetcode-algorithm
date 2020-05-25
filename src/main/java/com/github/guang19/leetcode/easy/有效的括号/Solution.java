package com.github.guang19.leetcode.easy.有效的括号;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author guang19
 * @date 2020/5/25
 * @description 有效的括号
 * @since 1.0.0
 */
public class Solution
{

    private static char getCorresponding(char c)
    {
        switch (c)
        {
            case ')':
                return '(';
            case  '}':
                return '{';
            case ']':
                return '[';
            default:
                return ' ';
        }
    }

    public static boolean isValid(String s)
    {
        int len = s.length();
        if (len == 0)
        {
            return s.equals("");
        }
        else if(len == 2)
        {
            return getCorresponding(s.charAt(1)) == s.charAt(0);
        }
        else if (len % 2 != 0)
        {
            return false;
        }
        else
        {
           LinkedList<Character> characters = new LinkedList<>();
           int i = 0;
           while (i < len)
           {
               if (getCorresponding(s.charAt(i)) == ' ')
               {
                   characters.push(s.charAt(i));
               }
               else
               {
                   char c = characters.isEmpty() ? ' ' : characters.pop();
                   if (c != getCorresponding(s.charAt(i)))
                   {
                        return false;
                   }
               }
               ++i;
           }
           return characters.isEmpty();
        }
    }

    public static void main(String[] args)
    {
        System.out.println(isValid("{{[]}}"));
        System.out.println(isValid("(([]){})"));
    }
}
