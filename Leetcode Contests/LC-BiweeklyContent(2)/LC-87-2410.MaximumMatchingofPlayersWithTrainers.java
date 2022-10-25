package LC-BiweeklyContent(2);

public class LC-87-2410.MaximumMatchingofPlayersWithTrainers {
    class Solution {
        public int matchPlayersAndTrainers(int[] players, int[] trainers) {
            int count=0,j=0;
            Arrays.sort(players);
            Arrays.sort(trainers);
            for(int i=0;i<players.length && j<trainers.length;i++){
                while(j<trainers.length && players[i]>trainers[j]){
                    j++;
                }
                if(j<trainers.length && players[i]<=trainers[j]){
                    count++;
                }
                j++;
            }
            return count;
        }
    }
}
