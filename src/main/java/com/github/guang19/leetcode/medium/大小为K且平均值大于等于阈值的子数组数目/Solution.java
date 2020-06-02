package com.github.guang19.leetcode.medium.大小为K且平均值大于等于阈值的子数组数目;

/**
 * @author guang19
 * @date 2020/6/2
 * @description 大小为K且平均值大于等于阈值的子数组数目
 * @since 1.0.0
 */
public class Solution
{

    public static int numOfSubarrays(int[] arr, int k, int threshold)
    {
        int len = arr.length;
        int result = 0;

        int cur = 0;
        int curSum = 0;
        for (int i = 0 ; i < len ; ++i)
        {
            cur = 0;
            curSum = 0;
            if (i <= len - k)
            {
                while (cur < k)
                {
                    curSum += arr[i + cur];
                    ++cur;
                }
                if (curSum / k >= threshold)
                {
                    ++result;
                }
            }
            else
            {
                break;
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        int[] arr1 = {2,2,2,2,5,5,5,8};
        int[] arr2 = {1,1,1,1,1};
        int[] arr3 = {11,13,17,23,29,31,7,5,2,3};
        System.out.println(numOfSubarrays(arr1,3,4));
        System.out.println(numOfSubarrays(arr2,1,0));
        System.out.println(numOfSubarrays(arr3,3,5));
    }
}
