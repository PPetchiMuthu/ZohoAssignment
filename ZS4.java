//circumference of the cylinder

import java.util.Scanner;

public class ZS4 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Radius : ");
        int r = scanner.nextInt();
        double cir = 2*3.14*r;
        System.out.println("Circumference of the cylinder : "+cir);
    }

}
