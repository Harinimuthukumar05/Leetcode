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
        if(head==null || head.next==null || k==0)return head;
        int count=0;
        ListNode temp1=head;
        ListNode temp2=head;
        while(temp1!=null){
            count++;
            temp1=temp1.next;
        }
        k=k%count;
        int stop=count-k-1;

        while(temp2.next!=null){
            temp2=temp2.next;
        }
        temp2.next=head;
        ListNode newTail=head;
        for(int i=0;i<stop;i++){
            newTail=newTail.next;
        }
        ListNode newHead=newTail.next;
        newTail.next=null;
        return newHead;
    }
}