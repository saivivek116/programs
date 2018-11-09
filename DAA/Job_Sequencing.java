import java.util.*;
class Job
{
	int num,DL,profit;
}
public class Job_Sequencing
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no. of jobs to be done :");
		int n = s.nextInt();
		Job j[] = new Job[n];
		for(int i=0;i<n;i++)
		{
			Job obj = new Job();
			System.out.printf("Enter the deadline and profit of %d job:\n",i+1);
			obj.DL = s.nextInt();
			obj.profit = s.nextInt();
			obj.num = i+1;
			j[i]=obj;
		}
		int max=0,pf=0,p;
		for(int i=0;i<n;i++)
		{	
			if((j[i].DL)>max)
				max = j[i].DL;
		}
		int seq[] = new int[max+1];		
		for(int i=0;i<n-1;i++)
		{	
			for(int k=0;k<n-i-1;k++)
			{
				if(j[k].profit<j[k+1].profit)
				{
					Job temp = j[k];
					j[k] = j[k+1];
					j[k+1] = temp;
				}
			}
		}
		int i,k=1;
		while(k<seq.length)
		{
			for(int m=0;m<n;m++)
			{
				for(i=j[m].DL;i>0;i--)
				{
					if(seq[i]==0)
					{
						seq[i]=j[m].num;
						pf = pf + j[m].profit;
						k++;
						break;
					}
				}
			}
		}
		System.out.printf("JOBS\tDONE B/W\n");	
		for(i=1;i<seq.length;i++)
			System.out.printf("J%d\t%d to %d\n",seq[i],i-1,i);
		System.out.printf("The profit obtained is %d\n",pf);	
	}
}    
