// write the program to print 'c' with the stars using gn number

import java.util.Scanner;

public class ZS52 {
     public static void main(String args[]){
         Scanner scanner= new Scanner(System.in);
         System.out.print("Input : ");
         int num = scanner.nextInt();
         for(int i=0; i<num;i++){
             System.out.print("*");
             if(i==0 || i==num-1)
                 for(int j=1;j<num;j++)
                     System.out.print("*");
             System.out.println();
         }
     }
}
