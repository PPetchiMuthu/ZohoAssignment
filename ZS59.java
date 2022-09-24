/* print the below format
        +===+===+
        |||
        |||
        |||
        +===+===+
        |||
        |||
        |||
        +===+===+
 */
public class ZS59 {
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            if(i%2!=0)
                System.out.println("+===+===+");
            else
                for(int j=0;j<3;j++)
                    System.out.println("|||");
        }
    }
}
