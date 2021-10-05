import java.util.Scanner;
import java.util.*;

public class twosets {
	static Scanner in;
	static long n, sum;
	static StringBuilder sb;

	public static void main(String[] args)  {
		in = new Scanner(System.in);
		n = in.nextLong();
		

		sum = n*(n+1)/2;
		
		if(sum%2 !=0) System.out.println("NO");
		else {
			System.out.println("YES");
			sum /=2;
			solve();
		}
		
	}
	
	static void solve() {
		HashSet<Integer> s1 = new HashSet<Integer>();
		HashSet<Integer> s2 = new HashSet<Integer>();
		
		int t = (int) n;
		
		for(int i=1; i<=t; i++) s1.add(i);
		
		while(sum >0) {
			if(sum-t < 0) {
				s1.remove((int)sum);
				s2.add((int)sum);
				break;
			}
			else {
				sum -= t;
				s1.remove(t);
				s2.add(t);
				t--;
			}
			
			
		}
		
		sb = new StringBuilder();
		sb.append(s1.size()).append("\n");
		for(int s : s1) {
			sb.append(s).append(" ");
		}
		sb.append("\n").append(s2.size()).append("\n");
		for(int s : s2) {
			sb.append(s).append(" ");
		}
		
		System.out.println(sb.toString());
	}

}
