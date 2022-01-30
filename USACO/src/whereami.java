import java.io.*;
import java.util.*;

public class whereami {
	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer st;
	static int n, ans;
	static String str;
	
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new FileReader("whereami.in"));
		out = new PrintWriter(new File("whereami.out"));
		
		init();
		solve();
		
		in.close();
		out.close();
	}
	
	static void init() throws IOException {
		n = Integer.parseInt(in.readLine());
		str = in.readLine();
	}
	
	static void solve() {
		for(int l=0; l<=n; l++) {
			boolean flag = true;
			for(int s=0; s<=n-l; s++) {
				String cur = str.substring(s, s+l);
				int index = str.indexOf(cur);
				int lastIndex = str.lastIndexOf(cur);
				if(index != lastIndex) {
					flag = false;
					break;
				}
				
			}
			if(flag) {
				ans = l;
				break;
			}
		}
		out.println(ans);
	}
}
