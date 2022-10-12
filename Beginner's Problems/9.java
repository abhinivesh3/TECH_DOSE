import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int [] array=new int[N];
        double sum=0;
        for(int i=0;i<N;i++){
            array[i]=scanner.nextInt();
            sum+=array[i];
        }
        System.out.printf("Mean: %.2f%n"+sum/N+"\n")
        Arrays.sort(array);
        if(N%2==0){
            System.out.println("Median : "+arr[N/2]);
        }
        else{
            System.out.printf("Median : %.2f%n"+(arr[(N/2)-1]+ arr[(N/2)])*0.5);
        }
        int mode=0;
        int i=0;
        while(i<N){
            int count=0,j=i+1;
            while(j<N && arr[i]==arr[j]){
                count++;
                j++;
            }
            if(count>mode){
                mode=count;
            }
            i=j;
        }
        i=0;
        System.out.print("Mode : ");
        while(i<N){
            int count=0,j=i+1;
            while(j<N && arr[i]==arr[j]){
                count++;
                j++;
            }
            if(count==mode){
                System.out.print(arr[i]+" ");
            }
            i=j;
        }
    
    }
}