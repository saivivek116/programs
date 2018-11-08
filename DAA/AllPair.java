import java.util.*;
public class AllPair {
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the no of nodes :");
		int n=s.nextInt();
		int cost[][]=new int[n][n];
		//Dijk h=new Dijk(n);
		System.out.print("Enter the cost Matrix :");
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				cost[i][j]=s.nextInt();
		s.close();
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
			{
				if(i==j)
					continue;
				if(cost[i][j]==0)
					cost[i][j]=999;
			}
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				for(int k=0;k<n;k++)
				{
					if(cost[i][j]>(cost[i][k]+cost[k][j]))
						cost[i][j]=(cost[i][k]+cost[k][j]);
				}
		System.out.println("The Dist Matrix :");
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				System.out.print(cost[i][j]+" ");
	}
	
}
