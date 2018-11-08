import java.util.*;
import static java.lang.Math.abs;
public class NQueens {
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter no of Queens :");
		int n= s.nextInt();
		int x[]=new int[n+1];
		NQueens nq=new NQueens();
		s.close();
		nq.queen(x,1,n);
	}
	public void queen(int[] x,int k,int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(place(x,k,i))
			{
				x[k]=i;
				if(k==n) {
					for(int j=1;j<=n;j++) {
						System.out.print(x[j]+" ");
						}
					System.out.println();
				}
				else queen(x,k+1,n);
			}
		}
	}
	public boolean place(int[] x,int k,int i)
	{
		for(int j=1;j<=k-1;j++)
		{
			if(x[j]==i||(abs(x[j]-i)==(abs(j-k))))
				return false;
		}
		return true;
	}
}
