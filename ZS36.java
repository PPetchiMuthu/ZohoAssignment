//find the frequency of eah element in the array

public class ZS36 {
    public static void main(String args[]){
        int arr1[] = new int[]{1,2,3,2,3,1,11,3,4};
        int arr2[] = new int[arr1.length];
       int dup = -1;
       for(int i=0;i<arr1.length;i++) {
           int count = 1;
           for (int j = i + 1; j < arr1.length; j++) {
               if (arr1[i] == arr1[j]) {
                   count++;
                   arr2[j] = dup;
               }
           }
           if (arr2[i] != dup)
               arr2[i] = count;
       }
        for(int i=0;i< arr1.length;i++)
            if (arr2[i] != dup)
                System.out.println("Element : " + arr1[i] + " Frequency : " + arr2[i]);
       }
}
