public class LC-282-2185.CountingWordsWithaGivenPrefix {
    class Solution {
        public int prefixCount(String[] words, String pref) {
            int n=0,count=0;
            for(String s:words){
                if(s.length()>=pref.length()){
                    for(int i=0;i<pref.length();i++){
                        if(s.charAt(i)==pref.charAt(i)){
                            n++;
                        }
                    }
                }
                if(n==pref.length()){
                    count++;
                }
                n=0;
            }
            return count;
        }
    }
}
