package com.github.guang19.leetcode.easy.高度检查器;

import java.util.Arrays;

/**
 * @author guang19
 * @date 2020/6/1
 * @description 高度检查器
 * @since 1.0.0
 */
public class Solution
{
    public static int heightChecker(int[] heights)
    {
        int len = heights.length;
        heights.clone();
        int[] temp = Arrays.copyOf(heights,len);
        Arrays.sort(temp);
        int count = 0;
        for (int i = 0 ; i < len; ++i)
        {
            if (heights[i] != temp[i])
            {
                ++count;
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        int[] heights = {1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }
}
