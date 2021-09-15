/*You are given a function,

Void *ReplaceCharacter(Char str[], int n, char ch1, char ch2);

The function accepts a string  ‘ str’ of length n and two characters ‘ch1’ and ‘ch2’
 as its arguments . Implement the function to modify and return the string ‘ str’ in
  such a way that all occurrences of ‘ch1’ in original string are replaced by ‘ch2’ 
  and all occurrences of ‘ch2’  in original string are replaced by ‘ch1’.

Assumption: String Contains only lower-case alphabetical letters.

Note:

Return null if string is null.
If both characters are not present in string or both of them are same , then return the string unchanged.*/


import java.util.*;
import java.util.stream.IntStream;
public class CharacterManipulation 
{
   public static void replaceChar(String str,char ch1,char ch2) 
   {
	   
	   char [] array = str.toCharArray();
	   
	     for(int i=0;i<array.length;i++)
	     {
	    	if(array[i]==ch1)
	    	{
	    		array[i] = 'p';
	    	}
	    	else if(array[i]==ch2) 
	    	{
	    		array[i] = 'a';
	    	}
	     }
	      
	    System.out.println(array);
	      
   }
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch1 = sc.next().charAt(0);
		char ch2 = sc.next().charAt(0);
		
		replaceChar(str, ch1, ch2);
		
	}

}
