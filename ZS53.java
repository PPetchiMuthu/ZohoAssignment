import java.util.Scanner;

public class ZS53 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int space = 30, dummy = 1;
        a:for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= space; j++)
                System.out.print(" ");
            for (int k = 1; k <= i; k++) {
                System.out.print((dummy++) + "  ");
                if (num < dummy)
                    break a;
            }
            System.out.println();
            space = space - 2;
        }
    }

}
