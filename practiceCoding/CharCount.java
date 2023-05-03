package practiceCoding;

public class CharCount {
	public static int charCounting(String s) {
		
		int count = 0;
		char[] charArray = s.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			
			if(charArray[i]=='a' ||charArray[i] == 'i') {
				count ++;
				
			}
			
			
		}
		
		return count;
		
		
	}
	
      
	public static void main(String[] args) {
		String s = "srivatsan";
		System.out.println("number of char 'a' and 'i'  in given string:"+charCounting(s));

	}

}
