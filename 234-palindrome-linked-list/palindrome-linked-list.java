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
    public boolean isPalindrome(ListNode head) {
        
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null&&fast.next.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode first=head;
        ListNode second=reverse(slow);
        ListNode temp=second;
        while(temp!=null&&first!=null)
        {
            if(temp.val!=first.val)
            {
                return false;
            }
            temp=temp.next;
            first=first.next;
        }
        return true;
        
        
    }
    public static ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        while(head!=null)
        {
            ListNode next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    } 
}