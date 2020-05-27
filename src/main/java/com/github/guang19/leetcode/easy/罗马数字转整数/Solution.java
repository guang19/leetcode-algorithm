package com.github.guang19.leetcode.easy.罗马数字转整数;

import java.util.HashMap;
import java.util.Map;

/**
 * @author guang19
 * @date 2020/5/25
 * @description 罗马数组转整数
 * @since 1.0.0
 */
public class Solution
{

    private static Map<Character,Integer> romanNumMap = new HashMap<>();

    static
    {
        romanNumMap.put('I',1);
        romanNumMap.put('V',5);
        romanNumMap.put('X',10);
        romanNumMap.put('L',50);
        romanNumMap.put('C',100);
        romanNumMap.put('D',500);
        romanNumMap.put('M',1000);
    }

    public static int romanToInt(String romanNum)
    {
        int len = romanNum.length();
        int cur = 0;
        int sum = 0;

        int preNum = romanNumMap.get(romanNum.charAt(cur++));

        int curNum;
        while (cur < len)
        {
            curNum = romanNumMap.get(romanNum.charAt(cur++));
            if (preNum < curNum)
            {
                sum -= preNum;
            }
            else
            {
                sum += preNum;
            }
            preNum = curNum;
        }
        sum += preNum;
        return sum;
    }

    public static void main(String[] args)
    {
        System.out.println(romanToInt("IX"));
    }
}
