package practiceCoding;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PrintUniqueChar {

	public static void main(String[] args) {
		String s ="Pay Pal";
		char[] charArray = s.toCharArray();
		Set<Character> setChar  = new HashSet<Character>();
		Set<Character> dupChar  = new HashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			
			if(!(setChar.add(charArray[i]))) {
				dupChar.add(charArray[i]);
				
			}
			
		}
		
		setChar.removeAll(dupChar);
		for (Character character : setChar) {
			if(character!=' ') {
				System.out.print(character);
			}
			
		}

	}

}
