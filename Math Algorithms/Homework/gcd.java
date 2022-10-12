import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int A=scanner.nextInt();
        int B=scanner.nextInt();
        int G=gcd(A,B);
        System.out.println("GCD :"+G);
        int L=A*B/G;
        System.out.println("LCD :"+L);
    }
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    } 
}