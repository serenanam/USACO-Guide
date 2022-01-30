import java.io.*;
import java.util.*;

public class walkinghome {
	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer st;
	static int n, k;
	static char[][] a;
	
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		
		init();
		solve();
		
		in.close();
	}
	
	static void init() throws IOException {
		st = new StringTokenizer(in.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		a = new char[n][];
		for(int i=0; i<n; i++) {
			a[i] = in.readLine().toCharArray();
		}
		System.out.println(Arrays.deepToString(a));
		
		
	}
	
	static void solve() {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i == n-1 && j == n-1) return 
			}
		}
	}
	
	
}

