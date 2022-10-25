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
		int [] arr=radixSort(a);
		for(int i=0;i<n;i++)
		{
		    System.out.print(arr[i]+" ");
		}
	}
	public static int[] radixSort(int[] a)
	{
      int n=a.length;
	    int max=a[0];
      for(int i=1;i<n;i++){
        max=Math.max(max,a[i]);
      }
      int masspass=(int)(Math.log(max)/Math.log(10));
      for(int i=0;i<=masspass;i++){
        int[]hash =new int[10];
        for(int j=0;j<n;j++){
          int b=a[j];
          int val=(b/(int)(Math.pow(10,i)))%10;
          hash[val]++;
        }
        for(int j=1;j<10;j++){
          hash[j]+=hash[j-1];
        }
        int[] arr=new int[n+1];
        for(int j=n-1;j>=0;j--){
          int b=a[j];
          int val= (b/(int)Math.pow(10,i))%10;
          arr[--hash[val]]=a[j];
        }
        a=arr;
      }
      return a;
	}
	
}