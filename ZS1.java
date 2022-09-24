//A Program to print the binary,octal,hexadecimal value of an integer

import java.util.Scanner;

public class ZS1 {
    public static void main(String ar[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number...");
        int number = scanner.nextInt();
        bin(number);
        oct(number);
        hex(number);
    }
    static void bin(int x)
     {
        String binary = "";
        while(x!=0)
        {
            int rem = x%2;
            binary = rem + binary;
            x = x/2;

        }
         System.out.println("Binary No : "+ binary);
     }
      static void oct(int x)
     {
         String octal = "";
         while (x!=0)
         {
             int rem = x%8;
             octal = rem + octal;
             x = x/8;
         }
         System.out.println("Octal No : "+octal);
     }

    static void hex(int x)
    {
        String hexa = "";
        while (x!=0)
        {
            int rem = x%16;
            if(rem >= 10)
                hexa = (char)(rem+55) + hexa;
            else
                hexa = rem + hexa;
            x = x/16;
        }
        System.out.println("Hexadecimal NO : "+ hexa);
    }

}
