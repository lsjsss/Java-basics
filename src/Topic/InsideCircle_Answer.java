package Topic;

/**
* @author lsjss
*/

import java.util.*;

public class InsideCircle_Answer {
    public static void main(String[] args) {
		int x,y;
		double m;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()) {
			x = input.nextInt();
			y = input.nextInt();
			m = Math.sqrt((x*x)+(y*y));
			
			if(m<10.0) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
	}
}
