public class 164. Maximum Gap {
    class Solution {
        public int maximumGap(int[] nums) {
            int n=nums.length;
            int max=nums[0];
            for(int i=1;i<n;i++){
                if(max<nums[i]){
                    max=nums[i];
                }
            }
            int masspass=(int)(Math.log(max)/Math.log(10));
            for(int i=0;i<=masspass;i++){
                int[]hash=new int[10];
                for(int j=0;j<n;j++){
                    int b=nums[j];
                    int val=(b/(int)Math.pow(10,i))%10;
                    hash[val]++;
                }
                for(int j=1;j<10;j++){
                    hash[j]+=hash[j-1];
                }
                int [] arr=new int[n+1];
                for(int j=n-1;j>=0;j--){
                    int b=nums[j];
                    int val=(b/(int)Math.pow(10,i))%10;
                    arr[--hash[val]]=nums[j];
                }
                nums=arr;
            }
            int m=0;
            for(int i=0;i<n-1;i++){
                if(m<Math.abs(nums[i]-nums[i+1])){
                    m=Math.abs(nums[i]-nums[i+1]);
                }
            }
            return m;
        }
    }
}
