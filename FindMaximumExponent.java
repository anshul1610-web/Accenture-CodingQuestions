/*You are given a function,

Int MaxExponents (int a , int b);

You have to find and return the number between ‘a’ and ‘b’ ( range inclusive on both ends)
 which has the maximum exponent of 2.

The algorithm to find the number with maximum exponent of 2 between the given range is

Loop between ‘a’ and ‘b’. Let the looping variable be ‘i’.
Find the exponent (power) of 2 for each ‘i’ and store the number with maximum exponent 
of 2 so faqrd in a variable , let say ‘max’. Set ‘max’ to ‘i’ only if ‘i’ has more 
exponent of 2 than ‘max’.
Return ‘max’.
Assumption: a <b

Note: If two or more numbers in the range have the same exponents of  2 , return the small number.*/



import java.util.*;
public class FindMaximumExponent
{

	
	public static void MaxExponents (int a , int b)
	{
		int sum =0;
		for(int i=a;i<b;i++) 
		{
			if((i%3==0) && (i%5==0))
			{
				sum+= i;
			}
		}
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b = sc.nextInt();
		
		MaxExponents (a ,  b);
	}

}
