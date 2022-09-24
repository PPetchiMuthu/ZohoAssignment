/*
    draw the pattern
                          1
                        2   2
                      3   3   3
                    4   4   4   4
                  5   5   5   5   5
 */

import java.util.Scanner;

public class ZS41 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int space = 30;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=space;j++)
                System.out.print(" ");
            for(int k=1;k<=i;k++)
                System.out.print(i+"   ");
            System.out.println();
            space=space-2;
        }
    }
}
