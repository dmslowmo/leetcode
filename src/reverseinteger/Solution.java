/**
 * 
 */
package reverseinteger;

/**
 * @author dmartana 
 * 
 * Reverse digits of an integer.
 * 
 * Example1: x = 123, return 321 
 * Example2: x = -123, return -321
 */
public class Solution {

   public int reverse(int x) {
      boolean sign = (x < 0);
      int temp = Math.abs(x);
      int reversed = 0;

      while (temp > 0) {
         if (reversed <= Integer.MAX_VALUE/10) {
            reversed *= 10;
         }
         else {
            return 0;
         }
         reversed += temp%10;
         temp /= 10;
      }
      
      return (sign ? -1 : 1) * reversed;
   }

   /**
    * @param args
    */
   public static void main(String[] args) {
      System.out.println(Integer.MAX_VALUE);
      Solution s = new Solution();
      System.out.println(s.reverse(1534236469));
      System.out.println(s.reverse(-123));
   }

}
