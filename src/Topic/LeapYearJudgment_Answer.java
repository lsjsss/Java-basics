package Topic;

/**
* @author lsjss
*/

import java.util.Scanner;

public class LeapYearJudgment_Answer {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in); //输入两个数
        int year;
        while(input.hasNext()) {
            year=input.nextInt();
            if((year%4==0 && year%100!=0)||year%400==0){
                System.out.println("1");
            }else{
                System.out.println("0");
            }
        }
    }
}
