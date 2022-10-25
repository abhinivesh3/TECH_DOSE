class Solution {
    public int[] decode(int[] encoded) {
        int a=0,x=0;
        int n=(encoded.length)+1;
        for(int i=1;i<=n;i++){
            a^=i;
        }
        for(int i=1;i<encoded.length;i+=2){
            x^=encoded[i];
        }
        int f=x^a;
        int [] ans=new int[n];
        ans[0]=f;
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]^encoded[i-1];
        }
        return ans;
    }
}