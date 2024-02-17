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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode n1 = head;
        int i=0;
        
        while(n1!=null)
        {
            i++;
            n1=n1.next;
        }
        
        int j=i-n;
        if(j==0)
        {
            head=head.next;
            return head;
        }
        i=0;
        n1=head;
        
        
        
        while(i<j-1)
        {
            i++;
            n1=n1.next;
        }
        n1.next=n1.next.next;
        return head;
        
    }
}