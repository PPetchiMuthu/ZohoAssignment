// find quotient and remainder of the given number


import java.util.Scanner;

public class ZS7 {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number : ");
        int num = scanner.nextInt();
        System.out.print("Divisor : ");
        int div = scanner.nextInt();
        int quotient = num/div;
        int rem = num%div;
        System.out.println("Quotient : "+quotient);
        System.out.println("Remainder : "+rem);
}
}
