package practiceCoding;
//Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
//
//Example 1:
//
//Input: s = "leetcode"
//Output: 0
//Example 2:
//
//Input: s = "loveleetcode"
//Output: 2
//Example 3:
//
//Input: s = "aabb"
//Output: -1

public class JavaChallenge8 {
	public static int findNonrepeatingChar(String s) {
		char[] charCount = new char[256];
		for (int i = 0; i < s.length(); i++) {
			charCount[s.charAt(i)]++;
			
		}
		for (int i = 0; i < s.length(); i++) {
			if(charCount[s.charAt(i)]==1) {
				return i;
				
			}
			
		}
		return -1;
	}
	

	public static void main(String[] args) {
		String s = "aabb";
		System.out.println("output:"+findNonrepeatingChar(s));
		
		
	}

}
