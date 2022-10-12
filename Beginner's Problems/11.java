import java.util.*;
public class Main{
    //public int swap(int A,int B){
    //    A^=B;
    //    B^=A;
    //    A^=B;
    //}
    public static void Main{
        Scanner scanner=new Scanner(System.in);
        int A=scanner.nextInt();
        int B=scanner.nextInt();
        //swap(A,B);
        A=A+B;
        B=A-B;
        A=A-B;
        System.out.println(A+" "+B);
    }
}