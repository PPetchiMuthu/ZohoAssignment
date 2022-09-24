//print the second largest element in an array

import java.util.Scanner;

public class ZS32 {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Array limit : ");
        int len = scanner.nextInt();
        int arr[] = new int[len];
        System.out.print("Array "+len+" values : ");
        for(int i=0;i<len;i++)
            arr[i]= scanner.nextInt();
        int first = 0, second = 0;
        for(int i=0;i<len;i++) {
            if (second < arr[i])
                second = arr[i];
            if (first < second) {
                int temp = second;
                second = first;
                first = temp;
            }
        }
        System.out.println("Second largest element : "+second);
    }
}
