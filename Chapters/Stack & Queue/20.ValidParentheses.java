package Stack & Queue;

public class 20.ValidParentheses {
    class Solution {
        public boolean isValid(String s) {
            Stack <Character> stack=new Stack<>();
            char[] str=s.toCharArray();
            for(int i=0;i<str.length;i++){
                if(str[i]=='('||str[i]=='{' ||str[i]=='['){
                    stack.push(str[i]);
                }
                else if(stack.empty()){
                    return false;
                }
                else if(str[i] == ')' && stack.pop() != '('){
                    return false;
                }
                else if(str[i] == ']' && stack.pop() != '['){
                    return false;
                }
                else if(str[i] == '}' && stack.pop() != '{'){
                    return false;
                }
            }
            return stack.empty();
        }
    }
}
