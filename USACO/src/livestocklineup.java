import java.io.*;
import java.util.*;

public class livestocklineup {
	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer st;
	static HashMap<String, Integer> m1;
	static HashMap<Integer, String> m2;
	static ArrayList<String> data, p;
	static String ans;
	
	
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new FileReader("lineup.in"));
		out = new PrintWriter(new File("lineup.out"));
		
		init();
		solve();
		
		in.close();
		out.close();
	}
	
	static void init() throws IOException {
		String cow[] = {"Bessie", "Buttercup", "Belinda", "Beatrice", "Bella", "Blue", "Betsy", "Sue"};
		Arrays.sort(cow);
		
		
		m1 = new HashMap<String, Integer>();
		for(int i=0; i<8; i++) {
			m1.put(cow[i], i);
		}
		
		m2 = new HashMap<Integer, String>();
		for(int i=0; i<8; i++) {
			m2.put(i, cow[i]);
		}
		
//		System.out.println(m1);
//		System.out.println(m2);
		
		p = new ArrayList<String>();
		per("01234567", "");
		//System.out.println(p.size());
		
		int n = Integer.parseInt(in.readLine());
		data = new ArrayList<String>();
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(in.readLine());
			String c1 = st.nextToken();
			st.nextToken();st.nextToken();st.nextToken();st.nextToken();
			
			String c2 = st.nextToken();
			data.add(m1.get(c1) + "" + m1.get(c2));
			data.add(m1.get(c2) + "" + m1.get(c1));
		}
		//System.out.println(data);
	}
	
	static void solve() {
		boolean flag;
		for(int i=0; i<p.size(); i++) {
			flag = true;
			for(int j=0; j<data.size(); j+=2) {
				if(p.get(i).contains(data.get(j)) || p.get(i).contains(data.get(j+1))) continue;
				else {
					flag = false;
					break;
				}
			}
			if(flag) {
				ans = p.get(i);
				break;
			}
		}
		
		//System.out.println(ans);
		
		for(int i=0; i<8; i++) {
			String name = m2.get(ans.charAt(i) - '0');
			//System.out.println(ans.charAt(i));
			out.println(name);
		}
		
	}
	
	static void per(String left, String right) {
		if(left.length() == 0) {
			p.add(right);
			return;
		}
		
		for(int i=0; i<left.length(); i++) {
			char c = left.charAt(i);
			String l = left.substring(0, i) + left.substring(i+1);
			String r = right + c;
			per(l, r);
		}
	}
}
