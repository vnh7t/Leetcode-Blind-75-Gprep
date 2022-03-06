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
    public void reorderList(ListNode head) {
        ListNode fast=head,slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
       
        fast=slow.next;
        slow.next=null;
        slow=head;
        fast=reverselist(fast);
        head=margetolist(slow,fast);
        
    }
    public ListNode margetolist(ListNode head1,ListNode curr2){
        ListNode curr=head1;
        while(curr2!=null){
            ListNode temp=curr.next;
            curr.next=curr2;
            curr=temp;
            
            ListNode temp2=curr2.next;
            curr2.next=temp;
            curr2=temp2;
            
            
        }
        return head1;
        
    }
     public ListNode reverselist(ListNode head){
        ListNode curr=head;
        ListNode reversed=null;
         while(curr!=null){
             ListNode temp;
             temp=curr.next;
             curr.next=reversed;
             reversed=curr;
             curr=temp;
         }
        return  reversed;
    }
}
