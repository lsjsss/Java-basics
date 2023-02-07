package Topic;

/**
* @author lsjss
*/

import java.util.*;

public class Palindrome_Answer {
    public static void main(String[] args) {
		String s;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			s = input.nextLine();
			int min=0;
			int max=s.length()-1;
			int i=1;
			while(min < max) {
				if(s.charAt(min)!=s.charAt(max)) {
					i=0;
					break;
				}
				min++;
				max--;
			}
			if(i==1) {
				System.out.printf("%s is a palindrome\n",s);
			}else if(i==0) {
				System.out.printf("%s is not a palindrome\n",s);				
			}
		}
	}
}
