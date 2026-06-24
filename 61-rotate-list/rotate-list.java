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
         if(head==null||head.next==null)
            {
                return head;
            }
            int n=0;
            ListNode temp=head;
            while(temp!=null)
            {
                n++;
                temp=temp.next;
            }
            k=k%n;
        for(int i=0;i<k;i++)
        {
            ListNode curr=head;
            ListNode prev=head;
           
            while(curr.next!=null)
            {
                curr=curr.next;
            }
            while(prev.next.next!=null)
            {
                prev=prev.next;
            }
            prev.next=null;
            curr.next=head;
            head=curr;
        }
        return head;
        
    }
}