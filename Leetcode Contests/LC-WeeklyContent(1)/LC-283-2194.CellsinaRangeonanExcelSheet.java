public class LC-283-2194.CellsinaRangeonanExcelSheet {
    class Solution {
        public List<String> cellsInRange(String s) {
            char[]  c=s.toCharArray();
            int st=c[1]-'0';
            int end=c[4]-'0';
            List <String> al=new ArrayList<String>();
            for(char ch=c[0];ch<=c[3];ch++)
            {
                for(int i=st;i<=end;i++){
                    al.add(ch+""+i);
                }
            }
            return al;
        }
    }
}
