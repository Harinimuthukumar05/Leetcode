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
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null)return head;
        ListNode dummy1=new ListNode(-1);
        ListNode small=dummy1;
        ListNode dummy2=new ListNode(-1);
        ListNode great=dummy2;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val<x){
                small.next=new ListNode(temp.val);
                small=small.next;
                }
            else{
                great.next=new ListNode(temp.val);
                great=great.next;
                }
                
                temp=temp.next;
        }
        small.next = dummy2.next;  
        return dummy1.next; 
    }
}