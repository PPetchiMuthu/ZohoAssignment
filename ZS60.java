import java.util.Scanner;

public class ZS60 {
    public static void find(char[][] a,String b){

        for(int i=0;i< a.length;i++){
            for(int j=0;j<a.length;j++)
            {
                boolean dum = false;
                if(j<=a.length/2){
                    for(int k=0;k<b.length();k++) {
                        if (a[i][j + k] == b.charAt(k)) {
                            if (k == b.length() - 1)
                                dum = true;
                        } else
                            break;
                    }
                    if(dum) {
                        System.out.println("Start index : <" + i + ", " + j + ">");
                        System.out.println("End index : <" + (i ) + ", " + (j + b.length() - 1) + ">");
                    }

                }
                if(i<=a.length/2){
                    for(int k=0;k<b.length();k++)
                    {
                        if (a[i+k][j] == b.charAt(k)){
                            if(k==b.length()-1)
                                dum=true;
                        }
                        else
                            break;
                    }
                if(dum) {
                    System.out.println("Start index : <" + i + ", " + j + ">");
                    System.out.println("End index : <" + (i + b.length() - 1) + ", " + (j) + ">");
                }
                }
            }
        }

    }
    public static void main (String args[]){
        char[][] a ={{'W','E','L','C','O'},{'M','E','T','O','Z',},{'O','H','O','C','O'},{'R','P','O','R','A'},{'T','I','O','N'}};
        String b= "COC";
        find(a,b);

    }
}
