package practiceCoding;
//You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
//
//Letters are case sensitive, so "a" is considered a different type of stone from "A".
//
//Example 1:
//
//Input: jewels = "aAb", stones = "aAAbbbb"
//Output: 3
//Example 2:
//
//Input: jewels = "z", stones = "ZZ"
//Output: 0

import java.util.ArrayList;
import java.util.List;

public class JavaChallenge9 {

	public static void main(String[] args) {
		String jewels = "c";
		String stones = "aAAbbbb";
		int count= 0;
		List<Character> charList = new ArrayList<Character>();
		for (int i = 0; i < stones.length(); i++) {
			charList.add(stones.charAt(i));
			
		}
		for (int i = 0; i < jewels.length(); i++) {
			if(charList.contains(jewels.charAt(i))) {
				count ++;
				
			}
			
		}
		System.out.println("output: "+count);
     
	}

}
