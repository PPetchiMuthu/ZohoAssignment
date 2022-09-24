//Find the largest  number among four numbers

import java.util.Scanner;

public class ZS12 {
    public static void main(String args[]){
        int big = 0, a[] = new int[4];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter four number : ");
        for(int i=0;i<4;i++)
        {
            a[i] = scanner.nextInt();
            if(a[i]>big)
                big=a[i];
        }
        System.out.println("Largest No : "+big);
    }
}
