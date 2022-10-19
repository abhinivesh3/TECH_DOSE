public class LC-263-2042.CheckifNumbersAreAscendinginaSentence {
    class Solution {
        public boolean areNumbersAscending(String s) {
            int prev=0;
            for(String str:s.split(" ")){
                try{
                    int number=Integer.parseInt(str);
                    if(number<=prev){
                        return false;
                    }
                    prev=number;
                }
                catch(Exception e){}
            }
            return true;
        }
    }
}
