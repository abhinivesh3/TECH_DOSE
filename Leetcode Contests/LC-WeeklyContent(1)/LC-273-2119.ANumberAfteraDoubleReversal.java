public class LC-273-2119.ANumberAfteraDoubleReversal {
    class Solution {
        public boolean isSameAfterReversals(int num) {
            int rev=0,c=0;
            while(num>0){
                rev=rev*10+num%10;
                if(rev==0 &&c==0){
                    return false;
                }
                c++;
                num/=10;
            }
            return true;
        }
    }
}
