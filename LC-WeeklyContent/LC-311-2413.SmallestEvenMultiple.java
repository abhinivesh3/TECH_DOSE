public class LC-311-2413.SmallestEvenMultiple {
    class Solution {
        public int smallestEvenMultiple(int n) {
            int i=2,value=1;
            while(n>0){
                if(i%2==0 && i%n==0){
                    value=i;
                    break;
                }
                i++;
            }
            return value;
    
        }
    }
}
