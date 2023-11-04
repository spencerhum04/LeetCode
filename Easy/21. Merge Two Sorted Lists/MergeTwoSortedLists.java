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
        ListNode merged = new ListNode(-1);
        ListNode alt = merged;

        if(list1 == null) {
            return list2;
        }
        if(list2 == null) {
            return list1;
        }

        while(list1 != null && list2 != null) {
            if(list1.val > list2.val) {
                merged.next = list2;
                list2 = list2.next;
                merged = merged.next;
            }
            else {
                merged.next = list1;
                list1 = list1.next;
                merged = merged.next;
            }
        }

        // Sort and add all elements except largest
        while(list1 != null && list2 != null) {
            if(list1.val > list2.val) {
                merged.next = list2;
                list2 = list2.next;
                merged = merged.next;
            }
            else {
                merged.next = list1;
                list1 = list1.next;
                merged = merged.next;
            }
        }

        // Add largest element
        if(list1 != null){
            merged.next = list1;
            list1 = list1.next;
            merged = merged.next;
        }
        if(list2 != null){
            merged.next = list2;
            list2 = list2.next;
            merged = merged.next;
        }

        return alt.next;
    }
}
