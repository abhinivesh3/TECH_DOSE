import java.util.*;
public class Main{
    public static int prime(int N){
        for(int i=2;(i*i)<=N;i++){
            if(N%i==0){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        for(int i=1;i<=N;i++){
            if(prime(i)==1){
                System.out.print(i+" ");
            }
        }
    }
}