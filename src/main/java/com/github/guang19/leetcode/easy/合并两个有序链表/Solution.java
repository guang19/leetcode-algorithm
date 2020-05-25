package com.github.guang19.leetcode.easy.合并两个有序链表;

/**
 * @author guang19
 * @date 2020/5/25
 * @description 合并两个有序链表
 * @since 1.0.0
 */
public class Solution
{
    public static class ListNode
    {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2)
    {
        if(list1 == null)
        {
            return list2;
        }
        if (list2 == null)
        {
            return list1;
        }
        ListNode orderListNode = null;
        ListNode temp = null;
        int val;
        while (list1 != null || list2 != null)
        {
            if (list1 != null && list2 != null)
            {
                if (list1.val <= list2.val)
                {
                    val = list1.val;
                    list1 = list1.next;
                }
                else
                {
                    val = list2.val;
                    list2 = list2.next;
                }
            }
            else if (list1 != null)
            {
                val = list1.val;
                list1 = list1.next;
            }
            else
            {
                val = list2.val;
                list2 = list2.next;
            }

            if (orderListNode == null)
            {
                orderListNode = new ListNode(val);
            }
            else
            {
                temp = orderListNode;
                ListNode tail = new ListNode(val);
                while (orderListNode.next != null)
                {
                    orderListNode = orderListNode.next;
                }
                orderListNode.next = tail;
                orderListNode = temp;
            }
        }
        return orderListNode;
    }

    public static void main(String[] args)
    {
        ListNode root1 = new ListNode(1);
        root1.next = new ListNode(2);
        root1.next.next = new ListNode(4);

        ListNode root2 = new ListNode(1);
        root2.next = new ListNode(3);
        root2.next.next = new ListNode(4);

        ListNode orderListNode = mergeTwoLists(root1, root2);

        while (orderListNode != null)
        {
            System.out.println(orderListNode.val);
            orderListNode = orderListNode.next;
        }
    }
}
