package com.github.guang19.leetcode.easy.最大子序和;

/**
 * @author guang19
 * @date 2020/5/28
 * @description 最大子序和
 * @since 1.0.0
 */
public class Solution
{
    public static int maxSubArray(int[] nums)
    {
        int len = nums.length;
        if (len == 0)
        {
            return 0;
        }
        if (len == 1)
        {
            return nums[0];
        }
        //假设最大自序和为 nums[0]
        int maxSum = nums[0];
        int tSum = 0;
        for (int i = 0 ; i < len; ++i)
        {

            tSum = Math.max(tSum + nums[i],nums[i]);
            if (tSum > maxSum)
            {
                maxSum = tSum;
            }

        }
        return maxSum;
    }

    public static void main(String[] args)
    {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
