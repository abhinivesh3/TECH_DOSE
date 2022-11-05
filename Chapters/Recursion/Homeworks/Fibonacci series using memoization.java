package Recursion.Homeworks;

public class Fibonacci series using memoization {
    import java.util.*;
    public class Main{
        public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);
            int N=scanner.nextInt();
            System.out.println(Fibonacci(N));
        }
        public static int Fibonacci(int N){
            int [] fib=new int[N+1];
            fib[0]=0;
            fib[1]=1;
            for(int i=2;i<=N;++i){
                fib[i]=fib[i-1]+fib[i-2];
            }
            return fib[N];
        }
    }
}
