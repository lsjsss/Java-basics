package Topic;

/**
* @author lsjss
*/

import java.util.*;

public class ISBN_Answer1 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()) {
            String s = input.nextLine();
            String[] t = new String[10];
            int[] intvalue = new int[10];
            int sum = 0;
            int j;
            for(j = 0; j < 9; ++j) {
                t[j] = (String)s.subSequence(j, j + 1);
                intvalue[j] = Integer.parseInt(t[j]);
            }
            for(j = 0; j < 9; ++j) {
                sum += intvalue[j] * (j + 1);
            }
            int d = sum % 11;
            if (d >= 10) {
                System.out.println("The ISBN-10 number is " + s + "X");
            } else {
                System.out.println("The ISBN-10 number is " + s + d);
            }
        }
    }
}
