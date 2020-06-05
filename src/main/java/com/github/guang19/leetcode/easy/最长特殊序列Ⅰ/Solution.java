package com.github.guang19.leetcode.easy.最长特殊序列Ⅰ;

/**
 * @author guang19
 * @date 2020/6/5
 * @description 最长特殊序列Ⅰ
 * @since 1.0.0
 */
public class Solution
{
    public static int findLUSlength(String a, String b)
    {
        if (a.equals(b))
        {
            return -1;
        }
        return Math.max(a.length(),b.length());
    }

    public static void main(String[] args)
    {
        System.out.println(findLUSlength("abc","cbc"));
    }
}
