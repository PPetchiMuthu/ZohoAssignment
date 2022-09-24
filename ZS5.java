//generate the division and addition table

import java.util.Scanner;

public class ZS5 {
    public static void divi(int n){
        System.out.println("Division table for "+n);
        for(int i=1;i<=10;i++)
            System.out.println(i+" / "+n+" = "+(n/(float)i));
    }
    public static void add(int n){
        System.out.println("Addition table for "+n);
        for(int i=1;i<=10;i++)
            System.out.println(i+" + "+n+" = "+(n+i));
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no : ");
        int num = scanner.nextInt();
        divi(num);
        add(num);
    }
}
