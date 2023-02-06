package Topic;

import java.util.Scanner;

public class NumericSorting_Answer {    //冒泡排序法
    public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		while(input.hasNext()) {
			int a=input.nextInt();
			int b=input.nextInt();
			int	c=input.nextInt();
			if(a<b) {
				int temp=a;
				a=b;
				b=temp;
			}
			if(a<c) {
				int temp=a;
				a=c;
				c=temp;
			}
			if(b<c) {
				int temp=b;
				b=c;
				c=temp;
			}
			System.out.println(a+" "+b+" "+c);
		}	
	}
}
