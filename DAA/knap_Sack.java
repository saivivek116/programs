import java.util.*;
class object
{
	int num,w,p;
}
class knap_Sack
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of objects:");
		int n = s.nextInt();
		object b[] = new object[n+1];
		for(int i=1;i<=n;i++)
		{
			System.out.printf("Enter the weight and profit of %d object\n",i);
			object obj = new object();
			obj.num = i;
			obj.w = s.nextInt();
			obj.p = s.nextInt();
			b[i] = obj;
		}
		System.out.printf("Enter the capacity of the KnapSack:\n");
		int c = s.nextInt();
		int t[][] = new int[n+1][c+1];
		for(int i=0;i<=c;i++)
			t[0][i] = 0;
		for(int i=1;i<=n;i++)
		{
			t[i][0] = 0;
			for(int j=1;j<=c;j++)
			{
				if((b[i].w<=j)&&((t[i-1][j-b[i].w] + b[i].p)>t[i-1][j]))
					t[i][j] = t[i-1][j-b[i].w] + b[i].p;
				else
					t[i][j] = t[i-1][j];
			}
		}
		int i = n-1,j,x=t[n][c],a;
		System.out.println("\nweight  and profit of the objects included in the bag are:\n\nobject\tweight\tprofit");
		while(x>0)
		{
			a=0;
			for(j=0;j<=c;j++)
			{
				if(t[i][j]==x)
				{
					a++;
					break;
				}
			}
			if(a==0)
			{
				System.out.printf("%d\t%d\t%d\n",b[i+1].num,b[i+1].w,b[i+1].p);
				x-=b[i+1].p;
			}
			else
				i--;
		}	
		System.out.printf("The profit obtained is %d\n",t[n][c]);	
	}
}
