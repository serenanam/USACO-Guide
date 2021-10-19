import java.util.*;

public class twoknights {
	static Scanner in;
	static long n, ans;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		n = in.nextLong();
		for(long i=1; i<=n; i++) {
			ans = (i*i) * (i*i -1 ) / 2;
			ans = ans - (i-2) * (i-1) * 4; 
			System.out.println(ans);
		}

	}

}
