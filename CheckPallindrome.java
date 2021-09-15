import java.util.Scanner;

public class CheckPallindrome
{
    public static int getPallindrome(int num1) 
    {
    	int sum=0;
    	int temp=0;
    	int remainder =0;
  
    		while(num1!=0)
    		{	
    		remainder = num1%10;
    		sum = sum*10+remainder;
    		num1 = num1/10;
    		}
                return sum;
    }
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		for(int i=num1;i<=num2;i++) 
		{
			if(i==getPallindrome(i)) 
			{
				System.out.print(i+",");
			}
		}
	}

}
