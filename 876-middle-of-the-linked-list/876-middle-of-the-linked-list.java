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
    public ListNode middleNode(ListNode head) {
       ListNode slow=head;
        ListNode fast=head;
        while(fast !=null && fast.next !=null )
        {
            slow= slow.next;
            fast=fast.next.next;
        }
        

      return slow;  
    }
}

// M 1- iterate over the list and find count, if even- mid=count/2, else count/2+1
    // int count=0, midpos=0;
    //    ListNode temp=head;
    //     while(temp.next != null)
    //     {
    //         temp=temp.next;
    //         count++;
    //     }
    //     if(count%2==0)
    //         midpos=count/2;
    //     else
    //         midpos=count/2 + 1;
    //     int c=0;
    //     while(c<midpos)
    //     {
    //       head=head.next; 
    //         c++;
    //     }
    //     return head;

//M 2- 2 pointer approach- slow and fast pointer