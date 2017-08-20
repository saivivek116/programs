import java.util.*;
class Search
{
  public static void main(String args[])
  {
    Scanner obj=new Scanner(System.in);
    int[] number=new int[5];
    for(int i=0;i<5;i++)
    {
    	number[i]=(int)(Math.random()*10);
    }
    System.out.println("guess the number");
    int n=obj.nextInt();
    for(int i:number)
    {
    	if(i==n)
    	{
    		System.out.println("hurrah!! the number is there.");
    		break;
    	}
    	else
    	{
    		System.out.println("Wrong guess");
    	}
    }
   }
}
    
	
