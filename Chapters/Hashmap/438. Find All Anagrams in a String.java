package Hashmap;

public class 438. Find All Anagrams in a String {
    class Solution {
        public List<Integer> findAnagrams(String s, String p) {
            List<Integer> list=new ArrayList<>();
            int[] str1=new int[26];
            int[] str2=new int[26];
            if(s.length()<p.length()){
                return list;
            }
            for(int i=0;i<p.length();i++){
                str1[s.charAt(i)-'a']++;
                str2[p.charAt(i)-'a']++;
            }
            if(Arrays.equals(str1,str2)){
                list.add(0);
            }
            int left=0,right=p.length();
            while(right<s.length()){
                str1[s.charAt(left)-'a']--;
                str1[s.charAt(right)-'a']++;
                if(Arrays.equals(str1,str2)){
                    list.add(left+1);
                }
                left++;
                right++;
            }
            return list;
        }
    } 
}
