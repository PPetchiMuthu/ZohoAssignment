//find the odd numbers between the range

import java.util.Scanner;

public class ZS46 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Starting No : ");
        int st = scanner.nextInt();
        System.out.print("Ending No : ");
        int end = scanner.nextInt();
        System.out.print("Output : ");
    for(int i=st+1;i<end;i++)
        if(i%2!=0)
            System.out.print(i+" ");
    }
}
