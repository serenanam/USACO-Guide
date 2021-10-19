import java.io.*;
import java.util.*;

public class blockedbillboard2 {
	static Scanner in;
	static PrintWriter out;
	static boolean a[][];
	static int x1, y1, x2, y2;
	
	public static void main(String[] args) throws IOException {
		in = new Scanner(new File("billboard.in"));
		out = new PrintWriter(new File("billboard.out"));
		
		init();
		solve();
		
		in.close();
		out.close();
	}
	
	static void init() throws IOException {
		a = new boolean[2001][2001];
		
		fill(true);
		fill(false);
	}
	
	static void fill(boolean s) {
		x1 = in.nextInt() + 1000;
		y1 = in.nextInt() + 1000;
		x2 = in.nextInt() + 1000;
		y2 = in.nextInt() + 1000;
		
		//System.out.println(x1 + " " + x2 + " " + y1 + " " + y2);
		
		for(int i=x1; i<x2; i++) {
			for(int j=y1; j<y2; j++) {
				a[i][j] = s;
				//System.out.println("hi");
			}
		}
		
		
	}
	
	static void solve() {
		int minx = 2001;
		int maxx = 0;
		int miny = 2001;
		int maxy = 0;
		boolean flag = false;
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				if(a[i][j]) {
					minx = Math.min(minx, i);
					maxx = Math.max(maxx, i);
					miny = Math.min(miny, j);
					maxy = Math.max(maxy, j);
					flag = true;
				}
			}
		}
		int ans = 0;
		if(flag) {
			ans = (maxx - minx+1) * (maxy - miny+1);
		}
		else ans = 0;
		
		out.println(ans);
	}
	
}
