#include<stdio.h>
#include<string.h>
int main()
{
    struct process{
      char pname[10];
      int at,bt,ct;
    };
    struct process p[10];
    int n,i,j;
    printf("Enter the number of processes\n");
    scanf("%d",&n);
    printf("Enter the name,arrival time and burst time of each process\n");
    for(i=0;i<n;i++)
    {
      printf("Enter the name of the process\n");
      scanf("%s",p[i].pname);
      printf("Enter the arrivaltime and burst time\n");
      scanf("%d%d",&p[i].at,&p[i].bt);
    }
    struct process t;
    for(i=0;i<n;i++)
    {
      for(j=i+1;j<n;j++)
      {
          if((p[i].at>p[j].at)||((p[i].at==p[j].at)&&(p[i].bt>p[j].bt)))
          {
            t=p[i];
            p[i]=p[j];
            p[j]=t;
          }
      }
    }
    struct process v;
    int x,y;
    x=0;
    y=0;
    for(i=0;i<n;i++)
    {
        if(i==0)
        {
          p[i].ct=p[i].at+p[i].bt;
          printf("process:%s\nat:%d\nbt:%d\nct:%d\n",p[i].pname,p[i].at,p[i].bt,p[i].ct);
        }
        else{
          if(v.at>p[i-1].ct)
          {
            v.ct=v.at+v.bt;
          }
          else
          {
          v.ct=v.bt+p[i-1].ct;}
          printf("process:%s\nat:%d\nbt:%d\nct:%d\n",v.pname,v.at,v.bt,v.ct);
          p[i]=v;
        }
        x=0,y=0;
        for(j=i+1;j<n;j++)
        {
          if(p[i].ct>=p[j].at)
          {
              if(x==0)
              {
                v=p[j];
                x++;
              }
              else
              {
                if(((v.bt>=p[j].bt)&&(v.at>p[j].at)))
                {
                  v=p[j];
                }
              }
              y++;
          }
        }
        if(y==0)
        {
            v=p[i+1];
        }
    }

    return 0;
}
