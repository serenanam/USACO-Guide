import java.io.*;
import java.util.*;

public class daisychains {
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
		for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());
		ans = n;
	}
	
	static void solve() {
		for(int s=0; s<n-1; s++) {
			for(int e = s+1; e<n; e++) {
				
				double sum = 0;
				for(int i=s; i<=e; i++) {
					sum += a[i];
				}
				
				double avg = sum/(e-s+1);
				
				for(int i=s; i<=e; i++) {
					if(avg == a[i]) {
						ans++;
						break;
					}
				}
			}
		}
		System.out.println(ans);
	}
}

