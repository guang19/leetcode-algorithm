package com.github.guang19.leetcode.easy.整数反转;

/**
 * @author guang19
 * @date 2020/5/24
 * @description 整数反转
 * @since 1.0.0
 */
public class Solution
{
    public static int reverse(int x) {
        int rev  = 0, pop = 0;
        while (x != 0)
        {
            pop = x % 10;
            x /= 10;
            //超出最大值，溢出
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7))
            {
                return 0;
            }
            //低于最小值，溢出
            else if(rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop > 8))
            {
                return 0;
            }
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public static void main(String[] args)
    {
        System.out.println(reverse(123123));
    }
}
