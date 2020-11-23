package com.codecafe.leetcode.easy;

/*
Given a sorted linked list, delete all duplicates such that each element appear only once.

Example 1:
Input: 1->1->2
Output: 1->2

Example 2:
Input: 1->1->2->3->3
Output: 1->2->3

 */

class LinkedList {

    ListNode head;

    public static void insert(LinkedList list, int data) {

        ListNode newNode = new ListNode(data);
        newNode.next = null;

        if (list.head == null)
            list.head = newNode;
        else {
            ListNode lastNode = list.head;

            while (lastNode.next != null)
                lastNode = lastNode.next;

            lastNode.next = newNode;
        }
    }

    public static void printList(ListNode node) {

        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class RemoveDuplicatesFromSortedList_83 {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        LinkedList.insert(list, 1);
        LinkedList.insert(list, 1);
        LinkedList.insert(list, 2);
        LinkedList.insert(list, 3);
        LinkedList.insert(list, 3);

        LinkedList.printList(list.head);
        System.out.println();
        LinkedList.printList(deleteDuplicates(list.head));

    }

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode currentNode = head;

        while (currentNode != null && currentNode.next != null) {
            if (currentNode.val == currentNode.next.val) {
                currentNode.next = currentNode.next.next; // skip the duplicate node
            } else {
                currentNode = currentNode.next;
            }
        }

        return head;
    }
}