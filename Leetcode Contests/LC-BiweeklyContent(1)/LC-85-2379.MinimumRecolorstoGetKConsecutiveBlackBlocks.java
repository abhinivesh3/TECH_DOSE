package LC-BiweeklyContent;

public class LC-85-2379.MinimumRecolorstoGetKConsecutiveBlackBlocks {
    class Solution {
        public static int concecutive(String blocks,int length,int iniPos,int k){
            int c=0,o=0;
            for(int i=iniPos;i<length;i++){
                if(blocks.charAt(i)=='B'){
                    c+=1;
                }
                else if(blocks.charAt(i)=='W' && c<k){
                    o+=1;
                    c+=1;
                }
                if(c==k){
                    return o;
                }
            }
            return 0;
            
        }
        public int minimumRecolors(String blocks,int k){
            int c=0;
            int length=blocks.length();
            int a=0,minimum=100;
            for(int i=0;i<length;i++){
                while(i<length && blocks.charAt(i)=='B'){
                    c+=1;
                    i+=1;
                }
                if(c>=k){
                    minimum=0;
                    a=1;
                }
                else{
                    c=0;
                }
            }
            if(a==0){
                for(int i=0;i<length;i++){
                    if(concecutive(blocks,length,i,k)!=0){
                        c=concecutive(blocks,length,i,k);
                    }
                    if(minimum>c){
                        minimum=c;
                    }
                }
            }
            return minimum;
        }
    }
}
