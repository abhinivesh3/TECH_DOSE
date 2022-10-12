import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int X=scanner.nextInt();
        int Y=scanner.nextInt();
        int power=1;
        while(Y>0){
          if(Y%2==1){
            power=power*X;
          }
          X=X*X;
          Y=Y/2;
        }
        System.out.print(power);
    }
}