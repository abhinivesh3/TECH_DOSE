public class LC-281-2180.CountIntegersWithEvenDigitSum {
    class Solution {
        public int countEven(int num) {
            int sum=0;
            int x=num;
            while(x>0){
                sum+=x%10;
                x/=10;
            }
            if(num%2==0 && sum%2==0){
                return num/2;
            }
            return (num-1)/2;
        }
    }
}
