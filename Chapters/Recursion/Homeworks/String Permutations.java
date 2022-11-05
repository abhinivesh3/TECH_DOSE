package Recursion.Homeworks;

public class String Permutations {
    import java.util.*;
    public class Main{
        public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);
            String str=scanner.next();
            String word=" ";
            Permutation(str,word); 
        }
        public static void Permutation(String str,String word){
            if(str.length()==0){
                System.out.println(word+" ");
                return;
            }
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                String left=str.substring(0,i);
                String right=str.substring(i+1);
                Permutation(left+right,word+ch);
            }
        }
    }
}