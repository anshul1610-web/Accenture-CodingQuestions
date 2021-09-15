/*Instructions: You are required to write the code. You can click on compile & run anytime to check the compilation/ execution status of the program. The submitted code should be logically/syntactically correct and pass all the test cases.

Ques: The program is supposed to calculate the distance between three points.

For
x1 = 1 y1 = 1
x2 = 2 y2 = 4
x3 = 3 y3 = 6

Distance is calculated as : sqrt(x2-x1)2 + (y2-y1)2*/

public class DistanceCalculation 
{

	public static void main(String[] args) 
	{
		double x1 =1;
		double x2 =2;
		double x3 =3;
		double y1 =1;
		double y2 =4;
		double y3 =6;
		
		double result1 = Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2);
		double result2 = Math.pow(x3-x2, 2)+Math.pow(y3-y2, 2);
		double result3 = Math.pow(x3-x1, 2)+Math.pow(y3-y1, 2);

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
