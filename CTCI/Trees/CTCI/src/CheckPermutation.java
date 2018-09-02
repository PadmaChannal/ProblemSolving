import java.util.Arrays;

public class CheckPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "aba";
		String s2 = "aaa";
		
		if(s1.length() != s2.length()) {
			System.out.println("Not permutation");
			return;
		}
		
		char[] chArr1 = s1.toCharArray();
		char[] chArr2 = s2.toCharArray();
		
		Arrays.sort(chArr1);
		Arrays.sort(chArr2);
		
		//if(chArr1.equals(chArr2))
		if(Arrays.equals(chArr1, chArr2))
			System.out.println("is a permutation");
		else
			System.out.println("Not a permutation");

		/* Take away: 
		 * 1. Comparing arrays: chArr1.equals(chArr2)
		 * 2. Arrays.equals(chArr1, chArr2)
		 * 3. Arrays are first class objects --> https://www.geeksforgeeks.org/compare-two-arrays-java/
		 */
		
	}

}
