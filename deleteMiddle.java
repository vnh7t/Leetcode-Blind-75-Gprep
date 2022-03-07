class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode fast=head , slow=head;ListNode prevnode=null;
        while(fast.next!=null){
            fast=fast.next.next;
             prevnode=slow;
            slow=slow.next;
        }
        prevnode.next=prevnode.next.next;
        return head;
        
    }
}
