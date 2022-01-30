import java.io.*;
import java.util.*;

public class distinctnumbers {
	static BufferedReader in;
	static StringTokenizer st;
	static int n;
	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		HashSet<Integer> a = new HashSet<Integer>();
		in = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(in.readLine());
		st = new StringTokenizer(in.readLine());
		for(int i=0; i<n; i++)  {
			a.add(Integer.parseInt(st.nextToken()));
			
		}
		
		System.out.println(a.size());
	}

}
