package week1.day2;

public class Calculator {
	
	public int add(int num1, int num2, int num3)
	{
		int sum = num1+num2+num3 ;
		return sum;
	}
	public int sub(int num1, int num2)
	{
		int subtraction = num1 - num2;
		return subtraction;
	}
	public double mul(double num1, double num2)
	{
		double product = num1 * num2;
		return product;
	}
	public float divide(float num1, float num2)
	{
		float division = num1 /num2;
		return division;
	}

	public static class MyCalculator{
		public static void main(String[] args) {
		Calculator myobj = new Calculator();
		int addition = myobj.add(3,4,5);
		System.out.println(addition);
		int sub = myobj.sub(4,5);
		System.out.println(sub);
		double mul= myobj.mul(4,5);
		System.out.println(mul);
		float division= myobj.divide(4,5);
		System.out.println(division);
		
		
	}
	
		
	}

}
