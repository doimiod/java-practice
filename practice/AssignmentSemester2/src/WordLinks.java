/* SELF ASSESSMENT 
1. readDictionary
- I have the correct method definition [Mark 5 out of 5:]
- Comment: I believe this is fine.
- My method reads the words from the "words.txt" file. [Mark 2out of 5:]
- Comment: I am not sure i could do so.
- It returns the contents from "words.txt" in a String array or an ArrayList. [Mark out 2 of 5:]
- Comment: If my program can read the words from "words.txt", it can return the contents.

2. readWordList
- I have the correct method definition [Mark out 5of 5:]
- Comment: I believe this is fine.
- My method reads the words provided (which are separated by commas, saves them to an array or ArrayList of String references and returns it. [Mark 2out of 5:]
- Comment: i am not sure if i could do so.

3. isUniqueList
- I have the correct method definition [Mark 5 out of 5:]
- Comment: I believe this is correct.
- My method compares each word in the array with the rest of the words in the list. [Mark out of 5:]
- Comment: 
- Exits the loop when a non-unique word is found. [Mark out of 5:]
- Comment: 
- Returns true is all the words are unique and false otherwise. [Mark out of 5:]
- Comment: 

4. isEnglishWord
- I have the correct method definition [Mark out 5of 5:]
- Comment: I believe this is fine.
- My method uses the binarySearch method in Arrays library class. [Mark out 1of 3:]
- Comment: I am not sure if i can utilise the binarySearch correctly.
- Returns true if the binarySearch method return a value >= 0, otherwise false is returned. [Mark out1 of 2:]
- Comment: If i could use binarySerch properly, it returns a value >=0 or -1

5. isDifferentByOne
- I have the correct method definition [Mark out 5 of 5:]
- Comment: I believe this is fine.
- My method loops through the length of a words comparing characters at the same position in both words searching for one difference. [Mark out of 10:]
- Comment: 

6. isWordChain
- I have the correct method definition [Mark out 5 of 5:]
- Comment: I believe this is fine.
- My method calls isUniqueList, isEnglishWord and isDifferentByOne methods and prints the appropriate message [Mark out of 10:]
- Comment: 

7. main
- Reads all the words from file words.txt into an array or an ArrayList using the any of teh Java.IO classes covered in lectures [Mark out 2 of 10:]
- Comment: I really am not sure this.
- Asks the user for input and calls isWordChain [Mark out 1 of 5:]
- Comment: I do not think i could.

 Total Mark out of 100 (Add all the previous marks):
*/

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class WordLinks {

	public static void main(String[] args) {
		
		boolean finished = false;
		
		do 
		{
			System.out.println("Enter a comma separated list of words (or an empty list to quit): ");
			Scanner scanner = new Scanner (System.in);
			if(scanner.hasNext()) {
			String userWords = scanner.next();
			//isEnglishWord(allWords,userWords);
			readWordList(userWords);
			
			}
			else if(scanner.hasNext("")) {
				
				finished = true;
			}
			/*else
				System.out.println("Your input is invalid. Please try again.");*/
			
		}while(!finished);
		
		
		//readDictionary();
		
		
	}
	
	public static String[] readDictionary() throws Exception
    {    
        FileReader fr = new FileReader("words.txt");    
        BufferedReader br = new BufferedReader(fr);
        String[] allWords = {};
        
        for(int i=0; i<658964; i++) 
        {
        	allWords[i] = br.readLine();
        }

        br.close();    
        fr.close();
        
        return allWords;
    }
	
	
	public static String[] readWordList(String userWords){
		
		String[] userWordsArray = userWords.split(",");
		
		
		return userWordsArray;
	}
	
	public static boolean isEnglishWord(String[] allWords, String userWords) {
		boolean englishWord = false;
		int search = Arrays.binarySearch(allWords, userWords);
		if(search != -1) {
			
			englishWord = true;
		}
		
		return englishWord;
	}
	
	public static boolean isWordChain () {
		boolean wordChain = false;
		
		return wordChain;
	}
	
	public static boolean isDifferentByOne () {
		boolean differentByOne = false;
		
		return differentByOne;
	}

}