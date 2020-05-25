package com.github.guang19.leetcode.easy.回文数;

import java.util.LinkedList;
import java.util.List;

/**
 * @author guang19
 * @date 2020/5/24
 * @description 回文数
 * @since 1.0.0
 */
public class Solution
{
    //暴力解法
    public static boolean isPalindrome(int x)
    {
        if (x < 0)
        {
            return false;
        }
        int t = x;
        //使用栈存储整数的每一位，然后pop与x的每一位比较
        LinkedList<Integer> list = new LinkedList<>();
        while (t != 0)
        {
            list.push(t % 10);
            t /= 10;
        }
        while (!list.isEmpty())
        {
            if (list.pop() != (x % 10))
            {
                return false;
            }
            x /= 10;
        }
        return true;
    }


    //官方解法
    public static boolean isPalindrome2(int x)
    {
        //如果整数为负数 或者 整数的最后一位为0,直接就返回false
        if (x < 0 || (x != 0 && x % 10 == 0))
        {
            return false;
        }
        int rev = 0;
        while (x > rev)
        {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return rev == x || rev / 10 == x;
    }

    public static void main(String[] args)
    {
        System.out.println(isPalindrome(-1234321));
    }
}
