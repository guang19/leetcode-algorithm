package com.github.guang19.leetcode.easy.搜索插入位置;

/**
 * @author guang19
 * @date 2020/5/27
 * @description 搜索插入位置
 * @since 1.0.0
 */
public class Solution
{

    public static int searchInsert(int[] nums, int target)
    {
        int betweenTargetIndex = 0;
        int len = nums.length;
        for (int i = 0 ; i < len; ++i)
        {
            if (nums[i] == target)
            {
                return i;
            }
            else if (nums[i] <= target && i + 1 < len && nums[i + 1] > target)
            {
                betweenTargetIndex = i + 1;
            }
            else if (nums[i] <= target && i + 1 >= len)
            {
                betweenTargetIndex = i + 1;
            }
        }
        return betweenTargetIndex;
    }

    public static void main(String[] args)
    {
//        int[] nums1 = {1,3,5,6};
//        int[] nums2 = {1,3,5,6};
//        int[] nums3 = {1,3,5,6};

//        System.out.println(searchInsert(nums2,7));
    }
}
