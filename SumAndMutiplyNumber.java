

/*Instructions: You are required to write the code. You can click on compile and run anytime to check compilation/execution status. The code should be logically/syntactically correct.

Problem: Write a program in C to display the table of a number and print the sum of all the multiples in it.
import java.util.*/


import java.util.Scanner;
public class SumAndMutiplyNumber 
{
    public static void getMultiple(int num)
    {
    	int value =0;
    	int sum=0;
    	for(int i=1;i<=10;i++) 
    	{
    		value = i*num;
    		System.out.print(value+",");
    		sum+= value;		
    	}
    	System.out.println();
    	System.out.println(sum);
    }
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	int num = sc .nextInt();
	
	getMultiple( num);
	}

}
