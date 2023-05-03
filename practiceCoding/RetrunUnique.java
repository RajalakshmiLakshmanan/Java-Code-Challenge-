package practiceCoding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RetrunUnique {
	public static int[] duplicate(int[] num  ) {
		
		// write your code here
		Set<Integer> set = new HashSet<Integer>();
  Set<Integer> dupset = new HashSet<Integer>();
for(int i=0;i<num.length;i++){
if(!set.add(num[i])){
 dupset.add(num[i]);
}
  }
set.removeAll(dupset);
  int n=set.size();
  int[] output =new int[n];
 int i=0;
  for(Integer no:set){
    output[i++] = no;
  }
return output;
}
	public static Set<Character> removedup (String input) {
		
		// write your code here
  Set<Character> set = new HashSet<Character>();
  Set<Character> dupset = new HashSet<Character>();
		for(int i=0;i<input.length();i++){
          if(!set.add(input.charAt(i))) {
        	  dupset.add(input.charAt(i));
          }
        }
		set.removeAll(dupset);
  return set;

}
	public static Map<Integer,Integer> numberOfOccurance(int[] data) {
		
		// write your code here
  Map<Integer,Integer> map = new HashMap<Integer,Integer>();
  for(int i=0;i<data.length;i++){
    if(map.containsKey(data[i])) {
    	Integer value = map.get(data[i]);
    	map.put(data[i], value+1);
    }else {
    	map.put(data[i], 1);
    }
		

}
  return map;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] num= {1,2,2,1,3,4,1,1,2,2,5,1};
         int[] output = duplicate(num);
         System.out.println(Arrays.toString(output));
         String input = "amazon";
         System.out.println(removedup(input));
         System.out.println(numberOfOccurance(num));
	}

}
