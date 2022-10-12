package LC-WeeklyContent;

public class LC-314-2432.TheEmployeeThatWorkedontheLongestTask {
    class Solution {
        public int hardestWorker(int n, int[][] logs) {
            int r= logs.length;
            int start=0,max=0,id=0,tt;
            for(int i=0;i<r;i++){
                tt=logs[i][1]-start;
                start=logs[i][1];
                if(tt>max){
                    max=tt;
                    id=logs[i][0];
                }
                else if(tt==max){
                    if(id>logs[i][0]){
                        id=logs[i][0];
                    }
                }
            }
            return id;
        }
    }
}
