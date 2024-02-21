package ps.leet;

import java.util.LinkedList;

public class MergeTwoSortedList {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public static void main(String[] args) {
//        ListNode list1 = new ListNode(-9);
//        list1.next = new ListNode(3);
//        ListNode list2 = new ListNode(5);
//        list2.next = new ListNode(7);
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);



        ListNode result = mergeTwoLists(list1, list2);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head = new ListNode();
        ListNode result;
        result = head;

        if (list1 == null && list2 == null) {
            return null;
        } else if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        int head1 = list1.val;
        int head2 = list2.val;

        if (head1 <= head2) {
            head.val = head1;
            list1 = list1.next;
        } else {
            head.val = head2;
            list2 = list2.next;
        }

        while (list1 != null && list2 != null) {

            int node1 = list1.val;
            int node2 = list2.val;

            if (node1 <= node2) {
                head.next = new ListNode(node1);
                head = head.next;
                list1 = list1.next;
            } else {
                head.next = new ListNode(node2);
                head = head.next;
                list2 = list2.next;
            }

        }

        while (list1 != null) {
            head.next = new ListNode(list1.val);
            head = head.next;
            list1 = list1.next;
        }

        while (list2 != null) {
            head.next = new ListNode(list2.val);
            head = head.next;
            list2 = list2.next;
        }

        return result;
    }

    public static class ListNode{
        int val;
        ListNode next;

        ListNode(){}

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
