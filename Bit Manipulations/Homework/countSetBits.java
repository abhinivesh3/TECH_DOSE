import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int count=0;
        while(N>0){
            if((N&1)==1){
                count++;
            }
            N=N>>1;
        }
        System.out.println(count);
    }
}