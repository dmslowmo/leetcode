package linesToWriteString;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private static final Map<Character, Integer> index = new HashMap<Character, Integer>() {{
        for (char i = 'a'; i <= 'z'; i++) {
            put(i, (int)i - 97);
        }
    }};

    public int[] numberOfLines(int[] widths, String S) {
        if (S.length() == 0) return new int[]{0,0};
        int length = 0;
        int numOfLines = 1;
        char[] charr = S.toCharArray();
        for (char c : charr) {
            length += widths[index.get(c)];
            if (length > 100) {
                length = widths[index.get(c)];
                numOfLines++;
            }
        }
        return new int[]{numOfLines, length};
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = s.numberOfLines(new int[]{10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10},
        "abcdefghijklmnopqrstuvwxyz");
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
