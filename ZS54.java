// draw the x pattern for odd number

import java.util.Scanner;

public class ZS54 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int space = 30;
        a:for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= space; j++)
                System.out.print(" ");
            for (int k = 1; k <= num; k++) {
               if(i==k||k==num+1-i)
                   System.out.print(k);
               else
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
