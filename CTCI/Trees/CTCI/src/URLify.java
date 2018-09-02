
public class URLify {

	public static void main(String[] args) {
		
		String s = "Mr John Smith      ";
		char[] chArr = new char[s.length()];
		int j =0;
		
		for(int i =0; i<13; i++) {
			if(s.charAt(i) == ' ') {
				chArr[j++] = '%';
				chArr[j++] = '2';
				chArr[j++] = '0';
				i++;
			}
			chArr[j] = s.charAt(i);
			j++;
		}
		
		for (char c : chArr){
			System.out.print(c + " ");
		}

	}

}
