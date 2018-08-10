import java.util.*;
class Merge
{   
    int[] m=new int[100];
    int[] L;
    int[] R;
    int i,n,mid;
     int j,k;
    Merge()
    {   
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array\n");
        n=s.nextInt();
        System.out.println("Enter the size ");
        for(i=0;i<n;i++)
        {   
            m[i]=s.nextInt();
         }
      }
               
    }
    public static void main(String[] args)
    {
        Merge me=new Merge();
        me.mergeDivision(me.m);
        
        for(i=0;i<n;i++)
        {   
            System.out.print(q.m[i]+" ");
            }
    
    }
    public void mergeDivision(m)
    {
        
        if(n<2)
            return;
         mid=n/2;
         L=new L[mid];
         R=new R[n-mid];
         for(i=0;i<mid;i++)
            L[i]=m[i];
          for(i=mid;i<n;i++)
            R[i]=m[i];
          mergeDivision(L);
          mergeDivsion(R);
          merge(L,R,A);
     }
     public void merge(int[] L,int[] R,int[] A)
     {
       
        int l=L.length();
        int r=R.length();
        i=j=k=0;
        while(i<l&&j<r)
        {
            if(L[i]<=R[j])
            {
                m[k]=L[i];
                i++;
             }
             else
             {
                
                m[k]=R[j];
                j++;
              }
              k++;
         }
         while(i<l)
         {
            m[k]=L[i];i++;k++;
            }
            while(j<r)
            {
                m[k]=R[j];j++;k++;
               }      
      }
     }
     
        
