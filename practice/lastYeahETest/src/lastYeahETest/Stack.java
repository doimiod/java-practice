package lastYeahETest;

import java.util.ArrayList;
public class Stack {
	
	
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	public Stack() {
		// TODO Auto-generated constructor stub
	}
	
	//private int numberInStack;
	
	public void push(int element) 
	{
		list.add(element);
	}
	
	public void pop(int element)
	{
		list.remove(list.size()-1);
	}
	
	int peek()
	{
		return list.get(list.size()-1);
	}
	
	
	int search(int number)
	{
		boolean found = false;
		int count = 0;
		while(found==false && count<list.size())
		{
			if(list.get(count)==number)
			{
				found = true;
			}
			count++;
		}
		
		if(found==false) 
		{
			count=-1;
		}
		return count;
	}
	
	void move(int n)
	{
		int number = search(n);
		
		if(number==-1)
		{
			System.out.println("number is not found");
		}
		else 
		{
			number = number-1;
			list.remove(number);
			list.add(n);
		}
		
	}
	
	/*public String toString() {
		return getClass().getName() + "[list = " + list + "]";
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

