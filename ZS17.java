//define the functionality of a conditional operators

public class ZS17 {
    static void and(int a,int b, int c){
        System.out.println("AND operators");
        System.out.println("True + True : "+(a>b&&c>b));
        System.out.println("True + False : "+(a>b&&b>c));
        System.out.println("False + False : "+(a<b&&b>c));
    }
    static void or(int a,int b, int c){
        System.out.println("OR operators");
        System.out.println("True + True : "+(a>b||c>b));
        System.out.println("True + False : "+(a>b||b>c));
        System.out.println("False + False : "+(a<b||b>c));
    }
    static void not(int a,int b, int c){
        System.out.println("NOT operators");
        System.out.println("True  : "+!(a>b));
        System.out.println("False : "+!(b>c));
    }
    public static void main(String args[]){
        int a = 10, b = 5 , c = 8;
        or(a,b,c);
        and(a,b,c);
        not(a,b,c);

    }

}
