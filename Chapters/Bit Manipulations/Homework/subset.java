package Bit

Manipulations.Homework;

public class subset {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> l=new ArrayList<>();
            for(int j=0;j<n;j++){
                if(i & (1<<j) !=0){
                    l.add(arr[j]);
                }
            }
            list.add(l);
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
