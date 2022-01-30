import java.io.*;
import java.util.*;

public class blockgame {
	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer st;
	static int[] a, b, c;
	static int n;
	static String x, y;
	
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new FileReader("blocks.in"));
		out = new PrintWriter(new File("blocks.out"));
		
		init();
		solve();
		
		in.close();
		out.close();
	}
	
	static void init() throws IOException {
		n = Integer.parseInt(in.readLine());
		
		c = new int[26];
		
		for(int i=0; i<n; i++) {
			a = new int[26];
			b = new int[26];
			st = new StringTokenizer(in.readLine());
			x = st.nextToken().toString();
			y = st.nextToken().toString();
			//System.out.println(x + " " + y);
			
			for(int j=0; j<x.length(); j++) {
				int index = x.charAt(j) - 'a';
				a[index]++;
			}
			
			for(int j=0; j<y.length(); j++) {
				int index = y.charAt(j) - 'a';
				b[index]++;
			}
			
			
			for(int j=0; j<26; j++) {
				c[j] += Math.max(a[j], b[j]);
			}
//			System.out.println ("a: " + Arrays.toString(a));
//			System.out.println ("b: " + Arrays.toString(b));
//			System.out.println ("c: " + Arrays.toString(c));
		}
		
		for(int i=0; i<26; i++) out.println(c[i]);
	}
	
	static void solve() {
	
	}
}
