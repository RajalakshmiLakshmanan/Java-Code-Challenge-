package practiceCoding;

import java.util.ArrayList;
import java.util.List;

public class CountVowels {
	
	public static int findVowelsCount(String s) {
		char[] array = s.toLowerCase().toCharArray();
		char[] vowels = {'a','e','i','o','u'};
		int count = 0;
		List<Character>  vowelsList = new ArrayList<Character>();
		for (Character character : vowels) {
			vowelsList.add(character);
		}
		for (Character character2 : array) {
			
		     if(vowelsList.contains(character2)) {
				count++;
				
			}
		}
		return count;
		
	}

	public static void main(String[] args) {
		String s ="Lakshmanan";
		System.out.println("output: "+findVowelsCount(s));
		
	}

}
