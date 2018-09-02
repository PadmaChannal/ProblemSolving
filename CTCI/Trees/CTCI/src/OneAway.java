import java.util.Arrays;

public class OneAway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "pale";
		String s2 = "xple";
		
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		
		
		int diff = 0,  min;
		
		if(s1.length() == s2.length()) {
			for(int i = 0; i < s1.length(); i++) 
				if(arr1[i] !=arr2[i]){
					diff++;
				}
		}
		
		else {
			if((s1.length() < s2.length()) && (s1.length() + 1 == s2.length())) {
				 min = s1.length();
			}
			else if((s2.length() < s1.length()) && (s2.length() + 1 == s1.length())) {
				 min = s2.length();
			}
			else {
				System.out.println("NOO!");
				return;
			}
				

			for(int i = 0; i < min ; i++)
				if(arr1[i] !=arr2[i]) {
					diff++;
					i++;
				}
					
				
		}
		
		
		System.out.println(diff);
		if(diff <= 1)
			System.out.println("Yes");
		else
			System.out.println("No");
		

	}

}
