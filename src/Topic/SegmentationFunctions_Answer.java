package Topic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SegmentationFunctions_Answer {
    public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00"); 
		while(input.hasNext()) {
			double y;
			double x=input.nextDouble();
			if(x<1) {
				y=x;
			}
			else if(x>=1 && x<10) {
				y=2*x-1;
			}
			else{
				y=3*x-11;
			}
			System.out.println(df.format(y));
		}
	}
}