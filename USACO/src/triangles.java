import java.io.*;
import java.util.*;

public class triangles {
	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer st;
	static int x[], y[], n, maxArea;
	static TreeSet<Integer> xp, yp;
	
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new FileReader("triangles.in"));
		out = new PrintWriter(new File("triangles.out"));
		
		init();
		solve();
		
		in.close();
		out.close();
	}
	
	static void init() throws IOException {
		n = Integer.parseInt(in.readLine());
		x = new int[n];
		y = new int[n];
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(in.readLine());
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
//		System.out.println(Arrays.toString(x));
//		System.out.println(Arrays.toString(y));
		
		xp = new TreeSet<Integer>();
		yp = new TreeSet<Integer>();
		
	}
	
	static void solve() {
		maxArea = 0;
		for(int i=0; i<n-2; i++) {
			for(int j=i+1; j<n-1; j++) {
				for(int k=j+1; k<n; k++) {
					//System.out.println(i + " " + j + " "  + k);
					if(check(i, j, k)) {
						maxArea = Math.max(maxArea, area());
					}
				}
			}
		}
		out.println(maxArea);
	}
	
	static boolean check(int i, int j, int k) {
		xp.clear();
		yp.clear();
		
		xp.add(x[i]); xp.add(x[j]); xp.add(x[k]); 
		
		yp.add(y[i]); yp.add(y[j]); yp.add(y[k]);
		
		//System.out.println("xp&yp " + xp + " " + yp);
		return xp.size() == 2 && yp.size() == 2;
	}
	
	static int area() {
		int dx = xp.last() - xp.first();
		int dy = yp.last() - yp.first();
		return dx * dy;
	}
}
