public class LC-310-2404.MostFrequentEvenElement {
    class Solution {
        public int mostFrequentEven(int[] nums) {
            int max=0;
            int val=29999,count=0;
            int n=nums.length;
            Arrays.sort(nums);
            for(int i=0;i<n;i++){
                int c=0;
                for(int j=0;j<n;j++){
                    if(nums[i]==nums[j] && nums[i]%2==0){
                        c++;
                    }
                }
                if(c>max ){
                    max=c;
                    val=nums[i];
                    count=1;
                }
            }
            if(count==0){
                return -1;
            }
            return val;
        }
    }
}
