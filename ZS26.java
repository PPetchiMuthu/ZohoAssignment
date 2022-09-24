//given two sorted array merege them no elements are repeated

import java.util.Arrays;

public class ZS26 {
    public static void main(String args[]) {
        int arr1[] = {2, 4, 5, 6, 7, 9, 10, 13};
        int arr2[] = {2, 3, 4, 5, 6, 7, 8, 9, 11, 15};
        int len1 = arr1.length;
        int len2 = arr2.length;
        int len = len1 + len2;
        int arr3[] = new int[len];
        int arr4[]=new int[len];
        int pos1=len1,pos2=0;
        for (int i = 0; i < len1; i++)
            arr3[i]=arr1[i];
        for(int j=0;j<len2;j++)
        {
            boolean ss=true;
            for (int i = 0; i < len1; i++)
                if (arr2[j]==arr1[i])
                   ss=false;
            if(ss)
                arr3[pos1++]=arr2[j];
            else
                arr4[pos2++]=arr2[j];
        }
        for(int i=0;i<pos1-1;i++)
            for(int j=i;j<pos1;j++)
                if(arr3[i]>arr3[j]){
                    int a=arr3[i];
                    arr3[i]=arr3[j];
                    arr3[j]=a;
                }
        System.out.print("Merged Array : ");
        for(int i=0;i<pos1;i++)
            System.out.print(arr3[i]+ " ");
        System.out.println();
        System.out.print("Repeated Elements : ");
        for(int i=0;i<pos2;i++)
            System.out.print(arr4[i]+" ");
    }
}