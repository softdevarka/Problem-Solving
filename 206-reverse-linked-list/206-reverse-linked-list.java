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
public ListNode reverseList(ListNode head) {
if (head == null || head.next == null){
return head;
}
ListNode p = head;
ListNode q = p.next;
ListNode r = q.next;
while(q!=null){
q.next = p;
p = q;
q = r;
if (r!=null){
r = r.next;
}
}
head.next = null;
head = p;
return head;
}
}