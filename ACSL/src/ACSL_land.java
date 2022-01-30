import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

public class ACSL_land{

    static int mpg, mph;
    static double cost;
    
    static class Result {
        public static String method1(String line) {    //
            int d1 = line.charAt(0) - 'A';
            int d2 = line.charAt(2) - 'A';
            int dist = 0;
            
            for(int i=d1; i<d2; i++) {
            	if(i == 0) dist += 450;
            	if(i == 1) dist += 140;
            	if(i == 2) dist += 120;
            	if(i == 3) dist += 320;
            	if(i == 4) dist += 250;
            	if(i == 5) dist += 80;
            }
            //System.out.println(dist);
            
            int hr = dist/mph;
            double min = (double) dist/mph - hr;
            min *= 60 * 100;
            min = Math.round(min);
            min /= 100;
      
            DecimalFormat hrformat = new DecimalFormat("00");
            String hrs = hrformat.format(hr);
            DecimalFormat minformat = new DecimalFormat("00");
            String mins = minformat.format(min);
            
            
            double price = (double) dist/mpg * cost;
            price *= 100;
            price = Math.round(price);
            price /= 100;
            DecimalFormat currency = new DecimalFormat("$00.00");
            String totalprice = currency.format(price);
            //System.out.println(totalprice);
            
            
            return dist + ", " + hrs + ":" + mins + ", " + totalprice;            

        }
    }


    // TEST FILE NAME: input.txt
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new FileReader("input.txt"));    // TEST FILE NAME: input.txt
        
        mpg = in.nextInt();
        cost = in.nextDouble();
        mph = in.nextInt();
        in.nextLine();
        
        
        for (int i = 0; i < 5; i++) {
            String result = Result.method1(in.nextLine().trim());    //result's data type may be changed.

            System.out.println(result);
        }

        in.close();
    }
}