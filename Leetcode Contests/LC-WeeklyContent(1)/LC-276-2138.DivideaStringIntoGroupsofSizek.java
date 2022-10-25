package LC-WeeklyContent;

public class LC-276-2138.DivideaStringIntoGroupsofSizek {
    class Solution {
        public String[] divideString(String s, int k, char fill) {
            int n=s.length()%k!=0 ? (s.length()/k)+1:s.length()/k;
            String []string=new String[n];
            StringBuilder str=new StringBuilder(s);
            if(s.length()%k>0){
                for(int i=0;i<k-(s.length()%k);i++){
                    str.append(fill);
                }
            }
            s=str.toString();
            str.setLength(0);
            int i=0;
            for(char ch:s.toCharArray()){
                str.append(ch);
                if(str.length()==k){
                    string[i++]=str.toString();
                    str.setLength(0);
                }
            }
            return string;
        }
    }
    
}
