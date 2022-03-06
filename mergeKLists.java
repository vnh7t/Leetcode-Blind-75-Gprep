class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==1){
            return lists[0];
        }
        if(lists.length<1){
            return null;
        }
        for(int i=1; i<lists.length;i++){
            lists[0]=mergeTwoList(lists[0],lists[i]);
        }
        return lists[0];
    }
    public ListNode mergeTwoList(ListNode ls1,ListNode ls2){
        if(ls1 ==null){
            return ls2;
        }
        if(ls2 ==null){
            return ls1;
        }
        if(ls1.val<ls2.val){
            ls1.next=mergeTwoList(ls1.next,ls2);
            return ls1;
        }else{
            ls2.next=mergeTwoList(ls1,ls2.next);
            return ls2;
        }
    }
}
