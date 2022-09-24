//Using recursion reverse the String

public class ZS49 {
    static void revString(String str){
        int len = str.length();
        int last = len;
        for(int i=len-1;i>=0;i--)
            if(str.charAt(i) == ' ') {
                for (int j = i + 1; j < last; j++)
                    System.out.print(str.charAt(j));
                System.out.print(" ");
                last = i;
            }
        for (int i=0;i<last;i++)
            System.out.print(str.charAt(i));
    }
    public static void main(String args[]){
        String str = "one two three four five";
        revString(str);

    }
}
