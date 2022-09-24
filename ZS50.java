//program to print the number in words

import java.util.Scanner;

public class ZS50 {
    public static void main(String args[]){
        String arr1[]= {" ","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seveneen","Nineteen"};
        String arr2[]={"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the No : ");
        int num = scanner.nextInt();
        System.out.print("Output : ");
        if(num<20)
            System.out.print(arr1[num]);
        else if (num<100) {
            int ones = num % 10, tens = num/10;
            System.out.print(arr2[tens]+" "+arr1[ones]);
        } else if (num<1000) {
            int ones = num % 10, tem = num%100, tens = tem/10, hun=num/100;
            if (tem==0)
             System.out.print(arr1[hun]+" Hundred");
            else if(tem<20)
                System.out.print(arr1[hun]+" Hundred and "+arr1[tem]);
            else
                System.out.print(arr1[hun]+" Hundred and "+arr2[tens]+" "+arr1[ones]);

        }
    }
}
