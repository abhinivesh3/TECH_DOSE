public class LC-303-2351.FirstLettertoAppearTwice {
    class Solution {
        public char repeatedCharacter(String s) {
            int []count=new int[126];
            char[] str=s.toCharArray();
            char ch='a';
            for(int index=0;index<s.length();index++){
                count[str[index]]++;
                if(count[str[index]]==2){
                    ch=str[index];
                    break;
                }
            }
            return ch;
        }
    }    
}
