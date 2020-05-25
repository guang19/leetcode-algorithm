package com.github.guang19.leetcode.easy.最长公共前缀;

/**
 * @author guang19
 * @date 2020/5/25
 * @description 最长公共前缀
 * @since 1.0.0
 */
public class Solution
{
    public static String longestCommonPrefix(String[] strs)
    {

        if (strs.length == 0)
        {
            return "";
        }
        else if (strs.length == 1)
        {
            return strs[0];
        }
        else
        {
            //longestCommonPrefixLen 就是公共最长字串的长度
            int longestCommonPrefixLen = 0;

            String preStr = strs[0];

            for (int i = 1 ; i < strs.length ; ++i)
            {
                if (preStr.length() <= 0 || strs[i].length() <= 0)
                {
                    return "";
                }
                else
                {
                    if (preStr.charAt(0) != strs[i].charAt(0))
                    {
                        return "";
                    }
                    else
                    {
                        int j = 1;
                        while (j < preStr.length() && j < strs[i].length())
                        {
                            if (preStr.charAt(j) == strs[i].charAt(j))
                            {
                                ++j;
                            }
                            else
                            {
                                break;
                            }
                        }
                        //如果 longestCommonPrefixLen 为 0 ，那么当前最长公共字串的长度就是 j , 否则取2者之间较小的那个
                        longestCommonPrefixLen = longestCommonPrefixLen > 0 ?  Math.min(longestCommonPrefixLen, j) : j;
                    }
                    preStr = strs[i];
                }
            }
            //随便选取一个字符串截取
            return strs[0].substring(0,longestCommonPrefixLen);
        }
    }

    public static void main(String[] args)
    {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
