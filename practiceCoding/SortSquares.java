package practiceCoding;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SortSquares {
	public static int[] mergeArrays(int[] nums1, int nums[]) {
		
		// write your code here
		Set<Integer> set =new TreeSet<Integer>();
//int length = nums1.length +nums.length;
  for(int i =0;i<nums1.length;i++){
    set.add(nums1[i]);
  }

for (int i = 0; i < nums.length; i++) {
	set.add(nums[i]);
	
	
}
  int n= set.size();
  int[] output =new int[n];
  int i=0;
  for(Integer no:set){
    output[i++] = no;
  }
    
return output;
}

	public static void main(String[] args) {
		int[] num1= {14,63,85,90,43,71};
		int[] num2 = {59,90,43,67,71,53,94};
		 int[] output = mergeArrays(num1,num2);
		 Arrays.toString(output);
		 System.out.println(Arrays.toString(output));

	}

}
