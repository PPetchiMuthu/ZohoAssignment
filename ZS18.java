//give the two radius 0f concentric circle find the area

import java.util.Scanner;

public class ZS18 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Outer radius : ");
        int out = scanner.nextInt();
        System.out.print("Inner radius : ");
        int in = scanner.nextInt();
        double area = 3.14*(out*out - in*in);
        System.out.println("Area between two concentric circle : "+area);
    }
}
