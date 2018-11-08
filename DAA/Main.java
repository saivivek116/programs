import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        int n;
        System.out.println("Enter no of elements:");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int arr[]=new int[n+1];
        System.out.println("Enter the elements:");
        for(int i=1;i<=n;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the value of the sum:");
        int m=s.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
            sum=sum+arr[i];
        int rem=sum;
        int x[]=new int[n+1];
        sum_of_subsets(0,1,rem,m,n,x,arr);
      }
      public static void sum_of_subsets(int s,int k,int r,int m,int n,int[] x,int[] arr)
      {
        x[k]=1;
        if(s+arr[k]==m)
        {
            for(int i=1;i<=n;i++)
            {
                System.out.print(x[i]+"");
             }
             System.out.println("");
         }
         else if(s+arr[k]+arr[k+1]<=m)
         {
            sum_of_subsets(s+arr[k],k+1,r-arr[k],m,n,x,arr);
            for(int i=k;i<=n;i++)
            {   
                x[i]=0;
            }
        }
        if((s+r-arr[k]>=m)&&(s+arr[k+1]<=m))
        {
            x[k]=0;
            sum_of_subsets(s,k+1,r-arr[k],m,n,x,arr);
         }
      }
   }
      
           
