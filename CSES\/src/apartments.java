import java.io.*;
import java.util.*;

public class apartments {
	static BufferedReader in;
	static StringTokenizer st;
	static int n, m, k;
	static int[] dsize, size;
	
	
	public static void main(String[] args) throws IOException {
		
		HashSet<Integer> a = new HashSet<Integer>();
		in = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(in.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		//System.out.println(in.readLine());
		
		dsize = new int[n];
		st = new StringTokenizer(in.readLine());
		System.out.println();
		for(int i=0; i<n; i++) {
			dsize[i] = Integer.parseInt(st.nextToken());
			//System.out.println(dsize[i]);
		}
		Arrays.sort(dsize);
		
		size = new int[m];
		st = new StringTokenizer(in.readLine());
		for(int i=0; i<m; i++) {
			size[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(size);

		
		int i=0;
		int j=0;
		int cnt = 0;
		while(i<n && j<m) {
			if(dsize[i] - k <= size[j] && size[j] <= dsize[i] + k) {
				cnt++; i++; j++;
			}
			else if(size[j] < dsize[i] - k) j++;
			else if(size[j] > dsize[i] + k) i++;
		}
		System.out.println(cnt);
	}

}
