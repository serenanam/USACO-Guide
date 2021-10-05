import java.io.*;
import java.util.*;

public class missingnumber {
	static BufferedReader in;
	static StringTokenizer st;
	static long n, sum;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(in.readLine());
		
		sum = n*(n+1)/2;
		
		st = new StringTokenizer(in.readLine());
		
		n--;
		
		for(int i=0; i<n; i++) sum-=Integer.parseInt(st.nextToken());
		
		System.out.println(sum);
	}

}
