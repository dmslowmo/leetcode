/**
 * 
 */
package binarypalindrome;

/**
 * @author dmartana
 * Problem: determine if the integer's binary representation is a palindrome.
 * Assumption: the input is non-negative integer
 * Constraint: no conversion to String is allowed
 *
 */
public class Solution {

   public boolean isBinaryPalindrome(int num) {
      int temp = num;
      int reverse = 0;
      while (temp > 0) {
         reverse = reverse << 1; // "make space" for the new bit, shift all bits once to the left
         reverse |= 1 & temp;    // put LSB of original number to the reverse variable
         temp = temp >> 1;       // throw away the LSB by shifting right once
      }
      return reverse == num;
   }
   /**
    * @param args
    */
   public static void main(String[] args) {
      Solution s = new Solution();
      System.out.println(s.isBinaryPalindrome(5));
      System.out.println(s.isBinaryPalindrome(3));
      System.out.println(s.isBinaryPalindrome(4));
      System.out.println(s.isBinaryPalindrome(7));
      System.out.println(s.isBinaryPalindrome(Integer.valueOf("110011", 2).intValue()));
   }

}
