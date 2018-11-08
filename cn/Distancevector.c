#include<stdio.h>
main()
{
       struct node
       {
            int dist[10];
            int next[10];
         };
           int n;
           printf("Enterthe no of nodes:");
           scanf("%d",&n);
           printf("\n%d",n);
          struct node arr[n];
          int cost[n][n];
           printf("Enter the cost matrix:\n");
           for(int i=0;i<n;i++)
           {
            for(int j=0;j<n;j++)
            {
               scanf("%d",&cost[i][j]);
               arr[i].dist[j]=cost[i][j];
               arr[i].next[j]=j;
             }
           }
           int count=0;
           do
           {
            count=0;
            for(int i=0;i<n;i++)
            {   
                for(int j=0;j<n;j++)
                {
                    for(int k=0;k<n;k++)
                    {
                        if(arr[i].dist[j]>(arr[i].dist[k]+arr[k].dist[j]))
                        {
                            arr[i].dist[j]=arr[i].dist[k]+arr[k].dist[j];
                            arr[i].next[j]=k;
                            count=1;
                         }
                     }
                 }
              }
            }while(count!=0);
        printf("Distance vector Routing:\n");
        for(int i=0;i<n;i++)
        {
            printf("Dest\tNextHop\tDist\n");
            for(int j=0;j<n;j++)
            {
                printf("%d\t%d\t%d\n",j+1,arr[i].next[j]+1,arr[i].dist[j]);
              }
         }
  }
                   
