//Whether a number is positive or negative

import java.util.Scanner;

public class ZS14 {
     public static void main(String args[]){
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter a N0 : ");
         int num = scanner.nextInt();
         if(num>0)
             System.out.println(num+" is a positive number ");
         else if (num!=0)
             System.out.println(num+" is a negative number");
             else
             System.out.println("zero");


     }
}
