//find the sum of given number and the reverse number

import java.util.Scanner;

public class ZS48 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
         int num = scanner.nextInt();
         int rev = 0, tem = num;
         while(tem!=0)
         {
             int lstdig = tem%10;
             rev = rev*10 + lstdig;
             tem = tem/10;
         }
        System.out.println("Sum = "+num+" + "+rev+" = "+(num + rev));
    }
}
