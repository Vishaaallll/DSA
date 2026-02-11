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
    public int gcd(int a , int b){
        if(b ==0){
            return Math.abs(a);
        }
        return gcd(b , a % b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;
        if(head.next == null) return head;
        while(temp.next != null ){
            int a = temp.val;
            int b = temp.next.val;
            ListNode node = new ListNode(gcd(a,b));

            node.next = temp.next;
            temp.next = node;

            temp = temp.next.next;
        }
        return head;
    }
}