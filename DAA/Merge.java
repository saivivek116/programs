import java.util.*;
class Merge
{
    public int a[],t[];
    Merge(int n)
    {
        a=new int[n];
        t=new int[n];
    }
    public static void main(String ar[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n=s.nextInt();
        Merge q=new Merge(n);
        System.out.print("Enter the Elements in array:");
        for(int i=0;i<n;i++)
            q.a[i]=s.nextInt();
        s.close();
        q.sort(0,n-1);
        for(int i=0;i<n;i++)
            System.out.print(q.a[i]+" ");
            
    }
    public void sort(int low,int high)
    {
        if(low<high)
        {
            int mid=(low+high)/2;
            sort(low,mid);
            sort(mid+1,high);
            merge(low,mid,high);
        }
    }
    public void merge(int l,int m,int h)
    {
        int i=l;
        int j=m+1;
        int k=l;
       // System.out.print(l+" # "+m+" # "+h+" #\n");
        while(i<=m&&j<=h)
        {
            if(a[i]<a[j])
            {
                t[k]=a[i];
                k++;
                i++;
            }
            else
            {
                t[k]=a[j];
                k++;
                j++;
            }
        }
        // System.out.print(i+" * "+j+" * "+k+" *\n");
        while(j<=h)
        {
             t[k++]=a[j++];
        }
        while(i<=m)
        {
             t[k++]=a[i++];
        }
        for(int w=l;w<k;w++)
            a[w]=t[w];
    }
 }
