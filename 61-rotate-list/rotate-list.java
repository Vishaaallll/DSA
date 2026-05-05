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
        if(head == null || k ==0 || head.next == null) return head;
        int size = 1;
        ListNode temp = head;
        while(temp.next != null){
            size++;
            temp = temp.next;
        }
        temp.next = head;
        k = k% size;
        int n = size - k -1;
        ListNode temp1 = head;
        for(int i = 0; i<n; i++){
            temp1 = temp1.next;
        }
        head = temp1.next;
        temp1.next = null;

        return head;
            
        }

    }
