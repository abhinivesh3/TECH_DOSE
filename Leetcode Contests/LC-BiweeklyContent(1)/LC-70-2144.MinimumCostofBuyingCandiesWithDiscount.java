package LC-BiweeklyContent;

public class LC-70-2144.MinimumCostofBuyingCandiesWithDiscount {
    class Solution {
        public int minimumCost(int[] cost) {
            Arrays.sort(cost);
            int sum=0,n=cost.length;
            for(int i=0;i<n;i+=1){
                if(i%3!=n%3){
                    sum+=cost[i];
                }
            }
            return sum;
        }
    }
}
