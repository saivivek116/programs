#include<stdio.h>
main()
{
	struct process{
		char name;
		int at;
		int bt;
		int ct;
	};
	struct process q[20];
	int tq;
	printf("Enter the timequantum\n");
	scanf("%d",tq);
	struct process p[10];
	int n;
	printf("enter the number of processes\n");
	scanf("%d",n);
	int i;
	for(i=0;i<n;i++)
	{
		printf("Enter The process name");
		scanf("%c",p[i].name);
		printf("Enter the arrival time");
		scanf("%d",p[i].at);
		printf("Enter the burst time");
		scanf("%d",p[i].bt);
	}
int j;
struct process p;
	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(p[i].at>p[j].at)
			{
				p=p[i];
				p[i]=p[j];
				p[j]=p;
			}
		}
	}
	int x=0,y=0;
	q[0]=p[0];
	for(i=0;i<n;i++)
	{
		if(i=0)
		{
			if(q[i].bt>tq)
			{
				q[i].bt=q[i].bt-tq;
				q[i].ct=q[i].at+tq;
			}
			else
			{
				q[i].ct=q[i].at+q[i].bt;
				q[i].bt=0;
			}
		}
		else
		{
			if(q[i].bt>tq)
			{
				q[i].bt=q[i].bt-tq;
				q[i].ct=q[i-1].ct+tq;
			}
			else
			{
				q[i].ct=q[i-1].ct+q[i].bt;
				q[i].bt=0;
			}
		}
		x=i+1;
		for(j=i+1;j<n;j++)
		{
			if(p[j].at<=q[i].ct)
			{
				q[x]=p[j];
				x++;
				y++;
			}
		}
		if(q[i].bt!=0)
		{
		q[x]=q[i];
		}
		if(y==0)
		{
			q[i+1]=p[i+1];
		}
	}
}
		
		
`		
		
