package practiceCoding;
//You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.
//
//Return the sum of all the unique elements of nums.
//
//Example 1:
//
//Input: nums = [1,2,3,2]
//Output: 4
//Explanation: The unique elements are [1,3], and the sum is 4.
//Example 2:
//
//Input: nums = [1,1,1,1,1]
//Output: 0
//Explanation: There are no unique elements, and the sum is 0.
//Example 3:
//
//Input: nums = [1,2,3,4,5]
//Output: 15
//Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.

import java.util.HashSet;
import java.util.Set;

public class JavaChallenge18 {
	
	public static int findSumOfUniquenum(int[] num) {
		Set<Integer> set= new HashSet<Integer>();
		Set<Integer> dupSet= new HashSet<Integer>();
		int sum= 0;
		for (Integer value : num) {
			if(!set.add(value)) {
				dupSet.add(value);
			}
			
		}
		System.out.println(set);
	 set.removeAll(dupSet);
		int size = set.size();
		if(size > 1) {
			for (Integer integer : set) {
				sum= sum + integer;
			}
			 
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] num = {1,1,2,1,3};
		System.out.println("Output: "+findSumOfUniquenum(num));
		

	}

}
