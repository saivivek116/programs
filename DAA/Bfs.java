import java.util.*;
class Bfs
{
    int v;
    LinkedList<Integer> ll[];
    Bfs(int n)
    {
        v=n;
        ll=new LinkedList[v];
        for(int i=0;i<v;i++)
            ll[i]=new LinkedList();
    }
    public static void main(String ar[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the no of vertices :");
        int n=s.nextInt();
        Bfs q=new Bfs(n);
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the nodes Connected to "+i+"\nEnter -1 if there are no new nodes :");
            do
            {
                int w=s.nextInt();
                if(w==-1)
                    break;
                 if(w>=0&&w<n)
                    q.ll[i].add(w);
                 else
                     System.out.print("Entered node does not exist");
                    
            }while(true);
         }
         System.out.print("Enter the node to start search :");
         q.search(s.nextInt());
         s.close();
     }
     public void search(int j)
     {
        LinkedList<Integer> que=new LinkedList();
        boolean vis[]=new boolean[v];
        que.add(j);
        vis[j]=true;
        while(que.size()!=0)
        {
            int h=que.poll();
            System.out.println(h+" ");
            Iterator<Integer> i=ll[h].listIterator();
            while(i.hasNext())
            {
                int hl=i.next();
                if(!vis[hl])
                {
                    vis[hl]=true;
                    que.add(hl);
                }
            }
            
        }
     }
}
                
