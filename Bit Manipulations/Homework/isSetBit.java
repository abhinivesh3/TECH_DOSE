import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt();
        int pos=scanner.nextInt();
        if(pos<0){
            System.out.println("Invalid Position");
        }
        else{
            System.out.println((N&(1<<(pos-1)))==0 ? "No" : "Yes");
        }
    }
}