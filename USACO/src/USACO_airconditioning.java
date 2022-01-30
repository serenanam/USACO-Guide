import java.io.*;
import java.util.*;

public class USACO_airconditioning {
	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer st;
	static int n, ans;
	static int[] a;
	
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		
		init();
		solve();
		
		in.close();
	}
	
	static void init() throws IOException {
		n = Integer.parseInt(in.readLine());
		ans = 0;
		
		a = new int[n];
		
		st = new StringTokenizer(in.readLine());
		
		for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(in.readLine());
		
		for(int i=0; i<n; i++) a[i] = a[i] - Integer.parseInt(st.nextToken());
		
		//System.out.println(Arrays.toString(a));
	}
	
	static void solve() {
		ans = Math.abs(a[0]);
		
		for(int i=0; i<n-1; i++) {
			ans += Math.abs(a[i] - a[i+1]);
		}
		ans += Math.abs(a[a.length-1]);
		
		ans /= 2;
		
		System.out.println(ans);
	}
}

