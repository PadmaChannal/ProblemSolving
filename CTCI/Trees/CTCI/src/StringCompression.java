import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class StringCompression {
	// Take away : do not complicate. This is easy af.
	
	public static void main(String[] args) {
		
		String s = "aabbbaabcccc";
		int count = 0;
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < s.length();i++) {
			count++;
			if(i+1 >= s.length() || s.charAt(i) != s.charAt(i+1)) {
				sb.append(s.charAt(i));
				sb.append(count);
				count = 0;
			}
		}
		
		System.out.println(sb);

	}

}
