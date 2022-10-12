class Solution {
    public int mySqrt(int x) {
        long start=0;
        long end=x;
        while(start+1<end){
            long m=start+(end-start)/2;
            if(m*m==x){
                return (int)m;
            }
            else if(m*m<x){
                start=m;
            }
            else{
                end=m;
            }
        }
        if(end*end==x){
            return (int)end;
        }
        return (int)start;
    }
}