//print all the substring of the given string

public class ZS56 {
    public static void main(String args[]){
        String str = "ABCD";
        int len = str.length();
        for(int i=1;i<=len;i++)
            for(int start=0;start<=len-i;start++){
                int end = start+i;
                for(int k=start;k<end;k++)
                    System.out.print(str.charAt(k));
                System.out.println();
        }

    }
}
