package ransomnote;

import java.util.ArrayList;
import java.util.List;

/**
 * Given  an  arbitrary  ransom  note  string  and  another  string  containing  letters from  all  the  magazines, 
 * write  a  function  that  will  return  true  if  the  ransom   note  can  be  constructed  from  the  magazines ;
 *  otherwise,  it  will  return  false.
 * <p>
 * Each  letter  in  the  magazine  string  can  only  be  used  once  in  your  ransom  note.
 * <p>
 * Note:
 * You may assume that both strings contain only lowercase letters.
 * <p>
 *
 * canConstruct("a", "b") -> false
 * canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 * Created by dmartana on 20/10/16.
 */
public class Solution {
	public boolean canConstruct(String ransomNote, String magazine) {
		if (ransomNote.length() > magazine.length()) {
			return false;
		}
		if (ransomNote.equals(magazine)) {
			return true;
		}

		List<Character> rnote = new ArrayList<>();
		for (int i = 0; i < ransomNote.length(); i++) {
			rnote.add(ransomNote.charAt(i));
		}
		List<Character> mag = new ArrayList<>();
		for (int i = 0; i < magazine.length(); i++) {
			mag.add(magazine.charAt(i));
		}
		List<Character> dup = new ArrayList<>();
		for (Character c : rnote) {
			if (mag.contains(c)) {
				dup.add(c);
				int index = mag.indexOf(c);
				mag.remove(index);
			}
		}
		if (dup.equals(rnote)) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.canConstruct("aa", "ab"));
		System.out.println(s.canConstruct("aa", "aab"));
		System.out.println(s.canConstruct("abb", "cacbcb"));
		System.out.println(s.canConstruct("fffbfg", "effjfggbffjdgbjjhhdegh"));
	}
}
