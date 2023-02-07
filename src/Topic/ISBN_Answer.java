package Topic;

/**
* @author lsjss
*/

import java.util.*;

public class ISBN_Answer {
    public static void main(String[] args) {
		int a;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			int[] d = new int[10];
			a = input.nextInt();
			for(int i=8;i>=0;i--) {
				d[8-i] = (int) (a/Math.pow(10, i)%10);
			}
			int add = 0;
			for(int i=0;i<9;i++) {
				add += d[i]*(i+1);
			}
			d[9] = add % 11;
			System.out.printf("The ISBN-10 number is ");
			for(int i=0;i<10;i++) {
				System.out.printf("%d",d[i]);
			}
			System.out.println();
		}
	}
}
