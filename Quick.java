import java.util.*;
class Quick{
         int[] a=new int[100];
         int n,i,p=1,q;
    Quick()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the input array\n");
        n=s.nextInt();
        q=n;
        System.out.println("Enter the numbers\n");
        for(i=1;i<=n;i++)
        {
            a[i]=s.nextInt();
           }
    }
    public static void main(String args[])
    {
    int w;
        Quick q=new Quick();
        q.quick(q.a,q.p,q.q);
        for(w=1;w<=q.n;w++)
        {
            System.out.print(q.a[w]+" ");
        }
        }
        public void quick(int[] a,int p,int q)
        {
            int r;
            if(p<q)
            {
                r=partition(a,p,q);
                quick(a,p,r-1);
                quick(a,r+1,q);
            }
           }
        public int partition(int[] a,int p,int q)
         {
         int j;
            int x=a[q];
            int in=p-1;
            for(j=p;j<=q-1;j++)
            {
                if(a[j]<=x)
                {
                    in=in+1;
                    int sw=a[in];
                    a[in]=a[j];
                    a[j]=sw;
                   }
               }
               int sw=a[in+1];
               a[in+1]=a[q];
               a[q]=sw;
               return in+1;
            }          
 }
