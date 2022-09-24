

public class ZS45 {
     public static void print(String str,int space){
          for(int i=0;i<str.length();i++){
               for(int k=0;k<i;k++)
                    System.out.print(" ");
               System.out.print(str.charAt(i)+" ");
               for(int j=0;j<space;j++){
                    System.out.print(" ");
               }
               space=space-2;
               if(i!=str.length()-1)
                    System.out.println(str.charAt(i));

          }
     }
     public static void main(String args[]){
          String str = "123";
          int space = 3;
          int tem = str.length()-space;
          while (tem!=0){
               space += 2;
               tem--;
          }
          System.out.println(space);
          print(str,space);
     }
}
