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
    public int digit(int sum){
        if(sum/10!=0)
        return 1;
        return 0;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res=null,curr=null;
        int rem=0;
        while(l1!=null&& l2!=null){
            int sum=l1.val+l2.val;
            if(rem!=0){
                sum+=rem;
                rem=0;
            }
            if(digit(sum)!=0){
                rem=sum/10;
                sum=sum%10;
            }
            ListNode newnode=new ListNode(sum,null);
            if(res==null){
                res=newnode;
                curr=res;
            }else{
                curr.next=newnode;
                curr=curr.next;
            }
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null || l2!=null){
            int sum=l1!=null?l1.val:l2.val;
            if(rem!=0){
                sum+=rem;
                rem=0;
            }
            if(digit(sum)!=0){
                rem=sum/10;
                sum=sum%10;
            }
            ListNode newnode=new ListNode(sum,null);
            curr.next=newnode;
            curr=curr.next;
            if(l1!=null) l1=l1.next;
            else l2=l2.next;
        }
        if(rem!=0){
            ListNode newnode=new ListNode(rem,null);
            curr.next=newnode;
        }
        return res;
    }
}