import java.util.*;
class Quick
{
    public static void main(String ar[])
    {
        Quick q=new Quick();
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n=s.nextInt();
        System.out.print("Enter the Elements in array:");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        q.sort(a,0,n-1);
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
            
    }
    public void sort(int[] a,int low,int high)
    {
        //int mid=(low+high)/2;
        if(low<high)
        {
            int m=part(a,low,high);
            sort(a,low,m-1);
            sort(a,m+1,high);
        }
    }
    public int part(int[] a,int i,int q)
    {
        int k=a[i];
        int p=i+1;
        //System.out.print(q+" * "+p+" *\n");
        while(q>p)
        {
            while(k>a[p])
                p++;
            while(k<a[q])
                q--;
            if(q>p)
            {
                int t=a[q];
                a[q]=a[p];
                a[p]=t;
            }
        }
        int t=a[q];
        a[q]=k;
        a[i]=t;
        return q;
    }
}
