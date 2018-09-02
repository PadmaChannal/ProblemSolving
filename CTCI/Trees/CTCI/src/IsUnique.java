import java.io.*;

public class IsUnique {
	public static void main(String[] args) {
			
		String s = "aaa";
			boolean isUnique = true;
		
			// Approach 1: Brute force O(n2)
			for(int i = 0; i < s.length(); i++)
				for(int j = i+1; j < s.length(); j++) 
					if(s.charAt(i) == s.charAt(j)) {
						isUnique = false;
						break;
					}
			if(isUnique)
				System.out.println("Is Unique");
			else
				System.out.println("Not Unique");
			
			// Approach 2: Sort a string by converting it to char Array. O(nlogn)
			// Approach 3: Extra DS --> Boolean array O(n)
			// Approach 4: Bit vector ?
			
			/* take away:
			 * Arrays.fill
			 * ASCII (256)  vs Unicode vs ANSI
			 */
			
	}

}
