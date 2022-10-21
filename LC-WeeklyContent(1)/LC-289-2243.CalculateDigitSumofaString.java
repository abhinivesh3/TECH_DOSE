public class LC-289-2243.CalculateDigitSumofaString {
    class Solution {
        public String digitSum(String s, int k) {
            StringBuilder ans=new StringBuilder(s);
            while(ans.length()>k){
                StringBuilder str=new StringBuilder();
                for(int i=0;i<ans.length();i+=k){
                    int sum=0;
                    for(int j=0;j<k && (j+i)<ans.length();j++){
                        sum+=ans.charAt(i+j)-'0';
                    }
                    str.append(sum+"");
                }
                ans=str;
            }
            return ans.toString();
        }
    }
}
