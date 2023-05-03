package practiceCoding;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWord {
	
	/*
	 * Pseudo code 
	 * a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";
	 *
	 *Output= We learn java basics as part of sessions in week1
	 *
	 * Psuedocode
	 *
	 * b) Split the String based on white spaces and save as String Array ,Then iterate the Array	  
	 * c) Create a empty Set 
	 * d) Iterate the String array
                 d.1) add each word into Set
	 * e) Print the Set values which is having unique words
	 */
	
public static void removeDuplicate(String s) {
	
	String[] split = s.split(" ");
	for (int i = 0; i < split.length; i++) {
		for (int j =i+1; j < split.length-1; j++) {
			
			if(split[i].equals(split[j])) {
				split[j] = " ";
				
			}
			
		}
	}
		// we can't print the array in foreach loop statemnet;
//		for (String string : split) {
//			System.out.print(" "+string);
//			
//		}
		
		for (int j = 0; j < split.length; j++) {
			
			System.out.print(" "+split[j]);
			
		}
		
	
	
	
	
}
	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] split = text.split(" ");
		
		Set<String> senSet = new LinkedHashSet<String>();
		
		for (String string : split) {
			
			senSet.add(string);
			
		}
		Object[] array = senSet.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
			
		}

		System.out.println("********************");
		removeDuplicate(text);
		
		
	}

}
