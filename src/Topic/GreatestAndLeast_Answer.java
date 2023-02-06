package Topic;

import java.util.Scanner;

public class GreatestAndLeast_Answer {
    public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		int x,y,a,b,k;
		while(input.hasNext()){
			x=input.nextInt();
			y=input.nextInt();

			a=1;
			k=2;
			while(k<=x && k<=y){
				if(x % k ==0 && y % k==0 )
					a=k;
				k++;
			}
			b=0;
			b=(x*y)/a;
			System.out.println(a+" "+b);
		}
	}
}
