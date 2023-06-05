package lastYeahETest;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbers = 1;
		Stack stack = new Stack();
		for(int i = 0; i < 10; i++)
		{
		stack.push(numbers);
		numbers++;
		}
		
		System.out.println("used push. the result is "+stack.list);
		stack.pop(stack.list.size());
		System.out.println("used pop to deliete 10. the result is "+stack.list);
		System.out.println("used peek to check what the top number is. the result is "+stack.peek());
		int four = 4;
		stack.move(four);
		System.out.println("used move to move 4 to the top. the result is "+stack.list);
		int five = 5;
		int whereIsFive = 10-stack.search(five);
		System.out.println("used search to determine where 5 is from the top. the result is "+whereIsFive);
		stack.pop(four);
		//System.out.println();
		System.out.print("used search to check it can determine four is not in a stack. the resut is, "+stack.search(four)); //stack.move(four);
		
	}

}

//Extend array and store new number.
/*double[] newNumbers = new double[(numbers==null)?1:numbers.length+1];
if (numbers!= null)
	System.arraycopy( numbers, 0, newNumbers, 0, numbers.length );
newNumbers[newNumbers.length-1] = input.nextDouble();;
numbers = newNumbers;
total += numbers[numbers.length-1];*/