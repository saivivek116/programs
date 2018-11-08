import java.util.*;

 class Dijsktra
 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int v,n=100,i,j;
        System.out.println("Enter the source vertex");
        v=s.nextInt();
        System.out.println("Enter the no of vertices");
        n=s.nextInt();
        int[][] cost=new int[n+1][n+1];
        System.out.println("enter the values into cost matrix");
        
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                cost[i][j]=s.nextInt();
                if(cost[i][j]==0)
                {
                    cost[i][j]=999;
                }
            }
        }
     
        int[] dist=new int[n+1];
        shortestPath(v,cost,dist,n);
         for(int a=1;a<=n;a++)
            {
                System.out.println(dist[a]);
            }  
     }
      public static void shortestPath(int v,int[][] cost,int[] dist,int n)
    {
        boolean[] s=new boolean[n+1];
        int pre[]=new int[n+1];
        for(int i=1;i<=n;i++)
        {
            s[i]=false;
            dist[i]=cost[v][i];
            pre[i]=v;
        }
        s[v]=true;dist[v]=0;
        for(int i=2;i<=n;i++)
        {
                int min=999,x=0;
                for(int j=1;j<=n;j++)
                {
                    
                    if((s[j]==false)&&(min>=dist[j]))
                    {
                        min=dist[j];
                        x=j;
                    }
                 } 
                 s[x]=true;
                 for(int j=1;j<=n;j++)
                 {
                        if(dist[j]>dist[x]+cost[x][j]){
                               dist[j]=dist[x]+cost[x][j];
                               pre[j]=x;
                               }
                     }
            }
            int j=0;
            for(int i=1;i<=n;i++)
            {
                if(i!=v)
                {
                    System.out.println("\nDist of node"+i+" ="+dist[i]);
                    System.out.print("%\n path is"+i);
                    j=i;
                    do{
                        j=pre[j];
                        System.out.print("<-"+j);
                        }while(j!=v);
                 }
                 System.out.println("");
             }
    }
 }
