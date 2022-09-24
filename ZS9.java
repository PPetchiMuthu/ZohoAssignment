//swap the two numbers

import java.util.Scanner;

public class ZS9 {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Num1 : ");
        int num1 = scanner.nextInt();
        System.out.print("Num2 : ");
        int num2 = scanner.nextInt();
        num1 = num1 + num2;
        num2 = num1 -num2;
        num1 = num1 - num2;
        System.out.println("Num1 : "+num1);
        System.out.println("Num2 : "+num2);
    }
}
