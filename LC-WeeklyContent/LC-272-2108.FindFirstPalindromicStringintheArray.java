public class LC-272-2108.FindFirstPalindromicStringintheArray {
    class Solution {
        public String firstPalindrome(String[] words) {
            for(String str:words){
                if(checkPalindromic(str)){
                    return str;
                }
            }
            return "";
        }
        public boolean checkPalindromic(String s){
            int right=0,left=s.length()-1;
            while(right<=left){
                if(s.charAt(right)!=s.charAt(left)){
                    return false;
                }
                right++;
                left--;
            }
            return true;
        } 
    }
}
