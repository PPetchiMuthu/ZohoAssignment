//Calculate the sum of the natural numbers and find the smallest digit of the sum

import java.util.Scanner;

public class ZS16 {
    public static void main(String args[]){
        int sum=0, digit=10;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a No : ");
        int num = scanner.nextInt();
        for(int i = 1; i<=num ;i++)
            sum += i;
        System.out.println("Sum of the Natural Number : "+sum);
        if (sum==0)
            digit=0;
        while(sum!=0){
            int lastdigit = sum%10;
            if(digit>lastdigit)
                digit=lastdigit;
            sum = sum/10;
        }
        System.out.println("Smallest digit of the sum : "+digit);


    }
}
