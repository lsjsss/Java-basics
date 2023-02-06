package Topic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaOfCircle_Answer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00"); 
		while(sc.hasNextDouble()) {
			double radius = sc.nextDouble();
			double area = Math.PI * radius * radius;
			System.out.println(df.format(area));
		}
	}
}
