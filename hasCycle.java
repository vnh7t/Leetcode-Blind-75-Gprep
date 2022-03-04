public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode pointerOne=head,pointerTwo=head;
        while(pointerOne!=null && pointerTwo!=null && pointerOne.next!=null && pointerTwo.next!=null){
            pointerOne=pointerOne.next;
            pointerTwo=pointerTwo.next.next;
            if(pointerOne==pointerTwo){
                return true;
            }
        }return false;
    }
}
