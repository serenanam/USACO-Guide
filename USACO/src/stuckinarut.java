import java.io.*;
import java.util.*;

public class stuckinarut {
	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer st;
	static int n, x[], y[];
	static char d[];
	
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		
		init();
		solve();
		
		in.close();
	}
	
	static void init() throws IOException {
		n = Integer.parseInt(in.readLine());
		d = new char[n];
		x = new int[n];
		y = new int[n];
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(in.readLine());
			d[i] = st.nextToken().charAt(0);
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
//		System.out.println(Arrays.toString(d));
//		System.out.println(Arrays.toString(x));
//		System.out.println(Arrays.toString(y));
	}
	
	static void solve() {
		
		for(int i=0; i<n; i++) {
			int ans = check(i);
			if(ans == Integer.MAX_VALUE) System.out.println("Infinity");
			else System.out.println(ans);
		}
		
	}
		
	static int check(int i) {
			
			int min = Integer.MAX_VALUE;
			
			
			for(int j=0; j<n; j++) {
				if(i == j || d[i] == d[j]) continue;
				
				int dx = Math.abs(x[i] - x[j]);
				int dy = Math.abs(y[i] - y[j]);
				
				if(d[i] == 'E') {
					if(y[i] < y[j] || x[i] > x[j]) continue;
					if(dy < dx && check(j) >= dx) min = Math.min(min, dx);
				
				}
				else {
					if(y[i] > y[j] || x[i] < x[j]) continue;
					if(dy > dx && check(j) >= dy) min = Math.min(min, dy);
				}
				
				
			}
			return min;
	
	}
}
