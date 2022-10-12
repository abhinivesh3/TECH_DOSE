import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        if(N<=1){
            System.out.println("Not Prime");
            System.exit(0);
        }
        else{
            for(int i=2;i*i<N;i++){
                if(N%i==0){
                    System.out.println("Not Prime");
                    System.exit(0);
                }
            }
        }
        System.out.println("Prime");
    }
}