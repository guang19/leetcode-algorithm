package com.github.guang19.leetcode.medium.递减元素使数组呈锯齿状;

import java.util.Arrays;

/**
 * @author guang19
 * @date 2020/6/2
 * @description 递减元素使数组呈锯齿状
 * @since 1.0.0
 */
public class Solution
{
    public static int movesToMakeZigzag(int[] nums)
    {

        int len = nums.length;
        int[] temp = Arrays.copyOf(nums, len);

        int count1 = 0;
        int count2 = 0;
        int left  = 0;
        int right  = 0;

        //偶数索引
        for (int i = 0 ; i < len; ++i)
        {
            if (i % 2 == 0)
            {
                if (i - 1 >= 0)
                {
                    if (temp[i] <= temp[i - 1])
                    {
                        left = temp[i - 1] - temp[i] + 1;
                        temp[i - 1] = temp[i - 1] - left;
                    }
                }
                if (i + 1 < len)
                {
                    if (temp[i] <= temp[i + 1])
                    {
                        right = temp[i + 1] - temp[i] + 1;
                        temp[i + 1] = temp[i + 1] - right;
                    }
                }
                count1 = count1 + left + right;
            }
            left = right = 0;
        }

        left = right = 0;

        //奇数索引
        for (int i = 1 ; i < len ; ++i)
        {
            if (i % 2 != 0)
            {
                if (i - 1 >= 0)
                {
                    if (nums[i] <= nums[i - 1])
                    {
                        left = nums[i - 1] - nums[i] + 1;
                        nums[i - 1] = nums[i - 1] - left;
                    }
                }
                if (i + 1 < len)
                {
                    if (nums[i] <= nums[i + 1])
                    {
                        right = nums[i + 1] - nums[i] + 1;
                        nums[i + 1] = nums[i + 1] - right;
                    }
                }
                count2 = count2 + left + right;
            }
            left = right = 0;
        }

        return Math.min(count1,count2);
    }

    public static void main(String[] args)
    {
        int[] nums1 = {1,2,3};
        int[] nums2 = {9,6,1,6,2};
        int[] nums3 = {7,4,8,9,7,7,5};
        System.out.println(movesToMakeZigzag(nums1));
        System.out.println(movesToMakeZigzag(nums2));
        System.out.println(movesToMakeZigzag(nums3));
    }
}
