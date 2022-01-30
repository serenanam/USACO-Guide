import java.io.*;
import java.util.*;

public class lostcow {
	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer st;
	static int x, y, ans, current, delta, next;
	
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new FileReader("lostcow.in"));
		out = new PrintWriter(new File("lostcow.out"));
		
		init();
		solve();
		
		in.close();
		out.close();
	}
	
	static void init() throws IOException {
		st = new StringTokenizer(in.readLine());
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());
//		System.out.println(x  + " " + y);
		delta = 1;
		current = x;
	}
	
	static void solve() {
		
		while(true) {
			next = x + delta;
			//System.out.println(next);
			if((next <= y && y <= current) || (current <= y && y<next)) {
				ans += Math.abs(y - current); 
				break;
			}
			else {
				ans += Math.abs(next - current);
				current = next;
				
				delta *= -2;
				//System.out.println(ans);
				//System.out.println(next);

			}
		}
		out.println(ans);
	}
}
