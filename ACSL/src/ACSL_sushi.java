import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

public class ACSL_sushi{


	static class Result {
		public static String method1(String line) {
			line.replace(" ", "");
			char a[] = line.toCharArray();

			String ans = "";
			int cost = 0;

			for(int i=0; i<a.length; i++) {
				char plate = a[i];
				if(plate == 'R') cost ++;
				else if(plate == 'O') cost += 2;
				else if(plate == 'B') cost += 3;
				else if(plate == 'Y') cost += 4;
				else if(plate == 'W') cost += 5;
			}


			ans += cost/10;
			cost %= 10;
			ans += cost/5;
			cost %= 5;
			ans += cost;
			
			return ans;
			
			

		}
	}


	// TEST FILE NAME: input.txt
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new FileReader("input.txt"));    // TEST FILE NAME: input.txt  


		for (int i = 0; i < 5; i++) {
			String result = Result.method1(in.nextLine().trim());    //result's data type may be changed.

			System.out.println(result);
		}

		in.close();
	}
}
