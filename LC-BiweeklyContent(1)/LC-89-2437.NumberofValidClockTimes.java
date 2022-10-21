package LC-BiweeklyContent(1);

public class LC-89-2437. NumberofValidClockTimes
{
    class Solution {
        public int countTime(String time) {
            int h=1;
            if(time.charAt(4)=='?'){
                h*=10;
            }
            if(time.charAt(3)=='?'){
                h*=6;
            }
            if(time.charAt(0)=='?' && time.charAt(1)=='?'){
                h*=24;
            }
            else{
                if(time.charAt(1)=='?'){
                    if(time.charAt(0)=='2'){
                        h*=4;
                    }
                    else{
                        h*=10;
                    }
                }
                if(time.charAt(0)=='?'){
                    if(time.charAt(1)<'4'){
                        h*=3;
                    }
                    else{
                        h*=2;
                    }
                }
            }
            return h;
        }
    }
