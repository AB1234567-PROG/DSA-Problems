/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int i=0, j=0;
        ListNode n1=new ListNode();
        ListNode n2=new ListNode();

        n1=headA;
        n2=headB;

        while(n1!=null)
        {
            i++;
            n1=n1.next;
        }

        while(n2!=null)
        {
            j++;
            n2=n2.next;
        }
        
        int diff=0;
        if(i>j)
         diff=i-j;
        else
         diff=j-i;

        n1=headA;
        n2=headB;
        

        if(i>j)
        {
            i=0;
            while(i<diff)
            {
               n1=n1.next;
               i++;
            }
        }
        else
        {
            j=0;
            while(j<diff)
            {
               n2=n2.next;
               j++;
            }
        }
        
        while(n1!=null && n2!=null)
        {
            if(n1==n2)
            return n1;
            n1=n1.next;
            n2=n2.next;
            
        }
        return null;
    }
}