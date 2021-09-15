/*N-base notation is a system for writing numbers that uses only n different symbols,
 *  This symbols are the first n symbols from the given notation list(Including the 
 *  symbol for o) Decimal to n base notation are (0:0, 1:1, 2:2, 3:3, 4:4, 5:5, 6:6, 7:7,
 *   8:8, 9:9, 10:A,11:B and so on upto 35:Z)
 

Implement the following function

Char* DectoNBase(int n, int num):

The function accept positive integer n and num Implement the function to calculate the n-base equivalent of num and return the same as a string

Steps:

Divide the decimal number by n,Treat the division as the integer division
Write the the remainder (in  n-base notation)
Divide the quotient again by n, Treat the division as integer division
Repeat step 2 and 3 until the quotient is 0
The n-base value is the sequence of the remainders from last to first*/

import java.util.*;
public class DecimalNotation
{

	public  static void   DectoNBase(int n, int num)
	{
		int quotient =0;
		int remainder =0;
		String str =" ";
	
		
			quotient = num/n;
			while(quotient!=0)
			{
				quotient = num/n;
				remainder = num%n;
			   if(remainder>9)
			   {
				remainder = remainder-9;
				str+= (char) (64+remainder);
			   }
			   else 
			   {
				  str+=  remainder;
			   }
			   num = quotient;
		    }
			StringBuffer sb = new StringBuffer(str);
			System.out.println(sb.reverse());
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = sc.nextInt();
		
		DectoNBase(n, num);

	}

}
