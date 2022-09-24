//print the average of the element in array

public class ZS39 {
    public static void main(String args[]){
        int arr[]= {2,4,7,8,6,7,8,4};
        int sum = 0;
        for(int i=0;i< arr.length;i++)
            sum += arr[i];
        float average =  sum / (float)(arr.length-1);
        System.out.println("Average : "+average);
    }
}
