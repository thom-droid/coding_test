package ps.leet;

public class MergeTwoSortedList2 {

    public static void main(String[] args) {
        MergeTwoSortedList2.ListNode list1 = new MergeTwoSortedList2.ListNode(1);
        list1.next = new MergeTwoSortedList2.ListNode(2);
        list1.next.next = new MergeTwoSortedList2.ListNode(4);
        MergeTwoSortedList2.ListNode list2 = new MergeTwoSortedList2.ListNode(1);
        list2.next = new MergeTwoSortedList2.ListNode(3);
        list2.next.next = new MergeTwoSortedList2.ListNode(4);
        mergeTwoLists(list1, list2);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
        if(l1 == null) return l2;

        if(l2 == null) return l1;

        if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        else{
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public static class ListNode{
        int val;
        ListNode next;

        ListNode(){}

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, MergeTwoSortedList2.ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
