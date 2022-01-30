import java.io.*;
import java.util.*;

public class USACO_walkinghome {
	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer st;
	static int n, k, ans;
	static char[][] a;
	
	
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		
		int r = Integer.parseInt(in.readLine());
		for(int i=0; i<r; i++)  {
			init();
		}
		
		
		in.close();
	}
	
	static void init() throws IOException {
		st = new StringTokenizer(in.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		a = new char[n][];
		for(int i=0; i<n; i++) a[i] = in.readLine().toCharArray();
		
		ans = 0;
		solve(0, 0, 0, true);
		solve(0, 0, 0, false);
		
		
		System.out.println(ans);
		
	}
	
	static void solve(int i, int j, int turn, boolean d) {
		if(i == n - 1 && j == n - 1) {
			ans++;
			return;
		}
		
		if(a[i][j] == 'H') return;
		if(ans > turn) return;
		if(i >= n || j >= n) return;
		
		if(d) i++;
		else j++;
			
		solve(i, j, turn, d);
		solve(i, j, turn+1, !d);
		
	}
}

