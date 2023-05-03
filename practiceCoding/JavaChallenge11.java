package practiceCoding;
//Given an array of integers arr, return true if the number of occurrences of each value in the array is unique, or false otherwise.
//
//Example 1:
//
//Input: arr = [1,2,2,1,1,3]
//Output: true
//Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
//Example 2:
//
//Input: arr = [1,2]
//Output: false
//Example 3:
//
//Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
//Output: true

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JavaChallenge11 {

	public static void main(String[] args) {
		int[] arr = {1,2,2,1,1,3};
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();	
		Set<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])) {
				Integer value = map.get(arr[i]);
				map.put(arr[i], value+1);
				
			}else {
				map.put(arr[i], 1);
				
			}
			
			}
		System.out.println(map);
		for (Integer eachvalue : map.values()) {
			set.add(eachvalue);
			
		}
		System.out.println(set);
		if(set.size()==map.size()) {
			
			System.out.println("output: true");
		}else {
			
			System.out.println("ouput:false");
		}
			
	}

}
