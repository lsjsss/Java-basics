package Topic;

/**
* @author lsjss
*/

import java.util.Scanner;

public class Grading_Answer {
    public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		while(input.hasNext()) {
			int score =input.nextInt();
			if(score>=90) {
				System.out.println("A");
			}
			else if(score>=80) {
				System.out.println("B");
			}
			else if(score>=70) {
				System.out.println("C");
			}
			else if(score>=60) {
				System.out.println("D");
			}
			else  {
				System.out.println("E");
			}
		}
	}
}
