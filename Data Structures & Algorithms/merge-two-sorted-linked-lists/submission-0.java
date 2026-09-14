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
      ListNode newList = new ListNode();
      ListNode curr = newList;
      while(list1 != null && list2 != null){

        if(list1.val < list2.val){
            ListNode n = new ListNode(list1.val);
            curr.next = n;
            curr = curr.next;

            list1 = list1.next;
        }else{
            ListNode n2 = new ListNode(list2.val);
            curr.next = n2;
            curr = curr.next;

            list2 = list2.next;
        }

      }  

        if(list1 != null){
            while(list1 != null){
                ListNode n = new ListNode(list1.val);
                curr.next = n;
                curr = curr.next;

                list1 = list1.next;
            }
        }

        if(list2 != null){
            while(list2 != null){
                ListNode n2 = new ListNode(list2.val);
                curr.next = n2;
                curr = curr.next;

                list2 = list2.next;
            }
        }

        newList = newList.next;
        return newList;


    }
}