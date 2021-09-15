import java.util.*;
public class ArrayDistribution 
{

	public int returnSum(int []array,int n)
	{
		int [] even = new int [n];
		int [] odd = new int [n];
		for(int j=0;j<n;j++) 
		{
			if(j%2==0) 
			{
				even[j] = array[j];
			}
			else 
			{
				odd[j] = array[j]; 
			}
		}
		
		Arrays.sort(even);
		Arrays.sort(odd);
		
		return (even[even.length-2]+odd[odd.length-2]);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []array = new int [n];
		for(int i=0;i<n;i++)
		{
			array[i]= sc.nextInt();
		}
		ArrayDistribution A = new ArrayDistribution();
		int sum = A.returnSum(array, n);
		System.out.println(sum);
		
		

	}

}
