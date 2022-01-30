import java.io.*;
import java.util.*;

public class cowsignal {
	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer st;
	static int m, n, k;

	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new FileReader("cowsignal.in"));
		out = new PrintWriter(new File("cowsignal.out"));

		init();
		solve();

		in.close();
		out.close();
	}

	static void init() throws IOException {
		st = new StringTokenizer(in.readLine());
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		//		System.out.println(m + " " + n + " " + k);
	}

	static void solve() throws IOException {
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(in.readLine());
			String ans = "";
			String t = st.nextToken();
			for(int j=0; j<n; j++) {
				
				for(int h=0; h<k; h++) {
					ans += t.charAt(j);
				}
			}
			for(int j=0; j<k; j++) out.println(ans);
		}
	}
}
