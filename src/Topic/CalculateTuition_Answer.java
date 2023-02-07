package Topic;

/**
* @author lsjss
*/

import java.util.*;

public class CalculateTuition_Answer {
    public static void main(String[] args) {
		int X;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			double add = 10000;
			X = input.nextInt();
			if(X>0) {
				for(int i=0; i<X; i++) {
					add += add * 0.07;
				}
				System.out.printf("%.2f\n",add);
			}else {
				continue;
			}
		}
	}
}
