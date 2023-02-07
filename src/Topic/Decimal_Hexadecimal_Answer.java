package Topic;

/**
* @author lsjss
*/

import java.util.*;

public class Decimal_Hexadecimal_Answer {
    public static void main(String[] args) {
		int x;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			x = input.nextInt();
			int a, b;
			int[] count=new int[50];
//			char s;
			if(x>=-9 && x<=9) {
				System.out.println(0);
			}else {
				a = x/16;
				b = x%16;
				int i=0;
				count[0]=b;
				while(a!=0) {
					i++;
					count[i]=a%16;
					a=a/16;
				}
//				System.out.printf("%d ",b);
				for(int j=i;j>=0;j--) {
					if(count[j]<10) {
						System.out.printf("%d",count[j]);
					}else if(count[j]==10) {
						System.out.printf("%s",'A');
					}else if(count[j]==11) {
						System.out.printf("%s",'B');
					}else if(count[j]==12) {
						System.out.printf("%s",'C');
					}else if(count[j]==13) {
						System.out.printf("%s",'D');
					}else if(count[j]==14) {
						System.out.printf("%s",'E');
					}else if(count[j]==15) {
						System.out.printf("%s",'F');
					}
				}
			}
			System.out.println();
		}
	}
}