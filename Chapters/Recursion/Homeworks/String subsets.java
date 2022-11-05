package Recursion.Homeworks;

public class String subsets {
    import java.util.*;
    public class Main{
        static List<String> list=new ArrayList<>();
        static String s=" ";
        public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);
            String str=scanner.next();
            subSets(str,0,s);
            System.out.println(list);
        }
        public static void subSets(String str, int pos,String s){
            if(pos==str.length()){
                list.add(s);
                return;
            }
            subSets(str,pos+1,s);
            s+=str.charAt(pos);
            subSets(str,pos+1,s);
        }
    }
}
