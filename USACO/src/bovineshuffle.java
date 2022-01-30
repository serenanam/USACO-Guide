import java.io.*;
import java.util.*;

public class bovineshuffle {
	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer st;
	static int n, a[];
	static String id[], temp[];
	
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new FileReader("shuffle.in"));
		out = new PrintWriter(new File("shuffle.out"));
		
		init();
		solve();
		
		in.close();
		out.close();
	}
	
	static void init() throws IOException {
		n = Integer.parseInt(in.readLine());
		//System.out.println(n);
		a = new int[n];
		id = new String[n];
		
		st = new StringTokenizer(in.readLine());
		for(int i=0; i<n; i++) {
			a[Integer.parseInt(st.nextToken())-1] = i;
		}
		
		st = new StringTokenizer(in.readLine());
		for(int i=0; i<n; i++) {
			id[i] = st.nextToken().toString();
		}
		temp = new String[n];
		//System.out.println(" " + Arrays.toString(a) + " " + Arrays.toString(id));
	}
	
	static void solve() {
		for(int k=0; k<3; k++) {
			for(int i=0; i<n; i++) {
				int j = a[i];
				temp[j] = id[i];
				
				
			}
			id = temp.clone();
			//System.out.println(Arrays.toString(temp));
			//System.out.println(Arrays.toString(id));
			
			
		}
		
		for(int i=0; i<n; i++) {
			out.println(id[i]);
		}
	}
}
