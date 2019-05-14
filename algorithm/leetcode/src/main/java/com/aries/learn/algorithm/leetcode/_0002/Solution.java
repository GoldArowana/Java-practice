package com.aries.learn.algorithm.leetcode._0002;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode tmp = head;

        int flag = 0;
        int ret;
        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                ret = l1.val + l2.val + flag;
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 != null) {
                ret = l1.val + flag;
                l1 = l1.next;
            } else {
                ret = l2.val + flag;
                l2 = l2.next;
            }

            if (ret >= 10) {
                flag = 1;
                ret -= 10;
            } else {
                flag = 0;
            }
            ListNode curr = new ListNode(ret);
            tmp.next = curr;
            tmp = tmp.next;
        }

        if (flag == 1) {
            ListNode curr = new ListNode(1);
            tmp.next = curr;
        }
        return head.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}