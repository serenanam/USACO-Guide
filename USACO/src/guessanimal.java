import java.io.*;
import java.util.*;

public class guessanimal {
	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer st;
	static String a[][];
	static int n;
	static HashMap<String, Integer> m;
	
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new FileReader("guess.in"));
		out = new PrintWriter(new File("guess.out"));
		
		init();
		solve();
		
		in.close();
		out.close();
	}
	
	static void init() throws IOException {
		n = Integer.parseInt(in.readLine());
		a = new String[n][];
		m = new HashMap<String, Integer>();
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(in.readLine());
			st.nextToken();
			int col = Integer.parseInt(st.nextToken());
			a[i] = new String[col];
			for(int j=0; j<col; j++) {
				String character = st.nextToken();
				a[i][j] = character;
				
				if(m.get(character) == null) {
					m.put(character,1);
				}
				else m.put(character, m.get(character) +1);
			}
		}
		
//		System.out.println(Arrays.deepToString(a));
//		System.out.println(m);
	}
	
	static void solve() {
		int maxYes = 0;
		
		for(int i=0; i<n; i++) {
			int yes = 1;
			for(String c: a[i]) {
				int t = m.get(c);
				if(t > 1) yes++;
			}
			maxYes = Math.max(maxYes, yes);
		}
		out.println(maxYes);
	}
}
