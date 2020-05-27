package com.github.guang19.leetcode.easy.外观数列;

/**
 * @author guang19
 * @date 2020/5/27
 * @description 外观数列
 * @since 1.0.0
 */
public class Solution
{
    public static String countAndSay(int n)
    {
//        String n1 = "1";
//        String n2 = "11";
//        String n3 = "21";
//        String n4 = "1211";
//        String n5 = "111221";


        String result = "1";
        StringBuilder next = new StringBuilder();
        for (int i = 1 ; i < n; ++i)
        {
            char curNum = result.charAt(0) ;
            for (int index = 0 , tLen = result.length() , curCount = 0 ; ;)
            {
                if (curNum == result.charAt(index))
                {
                    ++index;
                    ++curCount;
                    if (index >= tLen)
                    {
                        next.append(String.format("%d%d", curCount, curNum - 48));
                        break;
                    }
                }
                else
                {
                    next.append(String.format("%d%d", curCount, curNum - 48));
                    curCount = 0;
                    curNum = result.charAt(index);
                }
            }
            result = next.toString();
            next = new StringBuilder();
        }
        return result;
    }


    public static void main(String[] args)
    {
        System.out.println(countAndSay(6));
    }
}
