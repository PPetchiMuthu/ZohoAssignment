//whether a character is alphabet or not

import java.util.Scanner;

public class ZS15 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char in = scanner.next().charAt(0);
        char ch = Character.toLowerCase(in);
        if (ch >= 97 && ch <= 122)
            System.out.println(in + " is a Alphabet");
        else
            System.out.println(in + " is not a Alphabet");
    }
}
