import java.util.*;
public class SubsetSum {
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the no of Elements:");
		int n=s.nextInt();
		int a[]=new int[n];
		int x[]=new int[n];
		System.out.print("Enter the Elements in Ascending Order :");
		for(int  i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.print("Enter the Sum :");
		int m=s.nextInt();
		int sum=0;
		int r=0;
		for(int  i=0;i<n;i++)
		{
			r=r+a[i];
		}
		SubsetSum ss=new SubsetSum();
		ss.sos(sum,r,0,n,x,a,m);
	}
	public void sos(int s,int r,int k,int n,int[] x,int[] arr,int m)
	{
		x[k]=1;
		if(s+arr[k]==m)
		{
			for(int  i=0;i<n;i++)
			{
				System.out.print(x[i]+" ");
			}
			System.out.println();
		}
		else if(k<n-1&&s+arr[k]+arr[k+1]<=m)
		{
			sos(s+arr[k],r-arr[k],k+1,n,x,arr,m);
			for(int i=k;i<n;i++)
				x[i]=0;
		}
		if(s+r-arr[k]>=m&&s+arr[k+1]<=m)
		{
			x[k]=0;
			sos(s,r-arr[k],k+1,n,x,arr,m);
		}
	}
	
}

