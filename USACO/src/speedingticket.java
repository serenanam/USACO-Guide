import java.io.*;
import java.util.*;

public class speedingticket {
	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer st;
	static int n, m, a[], b[], start, end, mph, ans;
	
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new FileReader("speeding.in"));
		out = new PrintWriter(new File("speeding.out"));
		
		init();
		solve();
		
		in.close();
		out.close();
	}
	
	static void init() throws IOException {
		st = new StringTokenizer(in.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		a = new int[101];
		b = new int[101];
		
		
	}
	
	static void solve() throws IOException {
		start = 0;
		end = 0;
		mph = 0;

		for(int i=0; i<n; i++) {
			st = new StringTokenizer(in.readLine());
			end = Integer.parseInt(st.nextToken()) + start;
			mph = Integer.parseInt(st.nextToken());
			//System.out.println(end + " " + mph);
			
			for(int j=start; j<end; j++) {
				a[j] = mph;
			}
			start = end;
			
		}
		//System.out.println(Arrays.toString(a));
		start = 0;
		end = 0;
		mph = 0;
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(in.readLine());
			end = Integer.parseInt(st.nextToken()) + start;
			mph = Integer.parseInt(st.nextToken());
			//System.out.println(end + " " + mph);
			
			for(int j=start; j<end; j++) {
				b[j] = mph;
			}
			start = end;
			
		}
		//System.out.println(Arrays.toString(b));
		ans = 0;
		for(int i=0; i<a.length; i++) {
			ans = Math.max(b[i] - a[i], ans);
		}
		out.println(ans);
	}
}
