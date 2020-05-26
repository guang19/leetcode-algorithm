package com.github.guang19.leetcode.easy.移除元素;

/**
 * @author guang19
 * @date 2020/5/26
 * @description 移除元素
 * @since 1.0.0
 */
public class Solution
{

    public static int removeElement(int[] nums, int val)
    {
        int len = nums.length;
        if (len == 0)
        {
            return 0;
        }
        if (len == 1)
        {
            if (nums[0] == val)
            {
                return 0;
            }
            return 1;
        }
        int i = 0 ;
        int j = 0;
        while (j < len)
        {
            if (nums[j] != val)
            {
                nums[i] = nums[j];
                ++i;
                ++j;
            }
            else
            {
                ++j;
            }
        }
        return i ;
    }

    public static void main(String[] args)
    {
        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums,2));
    }
}
