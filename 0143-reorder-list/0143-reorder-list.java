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
class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }
        ListNode mid = findMid(head);
        ListNode h1 = head;
        ListNode h2 = reverse(mid.next);
        mid.next = null;
        while(h2!=null){
            ListNode temp1 = h1.next;
            ListNode temp2 = h2.next;
            h1.next = h2;
            h2.next = temp1;
            h1 = temp1;
            h2 = temp2;
        }
 
    }
    ListNode reverse(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode smallHead = reverse(head.next);
        ListNode tail = head.next;
        tail.next = head;
        head.next = null;
        return smallHead;
    }

    ListNode findMid(ListNode head){
        ListNode fast = head.next;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}