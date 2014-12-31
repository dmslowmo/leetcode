/**
 * 
 */
package palindromenumber;

/**
 * @author dmartana
 * Determine whether an integer is a palindrome. Do this without extra space.
 *
 */
public class Solution {

   public boolean isPalindrome(int x) {
      int reverse = 0;
      int orig = x;

      while (orig > 0) {
         reverse *= 10;
         reverse += orig%10;
         orig /= 10;
      }

      return x == reverse;
   }

   /**
    * @param args
    */
   public static void main(String[] args) {
      Solution s = new Solution();
      System.out.println(s.isPalindrome(7874787));
   }

}
