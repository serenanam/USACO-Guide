import java.text.DecimalFormat;

public class PrintFormat {
	public static void main(String[] args) {
		
		DecimalFormat currency = new DecimalFormat("$##.##");
		DecimalFormat num = new DecimalFormat("00.00");
		
		double money = 123.456;
		double number = 5.6;
		
		String output1 = currency.format(money);
		String output2 = num.format(number);
		
		System.out.println(output1);
		System.out.println(output2);
	}
}