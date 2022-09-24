//find the sum of the element in array even position

import java.util.Scanner;

public class ZS30 {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Array limit : ");
        int len = scanner.nextInt();
        int arr[] = new int[len]; int sum =0;
        System.out.println("Array "+len+" values");
        for(int i=0;i<len;i++)
            arr[i]= scanner.nextInt();
        for(int i=1;i<len;i+=2)
            sum +=arr[i];
        System.out.println("Sum of the even position element: "+sum);
    }
}
