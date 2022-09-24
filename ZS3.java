// Circumference of the rectangle

import java.util.Scanner;
public class ZS3 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length : ");
        int len = scanner.nextInt();
        System.out.print("Width : ");
        int wid = scanner.nextInt();
        int circum = 2*(len+wid);
        System.out.println("Cirumference of rectangle.." +circum);
    }
}
