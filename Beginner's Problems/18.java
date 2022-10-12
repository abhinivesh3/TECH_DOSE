import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        while(N){
            System.out.print(N%10+" ");
            N/=10;
        }
    }
}