import java.io.*;
import java.util.*;

public class backandforth {
	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer st;
	static int[] a, b, A, B, ans;
	
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new FileReader("backforth.in"));
		out = new PrintWriter(new File("backforth.out"));
		
		init();
		solve();
		
		in.close();
		out.close();
	}
	
	static void init() throws IOException {
		
		a = new int[10];
		b = new int[10];
		
		st = new StringTokenizer(in.readLine());
		for(int i=0; i<10; i++) a[i] = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(in.readLine());
		for(int i=0; i<10; i++) b[i] = Integer.parseInt(st.nextToken());
		
		A = new int[10];
		B = new int[10];
		A = a.clone();
		B = b.clone();
	}
	
	static void solve() {
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				int milk1 = 1000 - a[i] + b[j];
				int temp = a[i];
				a[i] = b[j];
				b[j] = temp;
				
				for(int k=0; k<10; k++) {
					for(int l=0; l<10; l++) {
						int milk2 = milk1 - a[k] + b[l];
						set.add(milk2);
					}
				}
				a = A.clone();
				b = B.clone();
			}
			
		}
		out.println(set.size());
	}
}
