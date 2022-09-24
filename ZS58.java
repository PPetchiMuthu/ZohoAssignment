//calculate the sum of 2 number and store the result in and print the sum

import java.util.Scanner;

public class ZS58 {
    public static void sum(int arr1[],int arr2[]){
        int lim1 = arr1.length;
        int lim2 = arr2.length;
        int arr3[]= new int[lim1];
        for(int i = lim2-1;i>=0;i--){
            int tem = arr1[--lim1]+arr2[i];
            if(tem>9) {
                 arr1[lim1-1]+=tem/10;
                tem %= 10;
            }
            arr3[lim1]=tem;
        }
        for(int i=0; i< arr1.length- arr2.length;i++)
            arr3[i]=arr1[i];
        System.out.print("Output : ");
        for(int tem:arr3)
            System.out.print(tem);
    }
    public static void main(String args[]){
        int arr1[]= {1,2,3,4,5,6,7,8};
        int arr2[]={1,2,3,4,5,8,9};
        if(arr1.length>arr2.length)
            sum(arr1,arr2);
        else
            sum(arr2,arr1);
    }
}