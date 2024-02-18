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
    public ListNode sortList(ListNode head) {
        
       if(head==null || head.next==null)
           return head;

        ListNode slow=head,fast=head.next;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }   
        
        ListNode Righthead=slow.next;
        slow.next=null;
        
        head=sortList(head);
        Righthead=sortList(Righthead);
        
        return sortList2(head, Righthead);
    }
    
    ListNode sortList2(ListNode head, ListNode Righthead)
    {
        ListNode temp=new ListNode();
        ListNode sorthead=temp;
        
        while(head!=null && Righthead!=null)
        {
            
            if(head.val>Righthead.val)
            {  sorthead.next=Righthead;
               sorthead=Righthead;
                Righthead=Righthead.next;
            }
            else
            {    sorthead.next=head;
                 sorthead=head;
                 head=head.next;
            }
        }
            
            while(head!=null)
            {
                sorthead.next=head;
                 sorthead=head;
                 head=head.next;
            }
            
            while(Righthead!=null)
            {  sorthead.next=Righthead;
               sorthead=Righthead;
                Righthead=Righthead.next;
            }
            
             return temp.next;
    }
}