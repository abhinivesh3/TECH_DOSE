package LC-WeeklyContent;

public class LC-313-2427.NumberofCommonFactors {
    class Solution {
        public int commonFactors(int a, int b) {
            int n,count=0;
            if(a<b){
                n=a;
            }
            else{
                n=b;
            }
            for(int i=1;i<=n;i++){
                if(a%i==0 && b%i==0){
                    count++;
                }
            }
            return count;
        }
    }
}
