import java.io.*;
import java.util.*;

public class bucketlist {
	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer st;
	static int n, a[], s, b, t;
	
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new FileReader("blist.in"));
		out = new PrintWriter(new File("blist.out"));
		
		init();
		solve();
		
		in.close();
		out.close();
	}
	
	static void init() throws IOException {
		n = Integer.parseInt(in.readLine());
		a = new int[1001];
	}
	
	static void solve() throws IOException {
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(in.readLine());
			s = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			t = Integer.parseInt(st.nextToken());
			
			for(int j=s;j<b; j++) {
				a[j] += t;
			}
		}
		Arrays.sort(a);
		out.println(a[1000]);
	}
}
