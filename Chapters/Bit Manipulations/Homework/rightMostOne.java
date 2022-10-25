import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int bit=0;
        while(N>0){
            if((N&1)!=0){
                System.out.println(1<<bit);
                System.exit(0);
            }
            N=N>>1;
            bit++;
        }
    }
}