package practiceCoding;
//Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.
//
//Return the largest lucky integer in the array. If there is no lucky integer return -1. 
//
//Example 1:
//
//Input: arr = [2,2,3,4]
//Output: 2
//Explanation: The only lucky number in the array is 2 because frequency[2] == 2.
//Example 2:
//
//Input: arr = [1,2,2,3,3,3]
//Output: 3
//Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.
//Example 3:
//
//Input: arr = [2,2,2,3,3]
//Output: -1
//Explanation: There are no lucky numbers in the array.

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;



public class JavaChallenge15 {
	public static int findLuckyNum(int[] num) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		List<Integer> list = new LinkedList<Integer>();
		 int luckynum = -1;
		for (int i = 0; i < num.length; i++) {
			if(map.containsKey(num[i])) {
				Integer value = map.get(num[i]);
				map.put(num[i], value+1);
				
			}else {
				
				map.put(num[i], 1);
			}
		}
		System.out.println(map);
		System.out.println(map.keySet());
		for (int key : map.keySet()) {
			//System.out.println(key);
			if(map.get(key)==key) {
			
				list.add(key);	
			}
			
		}
		System.out.println(list);
		Collections.sort(list);
		if(!list.isEmpty()) {
	    luckynum = list.get(list.size() - 1);
		return luckynum;
	}
		
		return luckynum;
	}

	public static void main(String[] args) {
		int[] arr = {2,2,2,3,3};
		System.out.println("output:"+findLuckyNum(arr));
		
	}

}
