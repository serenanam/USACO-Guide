import java.io.*;
import java.util.*;

public class bovinegenomics {
	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer st;
	static char a[][], b[][];
	static int n, m, ans;
	

	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new FileReader("cownomics.in"));
		out = new PrintWriter(new File("cownomics.out"));
		
		init();
		solve();
		
		in.close();
		out.close();
	}
	
	static void init() throws IOException {
		st = new StringTokenizer(in.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		a = new char[n][];
		for(int i=0; i<n; i++) {
			a[i] = in.readLine().toCharArray();
		}
		
		b = new char[n][];
		for(int i=0; i<n; i++) {
			b[i] = in.readLine().toCharArray();
		}
		
		ans = 0;
//		System.out.println(Arrays.deepToString(a));
//		System.out.println(Arrays.deepToString(b));
		
		
	}
	
	static void solve() {
		for(int c=0; c<m; c++) {
			boolean flag = false;
			
			for(int r=0; r<n; r++) {
				char spot = a[r][c];
				
				for(int pr = 0; pr<n; pr++) {
					if(spot == b[pr][c]) {
						flag = true;
						break;
					}
				}
				if(flag) break;
				
			}
			
			if(flag == false) ans++;
		}
		out.println(ans);
	}
}
