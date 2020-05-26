package com.github.guang19.leetcode.easy.删除排序数组中的重复项;

import java.util.Arrays;

/**
 * @author guang19
 * @date 2020/5/26
 * @description     删除排序数组中的重复项
 * @since 1.0.0
 */
public class Solution
{
    public static int removeDuplicates(int[] nums)
    {
        int cur = 0;
        //重复元素的指针
        int duplicationIndex = cur + 1;
        int len = nums.length;

        if (len == 0 || len == 1)
        {
            return len;
        }

        while (duplicationIndex < len)
        {
            if (nums[cur] == nums[duplicationIndex])
            {
                ++duplicationIndex;
            }
            else
            {
                for (int i = cur + 1; i < duplicationIndex; ++i)
                {
                    nums[i] = nums[duplicationIndex];
                }
                ++cur;
                duplicationIndex = cur + 1;
            }
        }
        return cur + 1;
    }

    public static void main(String[] args)
    {
        int[] nums1 = {1,1,2};
//        System.out.println(removeDuplicates(nums1));
//        System.out.println(Arrays.toString(nums1));

        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
//        System.out.println(removeDuplicates(nums2));
//        System.out.println(Arrays.toString(nums2));

        int[] nums3 = {1,2,2,2,3,4};
//        System.out.println(removeDuplicates(nums3));
//        System.out.println(Arrays.toString(nums3));

        int[] nums4 = {1,1};
//        System.out.println(removeDuplicates(nums4));
//        System.out.println(Arrays.toString(nums4));
    }
}
