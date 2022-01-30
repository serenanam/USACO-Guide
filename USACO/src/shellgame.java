import java.io.*;
import java.util.*;

public class shellgame {
	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer st;
	static int n, ans;
	static int p[], swap[][], g[];
	
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new FileReader("shell.in"));
		out = new PrintWriter(new File("shell.out"));
		
		init();
		solve();
		
		in.close();
		out.close();
	}
	
	static void init() throws IOException {
		n = Integer.parseInt(in.readLine());
		swap = new int[n][2];
		g = new int[n];
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(in.readLine());
			for(int j=0; j<2; j++) {
				swap[i][j] = Integer.parseInt(st.nextToken()) -1;
			}
			g[i] = Integer.parseInt(st.nextToken()) -1;
			
			
		}
		//System.out.println(Arrays.deepToString(swap));
		//System.out.println()
	}
	
	static int game() {
		int cnt = 0;
		for(int i=0; i<n; i++) {
			int temp = p[swap[i][0]];
			p[swap[i][0]] = p[swap[i][1]];
			p[swap[i][1]] = temp;			

			if(p[g[i]] == 1) cnt++;
	
		}
		return cnt;
	}
	static void solve() {
		p = new int[] {1, 0, 0};
		ans = game();
		p = new int[] {0, 1, 0};
		ans = Math.max(ans, game());
		p = new int[] {0, 0, 1};
		ans = Math.max(ans, game());
		out.println(ans);
	}
}
