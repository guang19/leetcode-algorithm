package com.github.guang19.leetcode.easy.反转字符串中的单词III;

/**
 * @author guang19
 * @date 2020/6/4
 * @description 反转字符串中的单词 III
 * @since 1.0.0
 */
public class Solution
{
    public static String reverseWords(String str)
    {
        StringBuilder temp = new StringBuilder("");
        StringBuilder result = new StringBuilder("");
        int i = 0;
        char c = ' ';
        int len = str.length();
        while (i < len)
        {
            c = str.charAt(i);
            if (c != ' ')
            {
                temp.append(c);
            }
            else
            {
                if (temp.length() > 0)
                {
                    result.append(temp.reverse());
                    temp.delete(0,temp.length());
                }
                result.append(' ');
            }
            ++i;
        }
        if (temp.length() > 0)
        {
            result.append(temp.reverse());
        }
        return result.toString();
    }


    public static void main(String[] args)
    {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
}
