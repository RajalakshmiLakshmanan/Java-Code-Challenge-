package practiceCoding;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MaxCountOfChar {
	public static char mostDuplicate(String input) {
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		int maxCount =0;
		char out = '\0';
		for(int i=0;i<input.length();i++) {
			if(map.containsKey(input.charAt(i))) {
				Integer value = map.get(input.charAt(i));
				map.put(input.charAt(i), value+1);
				
			}else {
				map.put(input.charAt(i), 1);
			}
			
		}
		
		for(Entry<Character, Integer> mapset : map.entrySet()) {
			if(mapset.getValue()>0) {
			out=mapset.getKey();
			maxCount = mapset.getValue();
			
		}
		}
      return out;
}

	public static void main(String[] args) {
		String s= "HelloWorld";
          System.out.println(mostDuplicate(s));
	}

}
