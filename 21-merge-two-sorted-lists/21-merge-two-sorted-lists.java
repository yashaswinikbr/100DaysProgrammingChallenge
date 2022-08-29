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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       //Iterative
        ListNode p1=list1;
        ListNode p2=list2;
        ListNode head;
        ListNode tail;
        if(list1==null)
           return list2;
        if(list2==null)
            return list1;
        if(list1.val<list2.val)
        {
            head=list1;
            tail=list1;
            p1=p1.next;
        }
        else
        {
            head=list2;
            tail=list2;
            p2=p2.next;
        }
        while(p1!=null && p2!=null)
        {
            if(p1.val<p2.val)
            {
                tail.next=p1;
                p1=p1.next;
                tail=tail.next;
                
            }
            else
            {
                tail.next=p2;
                p2=p2.next;
                tail=tail.next;
                
            }
            
        }
        
    
      if(p1==null)
      {
          tail.next=p2;
      }
      if(p2==null)
    {
          tail.next=p1;
      }
    return head;
    }
}

// M2- recursive