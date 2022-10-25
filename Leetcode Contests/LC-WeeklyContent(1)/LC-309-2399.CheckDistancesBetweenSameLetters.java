public class LC-309-2399.CheckDistancesBetweenSameLetters {
    class Solution{
    public boolean checkDistances(String s, int[] distance){
        int [] m = new int[26];
        int n;
        for(int i=0; i<26; i++){
            m[i] = -1;
        }
        for(int i=0; i<s.length(); i++){
            n = s.charAt(i)-'a';
            if(m[n]==-1){
                m[n] = i;
            }
            else{
                if(i-m[n]-1!=distance[n]){
                    return false;
                }
            }
        }
        return true;
    }
}
}
