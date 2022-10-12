import java.util.*;
public class Main{
    public static void insertionSort(List<Integer> array,int value){
        array.add(value);
        int N=array.size();
        for(int i=N-1;i>=1;i--){
           if(array.get(i)>array.get(i-1)){
                break;
           }
           Collections.swap(array,i,i-1);
        }
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        List<Integer> array=new ArrayList<>();
        for(int i=0;i<N;i++){
            int value=scanner.nextInt();
            insertionSort(array,value);
        }
        for(int i:array){
            System.out.print(i+" ");
        }
    }
}