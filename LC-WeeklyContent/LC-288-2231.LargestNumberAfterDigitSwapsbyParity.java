package LC-WeeklyContent;

public class LC-288-2231.LargestNumberAfterDigitSwapsbyParity {
    class Solution {
        public int largestInteger(int num) {
            char[] a=String.valueOf(num).toCharArray();
            int i,j,n=a.length;
            for(i=0;i<n;i+=1){
                for(j=i+1;j<n;j++){
                    if(a[i]<a[j] && (a[j]-a[i])%2==0){
                        char temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
                }
            }
            return Integer.parseInt(new String (a));
        }
    }
}
