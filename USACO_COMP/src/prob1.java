import java.io.*;
import java.util.*;

public class prob1 {
	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer st;
	static int n, hcnt, gcnt, ans;
	static String a;
	
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		
		init();
		solve();
		
		in.close();
	}
	
	static void init() throws IOException {
		n = Integer.parseInt(in.readLine());
		a = in.readLine();
	}
	
	static void solve() {
		
		for(int i=0; i<n; i++) {
			int hcnt = 0;
			int gcnt = 0;
			
			for(int j=i; j<n; j++) {
				if(a.charAt(j) == 'H') hcnt++;
				else gcnt++;
				
				if(j-i < 2) continue;
				
				if(hcnt == 1 || gcnt == 1) ans++;
				if(hcnt > 2 && gcnt > 2) break;
			}
		}
		System.out.println(ans);	
	}
}