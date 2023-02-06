package Topic;

import java.util.Scanner;

public class DigitalExtraction_Answer {
    public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(input.hasNext()) { 
			int a=input.nextInt();
			int thousand=a/1000; //千位就是拿四位数整除1000得的不带余数的数
			int hundred=a%1000/100;//百位就是四位数减去千位乘以1000再整除100
			int ten=a%1000%100/10;//十位就是减去千位百位，再整除10
			int last=a%1000%100%10;//个位就是减去千位百位十位即可
		System.out.println(thousand+" "+hundred+" "+ten+" "+last);
		}
	}
}