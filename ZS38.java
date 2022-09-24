//delete the element of the array

import java.util.Scanner;

public class ZS38 {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Array limit : ");
        int len = scanner.nextInt();
        int arr[] = new int[len];
        System.out.print("Array "+len+" values : ");
        for(int i=0;i<len;i++)
            arr[i]= scanner.nextInt();
        System.out.print("element to delete : ");
        int del = scanner.nextInt();
        int new_arr[] = new int[len-1];
        int j=0;
        for(int i=0;i<len;i++)
            if(arr[i]!=del)
                new_arr[j++]=arr[i];
        System.out.print("Output : ");
        for(int tem:new_arr)
            System.out.print(tem+" ");
    }
}
