package practiceCoding;
//Given an array nums of size n, return the majority element.
//
//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
//
//Example 1:
//
//Input: nums = [3,2,3]
//Output: 3
//Example 2:
//
//Input: nums = [2,2,1,1,1,2,2]
//Output: 2
public class JavaChallenge6 {

	public static void main(String[] args) {
		int [] num = {2,2,1,1,1,1,1,2,2};
		int length = num.length;
		for (int i = 0; i < length; i++) {
			int count=0;
			for (int j = i+1; j < length; j++) {
				if(num[i]==num[j]) {
					count++;
					
				}
			}
				if (count>=length/2) {
					System.out.println("output:"+ num[i]);
					break;
				}
			
			
		}
		
		
		
		
		
		

	}

}
