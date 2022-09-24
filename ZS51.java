//sort the elements in odd positions in descending order and even element in ascending order

public class ZS51   {
    public static void main(String args[]){
        int arr[]= {4,1,2,7,5,6,4,9};
        int len = arr.length;
        int arr2[]= new int[len];
        System.out.print("Given Array ");
        for(int i=0;i<len;i++)
            System.out.print(arr[i]+"  ");
        System.out.println();
        for(int i=0;i<len-2;i+=2)
            for(int j=i+2;j<len;j+=2)
                if(arr[i]<arr[j]){
                    int tem = arr[i];
                    arr[i]=arr[j];
                    arr[j]=tem;
                }
        for(int i=1;i<len-2;i+=2)
            for(int j=i+2;j<len;j+=2)
                if(arr[i]>arr[j]){
                    int tem = arr[i];
                    arr[i]=arr[j];
                    arr[j]=tem;
                }
        System.out.print("Output : ");
        for(int i=0;i<len;i++)
            System.out.print(arr[i]+"  ");
        System.out.println();

    }
}
