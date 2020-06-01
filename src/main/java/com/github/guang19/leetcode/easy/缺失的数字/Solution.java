package com.github.guang19.leetcode.easy.缺失的数字;

/**
 * @author guang19
 * @date 2020/6/1
 * @description 缺失的数字
 * @since 1.0.0
 */
public class Solution
{
    public static int missingNumber(int[] nums)
    {
        int len = nums.length;
        int mid = nums[len - 1] >> 1;
        int start = 0;
        if (nums[mid] == mid)
        {
            start = mid + 1;
        }
        for (int i = start; i < len ; ++i)
        {
            if (nums[i] != i)
            {
                return i;
            }
        }
        return len;
    }

    public static void main(String[] args)
    {
        int[] nums = {0,1,2,3,4,5,6,7,9};
        System.out.println(missingNumber(nums));
    }
}
