import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int pos=scanner.nextInt();
        System.out.println(N^(1<<(pos-1)));
    }
}