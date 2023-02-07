package Topic;

/**
* @author lsjss
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class TemperatureConversion_Answer {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00"); 
		while(in.hasNext()) {
		int C = in.nextInt();
		double  F = 32+C*9/5;
		System.out.println(df.format(F));
		}
	}
}
