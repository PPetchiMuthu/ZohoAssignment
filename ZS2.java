// find the circumference of the square
import java.util.Scanner;
public class ZS2 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sides length....");
        int lenght = scanner.nextInt();
        int circum = 4*lenght;
        System.out.println("Circumference of the square :"+circum);
    }
}
