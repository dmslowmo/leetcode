package uniqueMorseRepresentations;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    private static final String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    private static final Map<Character, Integer> index = new HashMap<Character, Integer>() {{
        for (char i = 'a'; i <= 'z'; i++) {
            put(i, (int)i - 97);
        }
    }};

    private int uniqueMorseRepresentations(String[] words) {
        Set<String> uniqueMorseWords = new HashSet<>();

        String morseWord = "";
        for (String word : words) {
            for (Character c : word.toCharArray()) {
                morseWord += morse[index.get(c)];
            }
            uniqueMorseWords.add(morseWord);
            morseWord = "";
        }

        return uniqueMorseWords.size();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println( 2 == s.uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));
    }
}
