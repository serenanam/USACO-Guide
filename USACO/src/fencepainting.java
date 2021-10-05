import java.io.*;
import java.util.*;

public class fencepainting {
	static BufferedReader in;
	static PrintWriter out;
	static int a, b, ans;
	static boolean fence[];
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new FileReader("paint.in"));
		out = new PrintWriter(new File("paint.out"));
		
		init();
		
		in.close();
		out.close();
	}
	
	static void init() throws IOException {
		fence = new boolean[101];
		ans = 0;
		
		for(int i=0; i<2; i++) {
			st = new StringTokenizer(in.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			solve(a, b);
			
		}
		out.println(ans);
		
	}
	
	static void solve(int a, int b) {
		
		for(int i=a; i<b; i++) {
			if(!fence[i]) ans++;
			fence[i] = true;
			
		}
		
		
	}
}
