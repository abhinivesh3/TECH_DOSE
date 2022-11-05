package Recursion.Homeworks;

public class Fibonacci series using recursion {
    import java.util.*;
    public class Main{
        public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);
            int N=scanner.nextInt();
            System.out.println(Fibonacci(N));
        }
        public static int Fibonacci(int N){
            if(N==0 || N==1){
                return N;
            }
            return Fibonacci(N-1)+Fibonacci(N-2);
        }
    }
}
