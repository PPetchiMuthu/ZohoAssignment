//Whether a number is even or odd

import java.util.Scanner;

public class ZS10 {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = scanner.nextInt();
        if (num%2==0)
            System.out.println("Given number is even");
        else
            System.out.println("Given number is odd");
    }
}
