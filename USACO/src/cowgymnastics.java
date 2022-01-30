import java.io.*;
import java.util.*;

public class cowgymnastics {
	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer st;
	static int k, n, a[][], ans;
	
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new FileReader("gymnastics.in"));
		out = new PrintWriter(new File("gymnastics.out"));
		
		init();
		solve();
		
		in.close();
		out.close();
	}
	
	static void init() throws IOException {
		st = new StringTokenizer(in.readLine());
		k = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		
		a = new int[k][n];
		for(int i=0; i<k; i++) {
			st = new StringTokenizer(in.readLine());
			for(int j=0; j<n; j++) {
				a[i][Integer.parseInt(st.nextToken())-1] = j;
				
			}
		}
		//System.out.println(Arrays.deepToString(a));
		
	}
	
	static void solve() {
		for(int s =0; s<n-1; s++) {
			
			for(int e=s+1; e<n; e++) {
				
				int win = 0;
				
				for(int g = 0; g<k; g++) {
					if(a[g][s] < a[g][e]) win++;
				}
				
				if(win == k || win == 0) ans++;
				
				
			}
		}
		out.println(ans);
		
	}
}

