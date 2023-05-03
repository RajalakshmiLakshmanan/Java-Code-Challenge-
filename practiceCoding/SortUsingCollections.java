package practiceCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		

// get the length of the array		

// sort the array			

// Iterate it in the reverse order

// print the array
	
// Required Output: Wipro, HCL , CTS, Aspire Systems


public class SortUsingCollections {
	
	public static void sortUsingSet(String[] compName) {
		Set<String> compSet = new TreeSet<String>();
        for (String string : compName) {
        	compSet.add(string);
			
		}
        System.out.println(compSet);
        List<String> compList =new ArrayList<String>(compSet);
        for (int i = compList.size()-1; i >=0; i--) {
        	
        	String string = compList.get(i);
        	System.out.print(","+string);
			
		}
		
		
	}
	

	public static void main(String[] args) {
		String[] compName = new String[4];
		compName[0]= "HCL";
		compName[1]= "Wipro";
		compName[2]= "AspireSystems";
		compName[3]= "CTS";
		int length = compName.length;
		Arrays.sort(compName);
        
        for (int i = length-1; i>=0; i--) {
        	
        	System.out.print(compName[i]+" ,");
			
		}
        sortUsingSet(compName);
        
	}

}
