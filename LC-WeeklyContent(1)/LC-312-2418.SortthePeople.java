package LC-WeeklyContent;

public class LC-312-2418.SortthePeople {
    class Solution {
        public String[] sortPeople(String[] names, int[] heights) {
            int n=heights.length;
            int m=names.length;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(heights[i]<heights[j]){
                        int temp=heights[i];
                        heights[i]=heights[j];
                        heights[j]=temp;
                        String ch=names[i];
                        names[i]=names[j];
                        names[j]=ch;
                    }
                }
            }
            return names;
        }
    }
}
