/*
    draw the pattern
                          *
                        *   *
                      *   *   *
                    *   *   *   *
                  *   *   *   *   *
 */

import java.util.Scanner;

public class ZS43 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int space = 30;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=space;j++)
                System.out.print(" ");
            for(int k=1;k<=i;k++)
                System.out.print("*   ");
            System.out.println();
            space=space-2;
        }
    }
}

