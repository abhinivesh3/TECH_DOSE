class Solution {
    public int climbStairs(int n) {
        if(n==0){
            return 0;
        }
        else{
            int[] N=new int[n+1];
            N[0]=1;
            N[1]=1;
            for(int i=2;i<=n;i++){
                N[i]=N[i-1]+N[i-2];
            }
            return N[n];
        }
        
    }
}