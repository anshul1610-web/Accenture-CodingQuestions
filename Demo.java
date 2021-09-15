import java.util.Scanner;

public class Demo 
{
		
  public static void main (String [] args) 
  {
	  System.out.println("Enter the value");
	  Scanner sc = new Scanner(System.in);
	  int a = sc.nextInt();
	  int b = sc.nextInt();
	  
	  int sum1 =0;
	  int sum2 =0;
	  for(int i = 1;i<=b;i++) 
	  {
		  if(i%a==0) 
		  {
			  sum1 = sum1+i;
		  }
		  else 
		  {
			  sum2 = sum2+i;
		  }
	  }
	  
	  System.out.println(sum2-sum1);

  }
}
