package Stack & Queue;

public class 224. Basic Calculato {
    class Solution {
        public int calculate(String s) {
            Stack<Integer> st = new Stack<>();
            int res = 0;
            int num = 0;
            int sign=1;
            for(int i=0;i<s.length();i++){
                if(Character.isDigit(s.charAt(i))){
                    num = num*10 + (int)(s.charAt(i)-'0');
                }
                else if(s.charAt(i)=='+'){
                    res+=num*sign;
                    num=0;
                    sign=1;
                }
                else if(s.charAt(i)=='-'){
                    res+=num*sign;
                    num=0;
                    sign=-1;
                }
                else if(s.charAt(i)=='('){
                    st.push(res);
                    st.push(sign);
                    sign=1;
                    res=0;
                }
                else if(s.charAt(i)==')'){
                    res+=sign*num;
                    num=0;
                    res*=st.pop();
                    res+=st.pop();
                }
            }
            if(num!=0){
                res+=sign*num;
            }
            return res; 
        }
    }
}
