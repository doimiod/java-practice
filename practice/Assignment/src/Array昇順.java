import java.util.Scanner;
public class Array昇順 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] highScores = {};
		Scanner scanner = new Scanner (System.in);
		
		int total = 0;
		int[] newScore = new int[(highScores==null)?1:highScores.length+1];
		if (highScores!= null)
			System.arraycopy( highScores, 0, newScore, 0, highScores.length );
		newScore[newScore.length-1] = scanner.nextInt();;
		highScores = newScore;
		total += highScores[highScores.length-1];
	//	highScores = insertScore(currentNumber, highScores);
		
		System.out.println(highScores);
	}
	
	public static boolean higherThan (int newScore, int[] highScores)
	{
		boolean higherThan = false;
		for(int i = 0; i < highScores.length; i++)
		{
			if(newScore > highScores[i])
				higherThan = true;
		}
		return higherThan;
	}
	
	public static int[] insertScore(int newScore, int[] highScores)
	{	if(higherThan(newScore, highScores))
			highScores[highScores.length - 1] = newScore;
		return listHighScoresFromMaxToMin(highScores);
	}
	
	public static int[] listHighScoresFromMaxToMin(int[] highScores)
	{
		int copy = 0;
		for(int i = 0; i < highScores.length; i++)
		{
			for(int j = i + 1; j < highScores.length; j++)
			{
				if(highScores[i] < highScores[j])
				{
					copy = highScores[j];
					highScores[j] = highScores[i];
					highScores[i] = copy;
				}
			}
		}
		return highScores;
	}
}

/* public static void bubbleSort(int[] highScores) {
        for (int i = 0; i < highScores.length; i++) {
            for (int j = 0; j < highScores.length; j++) {
                if (highScores[i] > highScores[j]) {
                    int tempScore = highScores[i];
                    highScores[i] = highScores[j];
                    highScores[j] = tempScore;
                    //System.out.println("midrun " + Arrays.toString(highScores));
                }
            }
        }
        //System.out.println("last " + Arrays.toString(highScores));
    }*/

/*public static void sort( int[] array )
{
  if (array!=null)
  {
    for (int index=0; index<array.length-1; index++)
    {
      int minimumIndex = index;
      for (int index2=index+1; index2<array.length; index2++)
      {
        if (array[index2] < array[minimumIndex])
          minimumIndex = index2;
      }
      int temp = array[index];
      array[index] = array[minimumIndex];
      array[minimumIndex] = temp;
    }
  }
}*/

