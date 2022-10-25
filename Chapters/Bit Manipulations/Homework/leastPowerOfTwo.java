import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int bit=0;
        while(N>0){
            N=N>>1;
            bit++;
        }
        System.out.println(1<<(bit-1));
    }
}