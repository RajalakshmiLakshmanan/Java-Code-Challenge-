package practiceCoding;
//Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
//
//Example 1:
//
//Input: nums = [1,2,3,1], k = 3
//Output: true
//Example 2:
//
//Input: nums = [1,0,1,1], k = 1
//Output: true
//Example 3:
//
//Input: nums = [1,2,3,1,2,3], k = 2
//Output: false


public class JavaChallenge7 {
	
	public static boolean isrepeated(int[] num,int k) {
		int i=0;
		while(i<num.length) {
			 int index = 0;
			for (int j = i+1; j < num.length; j++) {
				if(num[i]==num[j]) {
					 int value = Math.abs(i-j);
					 index= value;
					 break;
				}
			}
				if(index<=k) {
					return true;
					
				}else {
			
		      break;
				}
		
		}
		return false;
	}
		
		
	

	public static void main(String[] args) {
		int [] num= {1,0,1,1};
		int k=2;
		
		System.out.println("output: "+isrepeated(num,k));
		

	}

}
