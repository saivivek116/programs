//Not Executed
import java.util.*;
public class Hamiltonian {
	int x[];
	int a[][];
	int v;
	Hamiltonian(int n)
	{
		x=new int[n];
		a=new int[n][n];
		v=n;
	}
	public static void main(String ar[])
	{
		System.out.print("Enter the no of nodes :");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		Hamiltonian h=new Hamiltonian(n);
		System.out.print("Enter the cost Matrix :");
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				h.a[i][j]=s.nextInt();
		s.close();
		h.cycle(0);
	}
	public void cycle(int k)
	{
		while(true)
		{
			nextValue(k);
			if(x[k]==-1)
				return;
			if(k==v-1)
				for(int i=0;i<v;i++)
					System.out.print(x[i]+" ");
			else
				cycle(k+1);
			System.out.println("\nin loop 1");
		}
	}
	public void nextValue(int k)
	{
		while(true)
		{
			x[k]=x[k]+1;
			if(x[k]==v)
			{
				x[k]=-1;
			}
			if(x[k]==-1|| x[k+1]==-1)
				return;
			int i;
			if(a[x[k]][x[k+1]]==1)
			{
				for(i=0;i<k-1;i++)
					if(x[i]==x[k])
						break;
				if(i==k)
					if(k<(v-1)||(k==(v-1) && a[x[k]][x[0]]==1))
					{
						return;
					}
				System.out.println("\nin loop 3");
			}
			System.out.println("\nin loop 2");
			
		}
	}

}
