package com.github.guang19.leetcode.easy.实现strStr;

/**
 * @author guang19
 * @date 2020/5/27
 * @description 实现strStr函数
 * @since 1.0.0
 */
public class Solution
{
    public static int strStr(String source, String target)
    {
        if (source == null || target == null)
        {
            return -1;
        }
        if (target.equals(""))
        {
            return 0;
        }
        int i = 0 , j = 0;
        int sLen = source.length();
        int tLen = target.length();
        while (i < sLen && j < tLen)
        {
            if (source.charAt(i) == target.charAt(j))
            {
                ++i;
                ++j;
            }
            else
            {
                i = i - j + 1;
                j = 0;
            }
        }
        if (j == tLen)
        {
            return i - j;
        }
        return -1;
    }

    public static void main(String[] args)
    {
        System.out.println(strStr("hello","ll"));
    }
}
