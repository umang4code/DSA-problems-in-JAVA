/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode currA=A;
        ListNode currB=B;
        ListNode temp=null;
        ListNode h=(currA.val>currB.val)?currB:currA;
        while(currA!=null && currB!=null)
        {
            while(currA!=null &&currB!=null&&currA.val<=currB.val)
            {
                if(currA.next==null && currB!=null)
                {
                    currA.next=currB;
                    currA=null;
                    break;
                }
                else if(currA.next.val<=currB.val)
                    currA=currA.next;
                else if(currA.next.val>currB.val)
                {
                    temp=currA.next;
                    currA.next=currB;
                    currB=currB.next;
                    currA.next.next=temp;
                    currA=currA.next;
                }
            }
            while(currA!=null &&currB!=null&&currA.val>=currB.val)
            {
                if(currB.next==null&&currA!=null)
                {
                    currB.next=currA;
                    currB=null;
                    break;
                }
                else if(currB.next.val<=currA.val)
                    currB=currB.next;
                else if(currB.next.val>currA.val)
                {
                    temp=currB.next;
                    currB.next=currA;
                    currA=currA.next;
                    currB.next.next=temp;
                    currB=currB.next;
                }
            }
        }
        return h;
    }
}
