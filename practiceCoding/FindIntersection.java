package practiceCoding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindIntersection {
	public static int[] arrayIntersection(int[] nums1, int[] nums2) {
		Set<Integer> set1 = new HashSet<Integer>();
		for (int no : nums1) {
			set1.add(no);
			
		}
		Set<Integer> set2 = new HashSet<Integer>();
		for (int nos : nums2) {
			if(set1.contains(nos)) {
				set2.add(nos);
			}
					
		}
		int l = set2.size();
		int[] output= new int[l];
		int i=0;
		for (int unique : set2) {
			output[i++] = unique;
			
		}
				
		return output;
	}

	public static void main(String[] args) {
		int[] num1 = {4,9,5};
		int[] num2 = {9,4,9,8,4};
		
		int[] result = arrayIntersection(num1,num2);
		System.out.println(Arrays.toString(result));

	}

}
