/**
 * 
 */
package removenthnodefromend;

import common.ListNode;

/**
 * @author dmartana Given a linked list, remove the nth node from the end of
 *         list and return its head.
 * 
 *         For example,
 * 
 *         Given linked list: 1->2->3->4->5, and n = 2.
 * 
 *         After removing the second node from the end, the linked list becomes
 *         1->2->3->5. 
 *         Note: Given n will always be valid. Try to do this in one
 *         pass.
 *
 */
public class Solution {

   public ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode trailer = new ListNode(head.val);
      trailer.next = head.next;
      int ptrGap = -1;
      int step = 0;
      for (ListNode leader = head; leader != null; leader = leader.next) {
         if (ptrGap == n) {
            trailer = trailer.next;
            step++;
            System.out.println("trailer is at " + trailer.val + ", travelled " + step + " step");
         }
         else {
            ptrGap++;
            System.out.println("trailer is at " + trailer.val + ", ptrGap = " + ptrGap);
         }
      }

      if (trailer.next != null) {
         if (step > 0) {
            trailer.next = trailer.next.next;
         }
         else if (step == 0) {
            if (n-ptrGap == 0) {
               head.next = head.next.next;
            }
            else if (n-ptrGap == 1) {
               head = head.next;
            }
         }
      }
      else {
         return null;
      }

      return head;
   }

   /**
    * @param args
    */
   public static void main(String[] args) {
      ListNode head = new ListNode(0);
      ListNode ptr = head;
      for (int i = 1; i < 1; i++) {
         ListNode n = new ListNode(i);
         ptr.next = n;
         ptr = ptr.next;
      }

      Solution s = new Solution();
      
      // test
      for (ListNode p = s.removeNthFromEnd(head, 1); p != null; p = p.next) {
         System.out.println(p.val);
      }
   }
}
