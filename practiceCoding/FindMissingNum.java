package practiceCoding;

import java.util.Iterator;

public class FindMissingNum {
	public static void missingNum(int num[]) {
		
		for (int i = 0; i < num.length; i++) {
			
			if(num[i]!=(i+1)) {
				System.out.println("missing number is:"+(i+1));
				
				break;
			}
			
		}
		
		
	}
	

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,6,7,9};
		missingNum(num);
		

	}

}
