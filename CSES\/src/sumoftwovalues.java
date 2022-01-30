import java.io.*;
import java.util.*;

public class sumoftwovalues {
	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		
		st = new StringTokenizer(in.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(in.readLine());
		
		for(int i=1; i<=n; i++) {
			int num = Integer.parseInt(st.nextToken());
			int diff = x - num;
			
			if(memo.containsKey(diff))  {
				sb.append(memo.get(diff)).append(" ").append(i).append("\n");
			}
			else {
				memo.put(num,  i);
			}

		}
		
		if(sb.length() == 0) System.out.println("IMPOSSIBLE");
		else System.out.print(sb.toString());
		
		
		
		
		
		
		
		
		
		
		in.close();
	}
}

