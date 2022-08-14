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
        int count=0, midpos=0;
       ListNode temp=head;
        while(temp.next != null)
        {
            temp=temp.next;
            count++;
        }
        if(count%2==0)
            midpos=count/2;
        else
            midpos=count/2 + 1;
        int c=0;
        temp = head;
        while(c<midpos)
        {
          temp=temp.next; 
            c++;
        }
        return temp;
    }
}

// M 1- iterate over the list and find count, if even- mid=count/2, else count/2+1