import java.io.*;
import java.util.*;

public class censoring {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("censor.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("censor.out")));
		
		String s = in.readLine();
		String t = in.readLine();
		int tlen = t.length();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<s.length(); i++) {
			sb.append(s.charAt(i));
			
			if(sb.length() >= tlen && sb.substring(sb.length()-tlen).equals(t)) {
				sb.delete(sb.length()-tlen, sb.length()+1);
			}
		}
		
		out.println(sb.toString());
		out.close();
		in.close();
	}

}
