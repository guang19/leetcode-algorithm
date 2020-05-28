package com.github.guang19.leetcode.easy.加一;

import java.util.Arrays;

/**
 * @author guang19
 * @date 2020/5/28
 * @description 加一
 * @since 1.0.0
 */
public class Solution
{
    public static int[] plusOne(int[] digits)
    {
        int len = digits.length;
        int curBit = len - 1;
        if (digits[curBit] < 9)
        {
            digits[curBit] = digits[curBit] + 1;
            return digits;
        }
        else
        {
            digits[curBit] = 0;
            --curBit;
            while (curBit >= 0)
            {
                if (digits[curBit] < 9)
                {
                    digits[curBit] = digits[curBit] + 1;
                    return digits;
                }
                else
                {
                    digits[curBit] = 0;
                    --curBit;
                }
            }
            ++curBit;
            //如果加完后，数组的第一位为0,就代表加之前的第一位是9,如此使得整体增加一位长度。
            if (digits[curBit] == 0)
            {
                int[] temp = new int[len + 1];
                System.arraycopy(digits,0,temp,1,len);
                temp[0] = 1;
                digits = temp;
            }
            return digits;
        }
    }

    public static void main(String[] args)
    {
        int[] nums1 = {1,2,3};
        int[] nums2 = {4,3,2,1};
        int[] nums3 = {4,3,2,9};
        int[] nums4 = {9,9,9,9};
        System.out.println(Arrays.toString(plusOne(nums4)));
    }
}
