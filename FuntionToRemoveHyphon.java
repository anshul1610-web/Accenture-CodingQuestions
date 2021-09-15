/*The function accepts a string “str” of length ‘n’, that contains alphabets and hyphens (-). 
 * Implement the functionto move all hyphens(.) in the string to the front of the given string.

NOTE:- Return null if str is null.

Example :-

Input:
str.Move-Hyphens-to-Front
Output:
-MoveHyphenstoFront
Explanation:-

The string “Move-Hyphens -to-front” has 3 hyphens (.), which are moved to the front of the string,
 this output is “— MoveHyphen”*/

import java.util.*;
public class FuntionToRemoveHyphon 
{
	public static void MoveHyphen(String str) 
	{
		String s1 ="";
		String s2 = "";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='-') 
			{
			    s1+= str.charAt(i);
			}
			else
			{
				s2+= str.charAt(i);
			}
		}
		System.out.println(s1+s2);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		MoveHyphen(str); 
		

	}

}
