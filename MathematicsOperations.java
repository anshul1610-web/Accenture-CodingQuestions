/*You are required to implement the following function.

Int OperationChoices(int c, int n, int a , int b )

The function accepts 3 positive integers ‘a’ , ‘b’ and ‘c ‘ as its arguments.
 Implement the function to return.

( a+ b ) , if c=1
( a + b ) , if c=2
( a * b ) ,  if c=3
(a / b) ,  if c =4
Assumption : All operations will result in integer output.*/




import java.util.*;
public class MathematicsOperations 
{

	public static void  OperationChoices(int c, int a , int b )
	{
		if(c==1)
		{
			System.out.println(a+b);
		}
		else if(c==2) 
		{
			System.out.println(a-b);
		}
		else if(c==3)
		{
		System.out.println(a*b);
		}
		else if(c==4) 
		{
			System.out.println(a/b);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		OperationChoices( c,a , b );
	}

}
