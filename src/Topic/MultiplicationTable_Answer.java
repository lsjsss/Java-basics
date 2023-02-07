package Topic;

/**
* @author lsjss
*/

import java.util.*;

public class MultiplicationTable_Answer {
    public static void main(String[] args) {
		int l;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			l = input.nextInt();
			if(l > 0&&l<10) {
				for(int i=1;i<l+1;i++) {
					for(int j=1;j<=i;j++) {
						System.out.printf("%d*%d=%d\t",i,j,i*j);
					}
					System.out.println();
				}
			}else {
				System.out.println("输入错误");
			}
		}
	}
}
