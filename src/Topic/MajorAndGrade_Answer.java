package Topic;

/**
* @author lsjss
*/

import java.util.Scanner;

public class MajorAndGrade_Answer { //学生的专业和年级
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			String s = "";	
			s = input.nextLine();
			String s1="";
			String s2="";
			char a=s.charAt(0);
			char b=s.charAt(1);
			switch(a){
			case 'C' :s1 = "计算机";
					break;
			case 'M' :s1 = "数学";
					break;
			case 'P' :s1 = "物理";
					break;
			case 'A' :s1 = "艺术";
					break;
			}
			switch(b){
			case '1' :s2 = "大一";
					break;
			case '2' :s2 = "大二";
					break;
			case '3' :s2 = "大三";
					break;
			case '4' :s2 = "大四";
					break;
			}
			System.out.println(s1+s2);
		}
	}
}
