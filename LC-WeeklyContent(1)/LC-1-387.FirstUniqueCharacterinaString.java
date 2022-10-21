public class LC-1-387.FirstUniqueCharacterinaString {
    class Solution {
        public int firstUniqChar(String s) {
            int []count=new int[126];
            for(int i=0;i<s.length();i++){
                count[s.charAt(i)]++;
            }
            for(int i=0;i<s.length();i++){
                if(count[s.charAt(i)]==1){
                    return i;
                }
            }
            return -1;
        }
    }
}
