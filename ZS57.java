//print the numbers which are mismatched from two array

public class ZS57 {
    public static void main(String args[]){
        char arr1[] = {'a','b','c','d','e','f','g','h','i'};
        char arr2[] = {'a','b','d','e','e','g','g','i','i'};
        System.out.print("Output : ");
        for(int i=0;i< arr1.length;i++)
            if(arr1[i]!=arr2[i])
                System.out.print(arr1[i]+" "+arr2[i]+" ");
    }
}
