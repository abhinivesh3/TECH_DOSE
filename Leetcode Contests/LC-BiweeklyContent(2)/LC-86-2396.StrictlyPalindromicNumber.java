package LC-BiweeklyContent(2);

public class LC-86-2396.StrictlyPalindromicNumber {
    class Solution {
        public boolean isStrictlyPalindromic(int n) {
            return check(n,2);
        }
        public boolean check(int k,int base){
            int n=k;
            String s1="";
            String s2="";
            while(n!=0){
                s1=s1+(n%base);
                s2=(n%base)+s2;
                n=n/base;
            }
            if(s1.equals(s2)){
                if(base+1<=k-2){
                    check(k,base+1);
                }
                else{
                    return true;
                }
            }
            return false;
        }
    }
}
