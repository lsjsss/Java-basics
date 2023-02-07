package Topic;

/**
* @author lsjss
*/

import java.util.Scanner;

public class SumTwoNumbers_Answer {
	public static void main(String[] args) {
		int a,b;
		Scanner input =new Scanner(System.in);	//输入两个数
		while(input.hasNext()) {
		a=input.nextInt();
		b=input.nextInt();
		double c=a+b;
		System.out.println(c);
		}
	}
}
