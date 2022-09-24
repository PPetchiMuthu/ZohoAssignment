//copy all elements of one array into another array


public class ZS35 {
    public static void main(String args[]) {

        int arr1[] = {2,4,5,6,3,6,4,7};
        int arr2[] =new int[arr1.length];
        System.out.print("Array 1 :");
        for(int i=0;i<arr1.length;i++)
            System.out.print(arr1[i]+" ");
        System.out.println();
        System.out.print("Array 2 : ");
        for(int i=0;i< arr1.length;i++)
        {
            arr2[i]=arr1[i];
            System.out.print(arr2[i]+" ");
        }
    }
}
