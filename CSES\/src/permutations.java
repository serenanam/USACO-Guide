import java.util.Scanner;

public class permutations {
	static Scanner in;
	static int n;
	static StringBuilder sb;
	public static void main(String[] args)  {
		in = new Scanner(System.in);
		n = in.nextInt();
		sb = new StringBuilder();
		
		if(n == 1) sb.append("1");
		else if(n<=3) sb.append("NO SOLUTION");
		else {
			for(int i=2; i<=n; i+=2) sb.append(i).append(" ");
			for(int i=1; i<=n; i+=2) sb.append(i).append(" ");
		}
		
		System.out.println(sb.toString());
		
	}
}
