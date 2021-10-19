
import java.io.*;
import java.util.*;

public class squarepasture {
	static Scanner in;
	static PrintWriter out;
	static int[] x, y;
	
	public static void main(String[] args) throws IOException {
		in = new Scanner(new File("square.in"));
		out = new PrintWriter(new File("square.out"));
		
		init();
		solve();
		
		in.close();
		out.close();
	}
	
	static void init() throws IOException {
		x = new int[4];
		y = new int[4];
		x[0] = in.nextInt();
		y[0] = in.nextInt();
		x[1] = in.nextInt();
		y[1] = in.nextInt();
		x[2] = in.nextInt();
		y[2] = in.nextInt();
		x[3] = in.nextInt();
		y[3] = in.nextInt();
	}
	
	static void solve() {
		Arrays.sort(x);
		Arrays.sort(y);
		
		int lenx = x[3] - x[0];
		int leny = y[3] - y[0];
		
		int max = Math.max(lenx, leny);
		out.println(max*max);
	}
}

