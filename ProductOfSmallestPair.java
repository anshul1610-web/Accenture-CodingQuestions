/*The function accepts an integers sum and an integer array arr of size n. Implement
 * the function to find the pair, (arr[j], arr[k]) where j!=k, Such that arr[j] and
 * arr[k] are the least two elements of array (arr[j] + arr[k] <= sum) and return the
 * product of element of this pair
 

NOTE

Return -1 if array is empty or if n<2
Return 0, if no such pairs found
All computed values lie within integer range*/

import java.util.*;
public class ProductOfSmallestPair
{
	public static void ProductSmallestPair(int sum, int []array)
	{
		int temp=0;
		if(array.length==0 || array.length<2) 
		{
			System.out.println(-1);
		}
		else
		{
			Arrays.sort(array);
			temp = array[0]+array[1];
			
			if(temp<sum) 
			{
				System.out.println(array[0]*array[1]);
			}
			else
			{
				System.out.println("0");
			}
		}
		
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		int arr = sc.nextInt();
		int [] array = new int[arr];
		
		for(int i=0;i<arr;i++) 
		{
			array[i] = sc.nextInt();
		}
		
		 ProductSmallestPair(sum, array);

	}

}
