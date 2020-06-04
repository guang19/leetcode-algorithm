package com.github.guang19.leetcode.medium.和为K的最少斐波那契数字数目;

import java.util.*;

/**
 * @author guang19
 * @date 2020/6/4
 * @description  和为 K 的最少斐波那契数字数目
 * @since 1.0.0
 */
public class Solution
{
    public static int findMinFibonacciNumbers(int k)
    {
        if (k == 1 || k == 2)
        {
            return 1;
        }
        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(1);
        fibonacci.add(1);
        for (int i = 2 ;i <= k ; ++i)
        {
            fibonacci.add(fibonacci.get(i - 1) + fibonacci.get(i - 2));

            if (fibonacci.get(i) >= k)
            {
                break;
            }
        }
        int count = 0;
        for (int i = fibonacci.size() - 1; i >= 0 ; --i)
        {
            if (fibonacci.get(i) <= k)
            {
                ++count;
                k -= fibonacci.get(i);
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        System.out.println(findMinFibonacciNumbers(7));
    }
}
