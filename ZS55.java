/*print the pattern
     input 3            33333
                        32223
                        32123
                        32223
                        33333
 */


import java.util.Scanner;

public class ZS55 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int len = 2*num-1;
        for(int i=0;i<len;i++) {
            for(int k=0; k<30; k++)
                System.out.print(" ");
            for (int j = 0; j < len; j++) {
                int mini = Math.min(Math.min(i, j), Math.min(len - j - 1, len - i - 1));
                System.out.print(num - mini);
            }
            System.out.println();
        }
    }

}
