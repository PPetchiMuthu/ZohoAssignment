//print a letters from 'A' to the user input character without using strings
import java.util.Scanner;

public class ZS47 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ar character : ");
        char ch = (scanner.next().charAt(0));
        if (ch > 97)
            ch = (char) ((int) ch - 32);
        System.out.print("Output : ");
        for(int i=65;i<=ch;i++)
            System.out.print((char)i);
    }
}
