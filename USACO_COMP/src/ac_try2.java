import java.io.*;
import java.util.*;

public class ac_try2 {
	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer st;
	static int n, a[], ans;
	
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		
		init();
		solve();
		
		in.close();
	}
	
	static void init() throws IOException {
		n = Integer.parseInt(in.readLine());
		a = new int[n];
		st = new StringTokenizer(in.readLine());
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(in.readLine());
		
		ans = 0;
		
		for(int i=0; i<n; i++) {
			
			a[i] = a[i] - Integer.parseInt(st.nextToken()); 
			
		}
		System.out.println(Arrays.toString(a));
//		System.out.println(pos);
//		System.out.println(neg);
		
	}
	
	static void solve() {
		ans = Math.abs(a[0]);
		for(int i=0; i<a.length-1; i++) {
			ans += Math.abs(a[i] - a[i+1]);
		}
		ans += Math.abs(a[a.length-1]);
		
		ans /=2;
		System.out.println(ans);
	}
}