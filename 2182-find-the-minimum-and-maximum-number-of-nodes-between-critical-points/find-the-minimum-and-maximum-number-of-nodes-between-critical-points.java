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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return new int[]{-1, -1};
        }
        ListNode temp1 = head;
        ListNode temp2 = temp1.next;
        List<Integer> list = new ArrayList<>();
        int i = 2;
        while(temp2.next != null){
            if((temp1.val < temp2.val && temp2.val > temp2.next.val )||(temp1.val > temp2.val && temp2.val < temp2.next.val)){
                list.add(i);

            }
            temp1 = temp2;
            temp2 = temp2.next;
            i++;
        }
        if(list.size() < 2) return new int[]{-1,-1};
        int max = list.get(list.size()-1) - list.get(0);
        int min = Integer.MAX_VALUE;
        if(!list.isEmpty()){
            for (int j = 1; j < list.size(); j++) {
                min = Math.min(min, list.get(j) - list.get(j - 1));
            }
        }
         return new int[]{min,max};
    }
}