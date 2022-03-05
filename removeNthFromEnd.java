class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int counter2=n,counter1=n;
        ListNode pointerone=head,pointertwo=head;
        for(int i=counter1;i>0;i--){
            pointerone=pointerone.next;
        }
        if(pointerone==null){return pointertwo.next;}
        while(pointerone.next!=null){
            pointertwo=pointertwo.next;
            pointerone=pointerone.next;
        }
        pointertwo.next=pointertwo.next.next;
        return head;
    }
}

//Using Two pointers
