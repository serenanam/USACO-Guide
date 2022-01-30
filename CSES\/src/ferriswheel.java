import java.io.*;
import java.util.*;

public class ferriswheel {
	static BufferedReader in;
	static StringTokenizer st;
	static int n, x;
	static long a[];



	public static void main(String[] args) throws IOException {

		in = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(in.readLine());
		n = Integer.parseInt(st.nextToken());
		x = Integer.parseInt(st.nextToken());
		a = new long[n];
		st = new StringTokenizer(in.readLine());
		for(int i=0; i<n; i++) a[i] = Long.parseLong(st.nextToken());

		int cur = 0;
		int ans = 0;
		Arrays.sort(a);
		int i=0; 
		int j= n-1;
		
		while(i <= j) {
			//System.out.println(a[i] + " " + a[j]);
			if(a[i] + a[j] <= x) {
				ans++; i++; j--;
				
			}
			else {
				ans++; j--;
			
			}
		}
		System.out.println(ans);
	}
}

