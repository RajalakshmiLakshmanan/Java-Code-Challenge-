package practiceCoding;

import java.util.Arrays;

public class RemoveChar {
	public static String removeChar(String str, char ch) {
		
		// write your code here
		char[] array = str.toCharArray();
		String output = "";
  for(int i=0;i<array.length;i++){
    if(array[i]==ch){
      array[i]='\0';
    }
    	output = output+ array[i];
    	
  }
 String placeAll = output.replaceAll("[^a-z]","");
     //Arrays.toString(array);
    return placeAll;
    

}

	public static void main(String[] args) {
		String s = "testleaf";
		char c= 't';
		
		System.out.println("output:"+removeChar(s,c));
	}

}
