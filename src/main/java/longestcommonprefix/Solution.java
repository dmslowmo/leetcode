/**
 * 
 */
package longestcommonprefix;

/**
 * @author dmartana
 * Problem: Write a function to find the longest common prefix string amongst an array of strings.
 *
 */
public class Solution {

   public String longestCommonPrefix(String[] strs) {
      String commonPrefix = "";
      for (int i = 0; i < strs.length; i++) {
         if (i == 0) {
            commonPrefix = strs[i];
         }
         else {
            int rep = Math.min(commonPrefix.length(), strs[i].length());
            String temp = "";
            for (int j = 0; j < rep; j++) {
               char x = commonPrefix.charAt(j);
               if (x == strs[i].charAt(j)) {
                  temp += String.valueOf(x);
               }
               else if (j == 0) {
                  break;
               }
            }
            commonPrefix = temp;
         }
      }
      return commonPrefix;
   }

   /**
    * @param args
    */
   public static void main(String[] args) {
      String[] strs1 = {"hello", "hell", "hel", "he"};
      String[] strs2 = {"hello", "hell", "hel", "i"};
      String[] strs3 = {"he", "hello", "hel", "he"};
      String[] strs4 = {"aca", "cba"};
      Solution s = new Solution();
      System.out.println(s.longestCommonPrefix(strs1));
      System.out.println(s.longestCommonPrefix(strs2));
      System.out.println(s.longestCommonPrefix(strs3));
      System.out.println(s.longestCommonPrefix(strs4));
   }

}
