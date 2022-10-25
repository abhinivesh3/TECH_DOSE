public class LC-304-2357.MakeArrayZerobySubtractingEqualAmounts {
    class Solution {
        public int minimumOperations(int[] nums) {
            int count=0,c[]=new int[1000];
            for(int index=0;index<nums.length;index++){
                c[nums[index]]++;
                if(c[nums[index]]==1 && nums[index]!=0){
                    count+=1;
                }
            }
            return count;
        }
    }
}
