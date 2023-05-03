package practiceCoding;
//A distinct string is a string that is present only once in an array.
//
//Given an array of strings arr, and an integer k, return the kth distinct string present in arr. If there are fewer than k distinct strings, return an empty string "".
//
//Note that the strings are considered in the order in which they appear in the array.
//
// 
//
//Example 1:
//
//Input: arr = ["d","b","c","b","c","a"], k = 2
//Output: "a"
//Explanation:
//The only distinct strings in arr are "d" and "a".
//"d" appears 1st, so it is the 1st distinct string.
//"a" appears 2nd, so it is the 2nd distinct string.
//Since k == 2, "a" is returned. 
//Example 2:
//
//Input: arr = ["aaa","aa","a"], k = 1
//Output: "aaa"
//Explanation:
//All strings in arr are distinct, so the 1st string "aaa" is returned.

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class JavaChallenge17 {
	
	public static String findKthDisinctString(String[] arr,int k) {
		Map<String,Integer> map = new LinkedHashMap<String,Integer>();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])) {
				Integer value = map.get(arr[i]);
				map.put(arr[i], value+1);
			}else {
				map.put(arr[i],1 );
				
			}
			
				}
		System.out.println(map);
				for(Map.Entry<String, Integer> entrySet: map.entrySet()) {
					
					if(entrySet.getValue()==1) {
						count++;
					}
					if(count==k) {
						return entrySet.getKey();
						
					}
					
				}
			
			
				return "";
		
	}

	public static void main(String[] args) {
		String[] arr = {"aaa","aa","a"};
		int k= 1;
		System.out.println("output: "+findKthDisinctString(arr,k));
		

	}

}
