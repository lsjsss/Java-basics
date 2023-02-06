package Topic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SolveUnivariateQuadraticEquation_Answer {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double r1,r2;
        Scanner input= new Scanner(System.in);
        DecimalFormat df = new DecimalFormat( "0.00"); 
        while(input.hasNext())
        {
            a=input.nextDouble();
            b=input.nextDouble();
            c=input.nextDouble();
            if(b*b-4*a*c>0)
            {
                r1=(-b+Math.sqrt(b*b-4*a*c))/2*a;
                r2=(-b-Math.sqrt(b*b-4*a*c))/2*a;
                System.out.println("The equation has two roots "+df.format(r1)+" and "+df.format(r2));
            }
            if(b*b-4*a*c==0)
            {
                r1=-b/2*a;
                System.out.println("The equation has one root "+df.format(r1));
                
            }
            if(b*b-4*a*c<0)
            {
                System.out.println("The equation has no real roots");
            }
        }
    }
}
