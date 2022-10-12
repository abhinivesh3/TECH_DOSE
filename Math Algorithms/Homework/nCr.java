import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		int [][]pascalTriangle = new int[n+1][n+1];
		for(int i=0;i<=n;i++)
		{
		    for(int j=0;j<=i;j++)
		    {
		        if(j==0 || j==i)
		        {
		            pascalTriangle[i][j] = 1;
		        }
		        else{
		            pascalTriangle[i][j] = pascalTriangle[i-1][j-1]+pascalTriangle[i-1][j];
		        }
		    }
		}
		System.out.println(pascalTriangle[n][r]);
	}
}