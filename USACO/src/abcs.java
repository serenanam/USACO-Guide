import java.io.*;
import java.util.*;

public class abcs {
	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer st;
	static int a[];
	
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		
		init();
		solve();
		
		in.close();
	}
	
	static void init() throws IOException {
		a = new int[7];
		st = new StringTokenizer(in.readLine());
		for(int i=0; i<7; i++) a[i] = Integer.parseInt(st.nextToken());
		
	}
	
	static void solve() {
		Arrays.sort(a);
		int A = a[0];
		int B = a[1];
		int C = a[6] - A - B;
		System.out.println(A + " " + B + " " + C);
	}
}
