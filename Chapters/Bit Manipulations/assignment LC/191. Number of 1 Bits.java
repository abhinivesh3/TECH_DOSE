package Bit Manipulations.assignment LC;

public class 191. Number of 1 Bits{
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        // 1
        // int one=0;
        // while(n!=0){
        // one+=(n&1);
        // n=n>>>1;
        // }
        // return one;
        // 2
        // int count=0;
        // for(int i=0;i<32;i++){
        // int mask=(1<<i);
        // if((n&mask)!=0){
        // count+=1;
        // }
        // }
        // return count;
        // 3
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count += 1;
        }
        return count;
    }
}}
