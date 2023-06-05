import java.util.Scanner;
public class MinimumAndPalindromic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int total = 0;
		int [] numberStore = {};
		boolean finished = false;
		
		do 
		{
			
			System.out.println("Enter an integer to add to the array(or quit to finish)");
			Scanner scanner = new Scanner (System.in);
		    
			if (scanner.hasNextInt())
			{
			
				int[] newNumber = new int[(numberStore==null)?1:numberStore.length+1];
				if (numberStore!= null)
					System.arraycopy( numberStore, 0, newNumber, 0, numberStore.length );
				newNumber[newNumber.length-1] = scanner.nextInt();
				numberStore = newNumber;
				total += numberStore[numberStore.length-1];
				int lowestScore = determineMinimumValue(numberStore);
				System.out.println("The mimimum value is "+lowestScore+", and the values are");
			    
			}
			else if (scanner.hasNext("quit"))
			{
				System.out.println("see you");
				finished = true;
			}
			else
				System.out.println("Your input is invalid. Please try again.");
			
		}while(!finished);
		
		
	}
	
	
	public static int determineMinimumValue(int [] numberStore) {
		
		int lowestScore = numberStore[0];
		
		for(int i=0; i<numberStore.length; i++) 
	    	{
	    		if(numberStore[i]<=lowestScore)
	    			lowestScore = numberStore[i];
	    	}
		return lowestScore;
		
	}
	
	public static int sort( int[] numberStore ){
	  if (numberStore!=null)
	  {
	    for (int index=0; index<numberStore.length-1; index++)
	    {
	      int minimumIndex = index;
	      for (int index2=index+1; index2<numberStore.length; index2++)
	      {
	        if (numberStore[index2] < numberStore[minimumIndex])
	          minimumIndex = index2;
	      }
	      int temp = numberStore[index];
	      numberStore[index] = numberStore[minimumIndex];
	      numberStore[minimumIndex] = temp;
	    }
	  }
	  return numberStore[0];
	}

   public static boolean isPalindomic(int [] numberStore) {
	   
	   boolean isPalindomic = false;
	   
	  
	  
	return isPalindomic;
	
   }
   

}
