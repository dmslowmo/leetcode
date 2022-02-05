package queriesOnPermutationWithKey;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Solution {
    public int[] processQueries(int[] queries, int m) {
        var pSet = new LinkedHashSet<Integer>();
        for (var i=0; i<m; i++) {
            pSet.add(m-i);
        }
        var position = new ArrayList<Integer>();
        var i = 0;
        for (var q : queries) {
            for (var num : pSet) {
                if (num == q) {
                    position.add(pSet.size() - i - 1);
                    break;
                }
                i++;
            }
            i = 0;

            pSet.remove(q);
            pSet.add(q);
        }

        return position.stream().mapToInt(x -> x).toArray();
    }
}
