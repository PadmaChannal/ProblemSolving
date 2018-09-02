import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class StringCompression {

	public static void main(String[] args) {
		
		//// ----> REDO
		String s = "abc";
		
		int counti = 1;
		int countj = 1;
		StringBuilder sb=new StringBuilder();  
		int i;
		for( i = 0; i < s.length()-1; i++) {
			if(s.charAt(i) == s.charAt(i+1)) 
				counti++;
			else {
				 
				countj = counti+ 1;
				counti = 0;
				sb.append(s.charAt(i));
				if(s.charAt(0) == s.charAt(i))
					sb.append(countj -1);
				else
					sb.append(countj);
			}
		}
		
		sb.append(s.charAt(i));
		sb.append(counti+1);
		
		System.out.println(sb);

	}

}
