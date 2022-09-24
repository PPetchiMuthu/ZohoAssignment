//Find the root of the Quadratic equation

import java.util.Scanner;

public class ZS13 {
    public static void main(String args[]){
        int a ,b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a,b,c : ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        System.out.println("Given Equation : "+a+"x^2+"+b+"x+"+c);
        double x1 = (-b+(Math.sqrt(b*b-4*a*c)))/2*a;
        double x2 = (-b-(Math.sqrt(b*b-4*a*c)))/2*a;
        System.out.println("The root are "+x1+","+x2);
                ;
    }
}
