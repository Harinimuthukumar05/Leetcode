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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)return head;
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode temp=head;
        ListNode prev=dummy;
        while(temp!=null){
            if(temp.val!=val){
                temp=temp.next;
                prev=prev.next;
            }
            else{
                prev.next=temp.next;
                temp=temp.next;
            }
        }
        return dummy.next;
    }
}