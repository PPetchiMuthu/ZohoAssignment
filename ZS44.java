/*     draw the pattern
                A
               B B
              C C C
             D D D D
              C C C
               B B
                A
 */

import java.util.Scanner;

public class ZS44 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ar character :");
        char ch =(scanner.next().charAt(0));
        if(ch>97)
            ch = (char)((int)ch-32);
        int space = 30;
        for(int i=65;i<=ch;i++) {
            for (int j = 1; j <= space; j++)
                System.out.print(" ");
            for (int k = 65; k <= i; k++)
                System.out.print((char) i + " ");
            System.out.println();
            space = space - 1;
        }
        space = space +2;
        for(int i=ch-1;i>=65;i--) {
            for (int j = 1; j <= space; j++)
                System.out.print(" ");
            for (int k = i; k >= 65 ; k--)
                System.out.print((char) i + " ");
            System.out.println();
            space = space + 1;
        }
    }
}

