//Whether a character is a vowel or consonant


import java.util.Scanner;

public class ZS11 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char in = scanner.next().charAt(0);
        char ch = Character.toLowerCase(in);
        switch (ch)
        {
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
                System.out.println(in+" is a Vowel");
                break;
            default:
                if(ch>=97&&ch<=122)
                    System.out.println(in+" is a Consonant");
                else
                    System.out.println(in+" is not a Alphabet");


        }


    }
}
