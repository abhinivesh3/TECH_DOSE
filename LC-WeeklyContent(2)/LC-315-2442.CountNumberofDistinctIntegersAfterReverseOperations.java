package LC-WeeklyContent(2);

public class LC-315-2442.CountNumberofDistinctIntegersAfterReverseOperations {
    class Solution {
        public int countDistinctIntegers(int[] nums) {
            HashSet<Integer> list=new HashSet<>();
            for(int n:nums){
                list.add(n);
                int m=0;
                while(n>0){
                    m=m*10+n%10;
                    n/=10;
                }
                list.add(m);
            }
            return list.size();
        }
    }
}
