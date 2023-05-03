package practiceCoding;

import java.util.Iterator;

/*
* Pseudo code 

* a) Use the declared String text as input
	String text = "We learn java basics as part of java sessions in java week1";		
* b) Initialize an integer variable as count	  
* c) Split the String into array and iterate over it 
* d) Initialize another loop to check whether the word is there in the array
* e) if it is available then increase and count by 1. 
* f) if the count > 1 then replace the word as "" 

* g) Displaying the String without duplicate words	
*/


public class RemoveDuplicateWordUsingArray {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
        
        String[] split = text.split(" ");
        for (int i = 0; i < split.length; i++) {
        	
        	for(int j=i+1;j< split.length;j++) {
        		int count  =0;
        		if(split[i].equalsIgnoreCase(split[j])) {
        			count ++;
        		}
        	  if(count==1) {
        		  split[j]= " ";
        		  
        	  }
        		
        	}
        	
			
		}
        for (int i = 0; i < split.length; i++) {
        	
        	System.out.print (split[i]+ " ");
			
		}

	}

}
