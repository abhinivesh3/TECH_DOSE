package LC-WeeklyContent(2);

public class LC-311-2414.LengthoftheLongestAlphabeticalContinuousSubstring {
    class Solution {
        public int longestContinuousSubstring(String s) {
            int len = 0;
            int i = 0;
            int n=s.length();
            while (i < n) {
                int end = Max(s, n, i);
                len = Math.max(end - i + 1, len);
                i = end + 1;
            }
            return len;
        }
        static int Max(String s, int n, int i)
        {
            i++;
            while (i < n) {
                char c = s.charAt(i);
                char p = s.charAt(i - 1);
                if ((c - p == 1))
                    i++;
                else
                    break;
            }
            return i-1;
        }
    }
    
}
