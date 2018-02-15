package majorityelement;

import java.util.HashMap;
import java.util.Map;

public class Solution {

   public int majorityElement(int[] num) {
      //1. create a map with the elements of num as the keys and their frequencies as the values
      //2. while any of the values have not occurred > n/2 times:
      //   2a. if element exists, increment the value
      //   2b. else if element does not exist, put '1'
      //3. if a value has occurred > n/2 times, then return it
      //Fringe cases:
      //a. the size of the element is <= 1
      //b. there is no element whose frequency is > n/2
      Map<Integer, Integer> map = new HashMap<Integer, Integer>();
      for (int element : num) {
         if(!map.containsKey(element)) {
            map.put(element, 1);
            if(num.length == 1) {
               return element;
            }
         }
         else {
            map.put(element, map.get(element) + 1);
            if (map.get(element) > num.length/2) {
               return element;
            }
         }
      }

      throw new RuntimeException("No majority element exists");
   }

   public static void main(String[] args) {
      Solution s = new Solution();
      System.out.println(s.majorityElement(new int[]{1,1,1,2,2,2,3,3,3,3,3,3,3}));
   }

}
