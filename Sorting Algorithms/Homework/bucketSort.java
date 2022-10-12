import java.util.*;

public class Main {
    public class BucketSort {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];for(
        int i = 0;i<n;i++)
        {
		    a[i] = sc.nextInt();
		}

        bucket(a,n);
        System.out.println(Arrays.toString(a));
    }

    void bucket(int a[], int n) // function to implement bucket sort  
    {  
        int max = getMax(a, n); //max is the maximum element of array  
        int bucket[max], i;  
        for (int i = 0; i <= max; i++)  
        {  
            bucket[i] = 0;  
        }  
        for (int i = 0; i < n; i++)  
        {  
            bucket[a[i]]++;  
        }  
        for (int i = 0, j = 0; i <= max; i++)  
        {  
            while (bucket[i] > 0)  
            {  
            a[j++] = i;  
            bucket[i]--;  
            }  
        }  
    }

        int getMax(int a[], int n) {
            int max = a[0];
            for (int i = 1; i < n; i++)
                if (a[i] > max)
                    max = a[i];
            return max;
        }
}