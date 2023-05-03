package practiceCoding;

public class ReverseEvenWords {
	/* Pseudo Code:
	 
	 * Declare the input as Follow
      		String test = "I am a software tester"; 
	a) split the words and have it in an array
	b) Traverse through each word (using loop)
	c) find the odd index within the loop (use mod operator)
	
	d)split the words and have it in an array
	
	e)print the even position words in reverse order using another loop (nested loop)
	f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
	
	 
*/

	public static void main(String[] args) {
		
		String test = "I am a software tester"; 
		String[] split = test.split(" ");
		int length = split.length;
        for (int i = 0; i < length; i++) {
        	if(i%2!=0) {
        		char[] charArray = split[i].toCharArray();
        		String rev = "";
        		for (int j = charArray.length-1; j>=0; j--) {
					rev= rev + charArray[j];
        			
				}
        		split[i] = rev;
        		
        	}
        	
			System.out.print(split[i]+" ");
		}	
		
		
		

	}

}
