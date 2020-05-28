package com.github.guang19.leetcode.easy.最后一个单词的长度;

/**
 * @author guang19
 * @date 2020/5/28
 * @description 最后一个单词的长度
 * @since 1.0.0
 */
public class Solution
{
    public static int lengthOfLastWord(String s)
    {
        if (s == null || s.length() == 0 || s.trim().length() == 0)
        {
            return 0;
        }
        int len = s.length();
        String lastWord = "";
        String preWord = "";
        int i = 0;
        char c;
        while (i < len)
        {
            if ((c = s.charAt(i)) != ' ')
            {
                lastWord += c;
            }
            else
            {
                if (!lastWord.equals(""))
                {
                    preWord = lastWord;
                    lastWord = "";
                }
            }
            ++i;
        }

        return lastWord.equals("") ? preWord.length() : lastWord.length();
    }

    public static void main(String[] args)
    {
        System.out.println(lengthOfLastWord("Hello World!"));
    }
}
