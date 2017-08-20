import java.util.*;
class Dog
{
	public static void main(String args[])
	{
		ArrayList<Dog>mydogs=new ArrayList<Dog>();
		Dog a=new Dog();
		mydogs.add(a);
		Dog b=new Dog();
		mydogs.add(b);
		int thesize=mydogs.size();
		System.out.println("the number of dog objects present in the arraylist is"+thesize);
		int idx=mydogs.indexOf(b);
		System.out.println("the index of the object b is"+idx);
		boolean isIn=mydogs.contains(a);
		if(isIn)
		{
			mydogs.remove(b);
		}
		thesize=mydogs.size();
		System.out.println("the number of dog objects present in the arraylist is"+thesize);
	}
}

	
