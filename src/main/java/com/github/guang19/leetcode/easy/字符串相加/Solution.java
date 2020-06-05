package com.github.guang19.leetcode.easy.字符串相加;

/**
 * @author guang19
 * @date 2020/6/5
 * @description
 * @since 1.0.0
 */
public class Solution
{
    public static String addStrings(String num1, String num2)
    {
        StringBuilder result = new StringBuilder();
        int c1 = 0;
        int c2 = 0;
        int carry = 0;
        int cSum = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        while (i >= 0 && j >= 0)
        {
            c1 = num1.charAt(i) - 48;
            c2 = num2.charAt(j) - 48;
            cSum = c1 + c2 + carry;
            if (cSum>= 10)
            {
                carry = cSum / 10;
                result.append(cSum % 10);
            }
            else
            {
                carry = 0;
                result.append(cSum);
            }
            --i;
            --j;
        }
        while (i >= 0)
        {
            c1 = num1.charAt(i) - 48;
            cSum = c1 + carry;
            if (cSum>= 10)
            {
                carry = cSum / 10;
                result.append(cSum % 10);
            }
            else
            {
                carry = 0;
                result.append(cSum);
            }
            --i;
        }
        while (j >= 0)
        {
            c2 = num2.charAt(j) - 48;
            cSum = c2 + carry;
            if (cSum>= 10)
            {
                carry = cSum / 10;
                result.append(cSum % 10);
            }
            else
            {
                carry = 0;
                result.append(cSum);
            }
            --j;
        }
        if (carry > 0)
        {
            result.append(carry);
        }
        return result.reverse().toString();
    }

    public static void main(String[] args)
    {
        System.out.println(addStrings("94","6"));
    }
}
