package com.github.guang19.leetcode.easy.两数之和;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author guang19
 * @date 2020/5/24
 * @description 两数之和
 * @since 1.0.0
 */
public class Solution
{
    //暴力解法
    public static int[] twoSum(int[] nums, int target)
    {
        int len = nums.length;
        for (int i = 0 ; i < len; ++i)
        {
            for (int j = i + 1; j < len; ++j)
            {
                if (nums[i] + nums[j] == target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    //一遍hash表
    public static int[] twoSum2(int[] nums , int target)
    {
        Map<Integer , Integer> integerMap = new HashMap<>();
        integerMap.put(nums[0],0);
        int temp;
        for (int i = 1 ;i < nums.length ; ++i)
        {
            temp = target - nums[i];
            if (integerMap.containsKey(temp))
            {
                return new int[]{integerMap.get(temp),i};
            }
            integerMap.put(nums[i],i);
        }
        return null;
    }

    public static void main(String[] args)
    {
        int[] nums = new int[]{2, 7, 11, 15};
//        System.out.println(Arrays.toString(twoSum(numbs,26)));
        System.out.println(Arrays.toString(twoSum2(nums,26)));
    }
}
