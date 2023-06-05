/* SELF ASSESSMENT 
   1. Did I use appropriate CONSTANTS instead of numbers within the code? 
       Mark out of 5:3
       Comment: I believe i did so because I used CONSTANTS instead of numbers.
   2. Did I use easy-to-understand, meaningful CONSTANT names formatted correctly in UPPERCASE? 
       Mark out of 5:3 
       Comment: I used UPPERCASE constants but I am not sure that it is easy-to-understand or meaningful.
   3. Did I use easy-to-understand meaningful variable names formatted properly (in lowerCamelCase)? 
       Mark out of 10:8 
       Comment:i used lowerCameCase variable names but i am not sure that i could use it by proper name.
   4. Did I indent the code appropriately? 
       Mark out of 10:10 
       Comment: I believe I could do so. In my opinion, indent in this code is clear...
   5. Did I use an appropriate loop (or loops) to produce the different verses? 
       Mark out of 20:17 
       Comment: I believe I could do so. I think that the different verses appear correctly. 
   6. Did I use a switch to build up the verses? 
       Mark out of 25:23  
       Comment: I used switch to make the verses. and they are built up properly.
   7. Did I avoid duplication of code and of the lines which make up the verses (each line should be referred to in the code only once (or twice))? 
       Mark out of 10:9  
       Comment: I believe that I could avoid duplication.
   8. Does the program produce the correct output? 
       Mark out of 10:10  
       Comment: If I did not see the website which says wrong lyrics, the correct output appears.
   9. How well did I complete this self-assessment? 
       Mark out of 5:5 
       comment: It is the first time to use switch so I am a bit not sure that I could use it correctly. 
       However, I believe that the output is correct, so I marked a little bit high score on each question. but I think it is the result of my honest self-assessment.
   Total Mark out of 100 (Add all the previous marks):88 
*/
public class TheTwelveDaysOfChristmas {
	
	public static final int FIRST_DAY = 1;
	public static final int LAST_DAY = 12;
	
	public static void main(String[] args) {
		
		String dayNumber = "";
		String originalLyrics ="";
		String culmutiveLyrics = "";
		
		
		
		for (int dayCounter = FIRST_DAY; dayCounter <= LAST_DAY; dayCounter++)
		{
			boolean firstOrSecondDay = false;
			
			
			switch (dayCounter)  
			{
			case 1:
				dayNumber = "first";
				culmutiveLyrics = "a Partridge in a Pear Tree";
				firstOrSecondDay = true;
				break;
			case 2:
				dayNumber = "second";
				culmutiveLyrics = dayCounter+" Turtle Doves"+"\nand "+culmutiveLyrics;
				firstOrSecondDay = true;
				break;
			case 3:
				dayNumber = "third";
				originalLyrics = "French Hens";
				break;
			case 4:
				dayNumber = "fourth";
				originalLyrics = "Calling Birds";
				break;
			case 5:
				dayNumber = "fifth";
				originalLyrics = "Golden Rings";
				break;
			case 6:
				dayNumber = "sixth";
				originalLyrics = "Geese a Laying";
				break;
			case 7:
				dayNumber = "seventh";
				originalLyrics = "Swans a Swimming";
				break;
			case 8:
				dayNumber = "eighth";
				originalLyrics = "Maids a Milking";
			break;
			case 9:
				dayNumber = "ninth";
				originalLyrics = "Ladies Dancing";
				break;
			case 10:
				dayNumber = "tenth";
				originalLyrics = "Lords a Leaping";
				break;
			case 11:
				dayNumber = "eleventh";
				originalLyrics = "Pipers Piping";
				break;
			default:
				dayNumber = "twelfth";
				originalLyrics = "Drummers Drumming";
				break;
			}
			if (!firstOrSecondDay)
			{
				culmutiveLyrics = dayCounter + " "+originalLyrics +", \n"+culmutiveLyrics;
			}
			
			System.out.println("On the "+dayNumber+" day of Christmas");
			System.out.println("my true love sent to me");
			System.out.println(culmutiveLyrics+"\n");
			
		}
		
	}
	
}

