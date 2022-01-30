import java.io.*;
import java.util.*;

public class milkmeasurement {
	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer st;
	static int n, milk[], ans;
	static boolean[] current, next;
	static milkdata a[];
	
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new FileReader("measurement.in"));
		out = new PrintWriter(new File("measurement.out"));
		
		init();
		solve();
		
		in.close();
		out.close();
	}
	
	static void init() throws IOException {
		n = Integer.parseInt(in.readLine());
		a = new milkdata[n];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(in.readLine());
			a[i] = new milkdata(Integer.parseInt(st.nextToken()), st.nextToken(), Integer.parseInt(st.nextToken()));
		}
		Arrays.sort(a);
		
		milk = new int[] {7,7,7};
		current = new boolean[] {true, true, true};
	}
	
	static void solve() {
		for(int i=0; i<n; i++) {
			next = new boolean[n];
			int day = a[i].day;
			int name = convert(a[i].name);
			int measure = a[i].milk;
			milk[name] += measure;
			int max = Math.max(milk[0], Math.max(milk[1], milk[2]));
			
			for(int j=0; j<3; j++) {
				if(milk[j] == max) next[j] = true;
			}
			
			if(!Arrays.equals(current, next)) ans++;
			current = next.clone();
		}
		
		out.println(ans);
	}
	
	static int convert(String s) {
		if(s.equals("Elsie")) return 0;
		if(s.equals("Mildred")) return 1;
		return 2;
	}
	
}

class milkdata implements Comparable<milkdata>  {
	int day;
	String name;
	int milk;
	
	milkdata(int d, String n, int m) {
		day = d;
		name = n;
		milk = m;
	}
	
	public String toString() {
		return day + " " + name + " " + milk;
	}

	@Override
	public int compareTo(milkdata that) {
		if(this.day < that.day) return -1;
		return 1;
	}
	
	
}
