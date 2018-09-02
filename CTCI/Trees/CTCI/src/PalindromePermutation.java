import java.util.Map.Entry;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class PalindromePermutation {

	public static void main(String[] args) {
		
		String s = "aabbccuy";
		char[] chArr = s.toCharArray();
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		int count = 0;
		
		for(char c : chArr) {
			if(!hm.containsKey(c)) {
				hm.put(c,1);
	
			}
			else {
				 count = hm.get(c);
				 count++;
				hm.put(c, count);
			}
				
		}
		Iterator<Entry<Character, Integer>> it = hm.entrySet().iterator();
		int sum = 0;
		while(it.hasNext()) {
			HashMap.Entry<Character, Integer> pair = (HashMap.Entry<Character, Integer>) it.next();
			System.out.println(pair.getKey() + " " + pair.getValue());
			if(pair.getValue()%2!=0)
				sum++;
			
		}
		
		if(sum <= 1) {
			System.out.println("It is a permutation of a Palindrome!");
		}
		
		else 
			System.out.println("Not a permutation of Palindrome!");
				
		
	}

}
