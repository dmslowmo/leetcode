package replaceDigits;

public class Solution {
    private char[] alphabets = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    public String replaceDigits(String s) {
        char[] ca = s.toCharArray();
        for (var i=1; i<s.length(); i+=2) {
            ca[i] = shift(ca[i-1], ca[i]-'0');
        }
        return new String(ca);
    }

    private char shift(char c, int shiftBy) {
        return (char) (c + shiftBy);
    }
}
