package com.github.guang19.leetcode.easy.转换成小写字母;

/**
 * @author guang19
 * @date 2020/6/4
 * @description 转换成小写字母
 * @since 1.0.0
 */
public class Solution
{
    public static String toLowerCase(String str)
    {
        int c = ' ';
        StringBuilder sb = new StringBuilder();
        int len = str.length();
        for (int i = 0 ; i < len; ++i)
        {
            c = str.charAt(i);
            if (c >= 65 && c <= 90)
            {
                c = c + 32;
            }
            sb.append((char)c);
        }
        return sb.toString();
    }

    public static void main(String[] args)
    {
        System.out.println(toLowerCase("HASBD"));
    }
}
