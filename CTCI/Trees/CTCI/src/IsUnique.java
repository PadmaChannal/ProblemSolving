import java.io.*;

public class IsUnique {

	public static void main(String[] args) {

			String s = "aaa";
			boolean isUnique = true;
		
			// Brute force
			
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
	}

}
