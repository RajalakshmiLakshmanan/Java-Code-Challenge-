package practiceCoding;

import java.util.Iterator;

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


public class ReturnFirstUniqueIndex {
	
	public static int returnUniqueIndex(String s) {
		
		int charCount[] = new int[256];
		char[] charArray = s.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			charCount[charArray[i]]++;
			
		}
		
		for (int i = 0; i < charArray.length; i++) {
			
			if(charCount[charArray[i]]==1) {
				return i;
				
			}
			
		}
		return-1;
		
	}

	public static void main(String[] args) {
		
	String s = "aabb";
	System.out.println("output: "+returnUniqueIndex(s));	

	}

}
