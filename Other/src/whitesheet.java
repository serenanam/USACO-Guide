import java.util.*;

public class whitesheet {
	static Scanner in;
	static pos ws, b1, b2;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		init();
		solve();
		
		in.close();
	}
	
	static void init() {
		ws = new pos(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());
		b1 = new pos(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());
		b2 = new pos(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());
		
	}
	
	static void solve() {
		long area = (long)(ws.x2-ws.x1) * (long)(ws.y2 - ws.y1);
		long overlap = ol(ws, b1) + ol(ws, b2) - ol(ws, b1, b2);
		
		if(area > overlap) System.out.println("YES");
		else System.out.println("NO");
	}
	
	static long ol(pos a, pos b) {
		long left = Math.max(a.x1, b.x1);
		long right = Math.min(a.x2, b.x2);
		long bottom = Math.max(a.y1, b.y1);
		long top = Math.min(a.y2,  b.y2);
		
		if(left > right || bottom > top) return 0;
		
		return (right - left) * (top - bottom);
	}
	
	static long ol(pos a, pos b, pos c) {
		long left = Math.max(Math.max(a.x1, b.x1), c.x1);
		long right = Math.min(Math.min(a.x2, b.x2), c.x2);
		long bottom = Math.max(Math.max(a.y1, b.y1), c.y1);
		long top = Math.min(Math.min(a.y2, b.y2), c.y2);
		
		if(left > right || bottom > top) return 0;
		
		return (right - left) * (top - bottom);
	}
	
	static class pos {
		int x1, y1, x2, y2
;
		pos(int a, int b, int c, int d) {
			x1 = a; y1 = b; x2 = c; y2 = d;
		}
		
		public String toString() {
			return x1 + " " + y1 + " " + x2 + " " + y2;
		}
	}
	
	
}
