package com.github.guang19.leetcode.medium.不同路径;

import java.util.Arrays;

/**
 * @author guang19
 * @date 2020/6/4
 * @description 不同路径(二位数组动归)
 * @since 1.0.0
 */
public class Solution
{

    public static int uniquePaths(int m, int n)
    {
        int[][] grid = new int[n][m];
        for (int i = 0 ; i < n ; ++i)
        {
            for (int j = 0 ; j < m ; ++j)
            {
                //边界条件即 行或列为0的情况
                if (i == 0 || j == 0)
                {
                    grid[i][j] = 1;
                }
                else
                {
                    grid[i][j] = grid[i - 1][j] + grid[i][j - 1];
                }
            }
        }

        return grid[n - 1][m - 1];
    }

    public static void main(String[] args)
    {
        System.out.println(uniquePaths(3, 2));
        System.out.println(uniquePaths(7, 3));
    }
}
