/**
 * 
 */
package addtwonumbers;

import common.ListNode;

/**
 * @author dmartana
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

   Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
   Output: 7 -> 0 -> 8
 *
 */
public class Solution {

   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode p1 = l1;
      ListNode p2 = l2;
      ListNode digit = null;
      ListNode result = null;
      int carry = 0;
      while (p1 != null && p2 != null) {
         int sum = p1.val + p2.val + carry;
         if (digit == null) {
            digit = new ListNode((sum)%10);
            result = digit;
         }
         else {
            digit.next = new ListNode(sum%10);
            digit = digit.next;
         }
         carry = sum/10;
         p1 = p1.next;
         p2 = p2.next;
      }

      ListNode theRest = null;
      if (p1 != null) theRest = p1;
      else theRest = p2;
      
      if (theRest == null) {
         if (carry > 0) {
            digit.next = new ListNode(carry);
         }
      }

      while (theRest != null) {
         if (carry > 0) {
            int sum = theRest.val + carry;
            theRest.val = sum%10;
            carry = sum/10;
         }
         digit.next = theRest;
         digit = digit.next;
         theRest = theRest.next;
      }
      
      if (carry > 0) {
         digit.next = new ListNode(carry);
      }

      return result;
   }
 
   /**
    * @param args
    */
   public static void main(String[] args) {
      ListNode num1 = new ListNode(1);
      ListNode ptr1 = num1;
//      for (int i = 3; i < 5; i++) {
//         ListNode n = new ListNode(i);
//         ptr1.next = n;
//         ptr1 = ptr1.next;
//      }
      ListNode num2 = new ListNode(9);
      ListNode ptr2 = num2;
      for (int i = 9; i < 10; i++) {
         ListNode n = new ListNode(i);
         ptr2.next = n;
         ptr2 = ptr2.next;
      }

      Solution s = new Solution();
      ListNode result = s.addTwoNumbers(num1, num2);
      ListNode p = result;
      while (p != null) {
         System.out.print(p.val);
         p = p.next;
      }
      System.out.println();
   }
}
