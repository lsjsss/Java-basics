package Topic;

/**
* @author lsjss
*/

import java.util.*;

public class CalculateAreaOfTriangle_Answer {
    public static void main(String[] args) {
		double a, b, c;
		double s, area;
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		while(input.hasNext()) {
			a = input.nextDouble();
			b = input.nextDouble();
			c = input.nextDouble();
			
			if(a+b>c&&b+c>a&&a+c>b) {
				s = (a+b+c)/2;
				area = (double) Math.sqrt(s*(s-a)*(s-b)*(s-c));
				System.out.printf("%.2f\n",area);
			}else {
				System.out.println("Not a triangle");
			}
		}
	}
}
