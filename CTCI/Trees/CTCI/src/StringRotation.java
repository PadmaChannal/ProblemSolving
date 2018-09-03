
public class StringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Padma";
		String s2 = "adm";
		
		for(int i = 0; i < s1.length(); i++) {
			if(s2 == s1.substring(i, s2.length()+i)) {
				System.out.println("Is a substring");
				return ;
			}
			else {
				continue;
			}
		}
			
	}

}
