import java.text.DecimalFormat;

public class ACSL_2122_C1 {
	public static void main(String[] args) {
		char c1 = 'R';
		char c2 = 'W';
		char c3 = 'G';
		char c4 = 'B';
		char c5 = 'G';
		
//		char c1 = 'W';
//		char c2 = 'B';
//		char c3 = 'B';
//		char c4 = 'G';
//		char c5 = 'R';

		
		int hrs = 0;
		int mins = 0;
		
		if(c1 == 'R' || c1 == 'B') {
			hrs += 1;
		}
		if(c1 == 'G' || c1 == 'B') {
			mins += 1;
		}
		
		if(c2 == 'R' || c2 == 'B') {
			hrs += 1;
		}
		if(c2 == 'G' || c2 == 'B') {
			mins += 1;
		}
		
		if(c3 == 'R' || c3 == 'B') {
			hrs += 2;
		}
		if(c3 == 'G' || c3 == 'B') {
			mins += 2;
		}
		
		if(c4 == 'R' || c4 == 'B') {
			hrs += 3;
		}
		if(c4 == 'G' || c4 == 'B') {
			mins += 3;
		}
		
		if(c5 == 'R' || c5 == 'B') {
			hrs += 5;
		}
		if(c5 == 'G' || c5 == 'B') {
			mins += 5;
		}
		
		mins *= 5;
		if(mins >= 60) {
			mins -= 60;
			hrs += 1;
		}
		
		DecimalFormat hrformat = new DecimalFormat("00");
        String hr = hrformat.format(hrs);
        DecimalFormat minformat = new DecimalFormat("00");
        String min = minformat.format(mins);
		System.out.println(hr + ":" + min);
	}
}
