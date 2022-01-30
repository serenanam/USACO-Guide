
import java.io.*;
import java.util.*;

public class CF231A {
	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer st;
	static int p, v, t, n, ans;
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		
		
		init();
		solve();
		
		in.close();
	}
	
	static void init() throws IOException {
		n = Integer.parseInt(in.readLine());
		ans = 0;
		
	}
	
	static void solve() throws IOException {
		
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(in.readLine());
			p = Integer.parseInt(st.nextToken());
			v = Integer.parseInt(st.nextToken());
			t = Integer.parseInt(st.nextToken());
			if(p+v+t >= 2) ans += 1;
		}
		System.out.println(ans);
	}
}

