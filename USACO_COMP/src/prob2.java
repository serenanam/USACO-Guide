import java.io.*;
import java.util.*;

public class prob2 {
	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer st;
	static int n, a[], ans;
	static ArrayList<Integer> pos, neg;
	
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		
		init();
		
		in.close();
	}
	
	static void init() throws IOException {
		n = Integer.parseInt(in.readLine());
		a = new int[n];
		st = new StringTokenizer(in.readLine());
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		//System.out.println(Arrays.toString(a));
		
		pos = new ArrayList<Integer>();
		neg = new ArrayList<Integer>();
		
		st = new StringTokenizer(in.readLine());
		
		ans = 0;
		
		for(int i=0; i<n; i++) {
			
			int diff = a[i] - Integer.parseInt(st.nextToken()); 
			if(diff > 0) {
				pos.add(diff);
				neg.add(0);
			}
			else if(diff < 0) {
				neg.add(diff);
				pos.add(0);
			}
			else {
				pos.add(0);
				neg.add(0);
			}
		}
//		System.out.println(pos);
//		System.out.println(neg);
		
		PosSolve(pos);
		NegSolve(neg);
		
		System.out.println(ans);
	}

	
	static void PosSolve(ArrayList<Integer> pos) {
		if(pos.size() == 0) return;
		
		int min = pos.get(0);
		for(int i=0; i<pos.size(); i++) min = Math.min(min, pos.get(i));
		
		ans += Math.abs(min);
		
		for(int i=0; i<pos.size(); i++) pos.set(i,  pos.get(i) - min);
		
		ArrayList<Integer> temp = new ArrayList<Integer>();
		boolean flag = false;
		
		for(int i=0; i<pos.size(); i++) {
			if(pos.get(i) == 0 && flag) {
				PosSolve(temp);
				flag = false;
				temp = new ArrayList<Integer>();
			}
			if(pos.get(i) != 0) {
				flag = true;
				temp.add(pos.get(i));
			}
			
		}
		PosSolve(temp);
	}
	
	static void NegSolve(ArrayList<Integer> neg) {
		if(neg.size() == 0) return;
		
		int max = neg.get(0);
		for(int i=0; i<neg.size(); i++) max = Math.max(max, neg.get(i));
		
		ans += Math.abs(max);
		
		for(int i=0; i<neg.size(); i++) neg.set(i,  neg.get(i) - max);
		
		ArrayList<Integer> temp = new ArrayList<Integer>();
		boolean flag = false;
		
		for(int i=0; i<neg.size(); i++) {
			if(neg.get(i) == 0 && flag) {
				NegSolve(temp);
				flag = false;
				temp = new ArrayList<Integer>();
			}
			if(neg.get(i) != 0) {
				flag = true;
				temp.add(neg.get(i));
			}
			
		}
		NegSolve(temp);
	}
}

