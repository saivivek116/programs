#include<stdio.h>
#include<math.h>
int add(int b[] ,int x,int y,int c,int p)
{
	if((x==0)&&(y==0)&&(c==0))
	{
		b[p] = 0;
		return 0;
	}
	else if(((x==0)&&(y==1))||((x==1)&&(y==0))&&(c==0))
	{
		b[p]= 1;
		return 0;
	}
	else if((x==1)&&(y==1)&&(c==0))
	{
		b[p] = 0;
		return 1;
	}
	else if(((x==0)&&(y==1))||((x==1)&&(y==0))&&(c==1))
	{
		b[p] = 0;
		return 1;
	}
	else if((x==1)&&(y==1)&&(c==1))
	{
		b[p] = 1;
		return 1;
	}
	else if((x==0)&&(y==0)&&(c==1))
	{
		b[p] = 1;
		return 0;
	}
}
int ToBinary(int s,int b[])
{
	int count,sum=s,j;
	for(count = 0;s>0;s = s/2,count++);
	j = count;
	while(sum>0)
	{
		b[j] = sum%2;
		sum = sum/2;
		j--;
	}
	return count;
}  
void Wrap_sum(int m,int count,int b[])
{
	int x,carry=0;
	x = count - m;
	while(x>0)
	{
		carry = add(b,b[count],b[x],carry,count);
		x--;
		count--;
	}
}
int ToDecimal(int count,int m,int b[])
{
	int i,j=0,num=0;
	for(i=count;i>count-m;i--)
	{
		if(b[i]==0)
			b[i] = 1;
		else
			b[i] = 0;
		num +=  pow(2,j) * b[i];
		j++;
	}
	return num;
}
void main()
{
	int i,j=0,n,m,a[20],sum=0,b[30],d[30],s,count,c,num;
	printf("choose the type of check sum to be performed\n1.4-bit Check sum\n2.8-bit Check sum\n");
	scanf("%d",&c);
	if(c==1)
		m=4;
	else
		m = 8;
	printf("Enter the no. of %d-bit decimal numbers you want to enter\n",m);
	scanf("%d",&n);
	printf("Enter the %d %d-bit decimal numbers\n",n,m);
	for(i=1;i<=n;i++)
	{
		scanf("%d",&(a[i]));
		sum = sum + a[i];
	}
	printf("At sender\nThe sum is %d\n",sum);
	count = ToBinary(sum,b);
	if(count>m)
		Wrap_sum(m,count,b);
	num=ToDecimal(count,m,b);
	sum+=num;
	printf("After complimenting checksum is %d\nAt Receiver side\nThe sum is %d\n",num,sum);
	count = ToBinary(sum,d);
	if(count>m)
		Wrap_sum(m,count,d);
	num = ToDecimal(count,m,d);
	printf("After complimenting sum is %d\nSince the sum is ZERO\nThere are no errors and DATA is ACCEPTED\n",num);
	return;
}
