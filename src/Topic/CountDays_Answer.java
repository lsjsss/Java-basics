package Topic;

/**
* @author lsjss
*/

import java.util.*;

public class CountDays_Answer {
    public static void main(String[] args) {
		@SuppressWarnings( "resource" )
		Scanner input = new Scanner(System.in);
		int year, month, day;
		
		while(input.hasNext()) {
			year = input.nextInt();
			month = input.nextInt();
			day = input.nextInt();
			
			int n;
			if(year%4==0&&year%100!=0||year%400==0) {
				n=29;
				if(month==1) {
					System.out.println(day);
				}else if(month==2) {
					System.out.println(day+31);
				}else if(month==3){
					System.out.println(day+31+n);
				}else if(month==4) {
					System.out.println(day+62+n);
				}else if(month==5) {
					System.out.println(day+92+n);
				}else if(month==6) {
					System.out.println(day+123+n);
				}else if(month==7) {
					System.out.println(day+153+n);
				}else if(month==8) {
					System.out.println(day+184+n);
				}else if(month==9) {
					System.out.println(day+215+n);
				}else if(month==10) {
					System.out.println(day+245+n);
				}else if(month==11) {
					System.out.println(day+276+n);
				}else if(month==12) {
					System.out.println(day+306+n);
				}
			}else {
				n=28;
				if(month==1) {
					System.out.println(day);
				}else if(month==2) {
					System.out.println(day+31);
				}else if(month==3){
					System.out.println(day+31+n);
				}else if(month==4) {
					System.out.println(day+62+n);
				}else if(month==5) {
					System.out.println(day+92+n);
				}else if(month==6) {
					System.out.println(day+123+n);
				}else if(month==7) {
					System.out.println(day+153+n);
				}else if(month==8) {
					System.out.println(day+184+n);
				}else if(month==9) {
					System.out.println(day+215+n);
				}else if(month==10) {
					System.out.println(day+245+n);
				}else if(month==11) {
					System.out.println(day+276+n);
				}else if(month==12) {
					System.out.println(day+306+n);
				}
			}
		}
	}
}
