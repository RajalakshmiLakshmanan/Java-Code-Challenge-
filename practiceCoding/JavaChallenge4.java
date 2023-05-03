package practiceCoding;
//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//
//You must implement a solution with a linear runtime complexity and use only constant extra space.
//
// 
//
//Example 1:
//
//Input: nums = [2,2,1]
//Output: 1
//Example 2:
//
//Input: nums = [4,1,2,1,2]
//Output: 4
//Example 3:
//
//Input: nums = [1]
//Output: 1

import java.util.HashSet;
import java.util.Set;

public class JavaChallenge4 {

	public static void main(String[] args) {
		int[] num = {1};
		Set <Integer> arraySet = new HashSet<Integer>();
		Set <Integer> dupSet = new HashSet<Integer>();
		 for (Integer integer : num) {
			 if(!(arraySet.add(integer))) {
				 dupSet.add(integer);
				 
			 }
			
		}
arraySet.removeAll(dupSet);
 System.out.println(arraySet);

	}

}
