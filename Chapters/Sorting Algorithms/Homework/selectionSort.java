import java.util.*;
public class Main{
    public static void selectionSort(int[] array){
        int N=array.length;
        for(int i=0;i<N-1;i++){
            int minIndex=i;
            for(int j=i+1;j<N;j++){
                if(array[minIndex]>array[j]){
                    minIndex=j;
                }
            }
            int temp=array[minIndex];
            array[minIndex]=array[i];
            array[i]=temp;
        }
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int[] array=new int[N];
        for(int i=0;i<N;i++){
            array[i]=scanner.nextInt();
        }
        selectionSort(array);
        for(int i=0;i<N;i++){
            System.out.print(array[i]+" ");
        }
    }
}