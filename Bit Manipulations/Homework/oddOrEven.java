import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(((a&1)==0)?"Even":"Odd");
        return 0;
    }
}