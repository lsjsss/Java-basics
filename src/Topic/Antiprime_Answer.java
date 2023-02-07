package Topic;

/**
* @author lsjss
*/

import java.util.Scanner;

public class Antiprime_Answer {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
       Scanner input=new Scanner(System.in);
//		 System.out.print("Please enter a number for counts: ");
        while(input.hasNext()) {
            int counts=input.nextInt();
            isPrimeCount(counts);
            System.out.println();
        }
   }
   public static void isPrimeCount(int num) {
       int count=0;
       int number=13;
       while (count<num) {
           String number1=String.valueOf(number);
           int len=number1.length();
           int number2=0;
           for (int j=0;j<len;j++) {
               int m=number1.charAt(len-j-1)-'0';// 将字符型数字转化为十进制数字
               number2+=m*Math.pow(10, len-j-1);//将m乘以所在位的次方，累加得到number的反数
           }
           if (isPrime(number)&&isPrime(number2)&&number!=number2) {
               count++;
//				if (count%10==0) {
//					System.out.printf("%d\t",number);
//				}
//				else 
                   System.out.printf("%d\t",number);
           }
           number++;
       }
   }
   public static boolean isPrime(int n) {
       for (int i=2;i<=n/2;i++) {
           if (n%i==0) 
               return false;
       }
       return true;
   }//此方法用来判定素数
}
