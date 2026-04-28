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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        int length = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }
        int k_effective = k % length;
        if (k_effective == 0) {
            return head;
        }
        int steps_to_new_tail = length - k_effective;
        ListNode new_tail = head;
        for (int i = 0; i < steps_to_new_tail - 1; i++) {
            new_tail = new_tail.next;
        }
        ListNode new_head = new_tail.next;
        tail.next = head;
        new_tail.next = null;
        return new_head;
    }
}