import java.util.*;
public class Dijk {
	int dist[],cost[][],v;
	Dijk(int n)
	{
		dist=new int[n];
		cost=new int[n][n];
		v=n;
	}
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the no of nodes :");
		int n=s.nextInt();
		Dijk h=new Dijk(n);
		System.out.print("Enter the cost Matrix :");
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				h.cost[i][j]=s.nextInt();
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
			{
				if(i==j)
					continue;
				if(h.cost[i][j]==0)
					h.cost[i][j]=999;
			}
		System.out.print("Enter the Source Vertex :");
		int st=s.nextInt();
		s.close();
		System.out.print("Shortest path from Vertex "+ st +" is :");
		h.di(st);
	}
	public void di(int s)
	{
		boolean vis[]=new boolean[v];
		for(int i=0;i<v;i++)
		{
			dist[i]=cost[s][i];
		}
		vis[s]=true;
		dist[s]=0;
		int min=999,x=0,count=0;
		do
		{
			min=999;
			count=0;
			for(int i=0;i<v;i++)
			{
				if(dist[i]<min&&!vis[i])
				{
					min=dist[i];
					x=i;
				}
			}
			vis[x]=true;
			for(int i=0;i<v;i++)
			{
				if(dist[i]>(min+cost[x][i]))
				{
					dist[i]=(min+cost[x][i]);
					count=1;
				}
			}
		}while(count==1);
		for(int i=0;i<v;i++)
			System.out.print(dist[i]+"  ");
	}
}
