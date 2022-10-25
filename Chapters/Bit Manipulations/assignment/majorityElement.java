class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int m=0;
        for(int i=0;i<32;i++){
            int b=(1<<i),count=0;
            for(int j:nums){
                if((j&b)!=0){
                    count+=1;
                }
            }
            if(count>(n/2)){
                m|=b;
            }
        }
        return m;
    }
}