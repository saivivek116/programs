import java.util.*;

	public class obst {
		public static void main(String[] args)
		{
			int m,n,i,j;
			System.out.println("enter no.of elements");
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			
			int p[]=new int[n+1];
			int q[]=new int[n+1];
			System.out.println("enter p array");
			for(i=1;i<=n;i++)
				p[i]=sc.nextInt();
			System.out.println("enter q array");
			for(i=0;i<=n;i++)
				q[i]=sc.nextInt();
			optimal(p,q,n);
		}
		public static void optimal(int p[],int q[],int n)
		{
			int w[][]=new int[n+1][n+1];
			int c[][]=new int[n+1][n+1];
			int r[][]=new int[n+1][n+1];
			for(int i=0;i<=n-1;i++)
			{
				w[i][i]=q[i];
				c[i][i]=0;
				r[i][i]=0;
				w[i][i+1]=q[i]+p[i+1]+q[i+1];
				r[i][i+1]=i+1;
				c[i][i+1]=q[i]+q[i+1]+p[i+1];
			}
			w[n][n]=q[n];
			r[n][n]=0;
			c[n][n]=0;
			for(int m=2;m<=n;m++)
			{
				for(int i=0;i<=(n-m);i++)
				{
					int j=i+m;
					w[i][j]=w[i][j-1]+p[j]+q[j];
					int k=find(c,r,i,j);
					c[i][j]=w[i][j]+c[i][k-1]+c[k][j];
					r[i][j]=k;
				}
			}
			System.out.println(" \ncost array is");
			for(int i=0;i<=n;i++)
			{
				for(int j=0;j<=n;j++)
				{
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("\nweight array ");
			for( int i=0;i<=n;i++)
			{
				for(int j=0;j<=n;j++)
				{
					System.out.print(w[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("\nroot array is ");
			for(int i=0;i<=n;i++)
			{
				for(int j=0;j<=n;j++)
				{
					System.out.print(r[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("\nroot node is :"+r[0][n]);
		}
		private static int find(int [][]c,int [][]r,int i,int j)
		{
			int min=99,l=0;
			for(int m=r[i][j-1];m<=r[i+1][j];m++)
				
				
			{
				if((c[i][m-1]+c[m][j])<min)
				{
					min=(c[i][m-1]+c[m][j]);
					l=m;
				}
			}
			return l;
		}
	
	}
