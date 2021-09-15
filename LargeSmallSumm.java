/*The function accepts an integers arr of size ’length’ as its arguments you are required
 *to return the sum of second largest largest element from the even positions and second
 *smallest from the odd position of given ‘arr’

Assumption:

All array elements are unique
Treat the 0th position a seven
NOTE

Return 0 if array is empty
Return 0, if array length is 3 or less than 3*/




import java.util.*;
public class LargeSmallSumm 
{

	 public static void LargeSmallSum(int arr,int []array) 
	 {
		 int [] even = new int[arr];
		 int [] odd = new int[arr];
		  for(int j=0;j<arr;j++) 
		  {
			  if(j%2==0) 
			  {
				  even[j] = array[j];
			  }
			  else
			  {
				 odd[j]  = array[j];
			  }
		  }
		  
		  Arrays.sort(even);
		  Arrays.sort(odd);
		  
		  
		  System.out.println(even[even.length-2]+odd[odd.length-2]);
	 }
	
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int arr = sc.nextInt();
		int [] array = new int[arr];
		
		for(int i=0;i<arr;i++) 
		 {
			 array[i]= sc.nextInt();
		 }
		
		LargeSmallSum( arr,array);
	}

}
