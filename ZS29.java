//find the Factorial of the number and reverse the factorial number

import java.util.Scanner;

public class ZS29 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();
        int factorial = 1;
        for(int i=1;i<=num;i++)
            factorial *= i;
        System.out.println(num + "  factorial : "+factorial);

        int rev=0;
        while(factorial!=0){
            int lastd = factorial%10;
            rev = rev*10 + lastd;
            factorial /= 10;
        }
        System.out.println("Reverse : "+ rev);
    }

}
