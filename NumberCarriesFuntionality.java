/*A carry is a digit that is transferred to left if sum of digits exceeds 9 while adding
 *  two numbers from right-to-left one digit at a time

You are required to implement the following function.

Int NumberOfCarries(int num1 , int num2);

The functions accepts two numbers ‘num1’ and ‘num2’ as its arguments. You are required to
 calculate and return  the total number of carries generated while adding digits of two 
 numbers‘num1’ and ‘ num2’.

Assumption: num1, num2>=0*/


import java.util.*;
public class NumberCarriesFuntionality 
{

	public static void NumberOfCarries(int num1 , int num2)
	{
		int remainder1 =0;
		int remainder2 =0;
		int carry =0;
		int carrycount =0;
		while(num1 >0 && num2>0)
		{
			remainder1 = num1%10;
			remainder2 = num2%10;
			
			if((remainder1 + remainder2+carry)>9)
			{
				carry++;
				carrycount++;
			}
			if(carry==2) 
			{
				carry = carry-1;
			}
			num1 = num1/10;
			num2 = num2/10;
		}
		System.out.println(carrycount);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		NumberOfCarries(num1 , num2);

	}

}
