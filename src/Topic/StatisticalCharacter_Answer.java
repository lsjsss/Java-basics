package Topic;

/**
* @author lsjss
*/

import java.util.*;

public class StatisticalCharacter_Answer {
    public static void main(String[] args) {
		String s;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			s = input.nextLine();
			int l = s.length();
			char a;
			int x=0, y=0, z=0, w=0;
			for(int i=0; i<l; i++) {
				a = s.charAt(i);
				if( a>='A' && a<='Z' ) {
					x++;
				}else if( a>='a' && a<='z') {
					y++;
				}else if( a>='1' && a<='9' ) {
					z++;
				}else {
					w++;
				}
			}
			System.out.printf("大写字符:%d\t小写字符:%d\t数字字符:%d\t其他字符:%d\t",x,y,z,w);
		}
	}

}
