package practiceCoding;

import java.util.HashMap;
import java.util.Map;

public class CompareMap {

	public static boolean isAnagram(String input1, String input2) {
		Map<Character,Integer> map1=new HashMap<Character,Integer>();
	      Map<Character,Integer> map2=new HashMap<Character,Integer>();
	      
	      for(int i=0;i<input1.length();i++)
	      {
	        if(map1.containsKey(input1.charAt(i))){
	        	Integer value = map1.get(input1.charAt(i));
	        	map1.put(input1.charAt(i), value+1);
	        	
	        }else {
	        	map1.put(input1.charAt(i), 1);
	        	
	        }
	      }
	        for(int i=0;i<input2.length();i++)
		      {
		        if(map2.containsKey(input2.charAt(i))){
		        	Integer value = map2.get(input2.charAt(i));
		        	map2.put(input2.charAt(i), value+1);
		        	
		        }else {
		        	map2.put(input2.charAt(i), 1);
		        	
		        }
		      }
	        if(map1.equals(map2))
	        {
	        	return true;
		
	}
	        return false;
	      
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 = "stop";
		String input2 = "posh";
		System.out.println("output: "+isAnagram(input1, input2));

	}

}
