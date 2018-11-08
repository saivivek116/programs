import java.util.*;
class Knapsack
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        Knapsack ks=new Knapsack();
        System.out.println("Enter the no of elements");
        int n=s.nextInt();
        int[] wt=new int[n+1];
        int[] val=new int[n+1];
        
        System.out.println("Enter the weights of elements");
        for(int i=1;i<=n;i++)
            wt[i]=s.nextInt();
         System.out.println("Enter the values of elements");
         for(int i=1;i<=n;i++)
            val[i]=s.nextInt();
         System.out.println("Enter the knapsack weights");
         int w=s.nextInt();
         ks.solve(wt,val,w,n);
      }
      public void solve(int[] wt,int[] val,int W,int N)
      { 
        int NEGATIVE_INFINITY=Integer.MIN_VALUE;
        int[][] m=new int[N+1][W+1];
        int[][] sol=new int[N+1][W+1];
        for(int i=1;i<=N;i++)
        {
            for(int j=0;j<=W;j++)
            {
                int m1=m[i-1][j];
                int m2=NEGATIVE_INFINITY;
                if(j>=wt[i])
                {
                    m2=m[i-1][j-wt[i]]+val[i];
                 }
                 m[i][j]=Math.max(m1,m2);
                 sol[i][j]=m2>m1?1:0;
             }
         }
         int selected[]=new int[N+1];
         for(int n=N,w=W;n>0;n--)
         {
            if(sol[n][w]!=0)
            {
                selected[n]=1;
                w=w-wt[n];
             }
             else
             {
                selected[n]=0;
             }
         }
         System.out.println("Item with weights");
         for(int i=1;i<=N;i++)
         {
            if(selected[i]==1)
            {   
                System.out.println("1\t");
            }
            else
                System.out.println("0\t");
         }
    }
  }
                    
