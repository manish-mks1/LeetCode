// You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

// You may assume the two numbers do not contain any leading zero, except the number 0 itself.
/**
Example 1:
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]


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
