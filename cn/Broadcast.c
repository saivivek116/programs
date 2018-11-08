#include<stdio.h>
int main()
{   
    int n;
    printf("Enetr the no of nodes");
    scanf("%d",&n);
    int adj[n][n],visited[n],src;
    printf("Enter the adjacency matrix:\n");
    for(int i=0;i<n;i++)
    {
            for(int j=0;j<n;j++)
                {
                    scanf("%d",&adj[i][j]);
                 }
     }
     for(int i=0;i<n;i++)
     {
           visited[i]=0;
      }
      printf("Enter the source node:\n");
      scanf("%d",&src);
      visited[src]=1;
      int x=src,i=0;
      printf("The traversal from source is:\n");
      printf("%d\t",x);
      while(i<n)
      { 
        if(adj[x][i]==1&&visited[i]==0)
        {
            printf("%d\t",i);
            x=i;
            visited[i]=1;
            i=-1;
         }
         i++;
      }
      return 0;
}

                    
