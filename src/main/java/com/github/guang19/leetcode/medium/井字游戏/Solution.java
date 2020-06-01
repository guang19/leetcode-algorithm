package com.github.guang19.leetcode.medium.井字游戏;

/**
 * @author guang19
 * @date 2020/6/1
 * @description 井字游戏
 * @since 1.0.0
 */
public class Solution
{
    public static String tictactoe(String[] board)
    {
        int len = board.length;
        if (len == 1)
        {
            return board[0];
        }

        //是否有空格
        boolean flag = false;
        char s = ' ';

        //行
        for (int i = 0 ; i < len; ++i)
        {
            for (int j = 0; j < len ; ++j)
            {
                if (j + 1 < len)
                {
                    if ((s = board[i].charAt(j)) != board[i].charAt(j + 1))
                    {
                        break;
                    }
                    if (s == ' ')
                    {
                        flag = true;
                        break;
                    }
                }
                if (j == len - 1)
                {
                    return String.valueOf(s);
                }
            }
        }
        //列
        for (int i = 0 ; i < len; ++i)
        {
            for (int j = 0; j < len ; ++j)
            {
                if (j + 1 < len)
                {
                    if ((s = board[j].charAt(i)) != board[j + 1].charAt(i))
                    {
                        break;
                    }
                    if (s == ' ')
                    {
                        flag = true;
                        break;
                    }
                }
                if (j == len - 1)
                {
                    return String.valueOf(s);
                }
            }
        }


        //斜: 斜线分为左斜线和右斜线
        //左斜线
        for (int i = 0 ; i < len ; ++i)
        {
            if (i + 1 < len)
            {
                if ((s = board[i].charAt(i)) != board[i + 1].charAt(i + 1))
                {
                    break;
                }
                if (s == ' ')
                {
                    flag = true;
                    break;
                }
            }
            if (i == len - 1)
            {
                return String.valueOf(s);
            }
        }

        //右斜线
        for (int i = len - 1 , j = 0 ; i >=0 && j < len ; --i,++j)
        {
            if (i - 1 >= 0 && j + 1 < len)
            {
                if ((s = board[j].charAt(i)) != board[j + 1].charAt(i - 1))
                {
                    break;
                }
                if (s == ' ')
                {
                    flag = true;
                    break;
                }
            }
            if (i == 0 && j == len - 1)
            {
                return String.valueOf(s);
            }
        }
        if (flag)
        {
            return "Pending";
        }
        return "Draw";
    }


    public static void main(String[] args)
    {
        //[" O    X"," O     ","     O ","XXXXXXX","  O    "," O   O ","O  X OO"]
        String[] str = {
                " O    X",
                " O     ",
                "     O ",
                "XXXXXXX",
                "  O    ",
                " O   O ",
                "O  X OO"
        };
        System.out.println(tictactoe(str));
        System.out.println(tictactoe(str).length());
    }
}
