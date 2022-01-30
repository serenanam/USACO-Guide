import java.io.*;
import java.util.*;

public class cowqueue {
	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer st;
	static int n;
	static pair a[];
	
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new FileReader("cowqueue.in"));
		out = new PrintWriter(new File("cowqueue.out"));
		
		init();
		solve();
		
		in.close();
		out.close();
	}
	
	static void init() throws IOException {
		n = Integer.parseInt(in.readLine());
		a = new pair[n];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(in.readLine());
			a[i] = new pair(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		Arrays.sort(a);
		//System.out.println(Arrays.toString(a));
	}
	
	static void solve() {
		int end = a[0].arrival+a[0].questioning;
		
		for(int i=1; i<n; i++) {
			int arr = a[i].arrival;
			int q = a[i].questioning;
			
			if(end < arr) end = arr+q;
			else end += q;
		}
		out.println(end);
	}
	
	static class pair implements Comparable<pair> {
		int arrival, questioning;
		
		pair(int a, int q) {
			arrival = a;
			questioning = q;
		}

		@Override
		public int compareTo(cowqueue.pair o) {
			return this.arrival - o.arrival;
		}
		
		public String toString() {
			return arrival + " " + questioning;
		}
		
	}
}
