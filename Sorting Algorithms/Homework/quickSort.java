import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i] = sc.nextInt();
		}
		quickSort(a,0,n-1);
		for(int i=0;i<n;i++)
		{
		    System.out.print(a[i]+" ");
		}
	}
	public static void quickSort(int[] a,int start,int end)
	{
	    if(start<end){
	      int pivot =partition(a,start,end);
	      quickSort(a,start,pivot-1);
	      quickSort(a,pivot+1,end);
      }
	}
	public static int partition(int[] a,int start,int end)
	{
	    int i = (start-1);
      int pivot=a[end];
      for(int j=start;j<end;j++){
          if(a[j]<pivot){
            i++;
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
          }
      }
      int temp=a[i+1];
      a[i+1]=a[end];
      a[end]=temp;
	    return i+1;
	}
}